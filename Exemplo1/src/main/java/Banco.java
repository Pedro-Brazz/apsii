public class Banco {
    private String nome;
    private String cpf;
    private double saldo;

    public Banco (String novoNome, String novoCPF, double novoSaldo) {
        this.nome = novoNome;
        this.cpf = novoCPF;
        this.saldo = novoSaldo;
    }

    public Banco () {
        this.nome = "Sem nome";
        this.cpf = "Sem cpf";
        this.saldo = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}
