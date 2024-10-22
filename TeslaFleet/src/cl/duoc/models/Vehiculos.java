/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculos implements Interfaz {
    private String codigo;
    private boolean requieremantencion;
    private int horasdealquiler;
    private String tipovehiculo;

    public Vehiculos() {
    }

    public Vehiculos(String codigo, boolean requieremantencion, int horasdealquiler, String tipovehiculo) {
        this.codigo = codigo;
        this.requieremantencion = requieremantencion;
        this.horasdealquiler = horasdealquiler;
        this.tipovehiculo = tipovehiculo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isRequieremantencion() {
        return requieremantencion;
    }

    public void setRequieremantencion(boolean requieremantencion) {
        this.requieremantencion = requieremantencion;
    }

    public int getHorasdealquiler() {
        return horasdealquiler;
    }

    public void setHorasdealquiler(int horasdealquiler) {
        this.horasdealquiler = horasdealquiler;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    @Override
    public abstract String toString();

    

   
   
}
