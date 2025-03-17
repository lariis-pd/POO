package sysLoja;

public class Peca {
    
    private int tamanho;
    private String material;
    private String cor;
    private String marca;
    private String modelo;

    

    public Peca(){
        tamanho = 0;
        material = null;
        cor = null;
        marca = null;
        modelo = null;
    }

    public Peca(int tamanho, String material, String cor, String marca, String modelo) {
        this.tamanho = tamanho;
        this.material = material;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
