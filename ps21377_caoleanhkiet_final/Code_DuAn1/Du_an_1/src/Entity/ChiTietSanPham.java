package Entity;

public class ChiTietSanPham {

    private String IDCTSanPham, IDSanPham, TenCTSP;
    private int IDSize, IDColor, IDChatLieu, SoLuong;
    private Double gia;
    private boolean TrangThai;

    public String getIDCTSanPham() {
        return IDCTSanPham;
    }

    public void setIDCTSanPham(String IDCTSanPham) {
        this.IDCTSanPham = IDCTSanPham;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public String getTenCTSP() {
        return TenCTSP;
    }

    public void setTenCTSP(String TenCTSP) {
        this.TenCTSP = TenCTSP;
    }

    public int getIDSize() {
        return IDSize;
    }

    public void setIDSize(int IDSize) {
        this.IDSize = IDSize;
    }

    public int getIDColor() {
        return IDColor;
    }

    public void setIDColor(int IDColor) {
        this.IDColor = IDColor;
    }

    public int getIDChatLieu() {
        return IDChatLieu;
    }

    public void setIDChatLieu(int IDChatLieu) {
        this.IDChatLieu = IDChatLieu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
