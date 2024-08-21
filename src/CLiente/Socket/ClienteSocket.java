package CLiente.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteSocket {

	public ClienteSocket() {
	}

	public void conectaSocket(String ip, String msgEnviada) throws IOException {

		System.out.println("Criando conex�o...");
		try (Socket conn = new Socket(ip, 175);) {

			System.out.println("Conex�o estabelecida.");
			
			PrintWriter out = new PrintWriter(conn.getOutputStream(), true); // true para autoflush
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			out.println(msgEnviada);
			System.out.println(msgEnviada);

			String msgRecebida = in.readLine();
			System.out.println("Mensagem recebida " + msgRecebida);

		}

		catch (UnknownHostException e) {
			System.out.println("host n�o encontrado");
			e.printStackTrace();
		}

	}
}
