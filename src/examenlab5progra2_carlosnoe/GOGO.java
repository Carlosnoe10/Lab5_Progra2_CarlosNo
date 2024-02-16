/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenlab5progra2_carlosnoe;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author cd507 +++Asiento F2 Silla1 ++++
 */
public final class GOGO extends javax.swing.JFrame {

    ArrayList<Usuarios> Usus = new ArrayList();
    ArrayList<Tramites> Trans = new ArrayList();

    public GOGO() {
        initComponents();
        Agregador();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);

    }

    public void LlenadoTablaInfo() {
        javax.swing.table.DefaultTableModel MODELITO = new javax.swing.table.DefaultTableModel();
        MODELITO.addColumn("Nombre Completo");
        MODELITO.addColumn("No. Identidad");
        MODELITO.addColumn("Fecha de Nacimiento");
        MODELITO.addColumn("Departamento");
        for (int i = 0; i < Usus.size(); i++) {
            if (Usus.get(i) instanceof Civiles) {
                MODELITO.addRow(
                        new Object[]{
                            Usus.get(i).getNombre() + " " + Usus.get(i).getApellido(), Usus.get(i).getNumeroIdentidad(), Usus.get(i).getFechaNacimiento(), Usus.get(i).getDepartamento()
                        });
            }
        }
        JTable_InformacionCiviles.setModel(MODELITO);
    }

    public void VerificadorDeCuenta() {
        javax.swing.table.DefaultTableModel MODELITO = new javax.swing.table.DefaultTableModel();
        MODELITO.addColumn("Nombre");
        MODELITO.addColumn("Descripcion");
        MODELITO.addColumn("Fecha");
        MODELITO.addColumn("Numero Identidad");
        for (int i = 0; i < Trans.size(); i++) {

            MODELITO.addRow(
                    new Object[]{
                        Trans.get(i).getNombre(), Trans.get(i).getDescripcion(), Trans.get(i).getFechaSoli(), Trans.get(i).getNumeroI()
                    });

        }
        JTable_Tramites.setModel(MODELITO);

    }

    public void Agregador() {
        Usus.add(new Empleados("Marketing", "Community Manager", 2, "Jose", "Gomez Gomez", "NextSummer", new Date(2000, 6, 23), "Femenino", "Cortes"));
        Usus.add(new Civiles("Cristiano", "Ronaldo", "elbichosiu", new Date(1986, 7, 7), "Masculino", "Fransciso Morazan"));
        Usus.add(new Empleados("Disenio Grafico", "Conserge", 10, "Amador", "Benitez", "12345678", new Date(1999, 12, 4), "Masculino", "Comayagua"));
        Usus.add(new Civiles("Evangelina", "Hernandes", "bebesitayo", new Date(2004, 5, 20), "Femenino", "Cortes"));
        Usus.add(new Civiles("Pedro", "Capo", "Concalma", new Date(2003, 7, 1), "Maculino", "Francisco Morazan"));
        Usus.add(new Civiles("Javier", "Prades", "Top3", new Date(2000, 9, 21), "Masculino", "Comayagua"));
        Usus.add(new Civiles("Xiomi", "Zelaya", "VergaChina", new Date(1959, 1, 5), "Femenino", "Cortes"));

        Trans.add(new Tramites(Usus.get(1).getNombre(), "me robaron el carro por la cerro", new Date(1990, 12, 24), Usus.get(1).getNumeroIdentidad()));
        Trans.add(new Tramites(Usus.get(4).getNombre(), "secaeron", new Date(2004, 12, 1), Usus.get(4).getNumeroIdentidad()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JPass_Contrasenya = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        JT_NombreCompleto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        MenuEmpleado = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_InformacionCiviles = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable_Tramites = new javax.swing.JTable();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        JBottom_CerrarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Label_Nombre = new javax.swing.JLabel();

        Login.setBackground(new java.awt.Color(0, 0, 0));
        Login.setMinimumSize(new java.awt.Dimension(550, 500));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LogIn");

        jButton1.setText("Ingese");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre Completo");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JT_NombreCompleto)
            .addComponent(JPass_Contrasenya)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JT_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPass_Contrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jInternalFrame1.setVisible(true);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Informacion de los Civiles:");

        JTable_InformacionCiviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTable_InformacionCiviles.setAutoscrolls(false);
        JTable_InformacionCiviles.setShowGrid(true);
        jScrollPane1.setViewportView(JTable_InformacionCiviles);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setText("Tramites:");

        JTable_Tramites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTable_Tramites);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion Civiles", jInternalFrame1);

        jInternalFrame2.setVisible(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("jLabel7");

        jTextField1.setText("jTextField1");

        jLabel8.setText("jLabel8");

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 427, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificacion Civiles", jInternalFrame2);

        JBottom_CerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        JBottom_CerrarSesion.setText("Cerrar Sesion");
        JBottom_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBottom_CerrarSesionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel5.setText("Bienvenido: ");

        Label_Nombre.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N

        javax.swing.GroupLayout MenuEmpleadoLayout = new javax.swing.GroupLayout(MenuEmpleado.getContentPane());
        MenuEmpleado.getContentPane().setLayout(MenuEmpleadoLayout);
        MenuEmpleadoLayout.setHorizontalGroup(
            MenuEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBottom_CerrarSesion)
                .addContainerGap())
        );
        MenuEmpleadoLayout.setVerticalGroup(
            MenuEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                .addGroup(MenuEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(MenuEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBottom_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(134, 134, 134))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean Key1 = false;
        boolean Key2 = false;
        String PreNombre = "";
        int Numero = 0;
        for (int i = 0; i < Usus.size(); i++) {
            PreNombre = Usus.get(i).getNombre() + Usus.get(i).getApellido();
            if (PreNombre.equals(JT_NombreCompleto.getText())) {
                Key1 = true;
            }
        }
        for (int i = 0; i < Usus.size(); i++) {
            if (Usus.get(i).getContrasenya().equals(JPass_Contrasenya.getText())) {
                Key2 = true;
                Numero = i;
            }
        }

        if ((Key1 == true) && (Key2 == true)) {
            Login.setVisible(false);
            if (Usus.get(Numero) instanceof Civiles) {

            } else {
                MenuEmpleado.setVisible(true);
                MenuEmpleado.setBounds(Login.getX(), Login.getY(), Login.getWidth(), Login.getHeight());
                Label_Nombre.setText(Usus.get(Numero).getNombre());
                VerificadorDeCuenta();
                LlenadoTablaInfo();
            }
        } else {
            JOptionPane.showMessageDialog(Login, "Nombre o Contraseña invalidas");
            JT_NombreCompleto.setText("");
            JPass_Contrasenya.setText("");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBottom_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBottom_CerrarSesionActionPerformed
        MenuEmpleado.setVisible(false);
        Login.setVisible(true);
        JT_NombreCompleto.setText("");
        JPass_Contrasenya.setText("");
    }//GEN-LAST:event_JBottom_CerrarSesionActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GOGO().setVisible(false);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBottom_CerrarSesion;
    private javax.swing.JPasswordField JPass_Contrasenya;
    private javax.swing.JTextField JT_NombreCompleto;
    private javax.swing.JTable JTable_InformacionCiviles;
    private javax.swing.JTable JTable_Tramites;
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JFrame Login;
    private javax.swing.JFrame MenuEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
