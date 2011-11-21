public class DriverMaze {
    public static void main(String[] args) {
        MazeSearch Maze = new MazeSearch();
        System.out.println(Maze.iterativeDeepening());
        Maze.printSolution();
        Maze.printBoard();
    }
}
