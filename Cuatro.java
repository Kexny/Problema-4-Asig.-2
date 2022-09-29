//Kevin Li, Roberto Luo, Keny Tang, Enrique Wen

//Una tienda vende zapatos, carteras, vestidos y sombreros. 
//Crear una aplicación que permita llevar el inventario de actualizado acorde con la compra.

//Su programa debe imprimir el inventario actualizado en pantalla y solicitarle al cliente que desea comprar.
//Una vez el cliente seleccione, se le solicita la cantidad y se
//imprime en pantalla el costo total de lo que se está comprando.

//Al final, se debe mostrar el inventario actualizado en pantalla y solo
//se sale de la aplicación si el cliente escoge la opción de salir

import java.util.Scanner;
public class Cuatro
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double costo;
        int resp, cantT, cantZ =150, cantC = 100, cantV = 2, cantS=10, opc=6;

        //opcion de repetir
        while(opc == 6)
        {
            //Crear el inventario dado por el problema
            //Se ira actualizandose cuando el comprador ingrese la cantidad que se desea comprar
            System.out.println("Items \n"
                            + "Zapatos      |  Precio 25.00      |  Cantidad "+ cantZ + "       |  Introduzca 1 \n"
                            + "Carteras     |  Precio 15.50      |  Cantidad "+ cantC + "       |  Introduzca 2 \n"
                            + "Vestidos     |  Precio 150.75     |  Cantidad "+ cantV + "       |  Introduzca 3 \n"
                            + "Sombreros    |  Precio 5.00       |  Cantidad "+ cantS + "       |  Introduzca 4 \n"  
                            + "¿Que items deseas?");
            resp = scan.nextInt();

            if(resp==1)//Si la resp es igual 1 se entra
            {
                System.out.println("Zapatos  |  Precio 25.00  |  Cantidad "+ cantZ);
                System.out.println("Cantidad que se desea");
                cantT = scan.nextInt();
                if(cantT <= cantZ && cantZ >= 0)
                {
                    costo = cantT * 25;
                    cantZ = cantZ - cantT;
                    System.out.println("Costo Total: " + costo); 
                }
                else
                {
                    System.out.println("ERROR");
                }
            }//Final else if (resp==1)

            else if(resp==2)//Si la resp es igual 2 se entra
            {
                System.out.println("Carteras  |  Precio 15.50  |  Cantidad "+ cantC);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                if(cantT <= cantC && cantC >= 0)
                {
                    costo = cantT * 25;
                    cantC = cantC - cantT;
                    System.out.println("Costo Total: " + costo); 
                }
                else
                {
                    System.out.println("ERROR");
                }
            }//Final else if (resp==2)

            else if(resp==3)//Si la resp es igual 3 se entra
            {
                System.out.println("Vestidos  |  Precio 150.75  |  Cantidad "+ cantV);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                if(cantT <= cantV && cantV >= 0)
                {
                    costo = cantT * 25;
                    cantV = cantV - cantT;
                    System.out.println("Costo Total: " + costo); 
                }
                else
                {
                    System.out.println("ERROR");
                }
            }//Final else if (resp==3)

            else if(resp==4)//Si la resp es igual 4 se entra
            {
                System.out.println("Sombreros  |  Precio 5.00  |  Cantidad "+ cantS);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                if(cantT <= cantS && cantS >= 0)
                {
                    costo = cantT * 25;
                    cantS = cantS - cantT;
                    System.out.println("Costo Total: " + costo); 
                }
                else
                {
                    System.out.println("ERROR");
                }
            }//Final else if (resp==4)

            else 
            {//Hace saber al usuario que el numero o Items Introducido no concuerda con lo que tiene el programa.
                System.out.println("No existe tal Item, vuelva a intentarlo");
            }
            //Opcion de salir o continuar
            System.out.println("¿Deseas terminar la compra o seguir? \n"
                                + "Si deseas salir          |   Introduzca 5 \n"
                                + "Si deseas continuar      |   Introduzca 6");
            opc = scan.nextInt();
            //Se repite si el usuario desea continuar (6).
            if(opc==5)
            {
                System.out.println("Gracias por su compra y esperemos su regreso");
            }
        }scan.close();
    }//Final main
}//Final class