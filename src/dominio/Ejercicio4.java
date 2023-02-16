package dominio;

public class Ejercicio4 {
    public static int suma (int []lista,int i){
        if(i==0)
            return lista[0];
        else
            return lista[i]+suma(lista,i-1);

    }
}
