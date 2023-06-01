import java.util.*;

public class RandomMatrix {
    public static class RowsColumnsDiagonals {
        public ArrayList<Integer> rows;
        public ArrayList<Integer> columns;
        public boolean minDiag;
        public boolean majDiag;
        public RowsColumnsDiagonals() {
            this.rows = new ArrayList<>();
            this.columns = new ArrayList<>();
            this.minDiag = false;
            this.majDiag = false;
        }
        public String toString() {
            String r, c;
            return String.format(
                    "Rows: %s\n" +
                    "Columns: %s\n" +
                    "Minor Diagonal: %b\n" +
                    "Major Diagonal: %b\n",
                    (r = stringify(rows)).equals("") ? "none" : r,
                    (c = stringify(columns)).equals("") ? "none" : c,
                    minDiag,
                    majDiag);
        }
    }

    public static String stringify(ArrayList<Integer> iarrl) {
        String ret = "";
        for (int i : iarrl) {
            ret += String.format("%d ", i);
        }
        return ret;
    }

    public static void print2d(int[][] iarr2d) {
        for (var iarr : iarr2d) {
            for (var i : iarr) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
    public static int randint(int lbIncl, int ubExcl) {
        return (int) (Math.random() * (ubExcl - lbIncl)) + lbIncl;
    }
    public static int[][] randomBinarySquareMatrix(int width) {
        int[][] ret = new int[width][width];
        for (int h = 0; h < width; ++h) {
            for (int w = 0; w < width; ++w) {
                ret[h][w] = randint(0, 2);
            }
        }
        return ret;
    }

    public static int arraySum(int[] iarr) {
        int ret = 0;
        for (int i : iarr) {
            ret += i;
        }
        return ret;
    }

    public static double sumColumnInt(int[][] iarr2d, int c) {
        int ret = 0;
        for (int[] iarr : iarr2d) {
            ret += iarr[c];
        }
        return ret;
    }
    public static void print(int[] iarr) {
        for (int i : iarr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    public static RowsColumnsDiagonals checkHomogenousRCD(int[][] iarr2d) {
        int base = iarr2d.length;  // universal reference value because 2d array is square
        RowsColumnsDiagonals ret = new RowsColumnsDiagonals();
        // check homogenous rows
        for (int i = 0; i < iarr2d.length; ++i) {
            if (arraySum(iarr2d[i]) % base == 0) {
                ret.rows.add(i);
            }
        }
        // check homogenous columns
        for (int i = 0; i < iarr2d.length; ++i) {
            if (sumColumnInt(iarr2d, i) % base == 0) {
                ret.columns.add(i);
            }
        }
        // check homogenous diagonals
        int[] minorDiagonal = new int[iarr2d.length];
        int[] majorDiagonal = new int[iarr2d.length];
        for (int i = 0; i < iarr2d.length; ++i) {
            minorDiagonal[i] = iarr2d[base-i-1][i];
            majorDiagonal[i] = iarr2d[i][i];
        }
        if (arraySum(minorDiagonal) % base == 0) {
            ret.minDiag = true;
        }
        if (arraySum(majorDiagonal) % base == 0) {
            ret.majDiag = true;
        }
        return ret;
    }
    public static void main(String[] args) {
        // int[][] test = randomBinarySquareMatrix(8);
        int[][] test = new int[][]{
                {1, 0, 0, 1, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0, 1, 1},
                {0, 1, 1, 1, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 1, 0, 1, 0, 1}
        };

        print2d(test);
        System.out.print(checkHomogenousRCD(test));
    }
}
