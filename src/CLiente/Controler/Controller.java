package CLiente.Controler;
import CLiente.Socket.ClienteSocket;

import java.io.IOException;

public class Controller {
	private String ip;

	public void enviarMsgCorredores(String operacao, String torneio, String premio, String cpfPiloto, String cpfTecnico) throws IOException {

		String mensagem = operacao + ";" + "CORREDORES" + ";" + torneio + ";" + premio + ";" + cpfPiloto + ";" + cpfTecnico;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}
	
	public void enviarMsgPiloto(String operacao, String cpf, String nome, String endereco, String carro) throws IOException {

		String mensagem = operacao + ";" + "PILOTO" + ";" + cpf + ";" + nome + ";" + endereco + ";" + carro;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}
	
	public void enviarMsgTecnico(String operacao, String cpf, String nome, String endereco, String especialidade, int experiencia) throws IOException {

		String mensagem = operacao + ";" + "TECNICO" + ";" + cpf + ";" + nome + ";" + endereco + ";" + especialidade + ";" + experiencia;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}

	public String getIp() {
		return ip;
	}

	public void salvaIp(String ip) {
		this.ip = ip;
	}

	public void enviarMsg(String classe, String operacao, String identificador) throws IOException {
		String mensagem = operacao + ";" + classe + ";" + identificador;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}

	public void enviarUpdateCorredores(String operacao, String torneio, String premio) throws IOException {
		String mensagem = operacao + ";" + "CORREDORES" +";" + torneio + ";" + premio;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);
	}

	public void addOnCorredores(String operacao, String torneio, String cpf) throws IOException {
		String mensagem = operacao + ";"+ "CORREDORES" + ";" + torneio + ";" + cpf;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);
	}

	public void removeOnCorredores(String operacao, String torneio, String cpf) throws IOException {
		String mensagem = operacao + ";"+ "CORREDORES" + ";" + torneio + ";" + cpf;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);
	}

	public void getList(String classe) throws IOException {
		String mensagem = "LIST" + ";" + classe;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}
}
