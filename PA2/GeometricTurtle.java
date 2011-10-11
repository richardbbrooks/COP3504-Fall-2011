public class GeometricTurtle extends Turtle{
    private double ZERO = 0.0;
    private double FORTYFIVE = 45.0;
    private double NINETY = 90.0;
    private double ONEEIGHTY = 180.0;

    public void GeometricTurtle() {
        this.tailUp();
        this.faceEast();
    }

    public void drawSide(double length, double angle) {
        this.tailDown();
        this.turnLeft(angle);
        this.move(length);
        this.tailUp();
    }

    public void rectangle(double width, double height) {
        this.tailDown();
        this.drawSide(width, ZERO);
        this.drawSide(height, NINETY);
        this.drawSide(width, NINETY);
        this.drawSide(height, NINETY);
        this.tailUp();
        this.faceEast();
    }

    public void square(double length) {
        this.rectangle(length, length);
    }

    public void pentagon(double length) {
        double PENTAGONANGLE = 72.0;

        this.tailDown();
        this.drawSide(length, ZERO);
        this.drawSide(length, PENTAGONANGLE);
        this.drawSide(length, PENTAGONANGLE);
        this.drawSide(length, PENTAGONANGLE);
        this.drawSide(length, PENTAGONANGLE);
        this.tailUp();
        this.faceEast();
    }

    public void hexagon(double length) {
        double HEXAGONANGLE = 60.0;

        this.tailDown();
        this.drawSide(length, ZERO);
        this.drawSide(length, HEXAGONANGLE);
        this.drawSide(length, HEXAGONANGLE);
        this.drawSide(length, HEXAGONANGLE);
        this.drawSide(length, HEXAGONANGLE);
        this.drawSide(length, HEXAGONANGLE);
        this.tailUp();
        this.faceEast();
    }

    public void letterC(double height, double width, double thickness, char facing) {
        if (facing == 'L') {
            this.tailDown();
            this.drawSide(width, ZERO);
            this.drawSide(height, NINETY);
            this.drawSide(width, NINETY);
            this.drawSide(thickness, NINETY);
            this.drawSide(width-thickness, NINETY);
            this.drawSide(height - ((2.0)*thickness), -1 * NINETY);
            this.drawSide(width-thickness, -1 * NINETY);
            this.drawSide(thickness, NINETY);
            this.tailUp();
            this.faceEast();
        }
        if (facing == 'R') {
            this.tailDown();
            this.drawSide(width, ZERO);
            this.drawSide(thickness, NINETY);
            this.drawSide(width-thickness, NINETY);
            this.drawSide(height - ((2.0)*thickness), -1 * NINETY);
            this.drawSide(width-thickness, -1 * NINETY);
            this.drawSide(thickness, NINETY);
            this.drawSide(width, NINETY);
            this.drawSide(height, NINETY);
            this.tailUp();
            this.faceEast();
        }
    }

}
