
package Entity;

import java.util.Date;

public class HoaDon {
    private String IDHoaDon, IDUser, IDKhachHang,NgayTao, IDVoucher;
    private Double TongTien;
    private boolean TrangThaiThanhToan;

    public String getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(String IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    
    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getIDVoucher() {
        return IDVoucher;
    }

    public void setIDVoucher(String IDVoucher) {
        this.IDVoucher = IDVoucher;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public boolean isTrangThaiThanhToan() {
        return TrangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(boolean TrangThaiThanhToan) {
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    
}
