package ClasesyObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("indique un número: ");
        int n1 = entrada.nextInt();
        System.out.print("indique un segndo número: ");
        int n2 = entrada.nextInt();

        Operacion_PyA op = new Operacion_PyA();
        //Opcion 1
        int suma = op.sumar2(n1,n2);
        int resta = op.restar2(n1,n2);
        int mult = op.multiplicar2(n1,n2);
        int div =  op.dividir2(n1,n2);

        op.mostrarResultados2(suma,resta, mult, div);

        //Opcion 2
        System.out.println("\nLa suma es: "+op.sumar2(n1,n2));
        System.out.println("La suma es: "+op.restar2(n1,n2));
        System.out.println("La suma es: "+op.multiplicar2(n1,n2));
        System.out.println("La suma es: " +op.dividir2(n1,n2));

    }

}
