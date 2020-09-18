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
 int tope=0;
 
 
 Datos nombre [] = new Datos[43];
Scanner entrada= new Scanner(System.in);

    public void capturarDatos(){
        if(tope>=5){
            
            System.out.println("ERROR");
            
        }else{
            
            System.out.println("\nAGREGAR DATOS\n");
            
            nombre [tope] =new Datos();
            entrada.nextLine();
            System.out.println("Dame el nombre del alumno");
            nombre[tope].nombre= entrada.nextLine();
             System.out.println("Dame el numero de lista del alumno");
            nombre[tope].N_lista= entrada.nextInt();
            
            nombre[tope].control=false;
            tope++;
            
        }
        
        
        
    }
    
     public void MostrarDatos(){
         System.out.println("\nMOSTRAR DATOS\n");
        for(int i=0;i<tope;i++){
            
            System.out.println("Nombre del Alumno: "+nombre[i].nombre);
             System.out.println("Numero de lista del Alumno: "+nombre[i].N_lista);
             System.out.println("\n");
        }
     } 
        
        
        public void menu(){
            String volver="";
            do{
           String opcion=""; 
           do{
           System.out.println("Presione");
          System.out.println("1 para agregar alumno");
           System.out.println("2 para mostrar alumno");
          System.out.println("3 para salir");
         opcion=entrada.next();
           }while(!opcion.equals("1")&&!opcion.equals("2")&&!opcion.equals("3")); 
           
        switch(opcion){
            
            case "1":
                
                capturarDatos();
                
                break;
                
            case "2":
                MostrarDatos();
                
                
                break;
            
                
            case "3":  break;
                    
            
        }   
            
             System.out.println("\nDesea volver?\n\n(pulsa 1) para SI\n¡¡pulsa cualquier tecla para NO!!\n");
         volver = entrada.next();
        
       }while(volver.equals("1")); 
        
        System.out.println("\n¡¡ADIOS!!\n");     
     
    }
        
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Ejercicio_1_ruleta llamar= new Ejercicio_1_ruleta();
        
         System.out.println("Programa de ruleta de participacion\n");
         
         
        
    
        llamar.menu();
          
          
          
          
          
          
          
          
         
    }
    
    
   
    
}
