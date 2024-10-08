package dto;

public class Request {
    public String hoTen;
    public String maSV;
    private String diemLT;
    private String diemTH;

    public Request() {
    }

    public Request(String hoTen, String maSV, String diemLT, String diemTH) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return hoTen;
    }

    public void setTenSV(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(String diemLT) {
        this.diemLT = diemLT;
    }

    public String getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(String diemTH) {
        this.diemTH = diemTH;
    }

}
