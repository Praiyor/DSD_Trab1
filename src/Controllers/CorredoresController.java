package Controllers;

import java.io.PrintWriter;

public class CorredoresController {

    protected String[] request;
    protected PrintWriter out;

    public CorredoresController(String[] request, PrintWriter out){
        this.request = request;
        this.out = out;
    }

    public void selecionarOperacao(){
        String operacao = request[0];
        switch (operacao){
            case "INSERT":
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
                out.println("Dados inválidos");
        }
    }
}
