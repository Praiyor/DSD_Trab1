package Controllers;

import Services.CorredoresService;
import Services.PilotoService;

import java.io.IOException;
import java.io.PrintWriter;

public class CorredoresController {

    protected String[] request;
    protected PrintWriter output;


    public CorredoresController(String[] request, PrintWriter output){
        this.request = request;
        this.output = output;
    }

    public void selecionarOperacao() throws IOException{
    	
    	CorredoresService corredoresService = new CorredoresService(request, output);

        switch (request[0]){
            case "INSERT":
             corredoresService.add();
                break;
            case"UPDATE":
             corredoresService.update();
                break;
            case"GET":
            corredoresService.get();
                break;
            case"DELETE":
            corredoresService.delete();
                break;
            case"LIST":
            corredoresService.list();
                break;
            default:
                output.println("Dados inválidos");
        }
    }
}
