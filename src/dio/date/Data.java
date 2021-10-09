package dio.date;
import java.util.Date;

public class Data {
    public static void main(String[] args) {

        Date data = new Date();
        System.out.println(data);

        // Testando o segundo exemplo

        long tempo = System.currentTimeMillis();

        System.out.println(tempo);

        Date novoTempo = new Date(tempo);
        System.out.println(novoTempo);

        System.out.println(novoTempo.after(data));
        System.out.println(novoTempo.before(data));

        //compara duas datas e retorna  um inteiro (-1 se a data for anterior, 0 se for igual e 1 se for superior

        System.out.println(novoTempo.compareTo(data));

        // retorna o tempo em milisegundos
        System.out.println(novoTempo.getTime());

        // verifica se é igual
        System.out.println(novoTempo.equals(data));

        //
        System.out.println("TimeInMillis");
        Date data2 = new Date();
        data2.getTime();
        System.out.println(data2);
    }
}
