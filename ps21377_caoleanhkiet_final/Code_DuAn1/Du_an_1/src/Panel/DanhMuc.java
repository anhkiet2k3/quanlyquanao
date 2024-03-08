/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;


import java.awt.Panel;
import javax.swing.JPanel;

/**
 *
 * @author tri03
 */
public class DanhMuc {
    private String kind;
    private JPanel pn;

    public DanhMuc(String kind, JPanel pn) {
        this.kind = kind;
        this.pn = pn;
    }

    public DanhMuc(){}

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getPn() {
        return pn;
    }

    public void setPn(JPanel pn) {
        this.pn = pn;
    }
    
    
    
}
