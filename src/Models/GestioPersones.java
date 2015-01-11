/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Classe que ens permet gestionar una llista de Persones
 *
 * @author Francesc Gallart
 * @version 1.00 12/01/2014
 */
public class GestioPersones extends LinkedList<Persona> {

    /**
     * La posició en que es troba la persona que estem gestionant
     */
    private int posicio;

    /**
     * Constructor
     */
    public GestioPersones() {
        this.posicio = 0;
    }

    /**
     * Mètode que permet afegir una nova persona
     *
     * @param persona persona a afegir
     * @return true si s'ha afegit correctament, false en cas contrari
     */
    @Override
    public boolean add(Persona persona) {
        posicio = size();
        return super.add(persona);
    }

    /**
     * Mètode que ens permet eliminar una persona
     *
     * @param persona persona a eliminar
     * @return true si s'ha eliminat correctament, false en cas contrari
     */
    public boolean remove(Persona persona) {
        boolean correcte = super.remove(persona);
        if (correcte && posicio > 0) {
            posicio--;
        }
        return correcte;
    }

    /**
     * Mètode que retorna la posició de la última persona
     */
    public void ultimaPosicio() {
        posicio = (size() - 1);
    }

    /**
     * Mètode que retorna la primera posició
     */
    public void primeraPosicio() {
        posicio = 0;
    }

    /**
     * Mètode que retorna la posició real de la llista, la qual estem apuntant
     *
     * @return la posició real
     */
    public int getPosicio() {
        return posicio;
    }

    /**
     * Mètode que abança una posició per mostrar la persona següent
     */
    public void seguentPersona() {
        if (posicio < size() - 1) {
            posicio++;
        }
    }

    /**
     * Mètode que retrocedeix una posició per mostrar la persona anterior
     */
    public void anteriorPersona() {
        if (posicio > 0) {
            posicio--;
        }
    }

    /**
     * Mètode que ens permet retornar l'objecte persona el qual estem apuntant
     * mitjançant la posició de la llista
     *
     * @return la persona
     */
    public Persona getPersona() {
        Persona p = null;
        if (size() >= 0) {
            p = get(posicio);
        }
        return p;
    }

    /**
     * Mètode que ens permet odenar la llista per nom i cognoms
     */
    public void ordenar() {
        Collections.sort(this);
    }
}
