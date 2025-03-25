package aula;
public class TestaFuncionario {
    
    public static void main(String[] args) {
        Gerente G1 = new Gerente();
        Gerente G2 = new Gerente();
        Gerente G3 = new Gerente();

        Funcionario funcionario = G2;
        funcionario = G1;
        funcionario = G2;

        /*Gerente ger = new Gerente();
        funcDiretor = ger;*/
        
        /*G1.setNome("Larissa");
        G1.setCpf("02365423599");
        G1.setSalario(6000);
        G1.setNumFuncionarios(8);
        G1.setSenha(0702);*/
    }
}
