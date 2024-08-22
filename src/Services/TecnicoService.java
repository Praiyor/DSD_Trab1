package Services;

import DAO.PessoaDAO;
import Models.Tecnico;

import java.io.IOException;
import java.io.PrintWriter;

public class TecnicoService {

    private final PessoaDAO pessoadao = PessoaDAO.getInstance();

    protected String[] request;
    protected PrintWriter output;
    String outputMessage;

    public TecnicoService(String[] request, PrintWriter output) throws IOException {
        this.request = request;
        this.output = output;
    }


    public void add(){
// Lembrar de dar parse no int, pq sempre vem uma string e tecnico usa int pra experiencia
        try {
            //add0;tecn1;cpf2;nome3;endreco4;especialidade5;experiencia6
            System.out.println(request);
            int experiencia = Integer.parseInt(request[6]);
            Tecnico tecnico = new Tecnico(request[2],request[3],request[4],request[5], experiencia);

            pessoadao.addTecnico(tecnico);

            outputMessage = "Tecnico cadastrado com sucesso";

        }catch (Exception e){
            outputMessage = "Ocorreu um erro ao tentar cadastrar o tecnico, segue o erro:" + e.getMessage();
        }

        output.println(outputMessage);
    }
    public void update(){
        // tem que testar 
        try {
            int experiencia = Integer.parseInt(request[6]);

            outputMessage = pessoadao.atualizaTecnico(request[2], request[3], request[4],request[5], experiencia);
            
        }catch (Exception e){
            outputMessage = e.getMessage();
        }
        output.println(outputMessage);
    }
    public void get(){
        try {

            Tecnico tecnico = pessoadao.getTecnico(request[2]);

            outputMessage = tecnico.toString();

        }catch (Exception e){
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }
    public void delete(){
        try {
            outputMessage = pessoadao.removeTecnico(request[2]);
        }catch (Exception e){
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }
    public void list(){
        try {
            outputMessage = pessoadao.listTecnicos();
        }catch (Exception e){
            outputMessage = e.getMessage();
        }
        output.println(outputMessage);
    }
}
