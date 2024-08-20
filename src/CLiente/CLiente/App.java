package CLiente;

import java.io.IOException;
import java.util.Scanner;

import CLiente.Controler.*;

public class App {

	public static Controller con;
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.println("Digite o IP do Servidor");
		String ip = s.next();
		con = new Controller();
		con.salvaIp(ip);
		opcoes();

	}

	public static void opcoes() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma operação:");
			System.out.println("1. + opções Corredores");
	 //		System.out.println("2. + opções Pessoa"); ver se vai ter
			System.out.println("3. + opções Piloto");
			System.out.println("4. + opções Tecnico");
			System.out.println("5. Sair");
			System.out.print("Opção: ");

			int opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Selecionou 1");
				opcaoCorredores();
				continuar = false;
				break;
			case 2:
				System.out.println("Selecionou 2.");
				opcaoPessoa();
				continuar = false;
				break;
			case 3:
				System.out.println("Selecionou 3.");
				opcaoPiloto();
				continuar = false;
				break;
			case 4:
				System.out.println("Selecionou 4.");
				opcaoTecnico();
				continuar = false;
				break;
			case 5:
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	public static void opcaoCorredores() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma operação:");
			System.out.println("1. Criar Corredores");
			System.out.println("2. Atualizar Corredores");
			System.out.println("3. Obter Corredores");
			System.out.println("4. Deletar Corredores");
			System.out.println("5. Obter todos ss Corredores");
			System.out.println("6. Voltar");
			System.out.print("Opção: ");

			int opcao = s.nextInt();
			s.nextLine();

			String torneio = "";
			String premio = "";

			switch (opcao) {
			case 1:
				System.out.println("1. Criar Corredores ");
				System.out.println("Digite o Nome dos Corredores");
				torneio = s.next();
				System.out.println("Digite o Premio");
				premio = s.next();
				System.out.println(torneio + " " + premio);
				con.enviarMsgCorredores("INSERT", torneio, premio);
				continuar = false;
				opcaoCorredores();
				break;
			case 2:
				System.out.println("2. Atualizar Corredores");

				System.out.println("Digite o Torneio");
				torneio = s.next();

				System.out.println("Digite o premio");
				premio = s.next();

				System.out.println(torneio + " " + premio);
				con.enviarMsgCorredores("UPDATE", torneio, premio);
				continuar = false;
				opcaoCorredores();
				break;
			case 3:
				System.out.println("3. Obter Corredores.");

				System.out.println("Digite o tornio");
				torneio = s.next();

				con.enviarMsg("CORREDORES", "GET", torneio);
				continuar = false;
				opcaoCorredores();
				break;
			case 4:
				System.out.println("4. Deletar Torneio");
				System.out.println("Digite o nome do torneio");
				torneio = s.next();
				con.enviarMsg("CORREDORES", "DELETE", torneio);
				continuar = false;
				opcaoCorredores();
				break;
			case 5:
				System.out.println("5. Obter todos os Corredores");

				con.getList("CORREDORES");
				continuar = false;
				opcaoCorredores();
				break;
			case 6:
				continuar = false;
				opcoes();
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	public static void opcaoPessoa() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma operação:");
			System.out.println("1. Criar Pessoa");
			System.out.println("2. Atualizar Pessoa");
			System.out.println("3. Obter Pessoa");
			System.out.println("4. Deletar Pessoa");
			System.out.println("5. Obter todas as Pessoa");
			System.out.println("6. Voltar");
			System.out.print("Opção: ");

			int opcao = s.nextInt();
			s.nextLine();

			String cpf = "";
			String nome = "";
			String endereco = "";

			switch (opcao) {
			case 1:
				System.out.println("1. Criar Pessoa ");
				System.out.println("Digite o CPF da Pessoa");
				cpf = s.next();
				System.out.println("Digite o Nome da Pessoa");
				nome = s.next();
				System.out.println("Digite o endere�o da Pessoa");
				endereco = s.next();
				System.out.println(nome + " " + cpf + " " + endereco);
				// con.enviarMsgPessoa("INSERT", cpf, nome, endereco);
				continuar = false;
				opcaoPessoa();
				break;
			case 2:
				System.out.println("2. Atualizar Pessoa");

				System.out.println("Digite o CNPJ da Pessoa");
				cpf = s.next();

				System.out.println("Digite o Nome da Pessoa");
				nome = s.next();

				System.out.println("Digite o endere�o da Pessoa");
				endereco = s.next();
				System.out.println(nome + " " + cpf + " " + endereco);
				// con.enviarMsgPessoa("UPDATE", cpf, nome, endereco);
				continuar = false;
				opcaoPessoa();
				break;
			case 3:
				System.out.println("3. Obter Pessoa.");

				System.out.println("Digite o CPF da Pessoa");
				cpf = s.next();

				con.enviarMsg("PESSOA", "GET", cpf);
				continuar = false;
				opcaoPessoa();
				break;
			case 4:
				System.out.println("4. Deletar Pessoa");
				System.out.println("Digite o CPF da Pessoa");
				cpf = s.next();
				con.enviarMsg("PESSOA", "DELETE", cpf);
				continuar = false;
				opcaoPessoa();
				break;
			case 5:
				System.out.println("5. Obter todas as Pessoas");

				con.getList("PESSOA");
				continuar = false;
				opcaoPessoa();
				break;
			case 6:
				continuar = false;
				opcoes();
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	public static void opcaoPiloto() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma operação:");
			System.out.println("1. Criar Piloto");
			System.out.println("2. Atualizar Piloto");
			System.out.println("3. Obter Piloto");
			System.out.println("4. Deletar Piloto");
			System.out.println("5. Obter todos os Pilotos");
			System.out.println("6. Voltar");
			System.out.print("Opção: ");

			int opcao = s.nextInt();
			s.nextLine();

			String cpf = "";
			String nome = "";
			String endereco = "";
			String carro = "";

			switch (opcao) {
			case 1:
				System.out.println("1. Criar Piloto ");
				System.out.println("Digite o CPF da Piloto");
				cpf = s.next();
				System.out.println("Digite o Nome do Piloto");
				nome = s.next();
				System.out.println("Digite o Endere�o do Piloto");
				endereco = s.next();
				System.out.println("Digite o Carro do Piloto");
				carro = s.next();
				System.out.println(nome + " " + cpf + " " + endereco + " " + carro);
				con.enviarMsgPiloto("INSERT", cpf, nome, endereco, carro);
				continuar = false;
				opcaoPiloto();
				break;
			case 2:
				System.out.println("2. Atualizar Piloto");

				System.out.println("Digite o CNPJ da Piloto");
				cpf = s.next();

				System.out.println("Digite o Nome da Piloto");
				nome = s.next();

				System.out.println("Digite o endere�o da Piloto");
				endereco = s.next();

				System.out.println("Digite o Sal�rio do Piloto");
				carro = s.next();

				System.out.println(nome + " " + cpf + " " + endereco + " " + carro);
				con.enviarMsgPiloto("UPDATE", cpf, nome, endereco, carro);
				continuar = false;
				opcaoPiloto();
				break;
			case 3:
				System.out.println("3. Obter Piloto.");

				System.out.println("Digite o CPF do Piloto");
				cpf = s.next();

				con.enviarMsg("PILOTO", "GET", cpf);
				continuar = false;
				opcaoPiloto();
				break;
			case 4:
				System.out.println("4. Deletar Piloto");
				System.out.println("Digite o CPF do Piloto");
				cpf = s.next();
				con.enviarMsg("PILOTO", "DELETE", cpf);
				continuar = false;
				opcaoPiloto();
				break;
			case 5:
				System.out.println("5. Obter todos os Pilotos");

				con.getList("PILOTOS");
				continuar = false;
				opcaoPiloto();
				break;
			case 6:
				continuar = false;
				opcoes();
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	public static void opcaoTecnico() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma operação:");
			System.out.println("1. Criar Tecnico");
			System.out.println("2. Atualizar Tecnico");
			System.out.println("3. Obter Tecnico");
			System.out.println("4. Deletar Tecnico");
			System.out.println("5. Obter todos os Jovens aprendizes");
			System.out.println("6. Voltar");
			System.out.print("Opção: ");

			int opcao = s.nextInt();
			s.nextLine();

			String cpf = "";
			String nome = "";
			String endereco = "";
			String especialidade = "";
			int experiencia = 0;

			switch (opcao) {
			case 1:
				System.out.println("1. Criar Tecnico ");
				System.out.println("Digite o CPF do Tecnico");
				cpf = s.next();
				System.out.println("Digite o Nome do Tecnico");
				nome = s.next();
				System.out.println("Digite o Endere�o do Tecnico");
				endereco = s.next();
				System.out.println("Digite a especialidade do Tecnico");
				especialidade = s.next();
				System.out.println("Digite a experiencia do Tecnico");
				experiencia = s.nextInt();
				System.out.println(nome + " " + cpf + " " + endereco + " " + experiencia);
				con.enviarMsgTecnico("INSERT", cpf, nome, endereco, especialidade, experiencia);
				continuar = false;
				opcaoTecnico();
				break;
			case 2:
				System.out.println("2. Atualizar Tecnico");

				System.out.println("Digite o CPF do Tecnico");
				cpf = s.next();

				System.out.println("Digite o Nome do Tecnico");
				nome = s.next();

				System.out.println("Digite o endere�o do Tecnico");
				endereco = s.next();

				System.out.println("Digite a Expecialidade do Tecnico");
				especialidade = s.next();

				System.out.println("Digite a Idade do Tecnico");
				experiencia = s.nextInt();

				System.out.println(nome + " " + cpf + " " + endereco + " " + experiencia);
				con.enviarMsgTecnico("UPDATE", cpf, nome, endereco, especialidade, experiencia);
				continuar = false;
				opcaoTecnico();
				break;
			case 3:
				System.out.println("3. Obter Tecnico.");

				System.out.println("Digite o CPF do Tecnico");
				cpf = s.next();

				con.enviarMsg("TECNICO", "GET", cpf);
				continuar = false;
				opcaoTecnico();
				break;
			case 4:
				System.out.println("4. Deletar Tecnico");
				System.out.println("Digite o CPF do Tecnico");
				cpf = s.next();
				con.enviarMsg("TECNICO", "DELETE", cpf);
				continuar = false;
				opcaoTecnico();
				break;
			case 5:
				System.out.println("5. Obter todos os Tecnicos");

				con.getList("TECNICO");
				continuar = false;
				opcaoTecnico();
				break;
			case 6:
				continuar = false;
				opcoes();
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}
}