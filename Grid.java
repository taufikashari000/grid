public class Grid {
    public static void main(String[] args) {
        String [][] grid = {{"#", "#", "#", "#", "#", "#", "#", "#"},
                {"#", ".", ".", ".", ".", ".", ".", "#"},
                {"#", ".", "#", "#", "#", ".", ".", "#"},
                {"#", ".", ".", ".", "#", "#", ".", "#"},
                {"#", "X", "#", ".", ".", ".", ".", "#"},
                {"#", "#", "#", "#", "#", "#", "#", "#"}};
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j<8; j++) {
                if(j==7) {
                    System.out.println(grid[i][j]);
                }
                else {
                    System.out.printf(grid[i][j]);
                }
            }
        }
        for(int i = 3; i > 0; i--) {
            for(int j = 1; j < 6; j++) {
                if(grid[i].equals("#")) {
                    if(grid[j].equals("#")) {
                        
                    }
                }
            }
        }
    }
}