import java.util.Scanner;
import java.util.Arrays;

public class Auxiliar {
    /////////////////////////////////////////////////Exercício 1
    public int Veminimo(int[] a) {
        int i=a[0];
        for (int n=0;n<a.length;n++) {
            if (i>a[n]) i=a[n];
            else i=i;
        }
        return i;
    }
    public int[] Darray(int a1, int b1,int[] c) {
        int indice=0;
        int[] arrai= new int[(b1-a1)+1];
        //for(int i1=a1;i1<b1+1;i1++) {
        //    arrai[indice]=c[i1];
        System.arraycopy(c, a1, arrai, 0, b1-a1+1); /////IMPORTANTE AQUI ERA NECESSÁRIO USAR O ARRAYCOPY, NÃO DAVA PARA FAZER COM OUTRO
        return arrai;
    }
    ///public int[] Iguais(int[] array1, int[] array2) {
    ///    int[] arraia= new int[array1.length];
    ///    for (int i=0;i<array1.length;i++)
    ///    if (array1[i]==array2[i]) arraia[i] = array1[i]; /////////////////NAO PERCEBI O PORQUE DE ESTAR MAL PEDIR AJUDA
    ///    else break;
    ///    return arraia;
    ///}


////////////////////////////////////////////////////////Exercicio 3.
    public void Ordenaoarray(int[] ay) {
        Arrays.sort(ay);

    }

    public int procuraBinArray (int[] array, int a){
        return Arrays.binarySearch(array, a);

    }
}
