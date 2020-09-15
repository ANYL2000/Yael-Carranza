/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_ruleta;

/**
 *
 * @author anylc
 */
public class Datos {
 String nombre;
    int N_lista;
    boolean control;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_lista(int N_lista) {
        this.N_lista = N_lista;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public String getNombre() {
        return nombre;
    }

    public int getN_lista() {
        return N_lista;
    }

    public boolean isControl() {
        return control;
    }
   
  
    public Datos(String nombre, int N_lista, boolean control) {
        this.nombre = nombre;
        this.N_lista = N_lista;
        this.control = control;
        
    }
    public Datos(){
        
        
        
    }
      
    
    
}
