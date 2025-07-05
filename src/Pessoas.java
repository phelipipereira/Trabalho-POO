import java.util.ArrayList;
import java.util.List;

public class Pessoas {
    private List<Pessoa> pessoas;

    public Pessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa != null) {
            this.pessoas.add(pessoa);
            System.out.println("Pessoa '" + pessoa.getNome() + "' adicionada com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar uma pessoa nula.");
        }
    }

    public Pessoa buscarPessoaPorCpf(String cpf) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        System.out.println("Pessoa não encontrada!");
        return null;
    }

    public boolean removerPessoaPorCpf(String cpf) {
        Pessoa pessoaParaRemover = buscarPessoaPorCpf(cpf);
        if (pessoaParaRemover != null) {
            this.pessoas.remove(pessoaParaRemover);
            System.out.println("Pessoa com CPF '" + cpf + "' removida com sucesso!");
            return true;
        } else {
            System.out.println("Pessoa com CPF '" + cpf + "' não encontrada para remoção.");
            return false;
        }
    }

    public void listarTodasAsPessoas() {
        if (pessoas.isEmpty()) { // Verifica se a lista está vazia
            System.out.println("Nenhuma pessoa cadastrada ainda.");
        } else {
            System.out.println("\n--- LISTA DE PESSOAS CADASTRADAS ---");
            for (int i = 0; i < pessoas.size(); i++) {
                System.out.println((i + 1) + ". " + pessoas.get(i)); // Exibe cada pessoa (usando o toString() da Pessoa)
            }
            System.out.println("------------------------------------");
        }
    }


    public List<Pessoa> getTodasAsPessoas() {
        return new ArrayList<>(this.pessoas);
    }
}
