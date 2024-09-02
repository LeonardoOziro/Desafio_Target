
public class PercentualDeRepresentacao {
    public static void main(String[] args) {
        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        double[] faturamentos = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        double faturamentoTotal = 0;
        
        for (double faturamento : faturamentos) {
            faturamentoTotal += faturamento;
        }

        for (int i = 0; i < estados.length; i++) {
            double porcentagem = (faturamentos[i] / faturamentoTotal) * 100;
            
            System.out.println("Estado: " + estados[i] + " - Percentual de representação: " + String.format("%.2f", porcentagem) + " %");
        }
    }
}