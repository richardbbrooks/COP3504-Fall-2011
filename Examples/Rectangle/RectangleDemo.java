public class RectangleDemo {
    public static void main(String[] args) {
        //Create a new rectangle
        Rectangle box = new Rectangle(10.0, 20.0);

        //Display size and area
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}
