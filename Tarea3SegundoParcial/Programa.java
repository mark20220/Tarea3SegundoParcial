import java.util.Scanner;
/**
 * Es una interfaz con el usuario usando la terminal
 * 
 * @author Marcelo Oscar Cardozo Cadima 
 * @version 01/06/2021
 */
public class Programa
{
    public static void main(String[] a){
        Matriz matriz;
        int opcion;
        int fil,col;
        Menu menu;
        Scanner Num= new Scanner(System.in);
        System.out.println("Acontinuacion ingrese una matriz cuadrada por favor.");
        System.out.println("Ingresar el numero de filas: ");
        fil=Integer.parseInt(Num.nextLine());
        System.out.println("Ingresar el numero de columnas: ");
        col=Integer.parseInt(Num.nextLine());
        matriz = new Matriz(fil, col);
        menu=new Menu(new String[]{"1.- Recorrido Caracol.",
                                   "2.- Diagonal Principal y Secundaria.",
                                   "3.- Mostrar Matriz.",
                                   "4.- Salir."});
        do{
            System.out.println(menu.MostrarMenu());
            opcion=Integer.parseInt(Num.nextLine());
            switch(opcion){
                case 1: matriz.RecoridoCaracol(); break;
                case 2: matriz.Diagonal(); matriz.MostrarDiagonal(); break;
                case 3: matriz.MostrarMatriz(); break;
                default: System.out.println("Gracias...");
            }
        }while(opcion!=4);
    }
}
