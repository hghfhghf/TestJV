package control;

import boundary.StudentUIOutPut;
import dto.RequestData;
import dto.ResponseData;
import dto.ResponseError;
import entity.Student;

public class StudentControl {
    private Student student;
    private StudentUIOutPut studentUIOutPut;

    public StudentControl(Student student, StudentUIOutPut studentUIOutPut) {
        this.student = student;
        this.studentUIOutPut = studentUIOutPut;
    }

    public void execute(RequestData request) {
        try {
            int maSV = Integer.parseInt(request.getMaSV());
            float diemLT = Float.parseFloat(request.getDiemLT());
            float diemTH = Float.parseFloat(request.getDiemTH());
            student.setMaSV(maSV);
            student.setDiemLT(diemLT);
            student.setDiemTH(diemTH);
            student.setTenSV(request.getTenSV());
            String res1 = student.getTenSV();
            int res2 = student.getMaSV();
            float res3 = student.tinhDiemTB();

            ResponseData response = new ResponseData(res1, res2, res3);
            studentUIOutPut.showMessage(response);
        } catch (NumberFormatException e) {
            ResponseError error = new ResponseError("Loi: Du lieu nhap vao phai la so nguyen hoac so thuc");
            studentUIOutPut.showError(error);
        }
    }
}
