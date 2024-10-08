package boundary;

import java.io.PrintWriter;

import dto.Response;

public class StudentUIOutPut {
    private PrintWriter stdOut;

    public StudentUIOutPut() {
    }

    public StudentUIOutPut(PrintWriter stdOut) {
        this.stdOut = stdOut;
    }

    public void output(Response response) {
        stdOut.println("Ket qua: " + response.getResult());
        stdOut.flush();
    }

    public void showMessage(String message) {
        stdOut.println(message);
        stdOut.flush();
    }

    public PrintWriter getStdOut() {
        return stdOut;
    }

    public void setStdOut(PrintWriter stdOut) {
        this.stdOut = stdOut;
    }
}
