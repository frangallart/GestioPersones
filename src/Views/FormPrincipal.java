/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Persona;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Classe Form principal vista principal de l'aplicació Gestió de Persones
 *
 * @author Francesc Gallart
 * @version 1.00 12/01/2014
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public FormPrincipal() {
        initComponents();
    }

    /* Getters necessaris */
    public JButton getBtnAnterior() {
        return btnAnterior;
    }

    public JButton getBtnCancela() {
        return btnCancela;
    }

    public void setBtnCancela(JButton btnCancela) {
        this.btnCancela = btnCancela;
    }

    public JButton getBtnDarrer() {
        return btnDarrer;
    }

    public JButton getBtnDesa() {
        return btnDesa;
    }

    public JButton getBtnEdita() {
        return btnEdita;
    }

    public JButton getBtnEsborra() {
        return btnEsborra;
    }

    public JButton getBtnNou() {
        return btnNou;
    }

    public JButton getBtnPrimer() {
        return btnPrimer;
    }

    public JButton getBtnSeguent() {
        return btnSeguent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBarMenu = new javax.swing.JToolBar();
        btnNou = new javax.swing.JButton();
        btnEsborra = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnPrimer = new javax.swing.JButton();
        btnDarrer = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSeguent = new javax.swing.JButton();
        btnDesa = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        lblRegistre = new javax.swing.JLabel();
        panelDades = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblCognom1 = new javax.swing.JLabel();
        lblCognom2 = new javax.swing.JLabel();
        lblEdat = new javax.swing.JLabel();
        txtFieldNom = new javax.swing.JTextField();
        txtFieldDni = new javax.swing.JTextField();
        txtFieldCognom1 = new javax.swing.JTextField();
        txtFieldCognom2 = new javax.swing.JTextField();
        txtFieldEdat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTIÓ DE PERSONES");
        setName("framePrincipal"); // NOI18N
        setResizable(false);

        toolBarMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNou.setText("Nou");
        btnNou.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toolBarMenu.add(btnNou);

        btnEsborra.setText("Esborra");
        btnEsborra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEsborra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnEsborra);

        btnEdita.setText("Edita");
        btnEdita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnEdita);

        btnPrimer.setText("Primer");
        btnPrimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnPrimer);

        btnDarrer.setText("Darrer");
        btnDarrer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDarrer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnDarrer);

        btnAnterior.setText("Anterior");
        btnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnAnterior);

        btnSeguent.setText("Següent");
        btnSeguent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeguent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnSeguent);

        btnDesa.setText("Desa");
        btnDesa.setEnabled(false);
        btnDesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDesa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnDesa);

        btnCancela.setText("Cancel·la");
        btnCancela.setEnabled(false);
        btnCancela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenu.add(btnCancela);

        lblRegistre.setText("Registre x de x");
        lblRegistre.setFocusable(false);
        toolBarMenu.add(lblRegistre);

        lblDni.setText("DNI:");

        lblNom.setText("Nom:");

        lblCognom1.setText("Primer cognom:");

        lblCognom2.setText("Segon cognom:");

        lblEdat.setText("Edat:");

        txtFieldNom.setEditable(false);

        txtFieldDni.setEditable(false);

        txtFieldCognom1.setEditable(false);

        txtFieldCognom2.setEditable(false);

        txtFieldEdat.setEditable(false);

        javax.swing.GroupLayout panelDadesLayout = new javax.swing.GroupLayout(panelDades);
        panelDades.setLayout(panelDadesLayout);
        panelDadesLayout.setHorizontalGroup(
            panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCognom1)
                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNom)
                    .addComponent(lblCognom2)
                    .addComponent(lblEdat))
                .addGap(18, 18, 18)
                .addGroup(panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCognom1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCognom2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldEdat, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelDadesLayout.setVerticalGroup(
            panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addGap(25, 25, 25)
                .addGroup(panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNom))
                .addGap(25, 25, 25)
                .addGroup(panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCognom1)
                    .addComponent(txtFieldCognom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCognom2)
                    .addComponent(txtFieldCognom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdat)
                    .addComponent(txtFieldEdat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toolBarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(toolBarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnDarrer;
    private javax.swing.JButton btnDesa;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnEsborra;
    private javax.swing.JButton btnNou;
    private javax.swing.JButton btnPrimer;
    private javax.swing.JButton btnSeguent;
    private javax.swing.JLabel lblCognom1;
    private javax.swing.JLabel lblCognom2;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEdat;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblRegistre;
    private javax.swing.JPanel panelDades;
    private javax.swing.JToolBar toolBarMenu;
    private javax.swing.JTextField txtFieldCognom1;
    private javax.swing.JTextField txtFieldCognom2;
    private javax.swing.JTextField txtFieldDni;
    private javax.swing.JTextField txtFieldEdat;
    private javax.swing.JTextField txtFieldNom;
    // End of variables declaration//GEN-END:variables

    /**
     * Mètode que ens permet activar i desactivar la edició dels Text Fields
     *
     * @param actiu true si es volen activar, false en cas contrari
     */
    public void setEditableTxtFields(boolean actiu) {
        // Activar els camps Text Fields
        txtFieldDni.setEditable(actiu);
        txtFieldNom.setEditable(actiu);
        txtFieldCognom1.setEditable(actiu);
        txtFieldCognom2.setEditable(actiu);
        txtFieldEdat.setEditable(actiu);
    }

    /**
     * Mètode que ens permet activar i desactivar tots els botons
     *
     * @param actiu true si es volen activar, false en cas contrari
     */
    public void setEnabledBotons(boolean actiu) {
        btnNou.setEnabled(actiu);
        btnEsborra.setEnabled(actiu);
        btnEdita.setEnabled(actiu);
        btnPrimer.setEnabled(actiu);
        btnDarrer.setEnabled(actiu);
        btnAnterior.setEnabled(actiu);
        btnSeguent.setEnabled(actiu);
        btnDesa.setEnabled(actiu);
        btnCancela.setEnabled(actiu);
    }

    /**
     * Mètode que només ens activa el botó nou registre
     */
    public void nouRegistre() {
        setEnabledBotons(false);
        btnNou.setEnabled(true);
    }

    /**
     * Mètode que ens permet activar o desactivar els botons desa i cancel·la i
     * posar en un estat contrari a aquests a els altres botons
     *
     * @param actiu true si es volen activar, false en cas contrari
     */
    public void setEnabledDesaCancela(boolean actiu) {
        setEnabledBotons(!actiu);
        btnDesa.setEnabled(actiu);
        btnCancela.setEnabled(actiu);
    }

    /**
     * Mètode que ens permet obtenir les dades de la persona la qual apuntem i
     * mostrar-les en els text fields
     *
     * @param p la persona que volem mostrar
     */
    public void mostrarDadesPersona(Persona p) {
        txtFieldDni.setText(p.getDni());
        txtFieldNom.setText(p.getNom());
        txtFieldCognom1.setText(p.getCognom1());
        txtFieldCognom2.setText(p.getCognom2());
        txtFieldEdat.setText(Integer.toString(p.getEdat()));
    }

    /**
     * Mètode que ens permet obtenir les dades d'una persona a partir del
     * contingut dels text fields
     *
     * @return la persona
     */
    public Persona obtenirDadesPersona() {
        return new Persona(txtFieldDni.getText(),
                txtFieldNom.getText(), txtFieldCognom1.getText(),
                txtFieldCognom2.getText(),
                Integer.parseInt(txtFieldEdat.getText()));
    }

    /**
     * Mètode que ens permet esborrar el contingut de tots els Text Fields
     */
    public void esborrarTextFields() {
        txtFieldDni.setText("");
        txtFieldNom.setText("");
        txtFieldCognom1.setText("");
        txtFieldCognom2.setText("");
        txtFieldEdat.setText("");
    }

    /**
     * Mètode que ens mostra un missatge de confirmació alhora d'eliminar una
     * persona
     *
     * @return la resposta amb un enter: 0 Si, 1 No
     */
    public int confirmacioEsborrar() {
        return JOptionPane.showOptionDialog(this,
                "Estàs segur que vols eliminar aquest usuari",
                "Esborrar usuari", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");
    }

    /**
     * Mètode que ens permet actualitzar les dades del registre
     *
     * @param pos posició en la qual ens trobem actualment
     * @param mida mida de la llista
     */
    public void actualitzarLblRegistre(int pos, int mida) {
        if (mida > 0) {
            lblRegistre.setText("         Registre "
                    + (pos + 1) + " de " + mida);
        } else {
            lblRegistre.setText("         No hi ha registres");
        }
    }

    /**
     * Mètode que ens permet mostrar que estem creant un nou registre
     */
    public void nouLblRegistre() {
        lblRegistre.setText("         Nou registre");
    }

    /**
     * Mètode que ens permet vàlidar el contingut dels text fields segons les
     * expresions regulars establertes
     *
     * @return true si el contingut de les dades és correcte, false en cas
     * contrari
     */
    public boolean validarDades() {
        boolean valid = false;

        // Comprovar DNI
        if (txtFieldDni.getText().matches("(\\d{8})([A-Z]{1})")) {
            // Comprovar nom
            if (txtFieldNom.getText().
                    matches("^[a-zA-ZáàéèíóòúÁÀÉÈÍÓÒÚÑñÇç]+$")) {
                // Comprovar primer cognom
                if (txtFieldCognom1.getText().
                        matches("^[a-zA-ZáàéèíóòúÁÀÉÈÍÓÒÚÑñÇç]+$")) {
                    // Comprovar segon cognom
                    if (txtFieldCognom2.getText().
                            matches("^[a-zA-ZáàéèíóòúÁÀÉÈÍÓÒÚÑñÇç]+$")) {
                        // Comprovar edat
                        if (txtFieldEdat.getText().
                                matches("^([1-9]|[1-9][0-9]|[1-9][0-9][0-9])$")) {
                            valid = true;
                        } else {
                            missatgeError("Edat incorrecte, ha de ser entre 1 i"
                                    + " 999.", "Error");
                        }
                    } else {
                        missatgeError("El segon cognom no és vàlid.", "Error");
                    }
                } else {
                    missatgeError("El primer cognom no és vàlid.", "Error");
                }
            } else {
                missatgeError("El nom no és vàlid.", "Error");
            }
        } else {
            missatgeError("DNI incorrecte. Un dni correcte està format per 8 "
                    + "números seguits d'una lletra majúscula", "Error");
        }
        return valid;
    }

    /**
     * Mètode que ens permet mostra un quadre d'error amb el missatge passat per
     * paràmetre
     *
     * @param message missatge d'error que volem mostrar
     * @param title títol a mostrar
     */
    public void missatgeError(String message, String title) {
        JOptionPane.showMessageDialog(this, message, title,
                JOptionPane.ERROR_MESSAGE);
    }
}
