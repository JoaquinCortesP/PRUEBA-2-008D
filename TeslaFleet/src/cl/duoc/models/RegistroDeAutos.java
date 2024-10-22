/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class RegistroDeAutos implements Interfaz{
    private List<Vehiculos> registro = new ArrayList<>();
    private int codigounico = 0;
    
    
    public void AgregarVehiculo(Vehiculos nueVehiculo){
        registro.add(codigounico++,nueVehiculo);

    }
    public void listarVehiculos(){
        for(Vehiculos i: registro){
            System.out.println("-------REGISTRO---------");
            System.out.println(" Tipo de vehiculo: "+ i.getTipovehiculo());
            System.out.println("Requiere mantencion diaria: "+ i.isRequieremantencion());
            System.out.println("Horas alquiladas: " + i.getHorasdealquiler());
           
            System.out.println("------------------------");
        }
    }
    
    public void cantidad(){
        System.out.println("La cantidad Total de vehiculos es: "+ registro.size());
        
    }
    
    public boolean codigoUnico(String codigo){
        for(Vehiculos i : registro){
            if(i.getCodigo().equals(codigounico)){
                System.out.println("El codigo ya existe");
                
                return true;
            }
            
        }
        System.out.println("El codigo no existe");
        return false;
    }
    
    public double calcularCostoAlquilerFinal(int horasdealquiler, String tipovehiculo){
        double costo = 0;
        for(Vehiculos i: registro){
            costo = i.getHorasdealquiler()*VALOR_HORA_ALQUILER;
            
            
            if(tipovehiculo == "Moto"){
            costo =  i.calcularCostoAlquiler(horasdealquiler);
            System.out.println("El valor por vehiculo sería :" + costo);
            
            if(tipovehiculo == "Auto"){
            costo = i.calcularCostoAlquiler(horasdealquiler);
            System.out.println("El valor por vehiculo sería :" + costo);
            
            
            if(tipovehiculo == "Bicicleta"){
            costo = i.calcularCostoAlquiler(horasdealquiler); 
            System.out.println("El valor por vehiculo sería :" + costo);
            
            
            
            
            
            }
           System.out.println("El valor por vehiculo sería :" + costo);
            }
                
            }
            return costo;
        }
        
        return 0;
    }

    @Override
    public double calcularCostoAlquiler(int horasdealquiler) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}