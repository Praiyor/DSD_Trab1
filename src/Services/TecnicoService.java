package Services;

import DAO.PessoaDAO;

import java.io.IOException;
import java.io.PrintWriter;

public class TecnicoService {

    private final PessoaDAO pessoadao = PessoaDAO.getInstance();

    protected String[] request;
    protected PrintWriter out;

    public TecnicoService(String[] request, PrintWriter out) throws IOException {
        this.request = request;
        this.out = out;
    }


    public void add(){

//        pessoadao.addPiloto();
    }
    public void update(){
//        pessoadao.atualizaTecnico();
    }
    public void get(){
//        pessoadao.getTecnico();
    }
    public void delete(){
//        pessoadao.removeTecnico();
    }
    public void list(){
        pessoadao.listTecnicos();
    }
}
