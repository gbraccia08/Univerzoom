/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import data.ObjetoCeleste;
import java.util.ArrayList;

/**
 *
 * @author Gaia F. Braccia
 */
public class ReguladorCatalogo {
    
    
    public static ArrayList<ObjetoCeleste> buscarObj(ArrayList<ObjetoCeleste> lista,String tipo){
        ArrayList<ObjetoCeleste> objeto= new ArrayList<>();
        for (ObjetoCeleste ob : lista){
            if(ob.getTipoDeObjeto().toLowerCase().contains(tipo) || ob.getConstelacion().toLowerCase().contains(tipo) || ob.getNombre().toLowerCase().contains(tipo) ){
               objeto.add(ob);
            }
        }
       return objeto;
    } 
    
    public static ArrayList<ObjetoCeleste> buscarS(ArrayList<ObjetoCeleste> lista, String busca){
      ArrayList<ObjetoCeleste> coincidencias = new ArrayList<>();
      for(int i=0;i<lista.size();i++){
          if(lista.get(i).getConstelacion().equals(busca)){
              coincidencias.add(lista.get(i));
          
          }else if(lista.get(i).getTipoDeObjeto().equals(busca)){
              coincidencias.add(lista.get(i));
          }
      }
      return coincidencias;
    }
    
   public static ArrayList<ObjetoCeleste> organizar(ArrayList<ObjetoCeleste> lista, boolean tipo){
       
        MaxHeap max = new MaxHeap(tipo);
        ArrayList<ObjetoCeleste> aux= new ArrayList();
        for (ObjetoCeleste ob : lista) {
            max.insert(ob);
        }
        for (ObjetoCeleste ob : lista) {
            aux.add(max.remove());
        }
        
        return aux;
    }

    
}