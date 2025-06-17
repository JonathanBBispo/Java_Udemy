package Classes;
import javax.swing.JOptionPane;

import Classes.Entities.Student;
public class Ex3 {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        var aluno = new Student();
        aluno.name = JOptionPane.showInputDialog("Name: ");
        do{
            aluno.grade1 = Double.parseDouble(JOptionPane.showInputDialog("Grade 1:"));
        }while(aluno.grade1 > 30.0);
        do{
            aluno.grade2 = Double.parseDouble(JOptionPane.showInputDialog("Grade 2:"));
            aluno.grade3 = Double.parseDouble(JOptionPane.showInputDialog("Grade 3:"));

        }while(aluno.grade2 > 35.0 || aluno.grade3 > 35.0);
        
        JOptionPane.showMessageDialog(null, "FINAL GRADE = " +  aluno.finalGrade());
        aluno.passed();
    }
}
