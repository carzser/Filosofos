package filosofoscomensales;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Interface extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }
    
    Comedor comida;
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numFilosofosTextoLabel = new javax.swing.JLabel();
        numFilosofosLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        filosofosTable = new javax.swing.JTable();
        iniciarButton = new javax.swing.JButton();
        pausaButton = new javax.swing.JButton();
        reanudarButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inanicionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));

        numFilosofosTextoLabel.setText("Numero de filosofos aleatorio");

        filosofosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Estado", "Comidas Restantes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(filosofosTable);

        iniciarButton.setText("Iniciar");
        iniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarButtonActionPerformed(evt);
            }
        });

        pausaButton.setText("Pausa");
        pausaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausaButtonActionPerformed(evt);
            }
        });

        reanudarButton.setText("Reanudar");
        reanudarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reanudarButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filosofoscomensales/Circulo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(iniciarButton)
                                .addGap(26, 26, 26)
                                .addComponent(pausaButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(reanudarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inanicionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numFilosofosTextoLabel)
                                .addGap(75, 75, 75)
                                .addComponent(numFilosofosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iniciarButton)
                            .addComponent(pausaButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reanudarButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numFilosofosTextoLabel)
                            .addComponent(numFilosofosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(inanicionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarButtonActionPerformed
        Comedor comida = new Comedor(this, filosofosTable);
        this.comida = comida;
        //comida.actualizar();
        comida.iniciarSimulacion();
        iniciarButton.setEnabled(false);
        
        /*ImageIcon ImageAristoteles = new ImageIcon("Aristoteles.png");
        ImageIcon ImageComiendo = new ImageIcon("Comiendo.png");
        ImageIcon ImageEpicuro = new ImageIcon("Epicuro.png");
        ImageIcon ImageEsperando = new ImageIcon("Esperando.png");
        ImageIcon ImageNietzsche = new ImageIcon("Nietzsche.png");
        ImageIcon ImageKant = new ImageIcon("Kant.png"); 
        ImageIcon ImageKarl = new ImageIcon("Karl.png");
        ImageIcon ImagePensando = new ImageIcon("Pensando.png");
        ImageIcon ImagePlato = new ImageIcon("Plato.png");
        ImageIcon ImagePlaton = new ImageIcon("Platon.png");
        ImageIcon ImageDescartes = new ImageIcon("Descartes.png");
        ImageIcon ImageSaciado = new ImageIcon("Saciado.png");
        ImageIcon ImageSocrates = new ImageIcon("Socrates.png");
        ImageIcon ImageTales = new ImageIcon("Tales.png");
        ImageIcon ImageTen1 = new ImageIcon("Ten1.png");
        ImageIcon ImageTen2 = new ImageIcon("Ten2.png");
        ImageIcon ImageTen3 = new ImageIcon("Ten3.png");
        ImageIcon ImageTen4 = new ImageIcon("Ten4.png");
        ImageIcon ImageTen5 = new ImageIcon("Ten5.png");
        ImageIcon ImageTen6 = new ImageIcon("Ten6.png");
        ImageIcon ImageTen7 = new ImageIcon("Ten7.png");
        ImageIcon ImageTen8 = new ImageIcon("Ten8.png");
        ImageIcon ImageTen9 = new ImageIcon("Ten9.png");
        ImageIcon ImageTen10 = new ImageIcon("Ten10.png");
        ImageIcon ImageTen11 = new ImageIcon("Ten11.png");
        ImageIcon ImageTen12 = new ImageIcon("Ten12.png");
        ImageIcon ImageFideos = new ImageIcon("Fideos.png");
        ImageIcon ImageCirculo = new ImageIcon("Circulo.png");
        ImageIcon ImageZenon = new ImageIcon("Zenon.png");
        ImageIcon ImageCaso10 = new ImageIcon("Caso10.png");
        ImageIcon ImageCaso9 = new ImageIcon("Caso9.png");
        ImageIcon ImageCaso8 = new ImageIcon("Caso8.png");
        ImageIcon ImageCaso7 = new ImageIcon("Caso7.png");
        ImageIcon ImageCaso6 = new ImageIcon("Caso6.png");
        ImageIcon ImageCaso5 = new ImageIcon("Caso5.png");
        ImageIcon ImageCaso4 = new ImageIcon("Caso4.png");
        ImageIcon ImageCaso3 = new ImageIcon("Caso3.png");
        ImageIcon ImageCaso2 = new ImageIcon("Caso2.png");
        */
        /*
        ImageAristoteles.paintIcon(this,this.getGraphics(),620,116);
        ImageEpicuro.paintIcon(this,this.getGraphics(),750,165);
        ImageKarl.paintIcon(this,this.getGraphics(),790,260);
        ImageZenon.paintIcon(this,this.getGraphics(),770,355);
        ImageTales.paintIcon(this,this.getGraphics(),720,425);
        ImagePlaton.paintIcon(this,this.getGraphics(),620,458);
        ImageSocrates.paintIcon(this,this.getGraphics(),515,425);
        ImageNietzsche.paintIcon(this,this.getGraphics(),465,355);
        ImageDescartes.paintIcon(this,this.getGraphics(),445,260);
        ImageKant.paintIcon(this,this.getGraphics(),478,165);
        
        ImagePlato.paintIcon(this,this.getGraphics(),620,162);//Aristoteles
        ImagePlato.paintIcon(this,this.getGraphics(),715,195);//Epicuro
        ImagePlato.paintIcon(this,this.getGraphics(),752,270);//Karl
        ImagePlato.paintIcon(this,this.getGraphics(),730,350);//Zenon
        ImagePlato.paintIcon(this,this.getGraphics(),685,390);//Tales
        ImagePlato.paintIcon(this,this.getGraphics(),620,410);//Platon
        ImagePlato.paintIcon(this,this.getGraphics(),545,390);//Socrates
        ImagePlato.paintIcon(this,this.getGraphics(),507,350);//Nietzsche
        ImagePlato.paintIcon(this,this.getGraphics(),490,270);//Descartes
        ImagePlato.paintIcon(this,this.getGraphics(),528,197);//Kant
        
        ImageTen5.paintIcon(this,this.getGraphics(),610,175);//Aristoteles
        ImageTen4.paintIcon(this,this.getGraphics(),707,195);//Epicuro
        ImageTen11.paintIcon(this,this.getGraphics(),760,258);//Karl
        ImageTen2.paintIcon(this,this.getGraphics(),758,340);//Zenon
        ImageTen1.paintIcon(this,this.getGraphics(),718,388);//Tales
        ImageTen10.paintIcon(this,this.getGraphics(),655,426);//Platon
        ImageTen9.paintIcon(this,this.getGraphics(),576,418);//Socrates
        ImageTen8.paintIcon(this,this.getGraphics(),532,388);//Nietzsche
        ImageTen12.paintIcon(this,this.getGraphics(),504,310);//Descartes
        ImageTen6.paintIcon(this,this.getGraphics(),520,227);//Kant
        
        ImageSaciado.paintIcon(this,this.getGraphics(),620,70);//Aristoteles
        ImageSaciado.paintIcon(this,this.getGraphics(),780,130);//Epicuro
        ImageSaciado.paintIcon(this,this.getGraphics(),837,260);//Karl
        ImageSaciado.paintIcon(this,this.getGraphics(),810,350);//Zenon
        ImageSaciado.paintIcon(this,this.getGraphics(),720,470);//Tales
        ImageSaciado.paintIcon(this,this.getGraphics(),620,503);//Platon
        ImageSaciado.paintIcon(this,this.getGraphics(),510,470);//Socrates
        ImageSaciado.paintIcon(this,this.getGraphics(),412,350);//Nietzsche
        ImageSaciado.paintIcon(this,this.getGraphics(),400,260);//Descartes
        ImageSaciado.paintIcon(this,this.getGraphics(),440,130);//Kant
 
        
        ImageFideos.paintIcon(this,this.getGraphics(),620,162);//Aristoteles
        
        */
    }//GEN-LAST:event_iniciarButtonActionPerformed

    private void pausaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausaButtonActionPerformed
        try {
            comida.pausarSimulacion();
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pausaButtonActionPerformed

    private void reanudarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reanudarButtonActionPerformed
       comida.reanudarSimulacion();
    }//GEN-LAST:event_reanudarButtonActionPerformed

    
    public void modificarTabla(Comedor c){
        DefaultTableModel model = (DefaultTableModel)(filosofosTable.getModel());
        model.setRowCount(0);
        Filosofo[] fs = c.getFil();
        
        for (Filosofo f : fs) {          
            model.addRow(new Object[]
                        {f.getNombre(), f.getEstado(), f.getPlatos()});
        }
        
       
    }
    
    public void agregarCantidad(int cantidad){
       numFilosofosLabel.setText(cantidad+"");
    }
    
    
    public void displayInanicion(){
        inanicionLabel.setText("INANICION. LOS FILOSOFOS MUEREN DE HAMBRE");
    }
 

        

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable filosofosTable;
    private javax.swing.JLabel inanicionLabel;
    private javax.swing.JButton iniciarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numFilosofosLabel;
    private javax.swing.JLabel numFilosofosTextoLabel;
    private javax.swing.JButton pausaButton;
    private javax.swing.JButton reanudarButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
