import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Auxiliar objeto = new Auxiliar();
        System.out.println("Quantos valores vão conter o array? ");
        int tamanho = input.nextInt();
        int[] arrays = new int[tamanho];
        System.out.println("Digite por onrdem os valores pertencentes ao array");
        for (int indice = 0; indice < tamanho; indice++) {
            arrays[indice] = input.nextInt();
        }
        System.out.println("Quantos valores vão conter o array 2? ");
        int tamanho2 = input.nextInt();
        int[] arrays2 = new int[tamanho2];
        System.out.println("Digite por onrdem os valores pertencentes ao array 2");
        for (int indice1 = 0; indice1 < tamanho2; indice1++) {
            arrays2[indice1] = input.nextInt();
        }
        System.out.println("O menor valor do array é: " + objeto.Veminimo(arrays));
        System.out.println("Digite os valores desejados");
        int valor1=input.nextInt();
        int valor2=input.nextInt();
        System.out.println("O array entre os dois valores é " + Arrays.toString(objeto.Darray(valor1,valor2,arrays)));
        //System.out.println("Os arrays entre apresentam estes elementos iguais " + Arrays.toString(objeto.Iguais(arrays, arrays2)));/////////////////NAO PERCEBI ESTE PEDIR AJUDAR.

        System.out.println("Digite o valor desejado");
        int digito=input.nextInt();
        System.out.println("O elemento nesse espaço é " +objeto.procuraBinArray (arrays,digito) );
    }
}