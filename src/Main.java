import java.io.IOException;

import Servers.ServerBase;

public class Main {

    public static void main(String[] args) throws IOException {
       
        ServerBase serverBase = new ServerBase();
        serverBase.initServer();
    }
}