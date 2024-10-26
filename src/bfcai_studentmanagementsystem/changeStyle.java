
package bfcai_studentmanagementsystem;

import com.healthmarketscience.jackcess.Index;
import javax.swing.UIManager;

/**
 *
 * @author Muhammad Agami
 */
public class changeStyle {
    String[] style = {
        "com.jtattoo.plaf.smart.SmartLookAndFeel",
        "com.jtattoo.plaf.noire.NoireLookAndFeel",
        "com.jtattoo.plaf.mcwin.McWinLookAndFeel"
    };
    
    public void setLookAndFeel(int index) {
        try {
            UIManager.setLookAndFeel(style[index]);
        } catch (Exception ex) {
            
        }
    }

    public void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            
        }
    }

}
