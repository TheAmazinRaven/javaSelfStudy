public class exercise04x2DArrays {
    public static void main(String[] args) {

        int[][] revenue = new int[12][2];

        // --- MONTHS OF THE ARRAY ------------------

        // --- ROW 1, 2; COL 1; JAN/FEB
        revenue [0][0] = 1;
        revenue [1][0] = 2;

        // --- ROW 2, 3; COL 1; MAR/APR
        revenue [2][0] = 3;
        revenue [3][0] = 4;

        // --- ROW 3, 4; COL 1; MAY/JUN
        revenue [4][0] = 5;
        revenue [5][0] = 6;

        // --- ROW 5, 6; COL 1; JUL/AUG
        revenue [6][0] = 7;
        revenue [7][0] = 8;

        // --- ROW 7, 8; COL 1; SEPT/OCT
        revenue [8][0] = 9;
        revenue [9][0] = 10;

        // --- ROW 9, 10; COL 1; OCT/NOV/DEC
        revenue [10][0] = 11;
        revenue [11][0] = 12;

        // --- MONTHLY REVENUE ------------------

        // --- ROW 1, 2; COL 2; JAN/FEB
        revenue [0][1] = 34;
        revenue [1][1] = 44;

        // --- ROW 2, 3; COL 2; MAR/APR
        revenue [2][1] = 23;
        revenue [3][1] = 76;

        // --- ROW 3, 4; COL 2; MAY/JUN
        revenue [4][1] = 65;
        revenue [5][1] = 98;

        // --- ROW 5, 6; COL 2; JUL/AUG
        revenue [6][1] = 123;
        revenue [7][1] = 102;

        // --- ROW 7, 8; COL 2; SEPT/OCT
        revenue [8][1] = 87;
        revenue [9][1] = 43;

        // --- ROW 9, 10; COL 2; OCT/NOV
        revenue [10][1] = 34;
        revenue [11][1] = 12;

        for (int i = 0; i <= 11; i++) {

            System.out.println("For month number " + revenue[i][0] + ", the revenue was $" + revenue[i][1] + ".");
        }


    }
}

/*
Exercise 1

Create a two-dimensional array with 12 "rows" & 2 "columns." The first column will correspond to a month of the year such as January - 1 and December - 12. The second column will be revenue that a lemonade stand makes in that month. Load the array with the following information.

Jan = $34
Feb = $44
Mar = $23
Apr = $76
May = $65
Jun = $98
Jul = $123
Aug = $102
Sept = $87
Oct = $43
Nov = $34
Dec = $12
 */