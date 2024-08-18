package Services;

import DAO.CorredoresDAO;
import DAO.PessoaDAO;

import java.io.IOException;
import java.io.PrintWriter;

public class CorredoresService {


    private final CorredoresDAO corredoresdao = CorredoresDAO.getInstance();

    protected String[] request;
    protected PrintWriter out;

    public CorredoresService(String[] request, PrintWriter out) throws IOException {
        this.request = request;
        this.out = out;
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
