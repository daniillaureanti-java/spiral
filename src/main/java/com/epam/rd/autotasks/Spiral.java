package com.epam.rd.autotasks;

public class Spiral {

    static int[][] spiral(int m, int n) {

        int c = 0;
        int i = 0;
        int j = 0;
        int p = 0;
        int f = m - 1;
        int w = n - 1;


        int[][] mas = new int[m][n];

        if (f == 0) {
            for (i = 0; i < mas.length; i++) {
                for (j = 0; j < mas[i].length; j++) {
                    mas[i][j] = ++c;
                }
            }
        } else

            while (c < m * n - 1) {

                while (j < w) {
                    mas[i][j] = ++c;
                    j++;
                }

                while (i < f) {
                    mas[i][j] = ++c;
                    i++;
                }

                while (j > p) {
                    mas[i][j] = ++c;
                    j--;
                }

                f--;
                w--;
                p++;
                while (i > p) {
                    mas[i][j] = ++c;
                    i--;
                }

            }
        if (c == m * n - 1) {
            mas[i][j] = ++c;
        }

        return mas;
    }
}