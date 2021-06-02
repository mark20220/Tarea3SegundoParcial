
/**
 * Un arreglo para mostrar las opciones:
 * el recorrido de caracol en la matriz.
 * Diagonal principal y secundaria en la matriz.
 * imprimir la matriz.
 * 
 * @author Marcelo Oscar Cardozo Cadima
 * @version 01/06/2021
 */
public class Menu
{
    private String[] Opciones;
    public Menu(String[] Opciones){
        this.Opciones=Opciones;
    }
    
    public String MostrarMenu(){
        String Menu;
        Menu=" MENU DE OPCIONES \n" +
             " ---------------- \n";
        for(int i=0; i<Opciones.length; i++){
            Menu=Menu + Opciones[i]+ "\n";
        }
        Menu=Menu + " ---------------- \n" + "ELIGE UNA OPCION:";
        return Menu;
    }
}
