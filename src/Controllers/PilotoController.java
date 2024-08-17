package Controllers;

import DAO.PessoaDAO;

import java.io.PrintWriter;

public class PilotoController {

    private static PessoaDAO pessoaRepository;

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
}
