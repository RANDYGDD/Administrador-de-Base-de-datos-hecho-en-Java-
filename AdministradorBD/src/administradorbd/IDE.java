
package administradorbd;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

public class IDE extends javax.swing.JFrame 
{
    //VARIABLES DEL PROYECTO//
    DefaultTableModel modelo;
    MostrarConsulta cosulta = null;
    Connection conexion = null;
    Statement sentencia = null;
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Usuarios");
    DefaultMutableTreeNode vegetableNode = null;
    DefaultTreeModel treeModel = null;
    ArrayList<String> Tablas = null;
    ArrayList<String> consultas = new ArrayList<>();
    String usuario, contraseña, NameTable, NameAtributo, TipoDato;
    DefaultTreeCellRenderer render;
    String table = "Create table NAME ("
            + "Atributo TipoDato";
    int count = 1, pk = 1;
    boolean pasaporte = false;
   
    JLabel logo = new JLabel();
    JFrame frameimagen;
    
    public IDE() 
    {
        HiloNuevo hn = new HiloNuevo();
        Thread nuevoHilo = new Thread(hn);
        nuevoHilo.start();
        setExtendedState(MAXIMIZED_BOTH);
        //Agrega a una etiqueta la imagen que sera mostrada
        logo.setIcon(new ImageIcon(getClass().getResource("/TemplatesProyecto/logo.png")));
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        //Llama al metodo que se encarga de construir el frame que contendra la etiqueta contenedora de la imagen
        Mostrarlogo();
       
        initComponents();
        //CONTROL INICIO SESION//
        TFusuario.setText("Ingrese su usuario");
    }

    public void Mostrarlogo()
    {
        frameimagen = new JFrame();
        
        //El frame lo creamos como no decorado para que no muestre el contorno
        //que tienen todas las ventanas asi como los botonones maximizar, minimizar y restaurar, etc.
        
        frameimagen.setUndecorated(true);

        //Creamos un objeto de la clase que se encarga de hacer el efecto de transparencia
        TransparentBackground bg = new TransparentBackground();

        //Asigna un administrador de contenido al objeto y envia al centro la imagen
        bg.setLayout(new BorderLayout( ));
        bg.add("Center", logo); 
        
        //Coloca en el centro del frameimagen la imagen con el efecto de transparencia
        frameimagen.getContentPane( ).add("Center", bg); 
        frameimagen.pack( ); 
        frameimagen.setSize(700,645);
        frameimagen.setLocationRelativeTo(null);
        frameimagen.setVisible(true); 
    }
    
    public class HiloNuevo implements Runnable
    {
        public void run()
        {
            try 
            {
                Thread.sleep(6000);
            } 
            
            catch (InterruptedException ex) 
            {
                JOptionPane.showMessageDialog(null, "Mensaje" + ex);
            }
        
        //Llamamos al metodo que se encarga de cerrar el frame que contiene la imagen//
        //y que hace visible el frame principal//
        thissetvisible();

        }
    }
      
    public void thissetvisible()
    {
        //cierra el frame que contiene la imagen
        frameimagen.dispose();
        
        //Hace visible al frame principal
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_DB = new javax.swing.JFrame();
        Fondo = new javax.swing.JPanel();
        Llinea = new javax.swing.JLabel();
        Lpass = new javax.swing.JLabel();
        Ltitulo1 = new javax.swing.JLabel();
        Lusuario = new javax.swing.JLabel();
        TFusuario = new javax.swing.JTextField();
        TFPcontraseña = new javax.swing.JPasswordField();
        Bconectar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Crear_User = new javax.swing.JFrame();
        Pane_Fondo = new javax.swing.JTabbedPane();
        JPcredenciales = new javax.swing.JPanel();
        pass2 = new javax.swing.JLabel();
        boxTablespace = new javax.swing.JComboBox<>();
        line = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        TFnombre_u = new javax.swing.JTextField();
        TFP_pass1 = new javax.swing.JPasswordField();
        TFP_pass = new javax.swing.JPasswordField();
        Bcrear_u = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JProles = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        checkdb1 = new javax.swing.JCheckBox();
        checkconect1 = new javax.swing.JCheckBox();
        checkResouse1 = new javax.swing.JCheckBox();
        checkconect2 = new javax.swing.JCheckBox();
        checkresour2 = new javax.swing.JCheckBox();
        checkdb2 = new javax.swing.JCheckBox();
        roles4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jprivilegios = new javax.swing.JPanel();
        line2 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        Jprivilegios1 = new javax.swing.JPanel();
        line4 = new javax.swing.JLabel();
        line5 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        check_7 = new javax.swing.JCheckBox();
        check_1 = new javax.swing.JCheckBox();
        check_3 = new javax.swing.JCheckBox();
        check_5 = new javax.swing.JCheckBox();
        check_2 = new javax.swing.JCheckBox();
        check_4 = new javax.swing.JCheckBox();
        check_6 = new javax.swing.JCheckBox();
        check_8 = new javax.swing.JCheckBox();
        check_9 = new javax.swing.JCheckBox();
        check_11 = new javax.swing.JCheckBox();
        check_13 = new javax.swing.JCheckBox();
        check_15 = new javax.swing.JCheckBox();
        check_10 = new javax.swing.JCheckBox();
        check_12 = new javax.swing.JCheckBox();
        check_14 = new javax.swing.JCheckBox();
        check_16 = new javax.swing.JCheckBox();
        lb11 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        Otorgado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Otorgado1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AcercaDe = new javax.swing.JFrame();
        Pfondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Crear_Tabla = new javax.swing.JFrame();
        Pfondo1 = new javax.swing.JPanel();
        lb12 = new javax.swing.JLabel();
        line6 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        line7 = new javax.swing.JLabel();
        TFcantidad = new javax.swing.JTextField();
        TFnombre_atr = new javax.swing.JTextField();
        CBtipo_dato = new javax.swing.JComboBox<>();
        CBnull = new javax.swing.JCheckBox();
        CBprimary = new javax.swing.JCheckBox();
        Bcancelar = new javax.swing.JButton();
        Badd = new javax.swing.JButton();
        Bcrear = new javax.swing.JButton();
        TFnombre_t = new javax.swing.JTextField();
        Pprincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tarbol = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAresultados = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TAconsultas = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTdatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Bejecutar = new javax.swing.JButton();
        Blimpiar = new javax.swing.JButton();
        Bguardar = new javax.swing.JButton();
        Busuario = new javax.swing.JButton();
        Btabla = new javax.swing.JButton();
        Lconexion1 = new javax.swing.JLabel();
        Bconexion1 = new javax.swing.JButton();
        Bactualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PseparadorH1 = new javax.swing.JPanel();
        PseparadorH2 = new javax.swing.JPanel();
        LfondoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Marchivo = new javax.swing.JMenu();
        MIguardar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MIsalir = new javax.swing.JMenuItem();
        Meditar = new javax.swing.JMenu();
        MIcopiar = new javax.swing.JMenuItem();
        MIpegar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MIseleccionar = new javax.swing.JMenuItem();
        MIsuprimir = new javax.swing.JMenuItem();
        Mayuda = new javax.swing.JMenu();
        MIacerca = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        Login_DB.setFocusable(false);
        Login_DB.setResizable(false);

        Fondo.setBackground(new java.awt.Color(102, 102, 102));
        Fondo.setMinimumSize(new java.awt.Dimension(400, 400));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Llinea.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        Llinea.setForeground(new java.awt.Color(255, 255, 255));
        Llinea.setText("__________________");
        Fondo.add(Llinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 218, -1));

