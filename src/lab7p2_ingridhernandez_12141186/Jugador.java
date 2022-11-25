/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Jugador {
    private String nombre;
    private int dorsal;
    private int goles;
    private int asistencia;
    private int partidos;
    private int tarjeta_amarilla;
    private int tarjeta_rojas;
    private int faltas_Cometidas;
    private int faltas_recibidad;
    private String posicion;
    private int porteria_imbatibles;
    private String selecion;
    public Jugador() {
    }

    public Jugador(String nombre, int dorsal, int goles, int asistencia, int partidos, int tarjeta_amarilla, int tarjeta_rojas, int faltas_Cometidas, int faltas_recibidad, String posicion,String selecion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.partidos = partidos;
        this.tarjeta_amarilla = tarjeta_amarilla;
        this.tarjeta_rojas = tarjeta_rojas;
        this.faltas_Cometidas = faltas_Cometidas;
        this.faltas_recibidad = faltas_recibidad;
        this.posicion = posicion;
        this.selecion = selecion;
    }

    public Jugador(String nombre, int dorsal, int goles, int asistencia, int partidos, int tarjeta_amarilla, int tarjeta_rojas, int faltas_Cometidas, int faltas_recibidad, String posicion, int porteria_imbatibles,String selecion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.partidos = partidos;
        this.tarjeta_amarilla = tarjeta_amarilla;
        this.tarjeta_rojas = tarjeta_rojas;
        this.faltas_Cometidas = faltas_Cometidas;
        this.faltas_recibidad = faltas_recibidad;
        this.posicion = posicion;
        this.porteria_imbatibles = porteria_imbatibles;
        this.selecion = selecion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if(dorsal >=1 && dorsal <= 26){
             if(this.posicion != "Portero" && dorsal !=1 && dorsal !=13 && dorsal !=26 ){
              this.dorsal = dorsal;   
            }
        }
        
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getTarjeta_amarilla() {
        return tarjeta_amarilla;
    }

    public void setTarjeta_amarilla(int tarjeta_amarilla) {
        this.tarjeta_amarilla = tarjeta_amarilla;
    }

    public int getTarjeta_rojas() {
        return tarjeta_rojas;
    }

    public void setTarjeta_rojas(int tarjeta_rojas) {
        this.tarjeta_rojas = tarjeta_rojas;
    }

    public int getFaltas_Cometidas() {
        return faltas_Cometidas;
    }

    public void setFaltas_Cometidas(int faltas_Cometidas) {
        this.faltas_Cometidas = faltas_Cometidas;
    }

    public int getFaltas_recibidad() {
        return faltas_recibidad;
    }

    public void setFaltas_recibidad(int faltas_recibidad) {
        this.faltas_recibidad = faltas_recibidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getPorteria_imbatibles() {
        return porteria_imbatibles;
    }

    public void setPorteria_imbatibles(int porteria_imbatibles) {
        this.porteria_imbatibles = porteria_imbatibles;
    }

    public String getSelecion() {
        return selecion;
    }

    public void setSelecion(String selecion) {
        this.selecion = selecion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dorsal=" + dorsal + ", goles=" + goles + ", asistencia=" + asistencia + ", partidos=" + partidos + ", tarjeta_amarilla=" + tarjeta_amarilla + ", tarjeta_rojas=" + tarjeta_rojas + ", faltas_Cometidas=" + faltas_Cometidas + ", faltas_recibidad=" + faltas_recibidad + ", posicion=" + posicion + ", porteria_imbatibles=" + porteria_imbatibles + '}';
    }
    
            
}
