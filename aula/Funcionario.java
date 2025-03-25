package aula;
public class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {
        this.nome = null;
        this.cpf = null;
        this.salario = 0;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = null;
        this.cpf = null;
        this.salario = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificaçao(){
        return this.getSalario() * 0.11;
    }
    
}

