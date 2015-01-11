/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.*;
import Models.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Controlador de l'aplicació Gestió de Persones
 *
 * @author Francesc Gallart
 * @version 1.00 12/01/2014
 */
public class Controller {

    private GestioPersones model;
    private FormPrincipal view;
    private WindowListener eventIniciarTancar;
    private boolean editaPersona = false;

    public Controller(GestioPersones model, FormPrincipal view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Mètode que implementa els Listeners dels events que es poden produir en
     * clicar els botons
     */
    public void control() {
        // Botó Nou
        view.getBtnNou().addActionListener(e -> eventBtnNou());
        // Botó Esborra
        view.getBtnEsborra().addActionListener(e -> eventBtnEsborra());
        // Botó Edita
        view.getBtnEdita().addActionListener(e -> eventBtnEdita());
        // Botó Primer
        view.getBtnPrimer().addActionListener(e -> eventBtnPrimer());
        // Botó Darrer
        view.getBtnDarrer().addActionListener(e -> eventBtnDarrer());
        // Botó Anterior
        view.getBtnAnterior().addActionListener(e -> eventBtnAnterior());
        // Botó Seguent
        view.getBtnSeguent().addActionListener(e -> eventBtnSeguent());
        // Botó Desa
        view.getBtnDesa().addActionListener(e -> eventBtnDesa());
        // Botó Cancela
        view.getBtnCancela().addActionListener(e -> eventBtnCancela());

        // Events d'inici i tancament de l'aplicació
        eventIniciarTancar = new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                carregarDades();
            }

            @Override
            public void windowClosing(WindowEvent e) {
                modificarDades();
            }
        };
        view.addWindowListener(eventIniciarTancar);
    }

    /**
     * Mètode que s'executa al fer clic al botó nou
     */
    private void eventBtnNou() {
        // Netejem el contingut dels camps de text
        view.esborrarTextFields();
        // Activem la edició dels camps de text
        view.setEditableTxtFields(true);
        // Desactivar botons i Activar desar i cancel·lar
        view.setEnabledDesaCancela(true);
        // Actualitzar label registre
        view.nouLblRegistre();
    }

    /**
     * Mètode que s'executa al fer clic al botó esborrar
     */
    private void eventBtnEsborra() {
        if (view.confirmacioEsborrar() == 0) {
            // Eliminem la persona de la llista
            model.remove(model.getPersona());
            if (model.size() > 0) {
                // Mostrem la persona a la que apuntem
                view.mostrarDadesPersona(model.getPersona());
            } else {
                view.esborrarTextFields();
                // Només podem crear registre nou
                view.nouRegistre();
            }
            // Actualitzar label registre
            view.actualitzarLblRegistre(model.getPosicio(), model.size());
        }
    }

    /**
     * Mètode que s'executa al fer clic al botó edita
     */
    private void eventBtnEdita() {
        // Activem la edició dels text fields i els botons corresponents
        view.setEditableTxtFields(true);
        // Desactivar botons i Activar desar i cancel·lar
        view.setEnabledDesaCancela(true);
        editaPersona = true;
    }

    /**
     * Mètode que s'executa al fer clic al botó primer
     */
    private void eventBtnPrimer() {
        // Apuntem a la primera posició
        model.primeraPosicio();
        // Fem que és mostrin les dades d'aquesta
        view.mostrarDadesPersona(model.getPersona());
        // Actualitzar label registre
        view.actualitzarLblRegistre(model.getPosicio(), model.size());
    }

    /**
     * Mètode que s'executa al fer clic al botó darrer
     */
    private void eventBtnDarrer() {
        // Apuntem a la l'úlima posició
        model.ultimaPosicio();
        // Fem que és mostrin les dades d'aquesta
        view.mostrarDadesPersona(model.getPersona());
        // Actualitzar label registre
        view.actualitzarLblRegistre(model.getPosicio(), model.size());
    }

    /**
     * Mètode que s'executa al fer clic al botó anterior
     */
    private void eventBtnAnterior() {
        // Apuntem a la posició anterior
        model.anteriorPersona();
        // Fem que és mostrin les dades d'aquesta
        view.mostrarDadesPersona(model.getPersona());
        // Actualitzar label registre
        view.actualitzarLblRegistre(model.getPosicio(), model.size());
    }

    /**
     * Mètode que s'executa al fer clic al botó seguent
     */
    private void eventBtnSeguent() {
        // Apuntem a la posició següent
        model.seguentPersona();
        // Fem que és mostrin les dades d'aquesta
        view.mostrarDadesPersona(model.getPersona());
        // Actualitzar label registre
        view.actualitzarLblRegistre(model.getPosicio(), model.size());
    }

    /**
     * Mètode que s'executa al fer clic al botó desa
     */
    private void eventBtnDesa() {
        // Validem el contingut dels text fields
        boolean comprovar = view.validarDades();
        if (comprovar) {
            if (!editaPersona) {
                // Guardem la persona a la llista
                model.add(view.obtenirDadesPersona());
            } else {
                // Modifiquem les dades
                model.set(model.getPosicio(), view.obtenirDadesPersona());
                editaPersona = false;
            }
            // Desactivem els text fields
            view.setEditableTxtFields(false);
            // Activem els botons i desactivem els de desa i cancel·la
            view.setEnabledDesaCancela(false);
            // Actualitzar label registre
            view.actualitzarLblRegistre(model.getPosicio(), model.size());
        }
    }

    /**
     * Mètode que s'executa al fer clic al botó cancel·la
     */
    private void eventBtnCancela() {
        // Desactivem la edició
        view.setEditableTxtFields(false);

        // Hi ha registres
        if (model.size() > 0) {
            // Apuntem a la primera posició de la llista
            model.primeraPosicio();
            // Mostrem les seves dades
            view.mostrarDadesPersona(model.getPersona());
            // Activem els botons i desactivem els de desa i cancel·la
            view.setEnabledDesaCancela(false);
        } else {
            view.esborrarTextFields();
            // Només podem crear registre nou
            view.nouRegistre();
        }
        // Actualitzar label registre
        view.actualitzarLblRegistre(model.getPosicio(), model.size());
    }

    /**
     * Mètode que ens permet carregar les dades del fitxer en memòria en iniciar
     * l'aplicació
     */
    private void carregarDades() {
        File csvFitxer = new File("dades.csv");

        // Si existeix l'arxiu
        if (csvFitxer.exists()) {
            BufferedReader br = null;
            String linia;
            String cvsSplitBy = ";";

            try {
                br = new BufferedReader(new FileReader(csvFitxer));
                String[] dadesPersona = null;

                // Recorro totes les línies del fitxer i creo els objectes
                while ((linia = br.readLine()) != null) {

                    dadesPersona = linia.split(cvsSplitBy);
                    model.add(new Persona(dadesPersona[0], dadesPersona[1],
                            dadesPersona[2], dadesPersona[3],
                            Integer.parseInt(dadesPersona[4])));
                }

                // Si el fitxer està buit
                if (dadesPersona == null) {
                    // Només podem crear registre nou
                    view.nouRegistre();
                } else {
                    // Mostrem les dades de la primera persona de la llista
                    model.primeraPosicio();
                    view.mostrarDadesPersona(model.getPersona());
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,
                        null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,
                        null, ex);
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Controller.class.getName()).log(
                                Level.SEVERE, null, ex);
                    }
                }
            }
            // Si no existeix l'arxiu
        } else {
            try {
                // Només podem crear registre nou
                view.nouRegistre();
                csvFitxer.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
        // Actualitzar label registre
        view.actualitzarLblRegistre(model.getPosicio(), model.size());
    }

    /**
     * Mètode que ens permet modificar les dades del fitxer al tancar
     * l'aplicació i desar les persones que el formen per cognoms i nom
     */
    private void modificarDades() {
        File csvFitxer = new File("dades.csv");
        FileWriter fw = null;

        try {
            // Ordenem el contingut de la llista
            model.ordenar();
            fw = new FileWriter(csvFitxer);
            // Introduim una persona a cada línia
            for (Persona personaLinia : model) {
                fw.append(personaLinia.toString() + "\n");
            }

        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null,
                    ex);
        } finally {

            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
            }
        }
    }
}
