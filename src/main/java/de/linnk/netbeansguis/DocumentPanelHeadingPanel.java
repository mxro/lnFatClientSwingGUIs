/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DocumentPanelHeadingPanel.java
 *
 * Created on 08.03.2009, 22:50:30
 */

package de.linnk.netbeansguis;

/**
 *
 * @author mx
 */
public class DocumentPanelHeadingPanel extends javax.swing.JPanel {

    /** Creates new form DocumentPanelHeadingPanel */
    public DocumentPanelHeadingPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLine1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanelLine2 = new javax.swing.JPanel();
        jLabelCreated = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanelLine1.setLayout(new javax.swing.BoxLayout(jPanelLine1, javax.swing.BoxLayout.X_AXIS));

        jTextField1.setText("jTextField1");
        jTextField1.setMinimumSize(new java.awt.Dimension(400, 28));
        jPanelLine1.add(jTextField1);

        jPanelLine2.setLayout(new javax.swing.BoxLayout(jPanelLine2, javax.swing.BoxLayout.X_AXIS));

        jLabelCreated.setText("jLabel2");
        jPanelLine2.add(jLabelCreated);

        jLabel1.setText("created:");
        jPanelLine2.add(jLabel1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelLine1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(150, 150, 150)
                    .add(jPanelLine2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(116, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(jPanelLine1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(100, 100, 100)
                    .add(jPanelLine2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelCreated;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelLine1;
    public javax.swing.JPanel jPanelLine2;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
