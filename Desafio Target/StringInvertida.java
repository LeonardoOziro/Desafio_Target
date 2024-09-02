import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma frase para ser invertida: ");
        String frase = s.nextLine();
        s.close();

        char[] caracteres = frase.toCharArray();

        int comeco = 0;
        int fim = caracteres.length - 1;

        while (comeco < fim) {
            char temp = caracteres[comeco];

            caracteres[comeco] = caracteres[fim];
            caracteres[fim] = temp;

            comeco++;
            fim--;
        }

        String fraseInvertida = new String(caracteres);

        System.out.println(fraseInvertida);
    }
    
}