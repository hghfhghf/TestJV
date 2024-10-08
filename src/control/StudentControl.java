package control;

import boundary.StudentUIOutPut;
import dto.Request;
import dto.Response;
import entity.Student;

public class StudentControl {
    private Student student;
    private StudentUIOutPut studentUIOutPut;

    public StudentControl(Student student, StudentUIOutPut studentUIOutPut) {
        this.student = student;
        this.studentUIOutPut = studentUIOutPut;
    }

    public void execute(Request request) {
        try {
            int maSV = Integer.parseInt(request.getMaSV());
            int diemLT = Integer.parseInt(request.getDiemLT());
            int diemTH = Integer.parseInt(request.getDiemTH());
            student.setMaSV(maSV);
            student.setDiemLT(diemLT);
            student.setDiemTH(diemTH);
            float res = student.tinhDiemTB();
            Response response = new Response(res);
            studentUIOutPut.output(response);
        } catch (NumberFormatException e) {
            studentUIOutPut.showMessage("Loi: Du lieu nhap vao phai la so nguyen");
        }
    }
}
