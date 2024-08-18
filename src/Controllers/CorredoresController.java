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
                //Pode alterar para poder criar o corredores sem ter a lista de pilotos e tecnicos e dps adicionar um metodo para adicionar eles
                //da pra pegar e só colocar um metodo adicionar piloto pelo cpf a corredores ou algo do tipo
                //Qualquer coisa nesse sentido deve funcionar e ficar consistente
                break;
            case"UPDATE":
                break;
            case"GET":
                break;
            case"DELETE":
                break;
            case"LIST":
                break;
            default:
                output.println("Dados inválidos");
        }
    }
}
