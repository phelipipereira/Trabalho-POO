import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<Vaga> vagas;

    public Estacionamento(){
        vagas = new ArrayList<>();
    }

    public void addVagaCarro(Carro c){
        String tipo = "Carro";
        boolean status = true;
        Vaga vaga =  new Vaga(status, tipo, c);
        vagas.add(vaga);
    }

    public void addVagaCarro(){
        String tipo = "Carro";
        boolean status = true;
        Vaga vaga =  new Vaga(status, tipo);
        vagas.add(vaga);
    }

    public void addVagaMoto(){
        String tipo = "Moto";
        boolean status = true;
        Vaga vaga =  new Vaga(status, tipo);
        vagas.add(vaga);
    }

    public void addVagaMoto(Moto m){
        String tipo = "Moto";
        boolean status = true;
        Vaga vaga =  new Vaga(status, tipo, m);
        vagas.add(vaga);
    }

    public void removeVaga(Vaga v){
        vagas.remove(v);
    }


    public String toString() {
        String relatorio = "----------Vagas-----------\n\n";
        for(Vaga vaga: vagas){
            relatorio += vaga;
        }
        return relatorio;
    }

    public Vaga buscarVeiculo(String cpfProprietario) {

        for (Vaga vaga : vagas) {
            if (vaga.getStatus() && vaga.getCarro() != null && vaga.getProprietarioCarro() != null) {
                if (vaga.getCPFProprietarioDoCarro().equals(cpfProprietario)) {
                    System.out.println("Veículo (Carro) encontrado na vaga:\n" + vaga);
                    return vaga;
                }
            } else if (vaga.getStatus() && vaga.getMoto() != null && vaga.getProprietarioMoto() != null) {
                if (vaga.getProprietarioCPFDaMoto().equals(cpfProprietario)) {
                    System.out.println("Veículo (Moto) encontrado na vaga:\n" + vaga);
                    return vaga;
                }
            }
        }

        // Se o loop terminar e nenhum veículo for encontrado, exibe a mensagem e retorna null
        System.out.println("O veículo com CPF '" + cpfProprietario + "' não foi encontrado em nenhuma vaga.");
        return null;
    }
}


