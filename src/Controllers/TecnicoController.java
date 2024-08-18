package Controllers;

import DAO.PessoaDAO;

import java.io.IOException;
import java.io.PrintWriter;

public class TecnicoController {

    protected String[] request;
    protected PrintWriter out;

    public TecnicoController(String[] request, PrintWriter out){
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
