
package Modelo;

import Vista.Productos;

public class Visualizador {
    
   private Productos productos; //La llama para trabajar en un vizualizador de imagenes
    
   public Visualizador(Productos e){
    
    inicializar(e);
    
    }
   //Inicializar cada metodo y variables
   private void inicializar(Productos e){
       productos = e;
   }
    
}
