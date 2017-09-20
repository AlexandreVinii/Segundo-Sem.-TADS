package bubble.pkgshort;

import java.util.Random;

/**
 *
 * @author alexandre-vinii
 */
public class BubbleShort {

    public static void main(String[] args) {
        int [] vetor = criaVetor();
        
        vetor = popVetor(vetor);
        
       vetor = ordenaVetor(vetor);
       
       imprimeVetor(vetor);
    }

    static int[] criaVetor() {

        int[] vetor = new int[10000];

        return vetor;
    }

    static int[] popVetor(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
                vetor[i] = random.nextInt(10000000) + 1;
        }
        return vetor;
    }

    static int[] ordenaVetor(int[] vetor) {
        int aux = 0;
        for (int i = 0; i < vetor.length - 1 ; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[ j + 1] = aux;

                }
            }

        }
       return vetor; 
    }
    
    static void imprimeVetor (int [] vetor){
        
            for (int j = 0; j < vetor.length; j++) {
                
                System.out.printf("Vetor[%d] = %d\n\n",j+1,vetor[j]);

            }

        
    }

}
