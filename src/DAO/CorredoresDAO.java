 package DAO;

import Models.Corredores;
import Exceptions.CorredorNEncontradoException;

import java.util.HashMap;
import java.util.Map;


// fiz uma cópia da classe PessoaDAO
public class CorredoresDAO {

    private static Map<String, Corredores> corredoresMap = new HashMap<>();
    private static CorredoresDAO instance;

    private static final String noCorredores = "Não possui registros de corredores";
    private static final String notFound = "Não foi possível encontrar um torneio com o nome passado";

    private CorredoresDAO() {}

    public static CorredoresDAO getInstance() {
        if (instance == null) {
            instance = new CorredoresDAO();
        }
        return instance;
    }

    public void addCorredores(Corredores corredores) {
        corredoresMap.put(corredores.getTorneio(), corredores);
    }

    public String removeCorredores(String torneio) {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        if (corredoresMap.containsKey(torneio)) {
            corredoresMap.remove(torneio);
            return "Registro do torneio removido com sucesso!";
        }
        return notFound;
    }

    public Corredores getCorredores(String torneio) {
        if (corredoresMap.isEmpty()) {
            throw new CorredorNEncontradoException(noCorredores);
        }
        if (corredoresMap.containsKey(torneio)) {
            return corredoresMap.get(torneio);
        }
        throw new CorredorNEncontradoException(notFound);
    }

    public String listCorredores() {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        StringBuilder listaCorredores = new StringBuilder();

        for (Corredores corredores : corredoresMap.values()) {
            listaCorredores.append(corredores.toString()).append("\n");
        }

        return listaCorredores.toString();
    }

    public String atualizaCorredores(String torneio, String premio) {
        if (corredoresMap.isEmpty()) {
            return noCorredores;
        }
        if (corredoresMap.containsKey(torneio)) {
            Corredores corredores = corredoresMap.get(torneio);
            corredores.setPremio(premio);
            return "Torneio atualizado com sucesso!";
        }
        return notFound;
    }

}