package Classes.Entities;

public class Rectangle {
    public double width;
    public double height;

    double area(){
        return width * height;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double perimeter(){
        return 2 * (width + height);
    }

    double diagonal(){
        return Math.sqrt((width * width + height * height));
    }

    @Override
    public String toString() {
       return "AREA = " + area() + "\nPERIMETER = " + perimeter() + "\nDIAGONAL = " + diagonal();
    }   
}
