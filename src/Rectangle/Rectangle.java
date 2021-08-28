package Rectangle;

public class Rectangle {
    double length; //instance
    double width;

    public Rectangle(){
        //Default Constructor
        length = 4;
        width = 2;
    }

    public Rectangle(double length ,  double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){//calculate Area

        return length * width;
    }

    public double getPerimeter(){//calculate perimeter
        return 2*(length+width);
    }
}
