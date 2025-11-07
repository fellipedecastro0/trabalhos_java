package locadora;
public class Caminhao extends Veiculo implements Locavel {
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, double valorDiaria, double capacidadeCarga) {
        super(placa, marca, modelo, valorDiaria, StatusVeiculo.DISPONIVEL);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public double calcularDiariaComDesconto() {
        return getValorDiaria() * 1.15;
    }

    @Override
    public void iniciarLocacao() {
        if (verificarDisponibilidade()) {
            setStatus(StatusVeiculo.LOCADO);
            System.out.println("Caminhão " + getPlaca() + " locado.");
        } else {
            System.out.println("Falha! Caminhão " + getPlaca() + " não está disponível (Status: " + getStatus() + ")");
        }
    }

    @Override
    public void encerrarLocacao() {
        setStatus(StatusVeiculo.DISPONIVEL);
        System.out.println("Caminhão " + getPlaca() + " devolvido.");
    }

    @Override
    public boolean verificarDisponibilidade() {
        return getStatus() == StatusVeiculo.DISPONIVEL;
    }
}
