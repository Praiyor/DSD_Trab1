package Services;

import DAO.PessoaDAO;
import Models.Piloto;

import java.io.IOException;
import java.io.PrintWriter;

public class PilotoService {

    private final PessoaDAO pessoadao = PessoaDAO.getInstance();

    protected String[] request;
    protected PrintWriter out;

    public PilotoService(String[] request, PrintWriter out) throws IOException {
        this.request = request;
        this.out = out;
    }


    public void add(){
        // String [] request = mais ou menos isso "update;piloto;cpf;nome;endereco;carro"
//        String cpf = request[2];
//        String nome = request[3];
//        String endereco = request[4];
//        String carro = request[5];
        Piloto piloto = new Piloto(request[2], request[3],request[4],request[5]);
        pessoadao.addPiloto(piloto);
    }
    public void update(){
//        pessoadao.atualizaPiloto();
    }
    public void get(){
//        pessoadao.getPiloto();
    }
    public void delete(){
//        pessoadao.removePiloto();
    }
    public void list(){
        pessoadao.listPilotos();
    }
}
