/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_ruleta;

import java.util.Scanner;

/**
 *
 * @author anylc
 */
public class Ejercicio_1_ruleta {
 int tope;
 Datos nombre [] = new Datos[43];
Scanner entrada= new Scanner(System.in);

    public void capturarDatos(){
        if(tope>=5){
            
            System.out.println("ERROR");
            
        }else{
            
            nombre [tope] =new Datos();
            System.out.println("Dame el nombre del alumno");
            nombre[tope].nombre= entrada.nextLine();
             System.out.println("Dame el numero de lista del alumno");
            nombre[tope].N_lista= entrada.nextInt();
            
            nombre[tope].control=false;
            tope++;
            
        }
        
        
        
    }
    
     public void MostrarDatos(){
        
        for(int i=0;i<=tope;i++){
            
            System.out.println("Nombre del Alumno: "+nombre[i].nombre);
             System.out.println("Numero de lista del Alumno: "+nombre[i].N_lista);
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Programa de ruleta de participacion");
    }
    
}
