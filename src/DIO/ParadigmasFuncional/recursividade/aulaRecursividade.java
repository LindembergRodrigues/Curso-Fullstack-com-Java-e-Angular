package DIO.ParadigmasFuncional.recursividade;
import java.util.Scanner;
public class aulaRecursividade {
    public static long fatorial(long num) {
        int produto = 0;
        if (num > 1) {
            return num * fatorial(num-1);
        } else {
            return num;
        }
    }

    public static long novoFatorial(long atual, long multiplicacao){
        long produto = atual * multiplicacao;
        return atual>1 ?  novoFatorial(atual-1, produto) : produto;
    }

    public static void main(String[] args) {
        System.out.println("--teste recursividade--");
        Scanner scanner = new Scanner(System.in);
        long num = 0;
        do{
            System.out.print("\nNumero: ");
            num = scanner.nextInt();
            System.out.printf("Fatorial de %d é %d",num,fatorial(num));
            System.out.println("\nFatorial 2 ");
            System.out.printf("Fatorial de %d é %d",num,novoFatorial(num,1));
        }while(num >= 0);


    }
}
