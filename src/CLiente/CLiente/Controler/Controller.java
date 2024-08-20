package CLiente.Controler;
import java.io.IOException;

import Controler.ClienteSocket;

public class Controller {
	private String ip;

	public void enviarMsgCorredores(String operacao, String torneio, String premio) throws IOException {

		String mensagem = "CORREDORES" + ";" + operacao + ";" + torneio + ";" + premio;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}
	
	public void enviarMsgPiloto(String operacao, String cpf, String nome, String endereco, String carro) throws IOException {

		String mensagem = "PILOTO" + ";" + operacao + ";" + cpf + ";" + nome + ";" + endereco + ";" + carro;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}
	
	public void enviarMsgTecnico(String operacao, String cpf, String nome, String endereco, String especialidade, int experiencia) throws IOException {

		String mensagem = "TECNICO" + ";" + operacao + ";" + cpf + ";" + nome + ";" + endereco + ";" + especialidade ;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}

	public String getIp() {
		return ip;
	}

	public void salvaIp(String ip) {
		this.ip = ip;
	}

	public void enviarMsg(String classe, String operacao, String cnpj) throws IOException {
		String mensagem = classe + ";" + operacao + ";" + cnpj;

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}

	public void getList(String classe) throws IOException {
		String mensagem = classe + ";" + "LIST";

		ClienteSocket cli = new ClienteSocket();

		cli.conectaSocket(getIp(), mensagem);

	}
}
