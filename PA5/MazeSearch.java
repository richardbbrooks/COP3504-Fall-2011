import java.util.*;

public class MazeSearch {
    private int[][] maze = new int[][] {
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1},
        {0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1},
        {0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0},
        {0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
        {0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0},
        {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0},
        {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1},
        {0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0},
        {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
        {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1},
        {0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0},
        };
    private final int HEIGHT = maze.length;
    private final int WIDTH = maze[0].length;
    
    private final int OPEN = 0;
    private final int WALL = 1;
    private final int TRIED = 2;
    
    private final int X = 0;
    private final int Y = 1;
    
    private final int[] STARTINGPOSITION = new int[] {0,0};
    
    private int currentDepth = 0;
    
    private Stack<int[]> solution = new Stack<int[]>();

    private int[] getNextPosition(int x, int y) {
        if (getRight(x,y) == OPEN) {
        	maze[y][x] = TRIED;
            //maze[y][x+1] = TRIED;
            return new int[] {x+1, y};
        } else if (getBelow(x,y) == OPEN) {
        	maze[y][x] = TRIED;
        	//maze[y+1][x] = TRIED;
            return new int[] {x, y+1};
        } else if (getLeft(x,y) == OPEN) {
        	maze[y][x] = TRIED;
        	//maze[y][x-1] = TRIED;
            return new int[] {x-1, y};
        } else if (getAbove(x,y) == OPEN) {
        	maze[y][x] = TRIED;
        	//maze[y-1][x] = TRIED;
            return new int[] {x, y-1};
        } else {
            //Nothing to do here! (Put's on jetpack)
        	maze[y][x] =  TRIED;
            return new int[] {x, y}; 
        }
    }
    
    private boolean samePosition(int[] p1, int[] p2) {
    	if (p1[0] == p2[0] && p1[1] == p2[1])
    		return true;
    	else
    		return false;
    }

    private boolean validPosition(int x, int y) {
        if ((x >= 0 && x < WIDTH) && (y >= 0 && y < HEIGHT)) {
            return true;
        } else {
            return false;
        }
    }

    private int getLeft(int x, int y) {
        if (!validPosition(x, y)) {
            System.out.println("WTF OUT OF BOUNDS: " + x + " " + y);
            return WALL;
        }
        if (x == 0) {
            return WALL;
        } else {
            return maze[y][x-1];
        } 
    }

    private int getRight(int x, int y) {
        if (!validPosition(x, y)) {
            System.out.println("WTF OUT OF BOUNDS: " + x + " " + y);
            return WALL;
        }
        if (x == WIDTH -1) {
            return WALL;
        } else {
            return maze[y][x+1];
        } 
    }
    
    private int getBelow(int x, int y) {
        if (!validPosition(x, y)) {
            System.out.println("WTF OUT OF BOUNDS: " + x + " " + y);
            return WALL;
        }
        if (y == HEIGHT -1) {
            return WALL;
        } else {
            return maze[y+1][x];
        } 
    }
 
    private int getAbove(int x, int y) {
        if (!validPosition(x, y)) {
            System.out.println("WTF OUT OF BOUNDS: " + x + " " + y);
            return WALL;
        }
        if (y == 0) {
            return WALL;
        } else {
            return maze[y-1][x];
        }
    }
    
    public boolean iterativeDeepening() {
    	boolean foundSolution = mazeDepthSearch(STARTINGPOSITION, 50);
        System.out.println("Last Traveled: " + solution.peek()[0] + " " + solution.peek()[1]);
        System.out.println("Current Depth: " + currentDepth);
        return foundSolution;
    }
    private boolean mazeDepthSearch(int[] currentPosition, int maxDepth) {
    	if (currentDepth < maxDepth) {
    		int[] nextPosition = this.getNextPosition(currentPosition[0],currentPosition[1]);
    		if (currentDepth > 39) {
    			System.out.print("Depth"+currentDepth+" Current: " + currentPosition[X] + ", " + currentPosition[Y] + " | ");
    			System.out.println("Next: " + nextPosition[X] + ", " + nextPosition[Y] + " | ");
    		}
	    	if (nextPosition[X] == WIDTH-1 && nextPosition[Y] == HEIGHT-1) {
	    		System.out.println("Found at depth: " + currentDepth);
	    		currentDepth = maxDepth+1;
	    		return true;
	    	}
	    	if (this.samePosition(nextPosition, currentPosition)) {
	    		currentDepth--;
	    		return this.mazeDepthSearch(solution.pop(), maxDepth);
	    	}
	    	else {
	    		solution.push(nextPosition);
	    		currentDepth++;
	    		return this.mazeDepthSearch(nextPosition, maxDepth);
	    	}
    	} else
    		return false;
    }

    public MazeSearch() {
    	maze[0][0] = TRIED;
        this.printBoard();
        solution.push(STARTINGPOSITION);
    }
    public void printSolution() {
    	Iterator<int[]> solutionIterator = solution.iterator();
    	while (solutionIterator.hasNext()) {
    		int[] solutionStep = solutionIterator.next();
    		maze[solutionStep[Y]][solutionStep[X]] = 3;
    		System.out.print("{"+solutionStep[Y] + "|" + solutionStep[X]+"}, ");
    	}
    	System.out.println();
    }
    public void printBoard() {
        //Yeah, it's not recursive. But it's a helluva lot more intuitive. 
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (maze[i][j] == 0)
                    System.out.print(" ");
                else if (maze[i][j] == 1)
                    System.out.print("█");
                else if (maze[i][j] == 2)
                	System.out.print("X");
                else if (maze[i][j] == 3)
                	System.out.print("$");
                else
                    System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}
