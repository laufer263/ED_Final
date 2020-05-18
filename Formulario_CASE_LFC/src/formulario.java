import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * Creación de formulario para abrir aplicaciones y páginas web.
 * 
 * @author Laura Fernández Cobisa
 * @version 1.0
 * @since 18/05/2020
 */

public class formulario extends javax.swing.JFrame {
      
	
	/**
	* 
	* Declaración de variables
	* 
    */
	// serialVersionUID declaration
	private static final long serialVersionUID = 123L;
	
    private javax.swing.JButton boton_astah;
    private javax.swing.JButton boton_dia;
    private javax.swing.JButton boton_draw;
    private javax.swing.JButton boton_lucida;
    private javax.swing.JButton boton_salir;
 
    
	 /**
	 * 
	 * Método main
     * @param args Argumentos de linea de comando
     * 
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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }
    
    
	/**
	 * Constructor que inicializa el formulario
	 */
	
    public formulario() {
        initComponents();
    }
    
    
    /**
	 * Inicialización de los componentes
	 */
    
    private void initComponents() {

        boton_dia 		= new javax.swing.JButton();
        boton_astah 	= new javax.swing.JButton();
        boton_draw 		= new javax.swing.JButton();
        boton_lucida 	= new javax.swing.JButton();
        boton_salir 	= new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_dia.setIcon(new javax.swing.ImageIcon("src/graficos/dia.png"));
        boton_dia.setText("DIA");
        boton_dia.setToolTipText("Abrir DIA");
        boton_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_diaActionPerformed(evt);
            }
        });

        boton_astah.setIcon(new javax.swing.ImageIcon("src/graficos/astah.png"));
        boton_astah.setText("ASTAH");
        boton_astah.setToolTipText("Abrir ASTAH");
        boton_astah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_astahActionPerformed(evt);
            }
        });

        boton_draw.setIcon(new javax.swing.ImageIcon("src/graficos/draw.png"));
        boton_draw.setText("Draw.io");
        boton_draw.setToolTipText("Abrir Draw.io");
        boton_draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_drawActionPerformed(evt);
            }
        });

        boton_lucida.setIcon(new javax.swing.ImageIcon("src/graficos/lucidchart.png"));
        boton_lucida.setText("Lucidchart");
        boton_lucida.setToolTipText("Abrir Lucidchart");
        boton_lucida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_lucidaActionPerformed(evt);
            }
        });

        boton_salir.setIcon(new javax.swing.ImageIcon("src/graficos/salir.png"));
        boton_salir.setText("SALIR");
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
        });
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_draw, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_lucida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(boton_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(boton_astah, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_astah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_draw, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_lucida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }

    
    /**
	 * Ejecuta las acciones de las distintas opciones/botones.
	 * @param direccion ruta de la aplicación o página web que deseamos ejecutar/abrir.
	 * @param tipo de acción a realizar. 1 - Abrir aplicación. 2 - Abrir página web.
	 */
    
    public void ejecutar(String direccion, int tipo){
  
        try {
            
          if(tipo == 1){ //Página web

            URI pWeb = new URI(direccion);
            Desktop.getDesktop().browse(pWeb);
        
          }else if(tipo == 2){ //Aplicación
              
            Runtime app = Runtime.getRuntime();
            app.exec(direccion);
             
          }
           
        } catch (IOException ex) {
        	
            Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: \n" + ex.getMessage());
            
        } catch (URISyntaxException ex) {
        	
            Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    
    /**
	 * Control de eventos de los botones
	 */
    

    /**
	 * Botón app dia
	 * @param evt Evento sobre el botón
	 */
    
    private void boton_diaActionPerformed(java.awt.event.ActionEvent evt) {
    	
        ejecutar("/Applications/dia/dia.app", 2);
        
    }

    /**
   	 * Botón app dia
   	 * @param evt Evento sobre el botón
   	 */
    
    private void boton_astahActionPerformed(java.awt.event.ActionEvent evt) {

        ejecutar("/Applications/astahprofessional/astahprofessional.app", 2);
        
    }

    /**
   	 * Botón app dia
   	 * @param evt Evento sobre el botón
   	 */
    
    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {
       
        System.exit(0);
        
    }

    /**
   	 * Botón app dia
   	 * @param evt Evento sobre el botón
   	 */
    
    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {
       
    }

    /**
   	 * Botón app dia
   	 * @param evt Evento sobre el botón
   	 */
    
    private void boton_drawActionPerformed(java.awt.event.ActionEvent evt) {
       
        ejecutar("https://app.diagrams.net/", 1);
        
    }

    /**
   	 * Botón app dia
   	 * @param evt Evento sobre el botón
   	 */
    
    private void boton_lucidaActionPerformed(java.awt.event.ActionEvent evt) {
        
        ejecutar("https://www.lucidchart.com/pages/es", 1);
        
    }

 
}
