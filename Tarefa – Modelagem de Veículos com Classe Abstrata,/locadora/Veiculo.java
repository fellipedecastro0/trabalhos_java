package locadora;

// Classe abstrata que representa o modelo genérico de um veículo
public abstract class Veiculo {
    // Atributos
    private String placa;
    private String marca;
    private String modelo;
    protected double valorDiaria;
    protected StatusVeiculo status;

    // Construtor
    public Veiculo(String placa, String marca, String modelo, double valorDiaria, StatusVeiculo status) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.status = status;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public StatusVeiculo getStatus() {
        return status;
    }

    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }

    // Método concreto
    public void exibirResumo() {
        System.out.println("========== RESUMO DO VEÍCULO ==========");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("Status: " + status);
        System.out.println("=======================================");
    }

    public void enviarParaManutencao() {
        if (this.status != StatusVeiculo.LOCADO) {
            this.setStatus(StatusVeiculo.MANUTENCAO);
            System.out.println("Veículo " + getPlaca() + " enviado para manutenção.");
        } else {
            System.out.println("ERRO: Veículo " + getPlaca() + " está locado, não pode ir para manutenção.");
        }
    }

    public void retirarDaManutencao() {

        if (this.status == StatusVeiculo.MANUTENCAO) {
            this.setStatus(StatusVeiculo.DISPONIVEL); // Volta a ficar disponível
            System.out.println("Veículo " + getPlaca() + " retirado da manutenção.");
        } else {
            System.out.println("ERRO: Veículo " + getPlaca() + " não estava em manutenção.");
        }
    }
    public abstract double calcularDiariaComDesconto();
}

