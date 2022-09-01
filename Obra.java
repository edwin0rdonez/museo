import java.util.ArrayList;

public class Obra {

    public static ArrayList <Integer> clases(ArrayList<Integer> categorias){
        ArrayList <Integer> categoriasUnicas = new ArrayList<>();
        for (int i = 0; i < categorias.size(); i++) {
            if(!(categoriasUnicas.contains(categorias.get(i)))){
                categoriasUnicas.add(categorias.get(i));
            }
            
        }
        return categoriasUnicas;
    }
    public static ArrayList <Integer> meFaltanDeLaClase(ArrayList<Integer> obras, ArrayList<Integer> listaDeObras, int categoria){
        ArrayList <Integer> salida = new ArrayList<>();
        ArrayList <Integer> obrasFaltantes = new ArrayList<>();
        for (int i = 0; i < listaDeObras.size(); i++) {
            if(categoria == listaDeObras.get(i)){
                obrasFaltantes.add(i);
            }
            
        }
        for (Integer i : obras){
            if(obrasFaltantes.contains(i)){
                salida.add(i);
            }
        }
        return salida;
        
    }
    public static ArrayList <Integer> noTengo(ArrayList<Integer> obrasMuseoA, ArrayList<Integer> obrasMuseoB){
        ArrayList <Integer> obrasDeInteres = new ArrayList<>();
        for (int i = 0; i < obrasMuseoA.size(); i++) {
            if(!obrasMuseoB.contains(obrasMuseoA.get(i))){
                obrasDeInteres.add(obrasMuseoA.get(i));
            }

        }
        return obrasDeInteres;
    } 
    public static int puedoCambiar(ArrayList<Integer> duplicadosMuseoA,ArrayList<Integer> duplicadosMuseoB){
        int cantidadObrasMuseoA = 0;
        int cantidadObrasMuseoB = 0;

        for (int i = 0; i < duplicadosMuseoA.size(); i++) {
            if(!duplicadosMuseoB.contains(duplicadosMuseoA.get(i))){
                cantidadObrasMuseoB++;
            }
            
        }
        
        for (int i = 0; i < duplicadosMuseoB.size(); i++) {
            if(!duplicadosMuseoA.contains(duplicadosMuseoB.get(i))){
                cantidadObrasMuseoA++;
            }
            
        } 
        return (cantidadObrasMuseoA <= cantidadObrasMuseoB)?cantidadObrasMuseoA:cantidadObrasMuseoB;
    }
    
}
