import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import boundary.StudentUIInput;
import boundary.StudentUIOutPut;
import control.StudentControl;
import entity.Student;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdOut = new PrintWriter(System.out, true);

        Student student = new Student();
        StudentUIOutPut studentUIOutPut = new StudentUIOutPut(stdOut);
        StudentControl studentControl = new StudentControl(student, studentUIOutPut);
        StudentUIInput studentUIInput = new StudentUIInput(stdOut, stdIn, studentControl);

        studentUIInput.input();
    }
}
