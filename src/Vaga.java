public class Vaga {
    private static int codigo;
    private int codigoInterno;
    private boolean status;
    private String tipo;
    private Carro carro;
    private Moto moto;

    Vaga(boolean status, String tipo, Carro c){
        this.codigo += 1;
        this.codigoInterno = this.codigo;
        this.status = status;
        this.tipo = tipo;
        this.carro = c;
    }

    Vaga(boolean status, String tipo, Moto m){
        this.codigo += 1;
        this.codigoInterno = this.codigo;
        this.status = status;
        this.tipo = tipo;
        this.moto = m;
    }

    Vaga(boolean status, String tipo){
        this.codigo += 1;
        this.codigoInterno = this.codigo;
        this.status = status;
        this.tipo = tipo;
    }

    public String getCPFProprietarioDoCarro() {
        return this.carro.getProprietarioCPF();
    }

    public String getProprietarioCPFDaMoto(){
        return this.moto.getProprietarioCPF();
    }

    public Pessoa getProprietarioMoto(){
        return this.moto.getProprietario();
    }

    public Pessoa getProprietarioCarro(){
        return this.carro.getProprietario();
    }


    public Moto getMoto() {
        return moto;
    }

    public Carro getCarro() {
        return carro;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    public Boolean getStatus(){
        return this.status;
    }

    public String toString(){
        String relatorio;
        relatorio = "\n\n-----------Vaga " + this.codigoInterno + "----------------"
                + "\nStatus :" + this.status + "\nTipo :" + this.tipo + "\nVeiculo: " + this.carro;
        return relatorio;
    }









}
