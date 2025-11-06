package locadora;
public class Carro extends Veiculo implements Locavel {

    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroPortas) {
        super(placa, marca, modelo, valorDiaria, StatusVeiculo.DISPONIVEL);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularDiariaComDesconto() {
        return valorDiaria * 0.90; // 10% de desconto
    }

    @Override
    public void iniciarLocacao() {
        status = StatusVeiculo.LOCADO;
    }

    @Override
    public void encerrarLocacao() {
        status = StatusVeiculo.DISPONIVEL;
    }

    @Override
    public boolean verificarDisponibilidade() {
        return status == StatusVeiculo.DISPONIVEL;
    }
}
