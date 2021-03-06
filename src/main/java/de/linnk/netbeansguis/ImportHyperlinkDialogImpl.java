/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ImportHyperlinkDialog.java
 *
 * Created on 09.12.2009, 20:40:31
 */

package de.linnk.netbeansguis;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mx
 */
public class ImportHyperlinkDialogImpl extends javax.swing.JDialog implements ImportHyperlinkDialog {

    private ImportHyperlinkDialog.Callback callback;

    public void setCallback(ImportHyperlinkDialog.Callback callback) {
        this.callback=callback;
    }

    public String getHyperlink() {
        return this.textFieldHyperlink.getText();
    }

    public String getDescirption() {
        return this.textFieldDescription.getText();
    }

    public void showDialog() {
      
    	this.setVisible(true);

    }


    /** Creates new form ImportHyperlinkDialog */
    public ImportHyperlinkDialogImpl(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setModal(true);
        this.setTitle("Import Hyperlink");
        this.setLocationRelativeTo(null);
        /* dummy callback */
        this.setCallback(new Callback() {

			public void onCancel() {
				
			}

			public void onSuccess(String hyperlink, String descirption) {
				
			}
        	
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textFieldHyperlink = new javax.swing.JTextField();
        textFieldDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chechBoxClipboard = new javax.swing.JCheckBox();
        checkBoxPageTitle = new javax.swing.JCheckBox();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(formListener);

        jButton1.setText("Insert");
        jButton1.addActionListener(formListener);

        jButton2.setText("Cancel");
        jButton2.addActionListener(formListener);

        jLabel1.setText("Specify Hyperlink");

        textFieldHyperlink.addPropertyChangeListener(formListener);
        textFieldHyperlink.addInputMethodListener(formListener);
        textFieldHyperlink.addKeyListener(formListener);

        jLabel2.setText("Description");

        chechBoxClipboard.setSelected(true);
        chechBoxClipboard.setText("Scan Clipboard");
        chechBoxClipboard.addChangeListener(formListener);

        checkBoxPageTitle.setSelected(true);
        checkBoxPageTitle.setText("Read Web Page Title");
        checkBoxPageTitle.addChangeListener(formListener);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, checkBoxPageTitle)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(5, 5, 5))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 253, Short.MAX_VALUE)
                        .add(chechBoxClipboard))
                    .add(textFieldHyperlink, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(textFieldDescription, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(textFieldHyperlink, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(chechBoxClipboard))
                    .add(layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(jLabel2)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(textFieldDescription, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(checkBoxPageTitle)
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.InputMethodListener, java.awt.event.KeyListener, java.awt.event.WindowListener, java.beans.PropertyChangeListener, javax.swing.event.ChangeListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton1) {
                ImportHyperlinkDialogImpl.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                ImportHyperlinkDialogImpl.this.jButton2ActionPerformed(evt);
            }
        }

        public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
        }

        public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            if (evt.getSource() == textFieldHyperlink) {
                ImportHyperlinkDialogImpl.this.textFieldHyperlinkInputMethodTextChanged(evt);
            }
        }

        public void keyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getSource() == textFieldHyperlink) {
                ImportHyperlinkDialogImpl.this.textFieldHyperlinkKeyPressed(evt);
            }
        }

        public void keyReleased(java.awt.event.KeyEvent evt) {
        }

        public void keyTyped(java.awt.event.KeyEvent evt) {
        }

        public void windowActivated(java.awt.event.WindowEvent evt) {
            if (evt.getSource() == ImportHyperlinkDialogImpl.this) {
                ImportHyperlinkDialogImpl.this.formWindowActivated(evt);
            }
        }

        public void windowClosed(java.awt.event.WindowEvent evt) {
        }

        public void windowClosing(java.awt.event.WindowEvent evt) {
        }

        public void windowDeactivated(java.awt.event.WindowEvent evt) {
        }

        public void windowDeiconified(java.awt.event.WindowEvent evt) {
        }

        public void windowIconified(java.awt.event.WindowEvent evt) {
        }

        public void windowOpened(java.awt.event.WindowEvent evt) {
        }

        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            if (evt.getSource() == textFieldHyperlink) {
                ImportHyperlinkDialogImpl.this.textFieldHyperlinkPropertyChange(evt);
            }
        }

        public void stateChanged(javax.swing.event.ChangeEvent evt) {
            if (evt.getSource() == chechBoxClipboard) {
                ImportHyperlinkDialogImpl.this.chechBoxClipboardStateChanged(evt);
            }
            else if (evt.getSource() == checkBoxPageTitle) {
                ImportHyperlinkDialogImpl.this.checkBoxPageTitleStateChanged(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private String getClipboardText() {
        Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

        try {
            if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String text = (String)t.getTransferData(DataFlavor.stringFlavor);
                return text;
            }
        } catch (UnsupportedFlavorException e) {
        } catch (IOException e) {
        }
        return null;

    }


    private static String inputStreamAsString(InputStream stream)
throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(stream));
StringBuilder sb = new StringBuilder();
String line = null;

while ((line = br.readLine()) != null) {
sb.append(line + "\n");
}

br.close();
return sb.toString();
}

    private String getWebpageTitle(String hyperlink) {
     try {
        URL url = new URL(hyperlink);
    URLConnection urlConnection = url.openConnection();
     urlConnection.connect();
    String html = inputStreamAsString(urlConnection.getInputStream());
   
   

//    System.out.println(html);
    html = html.replaceAll("\\s+", " ");
    Pattern p = Pattern.compile("<title>(.*?)</title>");
    Matcher m = p.matcher(html);
    while (m.find() == true) {
      return m.group(1);
      }

    return null;
     } catch (Exception e) {
         
         return null;
     }
    }

    public void scanClipboard() {
        if (!chechBoxClipboard.isSelected()) return;
        String clipboard = getClipboardText();
        if (clipboard == null) return;

        try {
          URI uri = new URI(clipboard);
          textFieldHyperlink.setText(uri.toString());
        } catch (Exception e) {
           return;
        }



    }


    public void scanDescription() {
        if (!checkBoxPageTitle.isSelected()) return;
        String hyperlink = textFieldHyperlink.getText();

        try {
          URI uri = new URI(hyperlink);
          String title = getWebpageTitle(hyperlink);
          if (title == null) return;
          textFieldDescription.setText(title);
          return;
        } catch (Exception e) {
           return;
        }


    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
        String hyperlink = textFieldHyperlink.getText();

        try {
          URI uri = new URI(hyperlink);
         } catch (Exception e) {
           this.callback.onCancel();
           return;
        }

        this.callback.onSuccess(hyperlink, textFieldDescription.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       new Thread() {
        @Override
		public void run() {
           scanClipboard();
           scanDescription();
        }
       }.run();

    }//GEN-LAST:event_formWindowActivated

    private void textFieldHyperlinkPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textFieldHyperlinkPropertyChange
        new Thread() {
        @Override
		public void run() {
           scanDescription();
        }
       }.start();
    }//GEN-LAST:event_textFieldHyperlinkPropertyChange

    private void textFieldHyperlinkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldHyperlinkKeyPressed

        Thread t = new Thread() {
        @Override
		public void run() {
           scanDescription();
        }
       };
       t.setPriority(Thread.MIN_PRIORITY);
       t.start();
    }//GEN-LAST:event_textFieldHyperlinkKeyPressed

    private void textFieldHyperlinkInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textFieldHyperlinkInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHyperlinkInputMethodTextChanged

    private void chechBoxClipboardStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chechBoxClipboardStateChanged
       Thread t = new Thread() {
        @Override
		public void run() {
           scanDescription();
            scanClipboard();
        }
       };
       t.setPriority(Thread.MIN_PRIORITY);
       t.start();

    }//GEN-LAST:event_chechBoxClipboardStateChanged

    private void checkBoxPageTitleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkBoxPageTitleStateChanged
        Thread t = new Thread() {
        @Override
		public void run() {
           scanDescription();
            scanClipboard();
        }
       };
       t.setPriority(Thread.MIN_PRIORITY);
       t.start();
    }//GEN-LAST:event_checkBoxPageTitleStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        this.callback.onCancel();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImportHyperlinkDialogImpl dialog = new ImportHyperlinkDialogImpl(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
					public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox chechBoxClipboard;
    public javax.swing.JCheckBox checkBoxPageTitle;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JTextField textFieldDescription;
    public javax.swing.JTextField textFieldHyperlink;
    // End of variables declaration//GEN-END:variables

}
