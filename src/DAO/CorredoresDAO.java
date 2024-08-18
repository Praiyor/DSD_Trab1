package DAO;

import java.io.IOException;

public class CorredoresDAO {

    private static CorredoresDAO instance;

    public static CorredoresDAO getInstance() throws IOException {
        if (instance == null){
            instance = new CorredoresDAO();
        }

        return instance;
    }
}
