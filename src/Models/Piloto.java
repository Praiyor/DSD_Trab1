
package Models;

public class Piloto extends Pessoa{
    private String carros;


    public Piloto() {}
	
   
    public Piloto(String cpf, String nome, String endereco, String carros) {
		super(cpf, nome, endereco);
		this.carros = carros;
	}


	public String getCarros() {
		return carros;
	}

	public void setCarros(String carros) {
		this.carros = carros;
	}


    
	@Override
	public String toString() {
		return " Carros: " + getCarros() + " ";
	}



}