package sysLoja;

public class Blusa_frio extends Peca {
    
    private boolean touca;
    private boolean bolsos;
    private String fecho;
    private boolean detalhes;
    
    public Blusa_frio(boolean touca, boolean bolsos, String fecho, boolean detalhes) {
        this.touca = touca;
        this.bolsos = bolsos;
        this.fecho = fecho;
        this.detalhes = detalhes;
    }
    public Blusa_frio(int tamanho, String material, String cor, String marca, String modelo, boolean touca,
            boolean bolsos, String fecho, boolean detalhes) {
        super(tamanho, material, cor, marca, modelo);
        this.touca = touca;
        this.bolsos = bolsos;
        this.fecho = fecho;
        this.detalhes = detalhes;
    }
    public boolean isTouca() {
        return touca;
    }
    public void setTouca(boolean touca) {
        this.touca = touca;
    }
    public boolean isBolsos() {
        return bolsos;
    }
    public void setBolsos(boolean bolsos) {
        this.bolsos = bolsos;
    }
    public String getFecho() {
        return fecho;
    }
    public void setFecho(String fecho) {
        this.fecho = fecho;
    }
    public boolean isDetalhes() {
        return detalhes;
    }
    public void setDetalhes(boolean detalhes) {
        this.detalhes = detalhes;
    }
}
