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
public class seleccion {
    private String nombre=" ";
    private int jugados=0;
    private int ganados=0;
    private int empatados=0;
    private int perdidos=0;
    private int favor=0;
    private int contra=0;
    private int diferencia=0;
    private ArrayList<Jugador> j = new ArrayList();

    public seleccion() {
    }
     public seleccion(String nombre) {
        this.nombre = nombre;
    }

    public seleccion (String nombre, int jugados,int ganados, int empatados, int perdidos, int favor, int contra, int diferencia) {
        this.nombre = nombre;
        this.jugados = jugados;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.favor = favor;
        this.contra = contra;
        this.diferencia = diferencia;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJugados() {
        return jugados;
    }

    public void setJugados(int jugados) {
        this.jugados = jugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getFavor() {
        return favor;
    }

    public void setFavor(int favor) {
        this.favor = favor;
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public ArrayList<Jugador> getJ() {
        return j;
    }

    public void setJ(ArrayList<Jugador> j) {
        if(j.size()> 0 && j.size()<26){
        this.j = j;    
        }
        
    }

    @Override
    public String toString() {
        return "seleccion{" + "nombre=" + nombre + ", jugados=" + jugados + ", ganados=" + ganados + ", empatados=" + empatados + ", perdidos=" + perdidos + ", favor=" + favor + ", contra=" + contra + ", diferencia=" + diferencia + ", j=" + j + '}';
    }
    
}
