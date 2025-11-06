package locadora;

public class Moto extends Veiculo implements Locavel {

    private int cilindradas;

    public Moto(String placa, String marca, String modelo, double valorDiaria, int cilindradas) {
        super(placa, marca, modelo, valorDiaria, StatusVeiculo.DISPONIVEL);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDiariaComDesconto() {
        if (cilindradas <= 200) {
            return getValorDiaria() * 0.95;
        } else {
            return getValorDiaria();
        }
    }

    @Override
    public void iniciarLocacao() {
        setStatus(StatusVeiculo.LOCADO);
    }

    @Override
    public void encerrarLocacao() {
        setStatus(StatusVeiculo.DISPONIVEL);
    }

    @Override
    public boolean verificarDisponibilidade() {
        return getStatus() == StatusVeiculo.DISPONIVEL;
    }

    @Override
    public void exibirResumo() {
        System.out.println("---- MOTO ----");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cilindradas: " + cilindradas + "cc");
        System.out.println("Valor Diária: R$" + getValorDiaria());
        System.out.println("Status: " + getStatus());
        System.out.println("-----------------------");
    }
}
