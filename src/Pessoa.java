public class Pessoa {
    private String nome;
    private String sexo;
    private String cpf;
    private String cidade;
    private String telefone;

    Pessoa(String n, String s, String c, String tel, String cpf){
        this.nome = n;
        this.sexo =  s;
        this.cidade = c;
        this.telefone = tel;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getCidade(){
        return this.cidade;
    }


    public String toString() {
        String relatorio = "";
        relatorio = "Nome: " + this.nome + "\nCidade: " + this.cidade + "\nCPF: " + this.cpf;
        return relatorio;
    }
}
