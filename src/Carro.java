public class Carro extends Veiculo{
    private String modelo;
    private String cor;
    private int ano;
    private Pessoa proprietario;
    private Vaga vaga;

    public Carro(int hE, int mE, String m, String c, int a, Pessoa p){
        super(hE, mE);
        this.modelo = m;
        this.ano = a;
        this.cor = c;
        this.proprietario = p;
    }

    public String getProprietarioCPF(){
        return this.proprietario.getCpf();
    }

    public Pessoa getProprietario(){
        return this.proprietario;
    }



    public String toString() {
        String relatorio;
        relatorio ="\n\n" + "Modelo: " + this.modelo + "\nCor: "
                + this.cor + "\nAno: " + this.ano + "\nProprietário: " + this.proprietario.getNome()
                + "\nCPF do proprietario: " + this.getProprietarioCPF();
        return relatorio;
    }

    private float calcularpagamento(int hS, int mS, float v) {
        float valorPorHora = v;
        float valorPagamento = 0;
        int horaNolocal;
        int minNolocal;

        if (hS > 0 && hS > 0) {
            horaNolocal = hS - this.horaEntrada;
            minNolocal = mS - this.MinEntrada;
            valorPagamento = (horaNolocal * valorPorHora) + (minNolocal * (60/valorPorHora));
        } else if (hS == 0) {
            minNolocal = mS - this.MinEntrada;
            valorPagamento = minNolocal * (60/valorPorHora);
        } else if (mS == 0){
            horaNolocal = hS - this.horaEntrada;
            valorPagamento = horaNolocal * valorPorHora;
        }
        return valorPagamento;

    }



    public void baixaSaida (int hS, int mS, Vaga vaga, float v){
        String relatorio;
        float valor = calcularpagamento(hS, mS, v);
        this.vaga = vaga;
        this.vaga.setStatus(true);
        System.out.println("------------Valor do Pagamento--------------\n\nValor: " + valor + "\nVeiculo: " + this.modelo +
                "\nProprietario: " + this.proprietario + "Entrada: " + this.horaEntrada  + "h" + this.MinEntrada +
                "\nSaida :" + hS + "h" + mS);
    }



}
