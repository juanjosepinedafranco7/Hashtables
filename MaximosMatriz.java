public class MaximosMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 12, 3, 8},
            {9, 2, 15, 4},
            {7, 11, 6, 13},
            {1, 14, 10, 16}
        };
        
        for (int i = 0; i < matriz.length; i++) {
            int maxFila = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxFila) maxFila = matriz[i][j];
            }
            System.out.println("Máximo fila " + i + ": " + maxFila);
        }
   
        for (int j = 0; j < matriz[0].length; j++) {
            int maxCol = matriz[0][j];
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i][j] > maxCol) maxCol = matriz[i][j];
            }
            System.out.println("Máximo columna " + j + ": " + maxCol);
        }
    }
}
