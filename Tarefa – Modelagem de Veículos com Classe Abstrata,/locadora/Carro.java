package locadora;
public class Carro extends Veiculo implements Locavel {
    private int numeroPortas;
    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroPortas) {
        super(placa, marca, modelo, valorDiaria, StatusVeiculo.DISPONIVEL);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularDiariaComDesconto() {
        return valorDiaria * 0.90;
    }

    @Override
    public void iniciarLocacao() {
        status = StatusVeiculo.LOCADO;
        System.out.println("Locação iniciada para o carro: " + getModelo());
    }

    @Override
    public void encerrarLocacao() {
        status = StatusVeiculo.DISPONIVEL;
        System.out.println("Locação encerrada. Carro disponível: " + getModelo());
    }

    @Override
    public boolean verificarDisponibilidade() {
        return status == StatusVeiculo.DISPONIVEL;
    }
}