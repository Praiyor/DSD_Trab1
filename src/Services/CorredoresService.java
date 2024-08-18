package Services;

import DAO.CorredoresDAO;
import DAO.PessoaDAO;

import java.io.IOException;
import java.io.PrintWriter;

public class CorredoresService {


    private final CorredoresDAO corredoresdao = CorredoresDAO.getInstance();

    protected String[] request;
    protected PrintWriter output;

    public CorredoresService(String[] request, PrintWriter output) throws IOException {
        this.request = request;
        this.output = output;
    }


    public void add(){
//        corredoresdao.add();
    }
    public void update(){
//        corredoresdao.atualiza();
    }
    public void get(){
//        corredoresdao.get();
    }
    public void delete(){
//        corredoresdao.remove();
    }
    public void list(){
//        corredoresdao.list();
    }
}
