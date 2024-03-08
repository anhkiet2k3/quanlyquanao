/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import Panel.DanhMuc;
import Ui.BanHangJpanel;
import Ui.HoaDonJpanel;
import Ui.DoanhThuJpanel;
import Ui.KhachHangJpanel;
import Ui.ChiTietSanPhamJpanel;
import Ui.ThuocTinhJpanel;
import Ui.NhanVienJpanel;
import Ui.SanPhamJpanel;
import Ui.DoanhSoJpanel;
import Ui.KhuyenMaiJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author tri03
 */
public class ChuyenTab {

    private JPanel root;
    private String kindSelected = "";

    private List<DanhMuc> listItem = null;

    public ChuyenTab(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel pn) {
        kindSelected = "SanPham";

        pn.setBackground(Color.gray);

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new SanPhamJpanel());
        root.validate();
        root.repaint();

    }

    public void setEvent(List<DanhMuc> listItem) {
        this.listItem = listItem;
        for (DanhMuc item : listItem) {
            item.getPn().addMouseListener(new btnEvent(item.getKind(), item.getPn()));
        }
    }

    class btnEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel pn;

        public btnEvent(String kind, JPanel pn) {
            this.kind = kind;
            this.pn = pn;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {

                case "HangHoa":
                    node = new SanPhamJpanel();
                    break;
                case "SanPham":
                    node = new SanPhamJpanel();
                    break;
                case "MatHang":
                    node = new ChiTietSanPhamJpanel();
                    break;
                case "ThuocTinh":
                    node = new ThuocTinhJpanel();
                    break;

                case "GiaoDich":
                    node = new BanHangJpanel();
                    break;
                case "BanHang":
                    node = new BanHangJpanel();
                    break;
                case "HoaDon":
                    node = new HoaDonJpanel();
                    break;

                case "KhuyenMai":
                    node = new KhuyenMaiJPanel();
                    break;
                case "KhachHang":
                    node = new KhachHangJpanel();
                    break;

                case "ThongKe":
                    node = new DoanhSoJpanel();
                    break;
                case "DoanhSo":
                    node = new DoanhSoJpanel();
                    break;
                case "DoanhThu":
                    node = new DoanhThuJpanel();
                    break;

                case "NhanVien":
                    node = new NhanVienJpanel();
                    break;

                default:
                    node = new DoanhSoJpanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();

            setChangeBackgound(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            pn.setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            pn.setBackground(Color.gray);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equals(kind)) {
                pn.setBackground(new Color(0, 102, 255));
            }
        }

        private void setChangeBackgound(String kind) {
            for (DanhMuc item : listItem) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    item.getPn().setBackground(Color.gray);
                } else {
                    item.getPn().setBackground(new Color(0, 102, 255));
                }
            }
        }

    }
}
