// ANALISIS
/*
//Descripción: La calculadora deberá pedirle al usuario 2 numeros 
* y con esos 2 numeros realizar suma, resta,multiplicación, división y módulo
* Entadas: 2, numero 1 y numero 2, ambos ingresados por el usuario
* Salidas: 5, una por cada resultado de la operación aritmetica.
*/
import java.util.Scanner;

public class Fruver {

    //precios
    static final int PRECIO_MANZANA = 1000;
    static final int PRECIO_BANANO = 800;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int manzana, banano;

        System.out.print("¿Cuántas manzanas vas a llevar?: ");
        manzana = entrada.nextInt();

        System.out.print("¿Cuántos bananos vas a llevar?: ");
        banano = entrada.nextInt();

        double subtotalManzana = submanzana(manzana, PRECIO_MANZANA);
        double subtotalBanano = subbanano(banano, PRECIO_BANANO);
        double total = subtotalManzana + subtotalBanano;

        System.out.println("Subtotal manzanas: $" + subtotalManzana);
        System.out.println("Subtotal bananos: $" + subtotalBanano);
        System.out.println("Total a pagar: $" + total);

        entrada.close();
    }

    // Calculo de subtotal de manzanas
    public static double submanzana(int cantidad, int precioUnidad) {
        return cantidad * precioUnidad;
    }

    // Calculo de subtotal de bananos
    public static double subbanano(int cantidad, int precioUnidad) {
        return cantidad * precioUnidad;
    }
}

    