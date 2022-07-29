import static java.lang.Math.PI;

public class AreaCalculator {
    public static void main(String[]args){


        double areaofCircle = area(5.0);
        System.out.println("areaofCircle=" + areaofCircle);
        double areaofRectangle=area(5.0,4.0);
        System.out.println("areaofRectangle="+areaofRectangle);

    }
    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        else {

            return radius * radius * PI;
        }
    }
    public static double area(double x,double y){
        if (x<0||y<0){
            return -1;
        }
        else{

            return x*y;
        }

    }

}
