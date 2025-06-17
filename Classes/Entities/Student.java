package Classes.Entities;
import javax.swing.JOptionPane;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    public void passed(){
       if(finalGrade() > 60.0) JOptionPane.showMessageDialog(null, "PASS");
        else JOptionPane.showMessageDialog(null, "FAILED\nMISSING " + (60.0 - finalGrade()) + " POINTS");

    }
}
