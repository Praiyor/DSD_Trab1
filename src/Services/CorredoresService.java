package Services;

import DAO.CorredoresDAO;
import DAO.PessoaDAO;
import Models.Corredores;

import java.io.IOException;
import java.io.PrintWriter;

public class CorredoresService {

    private final CorredoresDAO corredoresdao = CorredoresDAO.getInstance();

    protected String[] request;
    protected PrintWriter output;
    String outputMessage;

    public CorredoresService(String[] request, PrintWriter output) throws IOException {
        this.request = request;
        this.output = output;
    }

    public void add() {
        // String [] request = mais ou menos isso
        // "update;piloto;cpf;nome;endereco;carro"
        // String cpf = request[2];
        // String nome = request[3];
        // String endereco = request[4];
        // String carro = request[5];

        try {
            Corredores corredor = new Corredores(request[2], request[3]);
            corredoresdao.addCorredores(corredor);

            outputMessage = "Corredor cadastrado com sucesso";

        } catch (Exception e) {
            outputMessage = "Ocorreu um erro ao tentar cadastrar o corredor, segue o erro:" + e.getMessage();
        }

        output.println(outputMessage);

    }

    public void update() {
        // tem que testar fiz aquela gambira

        try {
            Corredor corredor = corredordao.atualizaCorredores(request[2], request[3]);
            outputMessage = corredor.toString();
        } catch (Exception e) {
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }

    public void get() {
        try {
            Corredores corredor = corredoresdao.getCorredor(request[2]);
            outputMessage = corredor.toString();
        } catch (Exception e) {
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }

    public void delete() {
        try {
            outputMessage = corredoresdao.removeCorredores(request[2]);
        } catch (Exception e) {
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }

    public void list() {

        try {
            outputMessage = corredoresdao.listCorredores();
        } catch (Exception e) {
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }

}
