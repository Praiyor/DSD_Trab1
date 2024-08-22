package Controllers;

import DAO.PessoaDAO;
import Services.PilotoService;

import java.io.IOException;
import java.io.PrintWriter;

public class PilotoController {


    protected String[] request;

    protected PrintWriter output;


    public PilotoController(String[] request, PrintWriter output){
        this.request = request;
        this.output = output;
    }


    public void selecionarOperacao() throws IOException {
        PilotoService pilotoService = new PilotoService(request, output);

        System.out.println(request[0]);

        //Operacao a ser selecionada
        switch (request[0]){
            case "INSERT":
                pilotoService.add();
                break;
            case"UPDATE":
                pilotoService.update();
                break;
            case"GET":
                pilotoService.get();
                break;
            case"DELETE":
                pilotoService.delete();
                break;
            case"LIST":
                pilotoService.list();
                break;
            default:
                output.println("Dados inválidos aqui 2");
        }
    }
}
