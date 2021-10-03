package DIO.thread;

public class exemploThread {
    public static void main(String[] args) {
        /*
        BarraDeCarregamento2 BC = new BarraDeCarregamento2();
        BarraDeCarregamento2 BC1 = new BarraDeCarregamento2();
        BarraDeCarregamento3 BC2 = new BarraDeCarregamento3();

        BC.start();
        BC1.start();
        BC2.start();


        Thread th1 = new Thread(new BarraDeCarregamento2());
        Thread th2 = new Thread(new BarraDeCarregamento3());

        th1.start();
        th2.start();
        System.out.println(th1.getName());
        System.out.println(th2.getName());
        */
         GerarPDF geradorPDF = new GerarPDF();
         BarraDeCarregamento iniciaBarraDeCarregamento = new BarraDeCarregamento();

         geradorPDF.start();
         iniciaBarraDeCarregamento.start();

    }
}

class GerarPDF extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento extends Thread{
    @Override
    public void run(){
        System.out.println("Loading ... ");
    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println(" Rodei a Thread 2 " +  this.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(" Rodei a Thread 3 " );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}