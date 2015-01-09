/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Classe que modela una Persona
 *
 * @author Francesc Gallart
 * @version 1.00 12/01/2014
 */
public class Persona implements Comparable<Persona> {

    private String dni;
    private String nom;
    private String cognom1;
    private String cognom2;
    private int edat;

    /**
     * Constructor
     */
    public Persona(String dni, String nom, String cognom1, String cognom2,
            int edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.edat = edat;
    }

    /**
     * Getters i Setters
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return dni + ";" + nom + ";" + cognom1 + ";" + cognom2 + ";" + edat;
    }

    /**
     * Mètode que ens permet comparar els contactes per nom i cognoms
     *
     * @param persona la persona la qual volem comparar
     */
    @Override
    public int compareTo(Persona persona) {
        int comparacio = nom.compareTo(persona.getNom());

        if (comparacio == 0) {
            comparacio = cognom1.compareTo(persona.getCognom1());
            if (comparacio == 0) {
                comparacio = cognom2.compareTo(persona.getCognom2());
            }
        }
        return comparacio;
    }
}
