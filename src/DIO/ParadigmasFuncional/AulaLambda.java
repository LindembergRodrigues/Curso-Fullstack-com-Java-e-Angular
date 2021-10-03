package DIO.ParadigmasFuncional;
/*
antes da v.8 do java era necessário criar uma interface fora da classe para que pudesse
gerar uma estrutura no código que executasse tal tarefa
 */
public class AulaLambda  {
    public static void main(String[] args) {

        Calculadora soma  = (x,y) -> x+y;
        Calculadora sub  = (x,y) -> x-y;
        Calculadora div  = (x,y) -> x/y;
        Calculadora mult  = (x,y) -> x*y;

        System.out.println(soma.calcula(1,2));
        System.out.println(sub.calcula(12,5));
        System.out.println(div.calcula(13,5));
        System.out.println(mult.calcula(10,5));

    }

}
interface Calculadora{
    int  calcula(int x, int y);
}