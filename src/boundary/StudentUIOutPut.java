package boundary;

import java.io.PrintWriter;

import dto.ResponseData;
import dto.ResponseError;
import entity.Student;

public class StudentUIOutPut {
    private PrintWriter stdOut;

    public StudentUIOutPut() {
    }

    public StudentUIOutPut(PrintWriter stdOut) {
        this.stdOut = stdOut;
    }

    public void showMessage(ResponseData responsedData) {
        stdOut.println("Ket qua");
        stdOut.println("Ho ten: " + responsedData.getHoTen());
        stdOut.println("Ma so sinh vien: " + responsedData.getMaSV());
        stdOut.println("Diem trung binh: " + responsedData.getResult());
        stdOut.flush();
    }

    public void showError(ResponseError error) {
        stdOut.println("Loi: " + error.getError());
        stdOut.flush();
    }

    public PrintWriter getStdOut() {
        return stdOut;
    }

    public void setStdOut(PrintWriter stdOut) {
        this.stdOut = stdOut;
    }
}
