
package proyectosjava;

import java.util.Scanner;

public class CarritoConsola {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte respuesta;
        double montoTotal = 0d;
        String productos = "";

        do {
            System.out.println("Elige el producto a llevar: ");
            System.out.println("1. Mango - 5.50"+
                                "\n2. Mandarina - 6.50"+
                                "\n3. Manzana - 7.50"+
                                "\n4. Pera - 3.50"+
                                "\n5. Uva - 3.00"+
                                "\n6. Plátano - 4.50"+
                                "\n7. Sandía - 5.0");
            respuesta = input.nextByte();
            switch(respuesta) {
                case 1:
                    productos = productos + ",Mango";
                    montoTotal = montoTotal + 5.50;
                    break;
                case 2:
                    productos = productos + ",Mandarina";
                    montoTotal = montoTotal + 6.50;
                    break;
                case 3:
                    productos = productos + ",Manzana";
                    montoTotal = montoTotal + 7.50;
                    break;
                case 4:
                    productos = productos + ",Pera";
                    montoTotal = montoTotal + 3.50;
                    break;
                case 5:
                    productos = productos + ",Uva";
                    montoTotal = montoTotal + 3.00;
                    break;
                case 6:
                    productos = productos + ",Plátano";
                    montoTotal = montoTotal + 4.50;
                    break;
                case 7:
                    productos = productos + ",Sandía";
                    montoTotal = montoTotal + 5.0;
                    break;
                default: System.out.println("No existe el producto seleccionado");
                    break;
            }
            
            System.out.println("¿Deseas continuar? \n1. Sí \n2. No");
            respuesta = input.nextByte();
        } while (respuesta == 1);
        
        String[] carrito = productos.split(",");
        String output = "";
        
        for (int i = 1; i < carrito.length; i++) {
            output = output + "[" + carrito[i] + "]";
        }
        System.out.println("Tu carrito tiene "+output+" y el precio total es "+montoTotal+" soles");
    }
    
}
