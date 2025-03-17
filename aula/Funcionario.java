package aula;
public class Funcionario {
    
    private String nome;
    private String cpf;
    private int salario;

    public Funcionario() {
        this.nome = null;
        this.cpf = null;
        this.salario = 0;
    }

    public Funcionario(String nome, String cpf, int salario) {
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}

