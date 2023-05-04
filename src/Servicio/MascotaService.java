/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class MascotaService {
    
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n"); //escaner
    private ArrayList<Mascota> mascota; //creamos el objeto mascota del tipo Mascota de Entidades

    public MascotaService() {
        this.mascota = mascota = new ArrayList(); //
        
    }

//public Mascota crearMascota(){  //CREAR la mascota y GUARDAR en el ARRAYLIST (mascota.add(m1) y retornarlo para usarlo
//  
//    System.out.println("Introduccior nombre");
//    String nombre = read.next();
//    System.out.println("Introduccior apodo");
//    String apodo = read.next();
//    System.out.println("Introduccior raza");
//    String raza = read.next();
//    
//   
//   Mascota m1 = new Mascota(nombre, apodo, raza);
//    mascota.add(m1);
//    return m1;

    
 public Mascota crearMascota(){                                         
        System.out.println("Introduccior nombre");
   String nombre = read.next();
  System.out.println("Introduccir edad");
   int edad = read.nextInt();
  System.out.println("Introduccior raza");
   String raza = read.next();
                                                                                    /// para el tipo de dato CLASE o Entidad
        
        return new Mascota(nombre, edad, raza);
}
public void agregarMascota(Mascota m){
         mascota.add(m);
       
        

    
    
    
    
    
    
}
        public void fabricaMascota(int cantidad){
            
            for (int i = 0; i < cantidad; i++) {
                Mascota mascotacreada = crearMascota();
                agregarMascota(mascotacreada);
                System.out.println(mascotacreada.toString());
                
            }
            
        }
        
        
      public void mostrarMascota(){
          
          for (Mascota aux : mascota) {
              System.out.println(aux.toString());
          }
          
      }
      
      
      // TRY and CATCH
      public void actualizarMascota(int index){
          Mascota m = mascota.get(index);
          m.setRaza("Pastor Aleman");
                  
          
      }
      
      
      public void actualizarMascota2(int index){
          
          Mascota m = crearMascota();
          
          mascota.set(index, m);
          
      }
      
      public void eliminarMascota(int index){
          mascota.remove(index);
          
      }
      
      
      
      
      
      
      
      
      
      
      
      
}
