public class Main {

    public static void main(String[] args) {
        int peca1 = 180, peca2 = 247, peca3 = 144;
        int vet[] = new int[3];
        vet[0] = peca1;
        vet[1] = peca2;
        vet[2] = peca3;
        int maior = vet[0], menor = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        if (vet[0]== maior){
         System.out.println("A peça com mais ingressos vendidos é a peça 1");
        }else if (vet[1]== maior){
         System.out.println("A peça com mais ingressos vendidos é a peça 2");
        }else if (vet[2]== maior){
         System.out.println("A peça com mais ingressos vendidos é a peça 3");
        }
        if (vet[0]== menor){
         System.out.println("A peça com menos ingressos vendidos é a peca 1");
        }else if (vet[1]== menor){
         System.out.println("A peça com menos ingressos vendidosa é a peça 2");
        }else if (vet[2]== menor){
         System.out.println("A peça com menos ingressos vendidos é a peça 3");
        }
    }
}