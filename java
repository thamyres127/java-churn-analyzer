public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANALISADOR DE CHURN DE CLIENTES ===");
        System.out.println("Status: Sistema Iniciado com Sucesso\n");

        // Dados fictícios de clientes (1 = Cancelou a conta / 0 = Continua ativo)
        int cliente1Status = 1; 
        int cliente2Status = 0;
        int cliente3Status = 1;
        int cliente4Status = 0;
        int cliente5Status = 0;

        // Contagem de clientes do relatório
        int totalClientes = 5;
        int totalCancelados = cliente1Status + cliente2Status + cliente3Status + cliente4Status + cliente5Status;
        int totalAtivos = totalClientes - totalCancelados;

        // Cálculo simples da taxa de cancelamento (Churn)
        double taxaChurn = ((double) totalCancelados / totalClientes) * 100;

        // Exibição dos resultados no console
        System.out.println(">> RELATÓRIO DO PERÍODO:");
        System.out.println("Total de clientes analisados: " + totalClientes);
        System.out.println("Clientes ativos na base: " + totalAtivos);
        System.out.println("Clientes que cancelaram (Churn): " + totalCancelados);
        System.out.println("Taxa de Churn calculada: " + taxaChurn + "%");

        // Alerta de tomada de decisão baseada no resultado
        if (taxaChurn > 20.0) {
            System.out.println("\n[ALERTA]: Taxa de cancelamento alta! É necessário aplicar ações de retenção.");
        } else {
            System.out.println("\n[SUCESSO]: Taxa dentro do limite aceitável pela empresa.");
        }
    }
}
