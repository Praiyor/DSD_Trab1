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

    public void add() {
        // String [] request = mais ou menos isso
        // "update;piloto;cpf;nome;endereco;carro"
        // String cpf = request[2];
        // String nome = request[3];
        // String endereco = request[4];
        // String carro = request[5];

        try {
            Corredor corredor = new Corredor(request[2], request[3], request[4], request[5]);
            corredordao.addCorredor(corredor);

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
            Corredor corredor = corredordao.getCorredor(request[2]);
            outputMessage = corredor.toString();
        } catch (Exception e) {
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }

    public void delete() {
        try {
            outputMessage = corredordao.removeCorredor(request[2]);
        } catch (Exception e) {
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }

    public void list() {

        try {
            outputMessage = corredordao.listPilotos();
        } catch (Exception e) {
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }

}
