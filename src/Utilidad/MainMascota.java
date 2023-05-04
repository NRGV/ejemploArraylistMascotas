/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Servicio.MascotaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class MainMascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//       String[] nombresArray = new String [5];                    // aca creo el array y le doy dimension
//       
//        for (int i = 0; i < nombresArray.length; i++) {         // formula para llenar dinamicamente un array sin importar la dimension
//            nombresArray[i] = "Chiquito" + (i +1) ;
//            
//           
//        }
//        for (String var : nombresArray) {
//            System.out.println(var);
//            
//        }
//        
//        
//        ArrayList<String>nombresArrayList=new ArrayList(); //Primero creo el AyList
//                                                                        //formula para llenar manualmente un AyLi(ArrayList) 
//        nombresArrayList.add("Chiquito"); // le meto algo adentro
//        nombresArrayList.add("Culito");
//        System.out.println(nombresArrayList); //Lo muestro
//        
//        System.out.println(nombresArrayList.size()); // Con esto muestro el tamaño del array
//        
//        nombresArrayList.remove("Chiquito");  // con esto remuevo algo que sepa de la AyList
//        System.out.println(nombresArrayList);
//        
//        System.out.println(nombresArrayList.size());  
         Scanner read = new Scanner(System.in);       
        MascotaService ServMasc = new MascotaService();
        
        System.out.println("Bienvenidos al sistema de creacion de mascota");
        
        System.out.println("Cuantas mascotas quiere ingresar al sistema?");
        int cantidad = read.nextInt();
        System.out.println("--------------------------------------------");
        ServMasc.fabricaMascota(cantidad);
        
        System.out.println("--------------------------------------------");
        System.out.println("Las mascotas creadas al momento son ");
        ServMasc.mostrarMascota();
        System.out.println("--------------------------------------------");
        System.out.println("ACTUALIZAR MASCOTA");
        
        System.out.println("Ingrese el numero de mascota a la cual desea cambiarle la raza a Pastor Aleman");
        int aux = read.nextInt();
        ServMasc.actualizarMascota(aux);
        
        ServMasc.mostrarMascota();
        
        
        System.out.println("--------------------------------------------");
        
        
        System.out.println("ACTUALIZAR MASCOTA");
        
        System.out.println("Ingrese el numero de la mascota la cual desea MODIFICAR");
        int aux2 = read.nextInt();
        ServMasc.actualizarMascota2(aux2);
        
        ServMasc.mostrarMascota();
        
        System.out.println("--------------------------------------------");
        
        
        System.out.println("ELIMINACION DE UNA MASCOTA");
        
        System.out.println("Ingrese la posicion de la mascota que desea eliminar");
        int aux3 = read.nextInt();
        ServMasc.eliminarMascota(aux3);
        
        ServMasc.mostrarMascota();
        
        
    }
    
}
