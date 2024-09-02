import java.util.Scanner;
import java.util.ArrayList;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();
    
        int a = 0, b = 1;
        int numero, tamanho = 0;
    
        System.out.println("Digite qual numero voce deseja saber se esta na sequencia de fibonacci: ");
        numero = s.nextInt();
        s.close();
    
        lista.add(a);
        lista.add(b);

        while(b < numero){
            int temp;
            
            temp = b;
            b = a + b;
            a = temp;
            lista.add(b);

            tamanho++;
            
        }
    
        for (int i = 0; i < tamanho + 2; i++) {
            System.out.println(lista.get(i));
        }

        if(b == numero) {
                System.out.println("O numero " + numero + " pertence a sequencia de fibonacci");
        } else {
            System.out.println("O numero " + numero + " nao pertence a sequencia de fibonacci");
        }
    
    }
}
