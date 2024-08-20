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
            //    CorredoresService.add();
                break;
            case"UPDATE":
//CorredoresService.update();
                break;
            case"GET":
      //      CorredoresService.get();
                break;
            case"DELETE":
    //        CorredoresService.delete();
                break;
            case"LIST":
     //       CorredoresService.list();
                break;
            default:
                output.println("Dados inválidos");
        }
    }
}
