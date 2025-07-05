public abstract class Veiculo {
    protected int horaEntrada;
    protected int MinEntrada;
    protected int horaSaida;
    protected int MinSaida;

    Veiculo(int hE, int mE, int hS, int mS){
        this.horaEntrada = hE;
        this.horaSaida = hS;
        this.MinEntrada = mE;
        this.MinSaida = mS;
    }

    Veiculo(int hE, int mE){
        this.horaEntrada = hE;
        this.horaSaida = 0;
        this.MinEntrada = mE;
        this.MinSaida = 0;
    }


    public String toString() {
        String relatorio = "";
        return relatorio = "Hora de entrada: " + this.horaEntrada + ":" + this.MinEntrada + "\n Hora de saida: "
                + this.horaSaida + ":" + this.MinSaida;
    }
}
