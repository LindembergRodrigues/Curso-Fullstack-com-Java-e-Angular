package DIO.diversos;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Genericss<T> {
    private  ArrayList<T> lista ;

    public Genericss() {
        this.lista= new ArrayList(10);
    }

    public Genericss( int tam){
        if (tam > 0){
            this.lista= new ArrayList(tam);
        }
    }

    public void push(T dados){
        lista.add(dados);
    }

    public T pop(){
         if (lista.isEmpty()){
             throw new EmptyStackException();
         }
         return lista.remove(lista.size() -1 );
    }
}
