import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in); //Importantes definimos logo estas duas no inicio///////////////////
        Auxiliar objeto = new Auxiliar(); ////////////////////////////////////////////////////////////////////////
        System.out.println("Digite o valor que quer passar de celsius para Farenheit");
        int valor=input.nextInt();
        double valor2 =  objeto.celsiusParaFarenheit(valor);
        System.out.println("O valor em Farenheit é: "+ valor2);

        System.out.println("Digite os valores para qual quer saber o seu máximo");
        int valor11=input.nextInt();
        int valor22=input.nextInt();
        int valorfinal=objeto.maximoNumeros(valor11,valor22);
        System.out.println("O maior dos dois números é: "+valorfinal);

        System.out.println("Digite o seu nome e o seu saldo");
        String nome= input.next();
        int saldo= input.nextInt();
        System.out.println(objeto.criaDescricaoConta(nome,saldo));

        System.out.println("Digite o valor que quer converter para libras, bem como a taxa de conversão para libras");
        double euros=input.nextDouble();
        double taxaConversao = input.nextDouble();
        double libras= objeto.eurosParaLibras(euros,taxaConversao);
        System.out.println("Em libras corresponde a "+libras+" libras");

        System.out.println("Digite os valores que quer ordenar por ordem decrescente");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Os valores ordenadas por odem decresecnte: "+ objeto.ordemdecrescente(a, b));

        System.out.println("Digite o número que pretende realizar o seu fatorial");
        int num=input.nextInt();
        System.out.println("O valor correspondente em fatorial é "+objeto.factorial(num));

        System.out.println("O tempo gasto foi de "+ objeto.tempoGasto());
    }

}