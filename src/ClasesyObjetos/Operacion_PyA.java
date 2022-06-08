package ClasesyObjetos;

public class Operacion_PyA {

    // Metodo para sumar
    public int sumar2(int n1, int n2){
        int sumar = n1 + n2;
        return sumar;
    }

    // Metodo para restar
    public int restar2(int n1, int n2){
        int restar = n1 - n2;
        return restar;
    }

    // Metodo para multiplicar
    public int multiplicar2(int n1, int n2){
        int multi = n1 * n2;
        return multi;
    }

    // Metodo para dividir
    public int dividir2(int n1, int n2){
        int divi = n1 / n2;
        return divi;
    }

    // Metodo para mostrar resultados
    public void mostrarResultados2(int sumar, int restar, int multi, int divi){
        System.out.println("\nLa suma es: " + sumar);
        System.out.println("La resta es: " + restar);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La divición es: " + divi);
    }
}

