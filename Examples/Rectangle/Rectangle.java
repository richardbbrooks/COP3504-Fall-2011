public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double len, double wid) {
        this.setLength(len);
        this.setWidth(wid);
    }

    public Rectangle() {
        this.setLength(0);
        this.setWidth(0);
    }

    public void setLength(double len){
        this.length = len;
    }

    public void setWidth(double wid) {
        this.width = wid;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return (this.getLength() * this.getWidth());
    }
}
