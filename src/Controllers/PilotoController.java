package Controllers;

import DAO.PessoaDAO;

import java.io.IOException;
import java.io.PrintWriter;

public class PilotoController {


    //Pegar oq vem do client
    protected String[] request;

    //Dar o print no console do client pelo controller mesmo
    protected PrintWriter out;

    public PilotoController(String[] request, PrintWriter out){
        this.request = request;
        this.out = out;
    }

    //falta implementar o switch que vai chamar o service de piloto e o metodo referente do switch, esse switch vai ser chaamdo pelo basecontroller
    //Que vai ter um switch dentro dele q tbm vai ver qual controller ele deverá chamar

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
