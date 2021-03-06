/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UIText extends javax.swing.JFrame {

    /**
     * Creates new form UIText
     */
    private lectorArchivos lector;
    public UIText() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        lector = new lectorArchivos();
        contenido.setEditable(false);
        jxtAreaDetalle.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        btnOpenFile = new javax.swing.JButton();
        btnRunSeardh = new javax.swing.JButton();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jxtAreaDetalle = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenido.setColumns(20);
        contenido.setRows(5);
        jScrollPane1.setViewportView(contenido);

        btnOpenFile.setText("open file");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnRunSeardh.setText("run search");
        btnRunSeardh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunSeardhActionPerformed(evt);
            }
        });

        jtxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Palabra a Buscar:");

        jxtAreaDetalle.setColumns(20);
        jxtAreaDetalle.setRows(5);
        jScrollPane2.setViewportView(jxtAreaDetalle);

        jLabel2.setText("Detalles:");

        jLabel3.setFont(new java.awt.Font("Tlwg Typist", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(84, 106, 204));
        jLabel3.setText("BUSQUEDA DE COSTO UNIFORME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOpenFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRunSeardh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtBuscar)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnOpenFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRunSeardh)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
       String texto= abrirArchivo();
       contenido.setText(texto);
       String[] lista=contenido.getText().split(" ");
       //System.out.println(contenido.getText());
        for (int i = 0; i < lista.length; i++) {
            System.err.println(lista[i]);
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnRunSeardhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunSeardhActionPerformed
        // TODO add your handling code here:
        String cadenaBuscar = jtxtBuscar.getText();
        System.out.println("la palabra a buscar es: "+cadenaBuscar);
        // COSTO BUSQUEDA
        Integer res = lector.buscarPalabra(cadenaBuscar);
        System.out.println("el costo de busqueda del la palabra es: "+res);
        
        String detalle = "LA PALABRA A BUSCAR ES: "+cadenaBuscar+"\n"
                + "NODOS RECORIDOS: \n"
                + lector.darCademas(res)
                + "COSTO DE BUSQUEDA ES: "+res+"\n";
        
        
        jxtAreaDetalle.setText(detalle);
    }//GEN-LAST:event_btnRunSeardhActionPerformed

    private void jtxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarActionPerformed
    //abrir archivo
    private String abrirArchivo() {
        String aux = "";
        String texto = "";
        try {
            /**
             * llamamos el metodo que permite cargar la ventana
             */
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(this);
            /**
             * abrimos el archivo seleccionado
             */
            File abre = file.getSelectedFile();

            
            /**
             * recorremos el archivo, lo leemos para plasmarlo en el area de texto
             */
            if (abre != null) {
                
                lector.leerArchivo(abre);
                
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                
                lee.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        return texto;//El texto se almacena en el JTextArea
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UIText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UIText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UIText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UIText.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIText().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnRunSeardh;
    private javax.swing.JTextArea contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextArea jxtAreaDetalle;
    // End of variables declaration//GEN-END:variables
}
