
package super_market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * @author Toledo Presa Alexis
 */
public class descripcion_venta extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/supermaket?useTimezone=true&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "puchis22";
    
    PreparedStatement ps;
    PreparedStatement ps2;
    ResultSet rs;
    public static Connection getConection(){
        Connection con= null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    private void limpiarCajas(){
        txtcantidadp.setText(null);
        txtcodigop.setText(null);
        txtotalp.setText(null);
        
    }
    public descripcion_venta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        not_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_venta = new javax.swing.JTextField();
        txtcodigop = new javax.swing.JTextField();
        txtcantidadp = new javax.swing.JTextField();
        txtotalp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        not_txt.setEditable(false);
        not_txt.setBackground(new java.awt.Color(51, 255, 255));
        not_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        not_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        not_txt.setText("Productos a Vender");
        not_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                not_txtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Id_venta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Codigo de Producto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cantidad de Producto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("total de producto");

        txt_venta.setEditable(false);
        txt_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ventaActionPerformed(evt);
            }
        });

        txtotalp.setEditable(false);
        txtotalp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotalpActionPerformed(evt);
            }
        });

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Terminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(not_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_venta)
                                .addComponent(txtcodigop)
                                .addComponent(txtcantidadp)
                                .addComponent(txtotalp, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton2)
                                .addGap(41, 41, 41)
                                .addComponent(jButton3)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(not_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcantidadp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtotalp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void not_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_not_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_not_txtActionPerformed

    private void txtotalpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        double costo;
        double totalp;
        int canti;
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO descripcion_venta (id_venta, codigo_del_producto, cantidad_de_producto, total_del_producto) VALUES(?,?,?,?)");
            ps.setInt(1,Integer.parseInt(txt_venta.getText()));
            ps.setInt(2,Integer.parseInt(txtcodigop.getText()));
            ps.setInt(3,Integer.parseInt(txtcantidadp.getText()));

            ps2 =con.prepareStatement("SELECT almacen.precio FROM almacen where codigo_producto=?");
            ps2.setInt(1, Integer.parseInt(txtcodigop.getText()));
            
            rs = ps2.executeQuery();
            if(rs.next()){
                canti = Integer.parseInt(txtcantidadp.getText());
                costo = Double.parseDouble(rs.getString("almacen.precio"));
                totalp = canti*costo;
                System.out.println(totalp);
                txtotalp.setText(String.valueOf(totalp));

                
            }
             
            ps.setDouble(4,Double.parseDouble(txtotalp.getText()));
            int res = ps.executeUpdate();
            if (res >0){
                JOptionPane.showMessageDialog(null, "Venta guardada");
            }else{
                JOptionPane.showMessageDialog(null, "error al guardar");
            }
            con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ventaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double monto=0;
        Connection con = null;
        try{
            con = getConection();
            ps2 =con.prepareStatement("SELECT SUM(total_del_producto) FROM descripcion_venta WHERE id_venta=? GROUP BY id_venta; ");
            ps2.setInt(1, Integer.parseInt(txt_venta.getText()));
            rs = ps2.executeQuery();
            if(rs.next()){
                monto = Double.parseDouble(rs.getString("SUM(total_del_producto)"));
                System.out.println(monto);
            }
            ps = con.prepareStatement("UPDATE venta SET monto=? WHERE id_Venta=? ");
            ps.setDouble(1,monto);
            ps.setInt(2,Integer.parseInt(txt_venta.getText()));
            
            int res = ps.executeUpdate();
            
            if (res >0){
                JOptionPane.showMessageDialog(null, "Venta guardada");
            }else{
                JOptionPane.showMessageDialog(null, "error al guardar");
            }
            con.close();
        }catch(Exception e){
            System.err.println(e);
        }
        
        descripcion_venta v5=new descripcion_venta();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(descripcion_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(descripcion_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(descripcion_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(descripcion_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new descripcion_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField not_txt;
    public static javax.swing.JTextField txt_venta;
    private javax.swing.JTextField txtcantidadp;
    private javax.swing.JTextField txtcodigop;
    private javax.swing.JTextField txtotalp;
    // End of variables declaration//GEN-END:variables
}
