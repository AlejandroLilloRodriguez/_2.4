package aplicacion;

import static dominio.Ejercicio4.suma;
public class Principal {
    public static void main (String [] args){
        int[] lista={1,3,5,65,4,9,223,98,532,23};
        System.out.print(suma(lista,lista.length-1));
    }
}
