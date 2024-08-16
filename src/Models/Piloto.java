
package Models;




public class Piloto extends Pessoa{
    private String carros;


    public Piloto() {}
	
   
    public Piloto(String cpf, String nome, String endereco, String carros) {
		super(cpf, nome, endereco);
		this.carros = carros;
	}



}