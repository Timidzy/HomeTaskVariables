public class Shapes {
    public static void main(String[] args) {
        double rectangleWidth;
        double rectangleHeight;
        double rectanglePerimeter;
        double rectangleArea;
        rectangleHeight = 5;
        rectangleWidth = 10;
        rectanglePerimeter = (rectangleHeight + rectangleWidth) * 2;
        rectangleArea = rectangleHeight * rectangleWidth;
        System.out.println("Rectangle width is " + rectangleWidth);
        System.out.println("Rectangle height is " + rectangleHeight);
        System.out.println("Rectangle perimeter is " + rectanglePerimeter);
        System.out.println("Rectangle area is " + rectangleArea);
        System.out.println();

        double radius;
        double pi;
        double circumference;
        double circleArea;
        radius = 5;
        pi = Math.PI;
        circumference = radius * 2 * pi;
        circleArea = radius * radius * pi;
        System.out.println("Circle radius is " + radius);
        System.out.println("Circle ference is " + circumference);
        System.out.println("Circle area is " + circleArea);


    }
}
