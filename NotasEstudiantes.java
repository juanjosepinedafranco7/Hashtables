public class NotasEstudiantes {
    public static void main(String[] args) {
        int[][] notas = {
            {85, 90, 78},  // Estudiante 1
            {92, 88, 95},  // Estudiante 2  
            {76, 82, 89}   // Estudiante 3
        };
        
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            System.out.print("Estudiante " + (i+1) + ": ");
            
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                suma += notas[i][j];
            }
            
            double promedio = suma / 3.0;
            System.out.println(" | Promedio: " + promedio);
        }
    }
}
