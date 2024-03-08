package Util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MsgBox {

    /**
     * Hiển thị thông báo cho người dùng
     *
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo
     */
    public static void alert(Component parent, String message) {
        javax.swing.UIManager.put("OptionPane.messageForeground", java.awt.Color.RED);
        javax.swing.UIManager.put("Panel.background", java.awt.Color.OPAQUE);
        JOptionPane.showMessageDialog(parent, message,
                "Quản lí cửa hàng quần áo", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Hiển thị thông báo và yêu cầu người dùng xác nhận
     *
     * @param parent là cửa sổ chứa thông báo
     * @param message là câu hỏi yes/no
     * @return là kết quả nhận được true/false
     */
    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Quản lí cửa hàng quần áo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    /**
     * Hiển thị thông báo yêu cầu nhập dữ liệu
     *
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo nhắc nhở nhập
     * @return là kết quả nhận được từ người sử dụng nhập vào
     */
    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Quản lí cửa hàng quần áo", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void labelAlert(JLabel lbl, JTextField txtField, String message) {
        lbl.setText(message);
    }

    public static void labelAlertTextArea(JLabel lbl, JTextArea txtString, String mess) {
        lbl.setText(mess);
    }
}
