package Servers;

import Controllers.BaseController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerBase {
    //vai iniciar o server e receber o input do usuario, que vai ser o string com as divisorias
    // vai dar o split e chamar o baseController mandando o printwriter que vamos instanciar aqui e o request q é o array de String dps de dar o split
    // ai o server vai dar o out no console do client pelo service dps de realizar a operaçao no service

    ServerSocket server = new ServerSocket(80);
    String requestReceived;
    String [] requestToServer;

    BufferedReader input;
    PrintWriter output;

    private BaseController baseController;

    public ServerBase() throws IOException {

    }

    public void initServer() throws IOException {

        server.setReuseAddress(true);

        System.out.println("Server iniciado");

        while(true){
            try {
                Socket connection = server.accept();

                input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                output = new PrintWriter(connection.getOutputStream(), true);

                requestReceived = input.readLine();

                requestToServer = requestReceived.split(";");

                baseController = new BaseController(requestToServer, output);
                baseController.selecionarController();

                connection.close();
            }catch (Exception e){
                output.print("Server fechou");
                server.close();
            }
        }
    }
}
