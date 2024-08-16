
package Models;

public class Tecnico extends Pessoa{
    private String especialidade;
    private int experiencia;

    public Tecnico() {}


        public Tecnico(String cpf, String nome, String endereco, String especialidade, int experiencia) {
		super(cpf, nome, endereco);
		this.carros = especialidade;
        this.experiencia = experiencia;
	}


	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return " Especialidade: " + getEspecialidade() + " Experiencia: " + getEspecialidade();
	}

}