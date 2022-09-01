
import java.util.ArrayList;
import java.util.Arrays;
public class Procesando {
    public static void main(String[] args) {
        ArrayList<Integer> categoria_1 = new ArrayList<>(Arrays.asList(1,2,5,5,5,1,2,5,5,5));
        ArrayList<Integer> obras_1 = Obra.clases((categoria_1));
        System.out.print("[");
        for (int i = 0; i < obras_1.size(); i++) {
            if((i + 1) == obras_1.size()){
                System.out.print(  obras_1.get(i) + ",");
            }
            
        }
        System.out.println("]");

        ArrayList <Integer> faltantes = new ArrayList<>(Arrays.asList(1,3,6,8));
        ArrayList <Integer> categorias = new ArrayList<>(Arrays.asList(1,2,5,5,5,1,2,5,5,5));
        int unaCategoria = 2;
        
        ArrayList<Integer> meFalta = Obra.meFaltanDeLaClase(faltantes, categorias, unaCategoria);
        System.out.print("[");
        for (int i = 0; i < meFalta.size(); i++) {
            if((i + 1) == meFalta.size()){
                System.out.print("'" + meFalta.get(i) + "'");
            }else{
                System.out.print("'" + meFalta.get(i) + "',");
            }
            
        }
        System.out.println("]");
        ArrayList<Integer> museo1 = new ArrayList<>(Arrays.asList(3,5,7,10,15,16));
        ArrayList<Integer> museo2 = new ArrayList<>(Arrays.asList(4,10,5,8));

        ArrayList<Integer> interes = Obra.noTengo(museo1,museo2);
        System.out.print("[");
        for (int i = 0; i < interes.size(); i++) {
            if((i + 1) == interes.size()){
                System.out.print("'" + interes.get(i) + "'");
            }else{
                System.out.print("'" + interes.get(i) + "',");
            }
            
        }
        System.out.println("]");

        int cambiar = Obra.puedoCambiar(museo1, museo2);
        System.out.println(cambiar);



    }   
    
}
