package Models;

import java.util.List;

public class Corredores {

    private String torneio;
    private String premio;

    private List<Piloto> corredores;
    private List<Tecnico> tecnicos;

    public Corredores(String torneio, String premio, List<Piloto> corredores, List<Tecnico> tecnicos){
        this.torneio = torneio;
        this.premio = torneio;
        this.corredores = corredores;
        this.tecnicos = tecnicos;
    }

    public String getTorneio(){
        return this.torneio;
    }

    public void setTorneio(String torneio){
        this.torneio = torneio;
    }

    public String getPremio(){
        return this.premio;
    }

    public void setPremio(String premio){
        this.premio = premio;
    }

    public List<Piloto> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Piloto> corredores) {
        this.corredores = corredores;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    //Falta atualizar para o mesmo padrao de pessoa agora, pra facilitar a hora de mandar pro client
    @Override
    public String toString() {
        return "Corredores{" +
                "torneio='" + torneio + '\'' +
                ", premio='" + premio + '\'' +
                ", corredores=" + corredores +
                ", tecnicos=" + tecnicos +
                '}';
    }
}