        Lpass.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Lpass.setForeground(new java.awt.Color(255, 255, 255));
        Lpass.setText("Contraseña:");
        Fondo.add(Lpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 100, -1));

        Ltitulo1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        Ltitulo1.setForeground(new java.awt.Color(255, 255, 255));
        Ltitulo1.setText("Establecer Conexión");
        Fondo.add(Ltitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 218, -1));

        Lusuario.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Lusuario.setForeground(new java.awt.Color(255, 255, 255));
        Lusuario.setText("Usuario:");
        Fondo.add(Lusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, -1));

        TFusuario.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TFusuario.setToolTipText("Ingrese el Nombre de Usuario");
        Fondo.add(TFusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 140, -1));
        TFusuario.getAccessibleContext().setAccessibleDescription("Ingresa tu nombre de usuario.");

        TFPcontraseña.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TFPcontraseña.setToolTipText("Ingrese la Contraseña");
        Fondo.add(TFPcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 140, -1));
        TFPcontraseña.getAccessibleContext().setAccessibleName("");
        TFPcontraseña.getAccessibleContext().setAccessibleDescription("Ingresa tu contraseña.");

        Bconectar.setText("Conectar");
        Bconectar.setToolTipText("Realizar la Conexión");
        Bconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconectarActionPerformed(evt);
            }
        });
        Fondo.add(Bconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/template.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        javax.swing.GroupLayout Login_DBLayout = new javax.swing.GroupLayout(Login_DB.getContentPane());
        Login_DB.getContentPane().setLayout(Login_DBLayout);
        Login_DBLayout.setHorizontalGroup(
            Login_DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        Login_DBLayout.setVerticalGroup(
            Login_DBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Crear_User.setResizable(false);

        JPcredenciales.setBackground(new java.awt.Color(0, 102, 102));
        JPcredenciales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        pass2.setForeground(new java.awt.Color(255, 255, 255));
        pass2.setText("TableSpace por Defecto:");
        JPcredenciales.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        boxTablespace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USERS", "SYSAUX", "SYSTEM", "TEMP", "UNDOTBS1" }));
        boxTablespace.setToolTipText("TableSpace");
        JPcredenciales.add(boxTablespace, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        line.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line.setForeground(new java.awt.Color(255, 255, 255));
        line.setText("_______________________");
        JPcredenciales.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 275, -1));

        titulo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Creando un Nuevo Usuario");
        JPcredenciales.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 275, 44));

        nombre.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre de Usuario:");
        JPcredenciales.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        pass.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Contraseña:");
        JPcredenciales.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        pass1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        pass1.setForeground(new java.awt.Color(255, 255, 255));
        pass1.setText("Repita su Contraseña:");
        JPcredenciales.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        TFnombre_u.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TFnombre_u.setToolTipText("Ingrese el Nombre de Usuario");
        JPcredenciales.add(TFnombre_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 140, -1));

        TFP_pass1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TFP_pass1.setToolTipText("Repita su Contraseña");
        JPcredenciales.add(TFP_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 140, -1));

        TFP_pass.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TFP_pass.setToolTipText("Contraseña del Usuario");
        JPcredenciales.add(TFP_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 140, -1));

        Bcrear_u.setText("Crear Usuario");
        Bcrear_u.setToolTipText("Crea Usuario");
        Bcrear_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcrear_uActionPerformed(evt);
            }
        });
        JPcredenciales.add(Bcrear_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/template.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        JPcredenciales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        Pane_Fondo.addTab("Credenciales", JPcredenciales);

        JProles.setBackground(new java.awt.Color(0, 72, 106));
        JProles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Administrar");
        JProles.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 70, 40));

        line1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line1.setForeground(new java.awt.Color(255, 255, 255));
        line1.setText("_______________");
        JProles.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 170, -1));

        lb2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("CONNECT");
        JProles.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 80, 44));

        lb3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("RESOURCE");
        JProles.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 44));

        lb1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("DBA");
        JProles.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 40, 44));
        JProles.add(checkdb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));
        JProles.add(checkconect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));
        JProles.add(checkResouse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        JProles.add(checkconect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));
        JProles.add(checkresour2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));
        JProles.add(checkdb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        roles4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        roles4.setForeground(new java.awt.Color(255, 255, 255));
        roles4.setText("Otorgando Roles");
        JProles.add(roles4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 160, 44));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Otorgado");
        JProles.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 60, 40));

        Pane_Fondo.addTab("Roles", JProles);

        Jprivilegios.setBackground(new java.awt.Color(0, 72, 106));
        Jprivilegios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        line2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line2.setForeground(new java.awt.Color(255, 255, 255));
        line2.setText("Otorgar Privilegios");
        Jprivilegios.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 180, -1));

        line3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line3.setForeground(new java.awt.Color(255, 255, 255));
        line3.setText("________________");
        Jprivilegios.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 180, -1));

        Jprivilegios1.setBackground(new java.awt.Color(0, 72, 106));
        Jprivilegios1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        line4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line4.setForeground(new java.awt.Color(255, 255, 255));
        line4.setText("Otorgar Privilegios");
        Jprivilegios1.add(line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 180, -1));

        line5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line5.setForeground(new java.awt.Color(255, 255, 255));
        line5.setText("________________");
        Jprivilegios1.add(line5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 180, -1));

        Jprivilegios.add(Jprivilegios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lb4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("CREATE ROLE");
        Jprivilegios.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 20));

        lb5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("ALTER SESSION ");
        Jprivilegios.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        lb6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("CREATE SESSION");
        Jprivilegios.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        lb7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setText("CREATE TABLE");
        Jprivilegios.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 20));
        Jprivilegios.add(check_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));
        Jprivilegios.add(check_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        Jprivilegios.add(check_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));
        Jprivilegios.add(check_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));
        Jprivilegios.add(check_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        Jprivilegios.add(check_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));
        Jprivilegios.add(check_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        Jprivilegios.add(check_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        Jprivilegios.add(check_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));
        Jprivilegios.add(check_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));
        Jprivilegios.add(check_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));
        Jprivilegios.add(check_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));
        Jprivilegios.add(check_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));
        Jprivilegios.add(check_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));
        Jprivilegios.add(check_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));
        Jprivilegios.add(check_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        lb11.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb11.setForeground(new java.awt.Color(255, 255, 255));
        lb11.setText("ALTER ANY TABLE");
        Jprivilegios.add(lb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 20));

        lb10.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb10.setForeground(new java.awt.Color(255, 255, 255));
        lb10.setText("CREATE PROCEDURE");
        Jprivilegios.add(lb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, 20));

        lb9.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb9.setForeground(new java.awt.Color(255, 255, 255));
        lb9.setText("CREATE USER");
        Jprivilegios.add(lb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 20));

        lb8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb8.setForeground(new java.awt.Color(255, 255, 255));
        lb8.setText("DROP ANY TABLE");
        Jprivilegios.add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, 20));

        Otorgado.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        Otorgado.setForeground(new java.awt.Color(255, 255, 255));
        Otorgado.setText("Otorgado");
        Jprivilegios.add(Otorgado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 40));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Administrar");
        Jprivilegios.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, 40));

        Otorgado1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        Otorgado1.setForeground(new java.awt.Color(255, 255, 255));
        Otorgado1.setText("Otorgado");
        Jprivilegios.add(Otorgado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, 40));

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Administrar");
        Jprivilegios.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 70, 40));

        Pane_Fondo.addTab("Privilegios", Jprivilegios);

        javax.swing.GroupLayout Crear_UserLayout = new javax.swing.GroupLayout(Crear_User.getContentPane());
        Crear_User.getContentPane().setLayout(Crear_UserLayout);
        Crear_UserLayout.setHorizontalGroup(
            Crear_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pane_Fondo)
        );
        Crear_UserLayout.setVerticalGroup(
            Crear_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pane_Fondo)
        );

        Pfondo.setBackground(new java.awt.Color(0, 72, 106));
        Pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/logo_help.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Pfondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" AD DATABASE V.1.0");
        Pfondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AD DATABASE es un software inspirado y basado en otros IDE");
        Pfondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 330, 20));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Randy G. Diloné. Julio B. Delgado. Cristian E. Gomez. Luis M. Bidó ");
        Pfondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 350, -1, 20));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("o Administradores de Base de Datos, para tener manejo de las ");
        Pfondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 310, 20));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("diversas herramientas que se requieren para manejar una ");
        Pfondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 310, 20));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Base de Datos.");
        Pfondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 80, 20));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Copyright © 2016. Todos los derechos reservados. ");
        Pfondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 260, 20));

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel14.setText("Copyright © 2016. Todos los derechos reservados. ");
        Pfondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 260, 20));

        javax.swing.GroupLayout AcercaDeLayout = new javax.swing.GroupLayout(AcercaDe.getContentPane());
        AcercaDe.getContentPane().setLayout(AcercaDeLayout);
        AcercaDeLayout.setHorizontalGroup(
            AcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        AcercaDeLayout.setVerticalGroup(
            AcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcercaDeLayout.createSequentialGroup()
                .addComponent(Pfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Pfondo1.setBackground(new java.awt.Color(0, 51, 51));
        Pfondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb12.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb12.setForeground(new java.awt.Color(255, 255, 255));
        lb12.setText("NOMBRE_TABLA:");
        Pfondo1.add(lb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 20));

        line6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line6.setForeground(new java.awt.Color(255, 255, 255));
        line6.setText("Creación de Tablas");
        Pfondo1.add(line6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 180, 30));

        lb13.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb13.setForeground(new java.awt.Color(255, 255, 255));
        lb13.setText("NOMBRE_ATRIBUTO:");
        Pfondo1.add(lb13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 20));

        lb14.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lb14.setForeground(new java.awt.Color(255, 255, 255));
        lb14.setText("TIPO_DATO:");
        Pfondo1.add(lb14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        line7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        line7.setForeground(new java.awt.Color(255, 255, 255));
        line7.setText(" _________________");
        Pfondo1.add(line7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 210, -1));

        TFcantidad.setToolTipText("Cantidad");
        Pfondo1.add(TFcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 40, -1));

        TFnombre_atr.setToolTipText("Nombre del Atributo");
        Pfondo1.add(TFnombre_atr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 100, -1));

        CBtipo_dato.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        CBtipo_dato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INTEGER", "NUMBER", "VARCHAR", "VARCHAR2", "DATE" }));
        CBtipo_dato.setToolTipText("Tipo de Dato");
        Pfondo1.add(CBtipo_dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 100, -1));

        CBnull.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        CBnull.setText("NOT NULL");
        Pfondo1.add(CBnull, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 90, -1));

        CBprimary.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        CBprimary.setText("PRIMARY KEY");
        Pfondo1.add(CBprimary, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        Bcancelar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        Bcancelar.setText("CANCELAR");
        Bcancelar.setToolTipText("Cancelar los Cambios");
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });
        Pfondo1.add(Bcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        Badd.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        Badd.setText("AÑADIR +");
        Badd.setToolTipText("Añadir Nuevo Campo");
        Badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddActionPerformed(evt);
            }
        });
        Pfondo1.add(Badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        Bcrear.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        Bcrear.setText("CREAR");
        Bcrear.setToolTipText("Crear Tabla");
        Bcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrearActionPerformed(evt);
            }
        });
        Pfondo1.add(Bcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        TFnombre_t.setToolTipText("Nombre de la Tabla");
        Pfondo1.add(TFnombre_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, -1));

        javax.swing.GroupLayout Crear_TablaLayout = new javax.swing.GroupLayout(Crear_Tabla.getContentPane());
        Crear_Tabla.getContentPane().setLayout(Crear_TablaLayout);
        Crear_TablaLayout.setHorizontalGroup(
            Crear_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pfondo1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        Crear_TablaLayout.setVerticalGroup(
            Crear_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pfondo1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BD");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        Pprincipal.setBackground(new java.awt.Color(0, 93, 171));
        Pprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tarbol.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Esquema");
        Tarbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(Tarbol);

        Pprincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 234, 372));

        TAresultados.setEditable(false);
        TAresultados.setColumns(20);
        TAresultados.setRows(5);
        jScrollPane2.setViewportView(TAresultados);

        Pprincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 477, 234, 137));

        TAconsultas.setColumns(20);
        TAconsultas.setRows(5);
        jScrollPane3.setViewportView(TAconsultas);

        Pprincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 89, 809, 230));

        JTdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTdatos.setFocusable(false);
        JTdatos.getTableHeader().setResizingAllowed(false);
        JTdatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(JTdatos);

        Pprincipal.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 335, 810, 279));

        jPanel2.setBackground(new java.awt.Color(0, 72, 106));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setMaximumSize(new java.awt.Dimension(32764, 32767));

        Bejecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/play-button.png"))); // NOI18N
        Bejecutar.setToolTipText("Ejecutar");
        Bejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BejecutarActionPerformed(evt);
            }
        });

        Blimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/mop-tool-to-clean-floors.png"))); // NOI18N
        Blimpiar.setToolTipText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        Bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/guardar.png"))); // NOI18N
        Bguardar.setToolTipText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        Busuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/usuario.png"))); // NOI18N
        Busuario.setToolTipText("Crear Usuarios");
        Busuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusuarioActionPerformed(evt);
            }
        });

        Btabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/tabla.png"))); // NOI18N
        Btabla.setToolTipText("Crear Tablas");
        Btabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtablaActionPerformed(evt);
            }
        });

        Lconexion1.setBackground(new java.awt.Color(0, 0, 0));
        Lconexion1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Lconexion1.setForeground(new java.awt.Color(255, 255, 255));
        Lconexion1.setText("Conexiones");

        Bconexion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/add.png"))); // NOI18N
        Bconexion1.setToolTipText("Establecer Conexión");
        Bconexion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bconexion1ActionPerformed(evt);
            }
        });

        Bactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/refresh.png"))); // NOI18N
        Bactualizar.setToolTipText("Refrescar Esquema");
        Bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lconexion1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bconexion1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Bactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(164, 164, 164)
                .addComponent(Bejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Blimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Busuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btabla, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Btabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Busuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Blimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Lconexion1)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bconexion1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Bejecutar.getAccessibleContext().setAccessibleDescription("Ejecuta la sentencia SQL.");
        Blimpiar.getAccessibleContext().setAccessibleDescription("Limpia el área de trabajo.");
        Bguardar.getAccessibleContext().setAccessibleDescription("Guarda el área de trabajo.");
        Busuario.getAccessibleContext().setAccessibleDescription("Crea un nuevo usuario.");
        Btabla.getAccessibleContext().setAccessibleDescription("Crea una nueva tabla.");
        Bconexion1.getAccessibleContext().setAccessibleDescription("Establece una nueva conexión.");
        Bactualizar.getAccessibleContext().setAccessibleDescription("Actualiza el esquema.");

        Pprincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1060, 58));

        jPanel3.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Pprincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 89, -1, 525));

        PseparadorH1.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout PseparadorH1Layout = new javax.swing.GroupLayout(PseparadorH1);
        PseparadorH1.setLayout(PseparadorH1Layout);
        PseparadorH1Layout.setHorizontalGroup(
            PseparadorH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PseparadorH1Layout.setVerticalGroup(
            PseparadorH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        Pprincipal.add(PseparadorH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 467, 234, -1));

        PseparadorH2.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout PseparadorH2Layout = new javax.swing.GroupLayout(PseparadorH2);
        PseparadorH2.setLayout(PseparadorH2Layout);
        PseparadorH2Layout.setHorizontalGroup(
            PseparadorH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PseparadorH2Layout.setVerticalGroup(
            PseparadorH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        Pprincipal.add(PseparadorH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 325, 809, -1));

        LfondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TemplatesProyecto/FondoPrincipal.png"))); // NOI18N
        Pprincipal.add(LfondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 630));

        Marchivo.setText("Archivo");

        MIguardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MIguardar.setText("Guardar");
        MIguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIguardarActionPerformed(evt);
            }
        });
        Marchivo.add(MIguardar);
        Marchivo.add(jSeparator2);

        MIsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MIsalir.setText("Salir");
        Marchivo.add(MIsalir);

        jMenuBar1.add(Marchivo);

        Meditar.setText("Editar");

        MIcopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MIcopiar.setText("Copiar");
        Meditar.add(MIcopiar);

        MIpegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        MIpegar.setText("Pegar");
        Meditar.add(MIpegar);
        Meditar.add(jSeparator1);

        MIseleccionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MIseleccionar.setText("Seleccionar Todo");
        Meditar.add(MIseleccionar);

        MIsuprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        MIsuprimir.setText("Suprimir");
        Meditar.add(MIsuprimir);

        jMenuBar1.add(Meditar);

        Mayuda.setText("Ayuda");

        MIacerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MIacerca.setText("Acerca de...");
        MIacerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIacercaActionPerformed(evt);
            }
        });
        Mayuda.add(MIacerca);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Ayuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Mayuda.add(jMenuItem1);

        jMenuBar1.add(Mayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIacercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIacercaActionPerformed
        
        //JFRAME DE NUESTRO COPYRIGHT//
        AcercaDe.setVisible(true);
        AcercaDe.setSize(500, 430);
        AcercaDe.setLocationRelativeTo(null);    
        AcercaDe.setTitle("Acerca de...");
    }//GEN-LAST:event_MIacercaActionPerformed
    
    private void BconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconectarActionPerformed
        
        if(TFusuario.getText() != "Ingrese su usuario")
        {
            usuario = TFusuario.getText();
            contraseña = TFPcontraseña.getText();
            Conexion_DB(usuario, contraseña);
        }
    }//GEN-LAST:event_BconectarActionPerformed

    private void MIguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIguardarActionPerformed
        
        Guardar();
    }//GEN-LAST:event_MIguardarActionPerformed

    private void Bcrear_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcrear_uActionPerformed
        
        RecoleccionUsuario();
    }//GEN-LAST:event_Bcrear_uActionPerformed

    private void BaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddActionPerformed
        
        if(!TFnombre_atr.getText().isEmpty())
        {
            crearDatos();
        } 
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Debes Ingresar el nombre de la tabla!!!");
        }
    }//GEN-LAST:event_BaddActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        
        Crear_Tabla.setVisible(false);
    }//GEN-LAST:event_BcancelarActionPerformed

    private void BcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcrearActionPerformed
        
        if(!TFnombre_t.getText().isEmpty() || !TFnombre_atr.getText().isEmpty())
        {
            table = table + ")";
            TAresultados.setText(table);
            crearTabla();
            Crear_Tabla.setVisible(false);
        } 
        
        else 
        {
            TAresultados.setText("No puedes crear la tabla, faltan datos.");
            Crear_Tabla.setVisible(false);
        }
    }//GEN-LAST:event_BcrearActionPerformed

    private void BactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BactualizarActionPerformed

        if(pasaporte != false)
        {
            root = new DefaultMutableTreeNode("Usuarios");
            vegetableNode = null;
            treeModel = null;

            cosulta = new MostrarConsulta(conexion);

            try
            {
                Tablas = cosulta.retornarTablas(conexion);
            }

            catch (SQLException ex)
            {
                Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
            }

            Arbol();
        }

        else
        JOptionPane.showMessageDialog(null, "Aún no has establecido una conexión\n");
    }//GEN-LAST:event_BactualizarActionPerformed

    private void Bconexion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bconexion1ActionPerformed

        //INSTANCIA EL LOGIN PARA INICIAR SESION EN LA BD//
        Login_DB.setVisible(true);
        Login_DB.setSize(500, 400);
        Login_DB.setLocationRelativeTo(null);
        Login_DB.setTitle("Conectar Usuario");
    }//GEN-LAST:event_Bconexion1ActionPerformed

    private void BtablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtablaActionPerformed

        if(pasaporte != false)
        {
            Crear_Tabla.setVisible(true);
            Crear_Tabla.setTitle("Crear Tablas");
            Crear_Tabla.setSize(500, 400);
            Crear_Tabla.setLocationRelativeTo(null);
        }

        else
        JOptionPane.showMessageDialog(null, "Aún no has establecido una conexión\n");
    }//GEN-LAST:event_BtablaActionPerformed

    private void BusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusuarioActionPerformed

        if(pasaporte != false)
        {
            Crear_User.setVisible(true);
            Crear_User.setTitle("Crear Usuarios");
            Crear_User.setSize(600, 450);
            Crear_User.setLocationRelativeTo(null);
        }

        else
        JOptionPane.showMessageDialog(null, "Aún no has establecido una conexión\n");
    }//GEN-LAST:event_BusuarioActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed

        Guardar();
    }//GEN-LAST:event_BguardarActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed

        //LIMPI EL AREA DE TRABAJO//
        TAconsultas.setText("");
    }//GEN-LAST:event_BlimpiarActionPerformed

    private void BejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BejecutarActionPerformed

        //CONDICION QUE PERMITE ACCEDER A LAS DIFERENTES FUNCIONES//
        if(pasaporte != false)
        {
            String query = TAconsultas.getSelectedText();
            String h = query;
            String arr[] = query.split(" ");

            if(arr[0].equalsIgnoreCase("Select"))
            {
                SenciaSelect(h);
            }

            else
            {
                SetenciaUpdate(h);
            }
        }

        else
        JOptionPane.showMessageDialog(null, "Aún no has establecido una conexión\n");
    }//GEN-LAST:event_BejecutarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    Desktop desktop;
    File file = new File("F:\\Randy\\Escritorio\\Clases En General\\Materias R2 2016\\Programa 3\\Proyecto Final\\Final\\AdministradorBD\\src\\TemplatesProyecto\\Pag_AdminDB\\Acerca.html");
       
        if (Desktop.isDesktopSupported())
        {
            desktop = Desktop.getDesktop();
        
            try 
            {
             desktop.open(file);
            }
            
            catch (IOException ex) 
            {
                TAresultados.setText(ex.toString());
            }
        }
       
        else
        { 
            JOptionPane.showMessageDialog(null,"Lo lamento, no se puede abrir el archivo. Esta Maquina no soporta la API Desktop");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    
    //DESDE AQUI LOS METODOS//
    //CLASE PARA CONECTARSE A LA BASE DE DATOS//
    public void Conexion_DB(String user, String pass)
    {
        try 
        {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", user, pass);
            TAresultados.setText("Conexión Lograda con Exito.\n");
            cosulta = new MostrarConsulta(conexion);
            Tablas = cosulta.retornarTablas(conexion);
            Arbol();
            Login_DB.setVisible(false);
            pasaporte = true;
        }
        
        catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) 
        {
            TAresultados.setText(ex.getMessage());
        }
    }
    
    
    //CLASE PARA EJECUTAR LAS DIVERSAS SENTENCIAS//
    public void SetenciaUpdate(String query)
    {
       try 
        {
            Statement Stm = conexion.createStatement();
            System.out.println(Stm.executeUpdate(query));
            TAresultados.setText("Sentencia Realizada con exito.");
        } 
       
        catch (SQLException ex) 
        {
            TAresultados.setText(ex.toString());
        }
    }
    
    public void SenciaSelect(String query)
    {
        try 
        {
            TAresultados.setText("");
            cosulta = new MostrarConsulta(conexion, query);
            String[] cabecera = cosulta.getNombresColumnas();
            String datos [][] = cosulta.getDatosDevueltos();
            modelo = new DefaultTableModel(datos, cabecera);
            JTdatos.setModel(modelo);   
        }
            
        catch (Exception e) 
        {
            TAresultados.setText(e.getMessage());
        }
    }
    
    
    //CLASE PARA OBTENER LAS TABLAS DEL USUARIO CONECTADO//
    public void Arbol()
    {
        //ICONOS PARA EL JTREE//
        render = (DefaultTreeCellRenderer)this.Tarbol.getCellRenderer();
        render.setLeafIcon(new ImageIcon("src\\TemplatesProyecto\\dbtable.png"));
        render.setOpenIcon(new ImageIcon("src\\TemplatesProyecto\\User.png"));
        render.setClosedIcon(new ImageIcon("src\\TemplatesProyecto\\User.png"));
        
        try 
        {
            vegetableNode = new DefaultMutableTreeNode(cosulta.Usuario());
        } 
          
        catch (SQLException ex) 
        {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < Tablas.size(); i++) 
        {
            vegetableNode.add(new DefaultMutableTreeNode(Tablas.get(i)));
            root.add(vegetableNode); 
        }
         
        root.add(vegetableNode);
        treeModel = new DefaultTreeModel(root);
        Tarbol.setModel(treeModel);
    }
    
    
    //CLASE PARA GUARDAR EL AREA DE TRABAJO//
    public void Guardar()
    {
        JFileChooser jf = new JFileChooser();
        jf.showSaveDialog(null);
        FileWriter fw = null;
        
        try 
        {
            fw = new FileWriter(new File(jf.getSelectedFile().getPath()));
            fw.write(TAconsultas.getText());
            fw.close();
        } 
        
        catch (IOException ex) 
        {
           JOptionPane.showMessageDialog(null, "Error al encontrar el archivo.\n");
        }
    }
    
    
    //CREACION DE TABLAS Y CAMPOS CON SUS TIPOS DE DATOS//
    public void crearTabla()
    {
        try 
        {
            JOptionPane.showMessageDialog(null, table);
            
            Statement Stm = conexion.createStatement();
            int h = Stm.executeUpdate(table);
            TAresultados.setText("Tabla Creada.");      
        } 
        
        catch (SQLException ex) 
        {
            TAresultados.setText("Error" + ex);
        }
    }
    
    public void crearDatos() 
    { 
        if(count == 0)
        {
            if(TFnombre_atr.getText() != " ")
            {
                table = table + "," + TFnombre_atr.getText()+ " " + (String) CBtipo_dato.getSelectedItem();
            }
            
            if(TFcantidad.getText() != " " && (CBtipo_dato.getSelectedItem().equals("VARCHAR") || CBtipo_dato.getSelectedItem().equals("VARCHAR2") || CBtipo_dato.getSelectedItem().equals("NUMBER")))
            {
                table = table +" "+"(" + TFcantidad.getText(); table = table +")"; 
            }
            
            if(CBprimary.isSelected() && pk == 1) 
            { 
                table = table + " " + "PRIMARY KEY"; 
                pk = 0; 
                CBprimary.setVisible(false);
            }
            
            if(CBnull.isSelected()) 
            {
                table = table + " " + "NOT NULL";
            }
            
            TFnombre_atr.setText(" ");
            TFcantidad.setText(" ");
        } 
       
        if(count == 1)
        {
            if(TFnombre_atr.getText() != " ")
            {
                TipoDato = (String) CBtipo_dato.getSelectedItem();
                table = table.replace("NAME", TFnombre_t.getText()).replace("Atributo", TFnombre_atr.getText()).replace("TipoDato", (String) CBtipo_dato.getSelectedItem());
                
                if(TFcantidad.getText() != " " && (CBtipo_dato.getSelectedItem().equals("VARCHAR") || CBtipo_dato.getSelectedItem().equals("VARCHAR2") || CBtipo_dato.getSelectedItem().equals("NUMBER")))
                {
                    table = table + " " + "(" + TFcantidad.getText(); 
                    table = table +")";
                }
                
                if(CBprimary.isSelected() && pk == 1) 
                { 
                    table = table + " " + "PRIMARY KEY"; 
                    pk = 0; 
                    CBprimary.setVisible(false);
                }
                
                if(CBnull.isSelected()) 
                {
                    table = table + " " + "NOT NULL";
                }
                
                count = 0;
                
                TFnombre_atr.setText(" ");
                TFcantidad.setText(" ");
            } 
            
            else 
            { 
                TAresultados.setText("Vacio.");
            }
        }
    }
    
    
    //CREACION DE USUARIOS, ROLES Y PRIVILEGIOS//
    public void Actualizar()
    {
        try 
        {
            for (int i = 0; i < consultas.size(); i++) 
            {
                TAresultados.setText(" ");
                Statement Stm = conexion.createStatement();
                int h = Stm.executeUpdate(consultas.get(i));
            }
            
            TAresultados.setText("Usuario creado.");
        } 
        
        catch (SQLException ex) 
        {
            TAresultados.setText(ex.toString());
        }
    }
     
    public void Sentencias(String usuario)
    {
        String grant = " GRANT ", to = " TO ", admin = " WITH ADMIN OPTION ", temp = " ";
        TAresultados.setText(consultas.size()-1 + "\n");
        
        if(checkdb1.isSelected())
        {
            temp = grant + lb1.getText() + to + usuario;
            
            if(checkdb2.isSelected())
            {
                temp+= admin;
            }
                
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");  
        }
          
        temp = " ";
        
        if(checkconect1.isSelected())
        {
            temp = grant + lb2.getText() + to + usuario;
            
            if(checkconect2.isSelected())
            {
                temp += admin; 
            }
            
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
           
        temp = " "; 
        
        if(checkResouse1.isSelected())
        {
            temp = grant + lb3.getText() + to + usuario;
            
            if(checkresour2.isSelected())
            {
                temp += admin;
            }
            
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
        
        if(check_1.isSelected())
        {
            temp = grant + lb4.getText() + to + usuario;
            
            if(check_2.isSelected())
            {
                temp += admin;
            }
            
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
           
        if(check_3.isSelected())
        {
            temp = grant + lb5.getText() + to + usuario;
            
            if(check_4.isSelected())
            {
                temp += admin;
            }
            
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
              
        if(check_5.isSelected())
        {
            temp = grant + lb6.getText() + to + usuario;
                   
            if(check_6.isSelected())
            {
                temp += admin;
            }
            
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
               
        if(check_7.isSelected())
        {
            temp = grant + lb7.getText() + to + usuario;
                   
            if(check_8.isSelected())
            {
                temp += admin;
            }
                   
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
           
        if(check_9.isSelected())
        {
            temp = grant + lb8.getText() + to + usuario;
            
            if(check_10.isSelected())
            {
                temp += admin;
            }
                   
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
                
        if(check_11.isSelected())
        {
            temp = grant + lb9.getText() + to + usuario;
            
            if(check_12.isSelected())
            {
                temp += admin;
            }
                   
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
              
        if(check_13.isSelected())
        {
            temp = grant +lb10.getText() + to + usuario;
                   
            if(check_14.isSelected())
            {
                temp += admin;
            }
                   
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
           
        if(check_15.isSelected())
        {
            temp = grant + lb11.getText() + to + usuario;
                   
            if(check_16.isSelected())
            {
                temp += admin;
            }
                   
            consultas.add(temp);
            TAresultados.setText(consultas.get(consultas.size()-1) + "\n");
        }
  
        Actualizar();
    }
    
    public  void RecoleccionUsuario()
    {
          String usuario = TFnombre_u.getText();
          String contrasena = TFP_pass.getText();
          String  tabablespace = boxTablespace.getSelectedItem().toString();
          consultas.add("Create user " + usuario + " identified by " + contrasena + " default tablespace " + tabablespace + " temporary tablespace TEMP");
          Sentencias(usuario);
    }
      
 
    
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AcercaDe;
    private javax.swing.JButton Bactualizar;
    private javax.swing.JButton Badd;
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton Bconectar;
    private javax.swing.JButton Bconexion1;
    private javax.swing.JButton Bcrear;
    private javax.swing.JButton Bcrear_u;
    private javax.swing.JButton Bejecutar;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JButton Btabla;
    private javax.swing.JButton Busuario;
    private javax.swing.JCheckBox CBnull;
    private javax.swing.JCheckBox CBprimary;
    private javax.swing.JComboBox<String> CBtipo_dato;
    private javax.swing.JFrame Crear_Tabla;
    private javax.swing.JFrame Crear_User;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel JPcredenciales;
    private javax.swing.JPanel JProles;
    private javax.swing.JTable JTdatos;
    private javax.swing.JPanel Jprivilegios;
    private javax.swing.JPanel Jprivilegios1;
    private javax.swing.JLabel Lconexion1;
    private javax.swing.JLabel LfondoPrincipal;
    private javax.swing.JLabel Llinea;
    private javax.swing.JFrame Login_DB;
    private javax.swing.JLabel Lpass;
    private javax.swing.JLabel Ltitulo1;
    private javax.swing.JLabel Lusuario;
    private javax.swing.JMenuItem MIacerca;
    private javax.swing.JMenuItem MIcopiar;
    private javax.swing.JMenuItem MIguardar;
    private javax.swing.JMenuItem MIpegar;
    private javax.swing.JMenuItem MIsalir;
    private javax.swing.JMenuItem MIseleccionar;
    private javax.swing.JMenuItem MIsuprimir;
    private javax.swing.JMenu Marchivo;
    private javax.swing.JMenu Mayuda;
    private javax.swing.JMenu Meditar;
    private javax.swing.JLabel Otorgado;
    private javax.swing.JLabel Otorgado1;
    private javax.swing.JTabbedPane Pane_Fondo;
    private javax.swing.JPanel Pfondo;
    private javax.swing.JPanel Pfondo1;
    private javax.swing.JPanel Pprincipal;
    private javax.swing.JPanel PseparadorH1;
    private javax.swing.JPanel PseparadorH2;
    private javax.swing.JTextArea TAconsultas;
    private javax.swing.JTextArea TAresultados;
    private javax.swing.JPasswordField TFP_pass;
    private javax.swing.JPasswordField TFP_pass1;
    private javax.swing.JPasswordField TFPcontraseña;
    private javax.swing.JTextField TFcantidad;
    private javax.swing.JTextField TFnombre_atr;
    private javax.swing.JTextField TFnombre_t;
    private javax.swing.JTextField TFnombre_u;
    private javax.swing.JTextField TFusuario;
    private javax.swing.JTree Tarbol;
    private javax.swing.JComboBox<String> boxTablespace;
    private javax.swing.JCheckBox checkResouse1;
    private javax.swing.JCheckBox check_1;
    private javax.swing.JCheckBox check_10;
    private javax.swing.JCheckBox check_11;
    private javax.swing.JCheckBox check_12;
    private javax.swing.JCheckBox check_13;
    private javax.swing.JCheckBox check_14;
    private javax.swing.JCheckBox check_15;
    private javax.swing.JCheckBox check_16;
    private javax.swing.JCheckBox check_2;
    private javax.swing.JCheckBox check_3;
    private javax.swing.JCheckBox check_4;
    private javax.swing.JCheckBox check_5;
    private javax.swing.JCheckBox check_6;
    private javax.swing.JCheckBox check_7;
    private javax.swing.JCheckBox check_8;
    private javax.swing.JCheckBox check_9;
    private javax.swing.JCheckBox checkconect1;
    private javax.swing.JCheckBox checkconect2;
    private javax.swing.JCheckBox checkdb1;
    private javax.swing.JCheckBox checkdb2;
    private javax.swing.JCheckBox checkresour2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JLabel line4;
    private javax.swing.JLabel line5;
    private javax.swing.JLabel line6;
    private javax.swing.JLabel line7;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JLabel roles4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
