package Java.modular.DIO2;

import Java.modular.DIO2.mod.Div;
import Java.modular.DIO2.mod.Mult;
import Java.modular.DIO2.mod.Soma;
import Java.modular.DIO2.mod.Sub;

public class Calculadora {
    Soma soma;
    Sub sub;
    Mult mult;
    Div div;

    public Calculadora(){
        soma = new Soma();
        sub = new Sub();
        mult = new Mult();
        div = new Div();
    }

    public int soma (int a, int b){
        return soma.execute(a,b);
    }

    public int sub (int a, int b) {
        return sub.execute(a,b);
    }
    public int div (int a, int b) {
        return div.execute(a,b);
    }
    public int mult (int a, int b) {
        return mult.execute(a,b);
    }
}
