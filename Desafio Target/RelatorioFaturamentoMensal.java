public class RelatorioFaturamentoMensal {

    public static void main(String[] args) {

        // criei um array de dias de faturamento provisórios pois não tinha um arquivo JSON ou XML junto da pergunta
        double[] faturamentos = {1000.5, 2530.20, 0, 3000, 4367.8, 0, 0, 1354.67, 6000, 0};

        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        double menorFaturamento = faturamentos[0];
        double maiorFaturamento = faturamentos[0];

        for (double faturamento : faturamentos) {
            if (faturamento > 0) {
                somaFaturamento += faturamento;
                diasComFaturamento++;
                
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }

                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentos) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento ocorrido em um dia do mês: " + menorFaturamento);
        System.out.println("Maior valor de faturamento ocorrido em um dia do mês: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}