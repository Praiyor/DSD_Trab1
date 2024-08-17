
package Models;

public class Piloto extends Pessoa{
    private String carro;

    public Piloto(String cpf, String nome, String endereco, String carro) {
		super(cpf, nome, endereco);
		this.carro = carro;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + carro;
	}
}