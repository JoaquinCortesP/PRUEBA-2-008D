/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Autos extends Vehiculos{
    private int pasajeros;
    private boolean autopilot;

    public Autos(int pasajeros, boolean autopilot) {
        this.pasajeros = pasajeros;
        this.autopilot = autopilot;
    }

    public Autos(int pasajeros, boolean autopilot, String codigo, boolean requieremantencion, int horasdealquiler, String tipovehiculo) {
        super(codigo, requieremantencion, horasdealquiler, tipovehiculo);
        this.pasajeros = pasajeros;
        this.autopilot = autopilot;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
    }

    @Override
    public String toString() {
        return "Autos{" + "pasajeros=" + pasajeros + ", autopilot=" + autopilot + '}';
    }

    
    
    
   
    
    @Override
    public double calcularCostoAlquiler(int horasdealquiler){
        double costo = VALOR_HORA_ALQUILER * horasdealquiler;
        if(autopilot == true){
            costo *= 1.10;
            return costo;
        }else{
        return costo = VALOR_HORA_ALQUILER * horasdealquiler;
        }
        
    }
    
}
