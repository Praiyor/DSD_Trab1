 package DAO;

import Models.Corredores;
import Models.Piloto;
import Models.Tecnico;
import Exceptions.CorredorNEncontradoException;

import java.util.HashMap;
import java.util.Map;


public class CorredoresDAO {

    private static Map<String, Corredores> corredoresMap = new HashMap<>();
    private static CorredoresDAO instance;

    private static final String noCorredores = "Não possui registros de corredores";
    private static final String notFound = "Não foi possível encontrar um torneio com o nome passado";

    private CorredoresDAO() {}

    public static CorredoresDAO getInstance() {
        if (instance == null) {
            instance = new CorredoresDAO();
        }
        return instance;
    }

    public void addCorredores(Corredores corredores) {
        corredoresMap.put(corredores.getTorneio(), corredores);
    }

    public String removeCorredores(String torneio) {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        if (corredoresMap.containsKey(torneio)) {
            corredoresMap.remove(torneio);
            return "Registro do torneio removido com sucesso!";
        }
        return notFound;
    }

    public String getCorredores(String torneio) {
        if (corredoresMap.isEmpty()) {
            throw new CorredorNEncontradoException(noCorredores);
        }
        if (corredoresMap.containsKey(torneio)) {
            StringBuilder corres = new StringBuilder();
            Corredores corredores = corredoresMap.get(torneio);
            corres.append(corredores.toString()).append("\n");
            corres.append("Pilotos: ").append("\n");
            for(Piloto piloto : corredores.getCorredores()){
                corres.append(piloto.toString()).append("\n");
            }
            corres.append("Tecnicos: ").append("\n");
            for(Tecnico tecnico : corredores.getTecnicos()){
                corres.append(tecnico.toString()).append("\n");
            }

            return corres.toString();
        }
        throw new CorredorNEncontradoException(notFound);
    }

    public String listCorredores() {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        StringBuilder corres = new StringBuilder();
        corres.append("Quantidade de Corredores: " + corredoresMap.size()).append("\n");

        for (Corredores corredores : corredoresMap.values()) {
            corres.append(corredores.toString()).append("\n");

            corres.append("Pilotos: ").append("\n");
            for(Piloto piloto : corredores.getCorredores()){
                corres.append(piloto.toString()).append("\n");
            }
            corres.append("Tecnicos: ").append("\n");
            for(Tecnico tecnico : corredores.getTecnicos()){
                corres.append(tecnico.toString()).append("\n");
            }
        }


        return corres.toString();
    }

    public String atualizaCorredores(String torneio, String premio) {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        if (corredoresMap.containsKey(torneio)) {
            Corredores corredores = corredoresMap.get(torneio);
            corredores.setPremio(premio);
            return "Torneio atualizado com sucesso!";
        }
        return notFound;
    }
   public String AddTecnico(String torneio, Tecnico tecnico) {
       if (corredoresMap.isEmpty()) {
           return noCorredores;
       }
       if (corredoresMap.containsKey(torneio)){
           Corredores corredores = corredoresMap.get(torneio);
           corredores.addTecnicos(tecnico);

           return "Tecnico adicionado com sucesso!";
       }
       return notFound;
   }

   public String AddPiloto(String torneio, Piloto piloto) {
       if (corredoresMap.isEmpty()) {
           return noCorredores;
       }
       if (corredoresMap.containsKey(torneio)){
           Corredores corredores = corredoresMap.get(torneio);
           corredores.addPiloto(piloto);

           return "Piloto adicionado com sucesso!";
       }
       return notFound;
   }

    public String removeTecnico(String torneio, Tecnico tecnico) {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        if (corredoresMap.containsKey(torneio)) {
            Corredores corredores = corredoresMap.get(torneio);
            if (corredores.getTecnicos().contains(tecnico)) {
                corredores.removeTecnico(tecnico);
                return "Técnico removido com sucesso!";
            }
            return "O Tecnico informado não foi encontrado";
        }
        return notFound;
    }

    public String removePiloto(String torneio, Piloto piloto) {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        if (corredoresMap.containsKey(torneio)) {
            Corredores corredores = corredoresMap.get(torneio);
            if (corredores.getCorredores().contains(piloto)) {
                corredores.removePiloto(piloto);
                return "Piloto removido com sucesso!";
            }
            return "O Piloto informado não foi encontrado";
        }
        return notFound;
    }




	
}