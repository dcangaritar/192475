import java.util.Scanner;

public class SuperMalHechoOptimizado  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] nombres = new String[5];
        double[] precios = new double[5];
        double[] totales = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Escriba el nombre del producto " + (i + 1) + ":");
            nombres[i] = s.nextLine();
            System.out.println("Ingrese el precio:");
            precios[i] = s.nextDouble();
            s.nextLine(); 
        }

        double suma = 0;
        for (int i = 0; i < 5; i++) {
            double impuesto = precios[i] * 0.19;
            double descuento = (precios[i] > 10000) ? precios[i] * 0.10 : 0;
            totales[i] = precios[i] + impuesto - descuento;
            System.out.println("Producto: " + nombres[i] + ", Precio final: " + totales[i]);
            suma += totales[i];
        }

        System.out.println("El total de la compra es: " + suma);
        s.close();
    }
}

