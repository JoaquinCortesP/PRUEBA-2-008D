/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import cl.duoc.models.Autos;
import cl.duoc.models.Bicicletas;
import cl.duoc.models.Motos;
import cl.duoc.models.RegistroDeAutos;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //////CLASES//////////
        
        RegistroDeAutos lista = new RegistroDeAutos();
        
        Bicicletas bici1 = new Bicicletas("Manual", 20, "Bc-001", true, 5, "Bicicleta");
        Bicicletas bici2 = new Bicicletas("Mecanica", 14, "Bc-002", false, 10, "Bicicleta");
        
        Motos moto1 = new Motos(100, true, "Mt-001", true, 10, "Moto");
        Motos moto2 = new Motos(200, false, "Mt-001", false, 10, "Moto");
        
        
        Autos auto1 = new Autos(2, false, "Awto-001", true, 10, "Auto");
        Autos auto2 = new Autos(6, true, "Awto-002", true, 10, "Auto");
        Autos auto3 = new Autos(4, true, "Awto-003", true, 10, "Auto");
        
        
        
        /////////////////////
        
        
        
        //////////MENU/////////////
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion != 5){
            System.out.println("BIENVENIDO A TESLA FLEET");
            System.out.println("-------------------------");
            System.out.println("MENU DE ALQUILER DE VEHICULOS ELECTRICOS");
            System.out.println("[1]MOSTRAR GAMA DE VEHICULOS");
            System.out.println("[2]CARRITO DE ALQUILER");
            System.out.println("[3]TOTAL A PAGAR");
            System.out.println("[4]VALIDAR EXISTENCIA DE CODIGO");
            System.out.println("[5]SALIR");
            
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println(bici1+" [1] ");
                    System.out.println(bici2+" [2] ");
                    System.out.println(moto1+" [3] ");
                    System.out.println(moto2+" [4] ");
                    System.out.println(auto1+" [5] ");
                    System.out.println(auto2+" [6] ");
                    System.out.println(auto3+" [7] ");
                    
                    int vehiculos = entrada.nextInt();
                    
                    
                    switch(vehiculos){
                        
                        
                        case 1:
                            
                            
                            lista.AgregarVehiculo(bici1);                                                                               
                            System.out.println("Bicicleta alquilada con exito!");
                            System.out.println("-----------------");
                            
                            System.out.println("Escriba las horas que alquilará");
                            int horasdealquiler = entrada.nextInt();
                            bici1.getHorasdealquiler();
                            bici1.setHorasdealquiler(horasdealquiler);
                            
                            System.out.println("Detalles:");
                            System.out.println(bici1);  
                            
                            bici1.getTipovehiculo();
                            
                            
                            
                            break;
                        case 2:
                         
                            
                          
                          
                            
                            lista.AgregarVehiculo(bici2);
                            System.out.println("Bicicleta alquilada con exito!");
                            System.out.println("-----------------");
                            
                            System.out.println("Escriba las horas que alquilará");
                            horasdealquiler = entrada.nextInt();
                            bici2.getHorasdealquiler();
                            bici2.setHorasdealquiler(horasdealquiler);
                            
                            System.out.println("Detalles:");
                            System.out.println(bici2);  
                            
                            
                            break;
                            
                        case 3:
                            
                            
                            
                            lista.AgregarVehiculo(moto1);
                            System.out.println("MOTO alquilada con exito!");
                            System.out.println("-----------------");
                            
                            
                            System.out.println("Escriba las horas que alquilará");
                            horasdealquiler = entrada.nextInt();
                            moto1.getHorasdealquiler();
                            moto1.setHorasdealquiler(horasdealquiler);
                            
                            System.out.println("Detalles:");
                            System.out.println(moto1);   
                            
                            break;
                            
                        case 4:
                            
                            lista.AgregarVehiculo(moto2);
                            System.out.println("MOTO alquilada con exito!");
                            System.out.println("-----------------");
                            
                            System.out.println("Escriba las horas que alquilará");
                            horasdealquiler = entrada.nextInt();
                            moto2.getHorasdealquiler();
                            moto2.setHorasdealquiler(horasdealquiler);
                            
                            System.out.println("Detalles:");
                            System.out.println(moto2);  
                            
                            break;
                            
                        case 5:
                            
                            lista.AgregarVehiculo(auto1);
                            System.out.println("CAMIONETA alquilada con exito!");
                            System.out.println("-----------------");
                           
                            System.out.println("Escriba las horas que alquilará");
                            horasdealquiler = entrada.nextInt();
                            auto1.getHorasdealquiler();
                            auto1.setHorasdealquiler(horasdealquiler);
                            
                            System.out.println("Detalles:");
                            System.out.println(auto1);  
                            
                            break;
                            
                        case 6:
                            
                            lista.AgregarVehiculo(auto2);
                            System.out.println("SEDAN alquilada con exito!");
                            System.out.println("-----------------");
                         
                            System.out.println("Escriba las horas que alquilará");
                            horasdealquiler = entrada.nextInt();
                            auto2.getHorasdealquiler();
                            auto2.setHorasdealquiler(horasdealquiler);
                            
                            System.out.println("Detalles:");
                            System.out.println(auto2);  
                           
                            
                            break;
                            
                        case 7:
                            
                            lista.AgregarVehiculo(auto3);
                            System.out.println("CITY CAR alquilada con exito!");
                            System.out.println("-----------------");
                            
                            
                            System.out.println("Escriba las horas que alquilará");
                            horasdealquiler = entrada.nextInt();
                            auto3.getHorasdealquiler();
                            auto3.setHorasdealquiler(horasdealquiler);
                            
                            System.out.println("Detalles:");
                            System.out.println(auto3);  
                            break;
                    }
                    
                    break;
                case 2:
                    System.out.println("Sus vehiculos agregados son");
                    System.out.println("----------------------------");
                    
                    lista.listarVehiculos();
                    System.out.println("----------------------------");
                    break;
                    
                case 3:
                    int horasdealquier;
                    int tipovehiculo;
                    
                    System.out.println("Escoja que tipo de vehiculos posee en alquiler (1)Auto   (2) Moto o     (3)Bicicleta o 4 si su lista está llena ");
                    
                    tipovehiculo = entrada.nextInt();
                        switch(tipovehiculo){
                            
                            
                            case 1:
                                System.out.println("Ha seleccionado auto");
                                System.out.println("Escriba las horas de alquiler");
                                horasdealquier = entrada.nextInt();
                                
                                System.out.println("Total: " + lista.calcularCostoAlquilerFinal(horasdealquier, "Auto"));
                            case 2:
                                System.out.println("Ha seleccionado moto");
                                System.out.println("Escriba las horas de alquiler");
                                horasdealquier = entrada.nextInt();
                                
                                System.out.println("Total: " + lista.calcularCostoAlquilerFinal(horasdealquier, "Moto"));
                            case 3:
                                System.out.println("Ha seleccionado auto");
                                System.out.println("Escriba las horas de alquiler");
                                horasdealquier = entrada.nextInt();
                                
                                System.out.println("Total: " + lista.calcularCostoAlquilerFinal(horasdealquier, "Moto"));
                                
                                
                        }
                    
                    break;
                case 4:
                    System.out.println("Escriba el codigo");
                    String codigo = entrada.nextLine();
                    lista.codigoUnico(codigo);
                    
                    break;
                case 5:
                    break;
                 
            
            
            
            
            
            }
            
        }
        /////////MENU//////////////////
        
        
    }
    
}
