package dto;

public class ResponseData {
    private float result;
    private String hoTen;
    private int maSV;

    public ResponseData() {
    }

    public ResponseData(String hoTen, int maSV, float result) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.result = result;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
