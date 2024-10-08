package entity;

public class Student {
    private String hoTen;
    private int maSV;
    private float diemLT;
    private float diemTH;

    public Student() {

    }

    public Student(String hoTen, int maSV, float diemLT, float diemTH) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return hoTen;
    }

    public void setTenSV(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

}
