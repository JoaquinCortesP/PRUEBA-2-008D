/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Bicicletas extends Vehiculos{
    private String tipodefrenos;
    private int capacidadbateria;

    public Bicicletas(String tipodefrenos, int capacidadbateria) {
        this.tipodefrenos = tipodefrenos;
        this.capacidadbateria = capacidadbateria;
    }

    public Bicicletas(String tipodefrenos, int capacidadbateria, String codigo, boolean requieremantencion, int horasdealquiler, String tipovehiculo) {
        super(codigo, requieremantencion, horasdealquiler, tipovehiculo);
        this.tipodefrenos = tipodefrenos;
        this.capacidadbateria = capacidadbateria;
    }

    public String getTipodefrenos() {
        return tipodefrenos;
    }

    public void setTipodefrenos(String tipodefrenos) {
        this.tipodefrenos = tipodefrenos;
    }

    public int getCapacidadbateria() {
        return capacidadbateria;
    }

    public void setCapacidadbateria(int capacidadbateria) {
        this.capacidadbateria = capacidadbateria;
    }

    @Override
    public String toString() {
        return "Bicicletas{" + "tipodefrenos=" + tipodefrenos + ", capacidadbateria=" + capacidadbateria + "Kmh";
    }

    

   
    
    
    
     public double calcularCostoAlquiler(int horasdealquiler){
        double costo = VALOR_HORA_ALQUILER * horasdealquiler;
        if(capacidadbateria < 20){
            costo *= 0.95;
            return costo;
        }else{
        return costo = VALOR_HORA_ALQUILER * horasdealquiler;
        }
        
    }
}
