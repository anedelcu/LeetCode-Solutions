class Solution {

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0; // initial assumption: all water, no island

        int height = grid.length;
        int width = grid[0].length;

        for (int y = 0; y < height; y++) { // strictly left to right
            for (int x = 0; x < width; x++) { // ... and bottom to top
                if (grid[y][x] == 1) { // we look only at land tiles
                    perimeter += 4; // assume this tile being the whole island

                    // the following removes the assumed bottom perimeter of above or left tile
                    // ... and the assumed top or left perimeter of the current tile
                    if (y > 0 && grid[y - 1][x] == 1) perimeter -= 2; // because we visited above already
                    if (x > 0 && grid[y][x - 1] == 1) perimeter -= 2; // because we visited left already
                }
            }
        }

        return perimeter;
    }
}
