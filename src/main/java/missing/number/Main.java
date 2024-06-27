package missing.number;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,8,6,3,7,4};
        int maiorValor = 0;
        for (int i=0; i < array.length; i++){
            if(array[i] > maiorValor){
                maiorValor = array[i];
            }
        }
        int somaEsperada = maiorValor*(maiorValor+1)/2;
        int somaReal = 0;
        for (int i=0; i < array.length; i++){
            somaReal += array[i];
        }
        System.out.println("O número quem está faltando é: " + (somaEsperada - somaReal));
    }
}