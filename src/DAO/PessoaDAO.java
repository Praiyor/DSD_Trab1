package DAO;

import Models.Pessoa;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PessoaDAO {

    //Podemos usar cpf ou nomes na primeira string
    static Map<String, Pessoa> pilotos = new HashMap<>();
    //Acho que podemos colocar equipe tanto em piloto quanto em tecnico
    static Map<String, Pessoa> tecnicos = new HashMap<>();

    private static PessoaDAO instance;

    private PessoaDAO(){

    }

    public static PessoaDAO getInstance() throws IOException{
        if (instance == null){
            instance = new PessoaDAO();
        }
        return instance;
    }

    public static void addPiloto(){}
    public static void addTecnico(){}

    public static void removePiloto(){}
    public static void removeTecnico(){}
}
