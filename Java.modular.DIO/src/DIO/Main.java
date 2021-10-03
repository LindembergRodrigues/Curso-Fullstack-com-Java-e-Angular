package DIO;

import Java.modular.DIO2.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        for (int i =0 ;i<=9; i++){
            for( int j =0; j<=9;j++){
                System.out.printf("%d + %d = %d\t%d - %d = %d\t%d * %d = %d\t%d / %d = %d\n",i,j,cal.soma(i,j),i,j, cal.sub(i,j),i,j,cal.mult(i,j),i,j,cal.div(i,j));
            }
            System.out.println();
        }

    }
}
