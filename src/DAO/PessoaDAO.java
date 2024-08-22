package DAO;

import Exceptions.PessoaNEncontradaException;
import Models.Pessoa;
import Models.Piloto;
import Models.Tecnico;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PessoaDAO {

    static Map<String, Piloto> pilotos = new HashMap<>();

    static Map<String, Tecnico> tecnicos = new HashMap<>();
    private static PessoaDAO instance;

    private static final String no_pilots = "Não possui pilotos registrados";
    private static final String no_tec = "Não possui tecnicos registrados";

    private static final String notFound_pilots = "Não foi possivel encontrar um piloto com o cpf passado";
    private static final String noFound_tec = "Não foi possivel encontrar um Tecnico com o cpf passado";

    private PessoaDAO(){

    }

    public static PessoaDAO getInstance() throws IOException{
        if (instance == null){
            instance = new PessoaDAO();
        }
        return instance;
    }

    public void addPiloto(Piloto piloto){
        pilotos.put(piloto.getCpf(), piloto);
    }
    public void addTecnico(Tecnico tecnico){
        tecnicos.put(tecnico.getCpf(), tecnico);
    }

    public String removePiloto(String CPF){
        if (pilotos.isEmpty()){
            return no_pilots;
        }
        if(pilotos.containsKey(CPF)){

            pilotos.remove(CPF);

            return "O registro do Piloto foi removido com sucesso!";
        }
        return notFound_pilots;
    }
    public String removeTecnico(String CPF){
        if (tecnicos.isEmpty()){
            return no_tec;
        }
        if(tecnicos.containsKey(CPF)){

            tecnicos.remove(CPF);

            return "O registro do Tecnico foi removido com sucesso!";
        }
        return noFound_tec;
    }


    public Piloto getPiloto(String CPF) {
        if (pilotos.isEmpty()){
            throw new PessoaNEncontradaException(no_pilots);
        }
        if (pilotos.containsKey(CPF)){
            return pilotos.get(CPF);
        }

        throw  new PessoaNEncontradaException(notFound_pilots);

    }

    public Tecnico getTecnico(String CPF){
        if (tecnicos.isEmpty()){
            throw new PessoaNEncontradaException(no_tec);
        }
        if (tecnicos.containsKey(CPF)){
            return tecnicos.get(CPF);
        }

        throw  new PessoaNEncontradaException(noFound_tec);
    }

    public String listPilotos(){
        if (pilotos.isEmpty()){
            return no_pilots;
        }
        StringBuilder pilots = new StringBuilder();
        pilots.append(pilotos.size()).append("\n");

        for(Piloto piloto : pilotos.values()) {
            pilots.append(piloto.toString());
            pilots.append("\n");
        }

        return pilots.toString();

    }

    public String listTecnicos(){
        if (tecnicos.isEmpty()){
            return no_tec;
        }
        StringBuilder tecs = new StringBuilder();
        tecs.append(tecnicos.size()).append("\n");

        for(Tecnico tec : tecnicos.values()){
            tecs.append(tec.toString());
            tecs.append("\n");
        }

        return tecs.toString();

    }

    public String atualizaPiloto(String CPF, String endreco, String nome, String carro){
        if (pilotos.isEmpty()){
            return no_pilots;
        }
        if (pilotos.containsKey(CPF)){
            Piloto piloto = pilotos.get(CPF);
            piloto.setEndereco(endreco);
            piloto.setNome(nome);
            piloto.setCarro(carro);
            return "Piloto atualizado com sucesso!";
        }

        return notFound_pilots;
    }

    public String atualizaTecnico(String CPF, String endreco, String nome, String especialidade, int experiencia){
        if (tecnicos.isEmpty()){
            return no_tec;
        }
        if (tecnicos.containsKey(CPF)){
            Tecnico tecnico = tecnicos.get(CPF);
            tecnico.setEndereco(endreco);
            tecnico.setNome(nome);
            tecnico.setEspecialidade(especialidade);
            tecnico.setExperiencia(experiencia);

            return "Tecnico atualizado com sucesso!";
        }

        return noFound_tec;
    }

}
