
/**
 * constructor nos permita definir el tamaño de la matriz
 * metodo el recorrido de caracol en la matriz.
 * metoo Diagonal principal y secundaria en la matriz.
 * metodo imprimir la matriz.
 * 
 * @author Marcelo Oscar Cardozo Cadima 
 * @version 01/06/2021
 */
public class Matriz
{
    private int[][] Matriz;
    private int[][] Res;
    //Constructor.
    public Matriz(int fil, int col){
        Matriz=new int[fil][col];
    }
    //Recorrido en Caracol.
    public void RecoridoCaracol(){
        int Num=1;
        int Tamaño=Matriz.length;
        int Inicio=0;
        int Final=Matriz.length;
        for(int k=0;k<=Tamaño/2; k++){
            for(int j=Inicio; j<Final; j++){
                Matriz[Inicio][j]=Num;
                Num++;
            }
        
            for(int i=Inicio+1; i<Final; i++){
                Matriz[i][Final-1]=Num;
                Num++;
            }
        
            for(int j=Final-2; j>=Inicio; j--){
                Matriz[Final-1][j]=Num;
                Num++;
            }
        
            for(int i=Final-2; i>Inicio; i--){
                Matriz[i][Inicio]=Num;
                Num++;
            }
            Inicio++;
            Final--;
        }
    }
    //Muestra la matriz.
    public void MostrarMatriz(){
        for(int i=0;i<Matriz.length; i++){
            for(int j=0;j<Matriz[0].length; j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Diagonal principal y secundaria.
    public void Diagonal(){
        Res=new int[2][Matriz.length];
        for(int i=0;i<Matriz.length; i++){
            Res[0][i]=Matriz[i][i];
        }
        
        for(int i=0; i<Matriz.length; i++){
            int j=i+1;
            Res[1][i]=Matriz[Matriz.length-j][i];
        }
    }
    //Muestra la matriz de l a diagonal principal y secundaria.
    public void MostrarDiagonal(){
        for(int i=0;i<2; i++){
            for(int j=0;j<Matriz[0].length; j++){
                System.out.print(Res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
