/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_ingridhernandez_12141186;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMINISTRADOR1
 */
public class adminPartido {
     private ArrayList<Partido> par =new ArrayList();
    private File archivo = null;

    public adminPartido() {
    }
     public adminPartido(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partido> getpar() {
        return par;
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setpar(ArrayList<Partido> listaPersonas) {
        this.par= listaPersonas;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminSeleccion{" + "sel=" + par + ", archivo=" + archivo + '}';
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Partido p : par) {
                bw.write(p.getLocal() + "|");
                bw.write(p.getVistantes() + "|");
                bw.write(p.getGoles() + "|");
                bw.write(p.getPosicion() + "|");
                bw.write(p.getTiros_Total()+ "|");
                bw.write(p.getTiros_meta()+ "|");
                bw.write(p.getFaltas()+ "|");
                for (Jugador jc : p.getJ_Faltas()) {
                    bw.write(jc.getNombre()+":");
                }
                for (Jugador jt : p.getJ_tarjetas()) {
                    bw.write(jt.getNombre()+":");
                }
                for (Jugador jg : p.getJ_gol()) {
                    bw.write(jg.getNombre()+":");
                }
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }//Fin Escribir Archivo

    public void leerArchivo() throws IOException {
        Scanner lea = null;
        par= new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("(;|\\||\\[|\\]|,)");
               
                while (lea.hasNext()) {
                   par.add(new Partido(lea.next(),lea.next(),lea.nextInt(),lea.nextInt(), lea.nextInt(),lea.nextInt(),lea.nextInt()));
                   if(!lea.hasNext("") && !lea.hasNext("")){
                    System.out.println("Hay doble vacio");
                    
                while (!lea.hasNext("")) {
                            int indexPersonas =par.size() - 1;
                            par.get(indexPersonas).getJ_Faltas().add(new Jugador(lea.next()));
                        }
                while (!lea.hasNext("")) {
                            int indexPersonas =par.size() - 1;
                            par.get(indexPersonas).getJ_tarjetas().add(new Jugador(lea.next()));
                        }
                while (!lea.hasNext("")) {
                            int indexPersonas =par.size() - 1;
                            par.get(indexPersonas).getJ_gol().add(new Jugador(lea.next()));
                        }
                    } else {
                        lea.next();
                        
                    }
                   
                }
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
