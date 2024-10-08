package boundary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import control.StudentControl;
import dto.RequestData;

public class StudentUIInput {
    private PrintWriter stdOut;
    private BufferedReader stdIn;
    private StudentControl studentControl;

    public StudentUIInput() {
    }

    public StudentUIInput(PrintWriter stdOut, BufferedReader stdIn, StudentControl studentControl) {
        this.stdIn = stdIn;
        this.stdOut = stdOut;
        this.studentControl = studentControl;
    }

    public void input() throws IOException {
        stdOut.print("Nhap ho ten: ");
        stdOut.flush();
        String hoTen = stdIn.readLine();
        stdOut.print("Nhap ma so sinh vien: ");
        stdOut.flush();
        String maSV = stdIn.readLine();
        stdOut.print("Nhap diem li thuyet: ");
        stdOut.flush();
        String diemLT = stdIn.readLine();
        stdOut.print("Nhap diem thuc hanh: ");
        stdOut.flush();
        String diemTH = stdIn.readLine();

        RequestData request = new RequestData();
        request.setTenSV(hoTen);
        request.setDiemTH(diemTH);
        request.setDiemLT(diemLT);
        request.setMaSV(maSV);

        studentControl.execute(request);
    }
}
