/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Motos extends Vehiculos{
    private int bateriamoto;
    private boolean modoeco;

    public Motos(int bateriamoto, boolean modoeco) {
        this.bateriamoto = bateriamoto;
        this.modoeco = modoeco;
    }

    public Motos(int bateriamoto, boolean modoeco, String codigo, boolean requieremantencion, int horasdealquiler, String tipovehiculo) {
        super(codigo, requieremantencion, horasdealquiler, tipovehiculo);
        this.bateriamoto = bateriamoto;
        this.modoeco = modoeco;
    }

    public int getBateriamoto() {
        return bateriamoto;
    }

    public void setBateriamoto(int bateriamoto) {
        this.bateriamoto = bateriamoto;
    }

    public boolean isModoeco() {
        return modoeco;
    }

    public void setModoeco(boolean modoeco) {
        this.modoeco = modoeco;
    }

    @Override
    public String toString() {
        return "Motos{" + "bateriamoto=" + bateriamoto + ", modoeco=" + modoeco + '}';
    }

   

   
    
    @Override
    public double calcularCostoAlquiler(int horasdealquiler){
        double costo = VALOR_HORA_ALQUILER * horasdealquiler;
        if(modoeco == true){
        costo *= 1.08;
        return costo;
        }else{
        return costo = VALOR_HORA_ALQUILER * horasdealquiler;
        }
            
      
    }

}
