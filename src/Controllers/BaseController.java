package Controllers;

import DAO.PessoaDAO;

import java.io.IOException;
import java.io.PrintWriter;

//Mudar o nome pra algo que envolva pegar o tipo de entidade a ser pega para a operaçao
public class BaseController {

    protected String[] request;
    protected PrintWriter output;

    public BaseController(String[] request, PrintWriter output){
        this.request = request;
        this.output = output;
    }

    public void selecionarController() throws IOException {

        String operacao = request[1];

        System.out.println(operacao);
        switch (operacao) {
            case "PILOTO":
                PilotoController pilotoController = new PilotoController(request, output);
                pilotoController.selecionarOperacao();
                break;
            case "TECNICO":
                TecnicoController tecnicoControllert = new TecnicoController(request, output);
                tecnicoControllert.selecionarOperacao();
                break;
            case "CORREDORES":
                CorredoresController corredoresController = new CorredoresController(request, output);
                corredoresController.selecionarOperacao();
                break;
            default:
                output.println("Dados inválidos aqui");
        }
    }
}
