package DIO.ParadigmasFuncional.lambdas;
/*
antes da v.8 do java era necessário criar uma interface fora da classe para que pudesse
gerar uma estrutura no código que executasse tal tarefa
 */
public class AulaLambda  {
    public static void main(String[] args) {

        Calculadora calc = (x,y,c) -> {
            if (c == '+' ){
                return x + y;
            }else if (c == '-' ){
                return x - y;
            }else if (c == '*' ){
                return x * y;
            }else{
                return x / y;
            }
        };

        System.out.println(calc.calcula(1,2,'+'));
        System.out.println(calc.calcula(12,5,'-'));
        System.out.println(calc.calcula(13,5,'*'));
        System.out.println(calc.calcula(10,5,'/'));

    }

}
interface Calculadora{
    int  calcula(int x, int y, char c);
}