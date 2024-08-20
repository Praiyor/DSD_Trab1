package CLiente;

import java.io.IOException;
import java.util.Scanner;

import controller.Controller;

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
			System.out.println("Escolha uma opera��o:");
			System.out.println("1. + Op��es Oficina");
			System.out.println("2. + Op��es Pessoa");
			System.out.println("3. + Op��es Mecanico");
			System.out.println("4. + Op��es Jovem Aprendiz");
			System.out.println("5. Sair");
			System.out.print("Op��o: ");

			int opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Selecionou 1");
				opcaoOficina();
				continuar = false;
				break;
			case 2:
				System.out.println("Selecionou 2.");
				opcaoPessoa();
				continuar = false;
				break;
			case 3:
				System.out.println("Selecionou 3.");
				opcaoMecanico();
				continuar = false;
				break;
			case 4:
				System.out.println("Selecionou 4.");
				opcaoJovemAprendiz();
				continuar = false;
				break;
			case 5:
				continuar = false;
				break;
			default:
				System.out.println("Op��o inv�lida.");
			}
		}
	}

	public static void opcaoOficina() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma opera��o:");
			System.out.println("1. Criar Oficina");
			System.out.println("2. Atualizar Oficina");
			System.out.println("3. Obter Oficina");
			System.out.println("4. Deletar Oficina");
			System.out.println("5. Obter todas as Oficinas");
			System.out.println("6. Voltar");
			System.out.print("Op��o: ");

			int opcao = s.nextInt();
			s.nextLine();

			String cnpj = "";
			String nome = "";
			String endereco = "";

			switch (opcao) {
			case 1:
				System.out.println("1. Criar Oficina ");
				System.out.println("Digite o CNPJ da Oficina");
				cnpj = s.next();
				System.out.println("Digite o Nome da Oficina");
				nome = s.next();
				System.out.println("Digite o endere�o da Oficina");
				endereco = s.next();
				System.out.println(nome + " " + cnpj + " " + endereco);
				con.enviarMsgOficina("INSERT", cnpj, nome, endereco);
				continuar = false;
				opcaoOficina();
				break;
			case 2:
				System.out.println("2. Atualizar Oficina");

				System.out.println("Digite o CNPJ da Oficina");
				cnpj = s.next();

				System.out.println("Digite o Nome da Oficina");
				nome = s.next();

				System.out.println("Digite o endere�o da Oficina");
				endereco =  s.next();
				System.out.println(nome + " " + cnpj + " " + endereco);
				con.enviarMsgOficina("UPDATE", cnpj, nome, endereco);
				continuar = false;
				opcaoOficina();
				break;
			case 3:
				System.out.println("3. Obter Oficina.");

				System.out.println("Digite o CNPJ da Oficina");
				cnpj = s.next();

				con.enviarMsg("OFICINA","GET", cnpj);
				continuar = false;
				opcaoOficina();
				break;
			case 4:
				System.out.println("4. Deletar Oficina");
				System.out.println("Digite o CNPJ da Oficina");
				cnpj = s.next();
				con.enviarMsg("OFICINA","DELETE", cnpj);
				continuar = false;
				opcaoOficina();
				break;
			case 5:
				System.out.println("5. Obter todas as Oficinas");

				con.getList("OFICINA");
				continuar = false;
				opcaoOficina();
				break;
			case 6:
				continuar = false;
				opcoes();
				break;
			default:
				System.out.println("Op��o inv�lida.");
			}
		}
	}

	public static void opcaoPessoa() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma opera��o:");
			System.out.println("1. Criar Pessoa");
			System.out.println("2. Atualizar Pessoa");
			System.out.println("3. Obter Pessoa");
			System.out.println("4. Deletar Pessoa");
			System.out.println("5. Obter todas as Pessoa");
			System.out.println("6. Voltar");
			System.out.print("Op��o: ");

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
				con.enviarMsgPessoa("INSERT", cpf, nome, endereco);
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
				con.enviarMsgPessoa("UPDATE", cpf, nome, endereco);
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
				con.enviarMsg("PESSOA","DELETE", cpf);
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
				System.out.println("Op��o inv�lida.");
			}
		}
	}

	public static void opcaoMecanico() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma opera��o:");
			System.out.println("1. Criar Mecanico");
			System.out.println("2. Atualizar Mecanico");
			System.out.println("3. Obter Mecanico");
			System.out.println("4. Deletar Mecanico");
			System.out.println("5. Obter todos os Mecanicos");
			System.out.println("6. Voltar");
			System.out.print("Op��o: ");

			int opcao = s.nextInt();
			s.nextLine();

			String cpf = "";
			String nome = "";
			String endereco = "";
			String salario = "";

			switch (opcao) {
			case 1:
				System.out.println("1. Criar Mecanico ");
				System.out.println("Digite o CPF da Mecanico");
				cpf = s.next();
				System.out.println("Digite o Nome do Mecanico");
				nome = s.next();
				System.out.println("Digite o Endere�o do Mecanico");
				endereco = s.next();
				System.out.println("Digite o Sal�rio do Mecanico");
				salario = s.next();
				System.out.println(nome + " " + cpf + " " + endereco + " " + salario);
				con.enviarMsgMecanico("INSERT", cpf, nome, endereco, salario);
				continuar = false;
				opcaoMecanico();
				break;
			case 2:
				System.out.println("2. Atualizar Mecanico");

				System.out.println("Digite o CNPJ da Mecanico");
				cpf = s.next();

				System.out.println("Digite o Nome da Mecanico");
				nome = s.next();

				System.out.println("Digite o endere�o da Mecanico");
				endereco = s.next();

				System.out.println("Digite o Sal�rio do Mecanico");
				salario = s.next();

				System.out.println(nome + " " + cpf + " " + endereco + " " + salario);
				con.enviarMsgMecanico("UPDATE", cpf, nome, endereco, salario);
				continuar = false;
				opcaoMecanico();
				break;
			case 3:
				System.out.println("3. Obter Mecanico.");

				System.out.println("Digite o CPF do Mecanico");
				cpf = s.next();

				con.enviarMsg("MECANICO","GET", cpf);
				continuar = false;
				opcaoMecanico();
				break;
			case 4:
				System.out.println("4. Deletar Mecanico");
				System.out.println("Digite o CPF do Mecanico");
				cpf = s.next();
				con.enviarMsg("MECANICO","DELETE", cpf);
				continuar = false;
				opcaoMecanico();
				break;
			case 5:
				System.out.println("5. Obter todos os Mecanicos");

				con.getList("MECANICO");
				continuar = false;
				opcaoMecanico();
				break;
			case 6:
				continuar = false;
				opcoes();
				break;
			default:
				System.out.println("Op��o inv�lida.");
			}
		}
	}

	public static void opcaoJovemAprendiz() throws IOException {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Escolha uma opera��o:");
			System.out.println("1. Criar Jovem Aprendiz");
			System.out.println("2. Atualizar Jovem Aprendiz");
			System.out.println("3. Obter Jovem Aprendiz");
			System.out.println("4. Deletar Jovem Aprendiz");
			System.out.println("5. Obter todos os Jovens aprendizes");
			System.out.println("6. Voltar");
			System.out.print("Op��o: ");

			int opcao = s.nextInt();
			s.nextLine();

			String cpf = "";
			String nome = "";
			String endereco = "";
			String idade = "";

			switch (opcao) {
			case 1:
				System.out.println("1. Criar Jovem Aprendiz ");
				System.out.println("Digite o CPF do Jovem Aprendiz");
				cpf = s.next();
				System.out.println("Digite o Nome do Jovem Aprendiz");
				nome = s.next();
				System.out.println("Digite o Endere�o do Jovem Aprendiz");
				endereco = s.next();
				System.out.println("Digite a Idade do Jovem Aprendiz");
				idade = s.next();
				System.out.println(nome + " " + cpf + " " + endereco + " " + idade);
				con.enviarMsgJovem("INSERT", cpf, nome, endereco, idade);
				continuar = false;
				opcaoJovemAprendiz();
				break;
			case 2:
				System.out.println("2. Atualizar Jovem Aprendiz");

				System.out.println("Digite o CNPJ da Jovem Aprendiz");
				cpf = s.next();

				System.out.println("Digite o Nome da Jovem Aprendiz");
				nome = s.next();

				System.out.println("Digite o endere�o da Jovem Aprendiz");
				endereco = s.next();

				System.out.println("Digite a Idade do Jovem Aprendiz");
				idade = s.next();

				System.out.println(nome + " " + cpf + " " + endereco + " " + idade);
				con.enviarMsgJovem("UPDATE", cpf, nome, endereco, idade);
				continuar = false;
				opcaoJovemAprendiz();
				break;
			case 3:
				System.out.println("3. Obter Jovem Aprendiz.");

				System.out.println("Digite o CPF do Jovem Aprendiz");
				cpf = s.next();

				con.enviarMsg("MECANICO","GET", cpf);
				continuar = false;
				opcaoJovemAprendiz();
				break;
			case 4:
				System.out.println("4. Deletar Jovem Aprendiz");
				System.out.println("Digite o CPF do Jovem Aprendiz");
				cpf = s.next();
				con.enviarMsg("JOVEM","DELETE", cpf);
				continuar = false;
				opcaoJovemAprendiz();
				break;
			case 5:
				System.out.println("5. Obter todos os Jovem Aprendizs");

				con.getList("JOVEM");
				continuar = false;
				opcaoJovemAprendiz();
				break;
			case 6:
				continuar = false;
				opcoes();
				break;
			default:
				System.out.println("Op��o inv�lida.");
			}
		}
	}
}

    
}
