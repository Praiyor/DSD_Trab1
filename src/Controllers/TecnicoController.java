package Controllers;

import DAO.PessoaDAO;
import Services.PilotoService;
import Services.TecnicoService;

import java.io.IOException;
import java.io.PrintWriter;

public class TecnicoController {

    protected String[] request;
    protected PrintWriter output;

    public TecnicoController(String[] request, PrintWriter output){
        this.request = request;
        this.output = output;
    }



    public void selecionarOperacao() throws IOException {
        TecnicoService tecnicoService = new TecnicoService(request, output);

        switch (request[0]){
            case "INSERT":
                tecnicoService.add();
                break;
            case"UPDATE":
                tecnicoService.update();
                break;
            case"GET":
                tecnicoService.get();
                break;
            case"DELETE":
                tecnicoService.delete();
                break;
            case"LIST":
                tecnicoService.list();
                break;
            default:
                output.println("Dados inválidos");
        }
    }

}
