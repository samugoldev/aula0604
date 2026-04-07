import java.util.Scanner;

public class VetorUniao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];
        int[] Z = new int[2 * n]; 
        int contZ = 0;

       
        System.out.println("Preencha o vetor X:");
        for (int i = 0; i < n; i++) X[i] = scanner.nextInt();
        
        System.out.println("Preencha o vetor Y:");
        for (int i = 0; i < n; i++) Y[i] = scanner.nextInt();

        
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(Z, contZ, X[i])) {
                Z[contZ++] = X[i];
            }
        }

       
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(Z, contZ, Y[i])) {
                Z[contZ++] = Y[i];
            }
        }

    
        System.out.print("Vetor União Z: ");
        for (int i = 0; i < contZ; i++) {
            System.out.print(Z[i] + " ");
        }
        
        scanner.close();
    }

    
    public static boolean existeNoVetor(int[] vetor, int tamanhoAtual, int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) return true;
        }
        return false;
    }
}