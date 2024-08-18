package Controllers;

import DAO.PessoaDAO;

import java.io.IOException;
import java.io.PrintWriter;

//Mudar o nome pra algo que envolva pegar o tipo de entidade a ser pega para a operaçao
public class BaseController {

    protected String[] request;
    protected PrintWriter out;

    public BaseController(String[] request, PrintWriter out){
        this.request = request;
        this.out = out;
    }

    public void selecionarController() {
        //Provavelmente vamos colocar o tipo da pessoa ou se é corredores no segundo espaço da string
        //Tipo UPDATE;PILOTO
        String operacao = request[1];
        switch (operacao) {
            case "PILOTO":
                PilotoController pilotoController = new PilotoController(request, out);
                pilotoController.selecionarOperacao();
                break;
            case "TECNICO":
                TecnicoController tecnicoControllert = new TecnicoController(request, out);
                tecnicoControllert.selecionarOperacao();
                break;
            case "CORREDORES":
                CorredoresController corredoresController = new CorredoresController(request, out);
                corredoresController.selecionarOperacao();
                break;
            default:
                out.println("Dados inválidos");
        }
    }
}
