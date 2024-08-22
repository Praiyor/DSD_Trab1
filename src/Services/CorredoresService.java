package Services;

import DAO.CorredoresDAO;
import DAO.PessoaDAO;
import Models.Corredores;
import Models.Piloto;
import Models.Tecnico;

import java.io.IOException;
import java.io.PrintWriter;

public class CorredoresService {

	private final CorredoresDAO corredoresdao = CorredoresDAO.getInstance();

	protected String[] request;
	protected PrintWriter output;
	String outputMessage;

	public CorredoresService(String[] request, PrintWriter output) throws IOException {
		this.request = request;
		this.output = output;
	}

	public void add() {

		try {
			System.out.println(request);
			Corredores corredor = new Corredores(request[2], request[3] );
			corredoresdao.addCorredores(corredor);
            corredor.addPiloto(PessoaDAO.getInstance().getPiloto(request[4]));
            corredor.addTecnicos(PessoaDAO.getInstance().getTecnico(request[5]));
            
			outputMessage = "Corredores cadastrado com sucesso";

		} catch (Exception e) {
			outputMessage = "Ocorreu um erro ao tentar cadastrar o corredor, segue o erro:" + e.getMessage();
		}

		output.println(outputMessage);

	}

	public void update() {

		try {
			outputMessage = corredoresdao.atualizaCorredores(request[2], request[3]);

		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

	public void get() {
		try {
			outputMessage = corredoresdao.getCorredores(request[2]);
		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

	public void delete() {
		try {
			outputMessage = corredoresdao.removeCorredores(request[2]);
		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

	public void list() {

		try {
			outputMessage = corredoresdao.listCorredores();
		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

	public void addPiloto(){
		try {
			Piloto piloto = PessoaDAO.getInstance().getPiloto(request[3]);
			outputMessage = corredoresdao.AddPiloto(request[2],piloto);
		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

	public void addTecnico(){
		try {
			Tecnico tecnico = PessoaDAO.getInstance().getTecnico(request[3]);
			outputMessage = corredoresdao.AddTecnico(request[2],tecnico);
		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

	public void removePiloto() {
		try {
			Piloto piloto = PessoaDAO.getInstance().getPiloto(request[3]);

			outputMessage = corredoresdao.removePiloto(request[2], piloto);
		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

	public void removeTecnico() {
		try {
			Tecnico tecnico = PessoaDAO.getInstance().getTecnico(request[3]);

			outputMessage = corredoresdao.removeTecnico(request[2], tecnico);
		} catch (Exception e) {
			outputMessage = e.getMessage();
		}

		output.println(outputMessage);
	}

}
