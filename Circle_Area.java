import java.util.Scanner;
class Circle_Area {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        double area = (Math.PI*radius*radius);
        System.out.println("Circle Area:"+area);
        input.close();
    }
}
