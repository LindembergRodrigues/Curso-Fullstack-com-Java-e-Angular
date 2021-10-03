package DIO.date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExemplos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Data do vencimento(dd/mm/aaaa):");
        String [] data = in.nextLine().split("/");


        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DATE,Integer.parseInt(data[0]));
        cal.set(Calendar.MONTH,Integer.parseInt(data[1])-1);
        cal.set(Calendar.YEAR,Integer.parseInt(data[2]));

        // adiciona os 10 dias
        cal.add(Calendar.DATE,10);

        if ( cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ){
            cal.add(Calendar.DATE,2);
        }else if  ( cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            cal.add(Calendar.DATE, 1);
        }

        System.out.printf("Você pode pagar seu boleto até %s/%s/%s sem acréscimo de Juros",cal.get(Calendar.DATE),cal.get(Calendar.MONTH)+1,cal.get(Calendar.YEAR));
    }
}
