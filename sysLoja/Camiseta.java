package sysLoja;

public class Camiseta extends Peca{
    
    private String tipo_gola;
    private String tipo_manga;
    private String estampa;
    
    public Camiseta(String tipo_gola, String tipo_manga, String estampa) {
        this.tipo_gola = tipo_gola;
        this.tipo_manga = tipo_manga;
        this.estampa = estampa;
    }
    public Camiseta(int tamanho, String material, String cor, String marca, String modelo, String tipo_gola,String tipo_manga, String estampa) {
        super(tamanho, material, cor, marca, modelo);
        this.tipo_gola = tipo_gola;
        this.tipo_manga = tipo_manga;
        this.estampa = estampa;
    }
    public String getTipo_gola() {
        return tipo_gola;
    }
    public void setTipo_gola(String tipo_gola) {
        this.tipo_gola = tipo_gola;
    }
    public String getTipo_manga() {
        return tipo_manga;
    }
    public void setTipo_manga(String tipo_manga) {
        this.tipo_manga = tipo_manga;
    }
    public String getEstampa() {
        return estampa;
    }
    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }
}
