package Controllers;

import Services.PilotoService;

import java.io.PrintWriter;

public class CorredoresController {

    protected String[] request;
    protected PrintWriter output;


    public CorredoresController(String[] request, PrintWriter output){
        this.request = request;
        this.output = output;
    }

    public void selecionarOperacao(){

        switch (request[0]){
            case "INSERT":
                //Segui o msm padrão da classe Piloto.
                corredorService.add();
                break;
            case"UPDATE":
            corredorService.update();
                break;
            case"GET":
            corredorService.get();
                break;
            case"DELETE":
            corredorService.delete();
                break;
            case"LIST":
            corredorService.list();
                break;
            default:
                output.println("Dados inválidos");
        }
    }
}
