package locadora;
public class Main {

    public static void main(String[] args) {

        System.out.println("--- 🏁 Iniciando Testes da Locadora ---");
        Carro meuCarro = new Carro("ABC-1234", "Fiat", "Mobi", 120.0, 4);
        Moto minhaMoto = new Moto("DEF-5678", "Honda", "Biz", 80.0, 150);
        Caminhao meuCaminhao = new Caminhao("GHI-9012", "Volvo", "FH", 450.0, 20000.0);

        System.out.println("\n--- 🔎 STATUS INICIAL ---");
        meuCarro.exibirResumo();
        minhaMoto.exibirResumo();
        meuCaminhao.exibirResumo();

        System.out.println("\n--- 🔄 TESTANDO LOCAÇÃO DO CARRO ---");
        meuCarro.iniciarLocacao();
        System.out.println("Carro está disponível? " + meuCarro.verificarDisponibilidade());
        System.out.println("Status atual: " + meuCarro.getStatus());
        meuCarro.encerrarLocacao();
        System.out.println("Carro está disponível? " + meuCarro.verificarDisponibilidade());
        System.out.println("Status atual: " + meuCarro.getStatus());

        System.out.println("\n--- 💰 TESTANDO CÁLCULO DE DIÁRIAS ---");
        System.out.println("Diária (Carro): R$" + meuCarro.getValorDiaria() +
                " | Com desconto: R$" + meuCarro.calcularDiariaComDesconto());
        System.out.println("Diária (Moto): R$" + minhaMoto.getValorDiaria() +
                " | Com desconto (5%): R$" + minhaMoto.calcularDiariaComDesconto());
        System.out.println("Diária (Caminhão): R$" + meuCaminhao.getValorDiaria() +
                " | Com acréscimo (15%): R$" + meuCaminhao.calcularDiariaComDesconto());

        System.out.println("\n--- 🔧 TESTANDO MANUTENÇÃO (com o Caminhão) ---");
        meuCaminhao.enviarParaManutencao();
        System.out.println("Status atual: " + meuCaminhao.getStatus());
        System.out.println("Caminhão está disponível? " + meuCaminhao.verificarDisponibilidade());

        System.out.println("Tentando locar caminhão em manutenção...");
        meuCaminhao.iniciarLocacao();

        meuCaminhao.retirarDaManutencao();
        System.out.println("Status atual: " + meuCaminhao.getStatus());
        System.out.println("Caminhão está disponível? " + meuCaminhao.verificarDisponibilidade());

        System.out.println("Tentando locar caminhão disponível...");
        meuCaminhao.iniciarLocacao();
        System.out.println("Status final: " + meuCaminhao.getStatus());


        System.out.println("\n--- ✅ Testes Concluídos ---");
    }
}