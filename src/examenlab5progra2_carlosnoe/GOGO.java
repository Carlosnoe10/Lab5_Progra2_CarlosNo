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
    public Civiles TOP;

    public GOGO() {
        initComponents();
        Agregador();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
        VerificarLineas();
    }

    public void VerificarLineas() {
        for (int i = 0; i < Usus.size(); i++) {
            for (int j = 0; j < Usus.size(); j++) {
                if (i == j) {
                } else {
                    if (Usus.get(i).getNumeroIdentidad().equalsIgnoreCase(Usus.get(j).getNumeroIdentidad())) {
                        JOptionPane.showMessageDialog(null, "Son iguales");

                    }
                }
            }
        }
    }

    public void LLenadoTramitesCivil(int numero) {
        javax.swing.table.DefaultTableModel MODELITO = new javax.swing.table.DefaultTableModel();
        for (int i = 0; i < Trans.size(); i++) {

            if (Trans.get(i).getNombre().equalsIgnoreCase(Usus.get(numero).getNombre())) {
                MODELITO.addColumn("Nombre");
                MODELITO.addColumn("Descripcion");
                MODELITO.addColumn("Fecha");
                MODELITO.addColumn("Numero Identidad");
                MODELITO.addRow(
                        new Object[]{
                            Trans.get(i).getNombre(), Trans.get(i).getDescripcion(), Trans.get(i).getFechaSoli(), Trans.get(i).getNumeroI()
                        });

                JTable_Civil_Tramites.setModel(MODELITO);
            }
        }
    }

    public void LLenadoINFOCivil(int numero) {
        javax.swing.table.DefaultTableModel MODELITO = new javax.swing.table.DefaultTableModel();
        MODELITO.addColumn("Nombre Completo");
        MODELITO.addColumn("No. Identidad");
        MODELITO.addColumn("Fecha de Nacimiento");
        MODELITO.addColumn("Departamento");
        MODELITO.addRow(
                new Object[]{
                    Usus.get(numero).getNombre() + " " + Usus.get(numero).getApellido(), Usus.get(numero).getNumeroIdentidad(), Usus.get(numero).getFechaNacimiento(), Usus.get(numero).getDepartamento()
                });
        JTable_Civil_InformacionCiviles.setModel(MODELITO);
    }

    public void LlenadoDeComboboxState() {
        javax.swing.DefaultComboBoxModel Combo = new javax.swing.DefaultComboBoxModel<>();
        Combo.addElement("Francisco Morazan");
        Combo.addElement("Comayagua");
        Combo.addElement("Cortes");
        JCombo_State.setModel(Combo);
    }

    public void LLenadoDeComboxSex() {
        javax.swing.DefaultComboBoxModel Combo = new javax.swing.DefaultComboBoxModel<>();
        Combo.addElement("Masculino");
        Combo.addElement("Femenino");
        JCombo_Sex.setModel(Combo);
    }

    public void LlenadoDeComboBoxID() {
        javax.swing.DefaultComboBoxModel Combo = new javax.swing.DefaultComboBoxModel<>();
        for (int i = 0; i < Usus.size(); i++) {
            Combo.addElement(Usus.get(i).getNumeroIdentidad());
        }
        JCombo_SelectorID.setModel(Combo);

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
        Usus.add(new Civiles("Cristiano", "Ronaldo", "elbichosiu", new Date(1986, 7, 7), "Masculino", "Francisco Morazan"));
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
        JCombo_SelectorID = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JT_NombreMOD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JT_ContraMOD = new javax.swing.JTextField();
        JCombo_Sex = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JCombo_State = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        JT_ApellidoMOD = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JT_AnioMOD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JT_MesMOD = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JT_DiaMOD = new javax.swing.JTextField();
        BT_MOD = new javax.swing.JButton();
        JBottom_CerrarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Label_Nombre = new javax.swing.JLabel();
        MenuCivil = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTable_Civil_Tramites = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTable_Civil_InformacionCiviles = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jLabel16 = new javax.swing.JLabel();
        JT_NombreCivil = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TXTA_Civil = new javax.swing.JTextArea();
        JBT_CivilEnviar = new javax.swing.JButton();
        JLabelEditable1 = new javax.swing.JLabel();
        JBottom_CerrarSesion1 = new javax.swing.JButton();

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
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

        JCombo_SelectorID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCombo_SelectorID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCombo_SelectorIDItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel7.setText("Nombre: ");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel8.setText("Contraseña: ");

        JT_ContraMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_ContraMODActionPerformed(evt);
            }
        });

        JCombo_Sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel9.setText("Sexo: ");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel10.setText("Departamento: ");

        JCombo_State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel11.setText("Apellido: ");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel12.setText("Fecha De Nacimiento");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel13.setText("Año");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel14.setText("Mes");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel15.setText("Dia");

        BT_MOD.setText("MOD");
        BT_MOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_MODActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(JCombo_SelectorID, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JT_NombreMOD, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JT_ContraMOD, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JCombo_State, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE)
                        .addComponent(JCombo_Sex, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10))
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(JT_ApellidoMOD)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(JT_DiaMOD)
                            .addComponent(JT_MesMOD)
                            .addComponent(JT_AnioMOD)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(BT_MOD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCombo_SelectorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_MOD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_NombreMOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_ApellidoMOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(JT_ContraMOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCombo_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JT_AnioMOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JT_MesMOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCombo_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JT_DiaMOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBottom_CerrarSesion)
                .addGap(129, 129, 129))
            .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        MenuEmpleadoLayout.setVerticalGroup(
            MenuEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                .addGroup(MenuEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBottom_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuEmpleadoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jInternalFrame3.setVisible(true);

        JTable_Civil_Tramites.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(JTable_Civil_Tramites);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel18.setText("Tramites:");

        JTable_Civil_InformacionCiviles.setModel(new javax.swing.table.DefaultTableModel(
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
        JTable_Civil_InformacionCiviles.setAutoscrolls(false);
        JTable_Civil_InformacionCiviles.setShowGrid(true);
        jScrollPane3.setViewportView(JTable_Civil_InformacionCiviles);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel17.setText("Informacion de los Civiles:");

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Informacion Personal", jInternalFrame3);

        jInternalFrame4.setVisible(true);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel16.setText("Nombre");

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel19.setText("Descripcion");

        TXTA_Civil.setColumns(20);
        TXTA_Civil.setRows(5);
        jScrollPane5.setViewportView(TXTA_Civil);

        JBT_CivilEnviar.setText("Enviar");
        JBT_CivilEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_CivilEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JT_NombreCivil))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel16)
                        .addGap(0, 282, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(282, 282, 282))
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBT_CivilEnviar)
                .addGap(273, 273, 273))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JT_NombreCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBT_CivilEnviar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Gestion de Tramites", jInternalFrame4);

        JLabelEditable1.setText("jLabel16");

        JBottom_CerrarSesion1.setBackground(new java.awt.Color(204, 0, 0));
        JBottom_CerrarSesion1.setText("Cerrar Sesion");
        JBottom_CerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBottom_CerrarSesion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuCivilLayout = new javax.swing.GroupLayout(MenuCivil.getContentPane());
        MenuCivil.getContentPane().setLayout(MenuCivilLayout);
        MenuCivilLayout.setHorizontalGroup(
            MenuCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuCivilLayout.createSequentialGroup()
                .addGroup(MenuCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuCivilLayout.createSequentialGroup()
                        .addComponent(JLabelEditable1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBottom_CerrarSesion1))
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );
        MenuCivilLayout.setVerticalGroup(
            MenuCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCivilLayout.createSequentialGroup()
                .addGroup(MenuCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLabelEditable1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBottom_CerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                MenuCivil.setVisible(true);
                MenuCivil.setBounds(Login.getX(), Login.getY(), Login.getWidth(), Login.getHeight());
                LLenadoINFOCivil(Numero);
                LLenadoTramitesCivil(Numero);
                Label_Nombre.setText("Bienvenido: " + Usus.get(Numero).getNombre());
                TOP = (Civiles) Usus.get(Numero);
            } else {
                MenuEmpleado.setVisible(true);
                MenuEmpleado.setBounds(Login.getX(), Login.getY(), Login.getWidth(), Login.getHeight());
                Label_Nombre.setText(Usus.get(Numero).getNombre());
                VerificadorDeCuenta();
                LlenadoTablaInfo();
                LLenadoDeComboxSex();
                LlenadoDeComboBoxID();
                LlenadoDeComboboxState();
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

    private void JT_ContraMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_ContraMODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_ContraMODActionPerformed

    private void JCombo_SelectorIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCombo_SelectorIDItemStateChanged
        JT_NombreMOD.setText(Usus.get(JCombo_SelectorID.getSelectedIndex()).getNombre());
        JT_AnioMOD.setText(String.valueOf(Usus.get(JCombo_SelectorID.getSelectedIndex()).getFechaNacimiento().getYear()));
        JT_MesMOD.setText(String.valueOf(Usus.get(JCombo_SelectorID.getSelectedIndex()).getFechaNacimiento().getMonth()));
        JT_DiaMOD.setText(String.valueOf(Usus.get(JCombo_SelectorID.getSelectedIndex()).getFechaNacimiento().getDay()));
        JT_ApellidoMOD.setText(Usus.get(JCombo_SelectorID.getSelectedIndex()).getApellido());
        JT_ContraMOD.setText(Usus.get(JCombo_SelectorID.getSelectedIndex()).getContrasenya());

// TODO add your handling code here:
    }//GEN-LAST:event_JCombo_SelectorIDItemStateChanged

    private void BT_MODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_MODActionPerformed

        Usus.get(JCombo_SelectorID.getSelectedIndex()).setApellido(JT_ApellidoMOD.getText());
        Usus.get(JCombo_SelectorID.getSelectedIndex()).setContrasenya(JT_ContraMOD.getText());
        Usus.get(JCombo_SelectorID.getSelectedIndex()).setFechaNacimiento(new Date(Integer.parseInt(JT_AnioMOD.getText()), Integer.parseInt(JT_MesMOD.getText()), Integer.parseInt(JT_DiaMOD.getText())));
        Usus.get(JCombo_SelectorID.getSelectedIndex()).setNombre(JT_NombreMOD.getText());
        switch (JCombo_Sex.getSelectedIndex()) {
            case 0:
                Usus.get(JCombo_SelectorID.getSelectedIndex()).setSexo("Masculino");
                break;
            case 1:
                Usus.get(JCombo_SelectorID.getSelectedIndex()).setSexo("Femenino");
                break;
        }
        switch (JCombo_State.getSelectedIndex()) {
            case 0:
                Usus.get(JCombo_SelectorID.getSelectedIndex()).setDepartamento("Francisco Morazan");
                break;
            case 1:
                Usus.get(JCombo_SelectorID.getSelectedIndex()).setDepartamento("Comayagua");
                break;
            case 2:
                Usus.get(JCombo_SelectorID.getSelectedIndex()).setDepartamento("Cortes");
                break;

        }
        JOptionPane.showMessageDialog(MenuEmpleado, "Modificado Correctamente");

    }//GEN-LAST:event_BT_MODActionPerformed

    private void JBottom_CerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBottom_CerrarSesion1ActionPerformed
        Login.setVisible(true);
        JT_NombreCompleto.setText("");
        JPass_Contrasenya.setText("");
        MenuCivil.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_JBottom_CerrarSesion1ActionPerformed

    private void JBT_CivilEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_CivilEnviarActionPerformed

        Trans.add(new Tramites(JT_NombreCivil.getText(), TXTA_Civil.getText(), new Date(), TOP.NumeroIdentidad));
        JT_NombreCivil.setText("");
        TXTA_Civil.setText("");
    }//GEN-LAST:event_JBT_CivilEnviarActionPerformed

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
    private javax.swing.JButton BT_MOD;
    private javax.swing.JButton JBT_CivilEnviar;
    private javax.swing.JButton JBottom_CerrarSesion;
    private javax.swing.JButton JBottom_CerrarSesion1;
    private javax.swing.JComboBox<String> JCombo_SelectorID;
    private javax.swing.JComboBox<String> JCombo_Sex;
    private javax.swing.JComboBox<String> JCombo_State;
    private javax.swing.JLabel JLabelEditable1;
    private javax.swing.JPasswordField JPass_Contrasenya;
    private javax.swing.JTextField JT_AnioMOD;
    private javax.swing.JTextField JT_ApellidoMOD;
    private javax.swing.JTextField JT_ContraMOD;
    private javax.swing.JTextField JT_DiaMOD;
    private javax.swing.JTextField JT_MesMOD;
    private javax.swing.JTextField JT_NombreCivil;
    private javax.swing.JTextField JT_NombreCompleto;
    private javax.swing.JTextField JT_NombreMOD;
    private javax.swing.JTable JTable_Civil_InformacionCiviles;
    private javax.swing.JTable JTable_Civil_Tramites;
    private javax.swing.JTable JTable_InformacionCiviles;
    private javax.swing.JTable JTable_Tramites;
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JFrame Login;
    private javax.swing.JFrame MenuCivil;
    private javax.swing.JFrame MenuEmpleado;
    private javax.swing.JTextArea TXTA_Civil;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
