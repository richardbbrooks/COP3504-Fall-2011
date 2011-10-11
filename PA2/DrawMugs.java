public class DrawMugs {
    public static void main(String[] args) {
        System.out.println("Hello");

        int ISLANDSIZE = 500;
        Island madagascar = new Island(ISLANDSIZE, ISLANDSIZE);        
        GeometricTurtle turtle = new GeometricTurtle();

        madagascar.putTurtleAtCenter(turtle);

        //(0,0) (bottom left) as origin for notation
        //
        //NAVIGATE TO THE BOTTOM LEFT (10,20)
        turtle.turnLeft(180.0);
        turtle.move(ISLANDSIZE/2.0 - 30.0);
        turtle.turnLeft(90.0);
        turtle.move(ISLANDSIZE/2.0 - 30.0);
        turtle.faceEast();
        
        //turtle.rectangle(50.0, 80.0);
        //turtle.square(20.0);
        //turtle.pentagon(30.0);
        //turtle.hexagon(25.0);

        //DRAW THE FIRST HANDLE
        turtle.letterC(80.0, 40.0, 20.0, 'R');
        
        //NAVIGATE TO WHERE TO DRAW RECTANGLE
        turtle.move(40.0);
        turtle.turnLeft(270.0);
        turtle.move(20.0);
        turtle.faceEast();

        //DRAW THE FIRST RECTANGLE
        turtle.rectangle(80.0, 120.0);

        //NAVIGATE TO THE START POINT FOR THE FIRST SHAPE
        turtle.move(28.25);
        turtle.turnLeft(90.0);
        turtle.move(40.0);
        turtle.faceEast();

        //DRAW THE FIRST SHAPE
        turtle.pentagon(23.51);
        
        //NAVIGATE TO THE START POINT FOR THE SECOND HANDLE
        turtle.move(180.0);//going to be some large number
        turtle.turnRight(90.0);
        turtle.move(20.0);
        turtle.faceEast();
        
        //DRAW THE SECOND HANDLE
        turtle.letterC(80, 40.0, 20.0, 'L');

        //NAVIGATE TO THE START POINT FOR THE SECOND RECTANGLE
        turtle.turnLeft(180.0);
        turtle.move(80.0);
        turtle.turnLeft(90.0);
        turtle.move(20.0);
        turtle.faceEast();

        //DRAW THE SECOND RECTANGLE
        turtle.rectangle(80.0, 120.0);
        
        //MOVE TO WHERE THE SECOND SHAPE STARTS
        turtle.move(40.0);
        turtle.turnLeft(90.0);
        turtle.move(40.0);
        turtle.faceEast();

        //DRAW THE SECOND SHAPE
        turtle.turnLeft(45.0);//ANGLE THE SQUARE
        turtle.square(28.28);
        turtle.faceEast();

        //MOVE TO THE START POINT OF THE THIRD HANDLE
        turtle.turnLeft(90.0);
        turtle.move(100.0);
        turtle.turnLeft(90.0);
        turtle.move(145.0);
        turtle.faceEast();

        //DRAW THE THIRD HANDLE
        turtle.letterC(80.0, 40.0, 20.0, 'R');
        
        //NAVIGATE TO WHERE TO DRAW RECTANGLE
        turtle.move(40.0);
        turtle.turnLeft(270.0);
        turtle.move(20.0);
        turtle.faceEast();

        //DRAW THE LAST RECTANGLE
        turtle.rectangle(80.0, 120.0);

        //MOVE TO THE START OF THE LAST SHAPE;
        turtle.move(40.0);
        turtle.turnLeft(90.0);
        turtle.move(40.0);
        turtle.faceEast();

        //DRAW THE LAST SHAPE
        turtle.turnLeft(30.0);
        turtle.hexagon(20.0);
    }
}

