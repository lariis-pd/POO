package aula;
public class Gerente extends Funcionario{
    
    private int senha;
    private int numFuncionarios;

    public Gerente() {
        super();
        this.senha = 0;
        this.numFuncionarios = 0;
    }

    public Gerente(String nome, String cpf, int salario, int senha, int numFuncionarios) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numFuncionarios = numFuncionarios;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public boolean autenticaSenha(int senha){
        if (this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        }else{
            System.out.println("Acesso negado");
            return false;
        }
    }
}
