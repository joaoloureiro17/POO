import java.time.LocalDateTime;

public class Auxiliar {
    public double celsiusParaFarenheit(double graus) {
        graus = 1.8*graus +32;
        return graus;
    }
    public int maximoNumeros(int a, int b) {
        if (a>=b) a=a;
        else a=b;
        return a;
    }
    public String criaDescricaoConta(String nome, double saldo) { //Importante
        return "Nome do titular da conta "+ nome + " ,apresenta um saldo de :" + saldo;
    }
    public double eurosParaLibras(double valor, double taxaConversao) {
        valor=valor*taxaConversao;
        return valor;
    }
    public String ordemdecrescente (int valor1, int valor2) {
        int media=(valor1+valor2)/2;
        if (valor1>=valor2) return "A organização decrescnete dos dois valores é respetivamente: "+ valor2 +" " +valor1 + " e a média destes dois é " + media;
        else return "A organização decrescnete dos dois valores é respetivamente: "+ valor1 +" " +valor2 + " e a média destes dois é " + media;
    }
    public long factorial(int num) {
        int i=num;
        int valor=1;
        while (i>0) {
            valor=valor*i;
            i=i-1;
        }
        return valor;
    }
    public long tempoGasto() { //Importante
        int TempoI= LocalDateTime.now().getNano(); //Dá nos a data no momento em que este comando é executado
        double valorfatorial= factorial(5000);
        int TempoFinal=LocalDateTime.now().getNano();//Dá nos o tempo total que demorou a executar o fatorial, uma vez que subtraimos ao tempo no momento o tempo inicial
        return TempoFinal;
    }
}
