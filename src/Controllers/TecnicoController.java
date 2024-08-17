package Controllers;

import DAO.PessoaDAO;

import java.io.PrintWriter;

public class TecnicoController {

    private static PessoaDAO pessoaRepository;

    protected String[] request;
    protected PrintWriter out;

    public TecnicoController(String[] request, PrintWriter out){
        this.request = request;
        this.out = out;
    }


}
