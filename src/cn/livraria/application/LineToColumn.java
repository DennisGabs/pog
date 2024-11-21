package cn.livraria.application;

public class LineToColumn {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int [][] novaMatrix = new int[matrix.length][matrix.length - 1];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length; j++) {
                novaMatrix[j][i] = matrix[i][j];
                System.out.printf(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
