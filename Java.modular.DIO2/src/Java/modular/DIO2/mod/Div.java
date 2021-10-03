package Java.modular.DIO2.mod;

public class Div implements Calcula {
    @Override
    public int execute(int a, int b) {
        return b != 0 ? a/b : 0;
    }
}
