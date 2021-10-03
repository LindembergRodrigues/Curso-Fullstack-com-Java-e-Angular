package DIO.PararelStream;

import java.util.stream.IntStream;

public class ExemploPS {
    public static void main(String[] args) {
        Long time = System.currentTimeMillis();
        IntStream.range(1,500000).forEach(n -> fatorial((long) n));
        long time3 = System.currentTimeMillis();
        System.out.println("Tempo de duração " + (time3-time));
        System.out.println("\nCom o Parallel");
        time = System.currentTimeMillis();
        IntStream.range(1,500000).parallel().forEach(n -> fatorial((long) n));
        time3 = System.currentTimeMillis();
        System.out.println("Tempo de duração " + (time3-time));
    }

    public static long fatorial(Long num){
        long fat =1;
        for ( long  i =2; i<num;i++){
            fat *= i;
        }
        return fat;
    }

}
