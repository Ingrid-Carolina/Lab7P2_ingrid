/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_ingridhernandez_12141186;

import java.util.ArrayList;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Partido {
    private seleccion local;
    private seleccion vistantes;
    private int goles;
    private int posicion;
    private int tiros_Total;
    private int tiros_meta;
    private int faltas;
    ArrayList<Jugador> j_Faltas = new ArrayList();
     ArrayList<Jugador> j_tarjetas = new ArrayList();
             ArrayList<Jugador> j_gol = new ArrayList();

    public Partido() {
    }

    public Partido(seleccion local, seleccion vistantes, int goles, int posicion, int tiros_Total, int tiros_meta, int faltas) {
        this.local = local;
        this.vistantes = vistantes;
        this.goles = goles;
        this.posicion = posicion;
        this.tiros_Total = tiros_Total;
        this.tiros_meta = tiros_meta;
        this.faltas = faltas;
    }

    public seleccion getLocal() {
        return local;
    }

    public void setLocal(seleccion local) {
        this.local = local;
    }

    public seleccion getVistantes() {
        return vistantes;
    }

    public void setVistantes(seleccion vistantes) {
        this.vistantes = vistantes;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getTiros_Total() {
        return tiros_Total;
    }

    public void setTiros_Total(int tiros_Total) {
        this.tiros_Total = tiros_Total;
    }

    public int getTiros_meta() {
        return tiros_meta;
    }

    public void setTiros_meta(int tiros_meta) {
        this.tiros_meta = tiros_meta;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public ArrayList<Jugador> getJ_Faltas() {
        return j_Faltas;
    }

    public void setJ_Faltas(ArrayList<Jugador> j_Faltas) {
        this.j_Faltas = j_Faltas;
    }

    public ArrayList<Jugador> getJ_tarjetas() {
        return j_tarjetas;
    }

    public void setJ_tarjetas(ArrayList<Jugador> j_tarjetas) {
        this.j_tarjetas = j_tarjetas;
    }

    public ArrayList<Jugador> getJ_gol() {
        return j_gol;
    }

    public void setJ_gol(ArrayList<Jugador> j_gol) {
        this.j_gol = j_gol;
    }

    @Override
    public String toString() {
        return "Partido{" + "local=" + local + ", vistantes=" + vistantes + ", goles=" + goles + ", posicion=" + posicion + ", tiros_Total=" + tiros_Total + ", tiros_meta=" + tiros_meta + ", faltas=" + faltas + ", j_Faltas=" + j_Faltas + ", j_tarjetas=" + j_tarjetas + ", j_gol=" + j_gol + '}';
    }
             
}
