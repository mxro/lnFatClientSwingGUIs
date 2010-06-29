/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.linnk.netbeansguis;

/**
 *
 * @author mx
 */
public interface ImportHyperlinkDialog {
     public String getHyperlink();
     public String getDescirption();
     public void showDialog();

     public static interface Callback {
         public void onSuccess(String hyperlink, String descirption);
         public void onCancel();
     }
}
