package sysLoja;

public class Calca extends Peca{
    
    private int qtd_bolsos;
    private String tam_cos;

    public Calca(int qtd_bolsos, String modelo) {
        this.qtd_bolsos = qtd_bolsos;
        
    }

    public Calca(int tamanho, String material, String cor, String marca, String modelo, int qtd_bolsos, String tam_cos) {
        super(tamanho, material, cor, marca, modelo);
        this.qtd_bolsos = qtd_bolsos;
        this.tam_cos = tam_cos;
    }

    public int getQtd_bolsos() {
        return qtd_bolsos;
    }
    public void setQtd_bolsos(int qtd_bolsos) {
        this.qtd_bolsos = qtd_bolsos;
    }
    public String getTam_cos() {
        return tam_cos;
    }

    public void setTam_cos(String tam_cos) {
        this.tam_cos = tam_cos;
    }
}
