import javax.swing.JOptionPane;

public class VentasRegiones {
    public static void main(String[] args) {
        int[][] ventas = new int[3][4]; /
        
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ventas Región " + i + ", Mes " + j));
            }
        }
        
        for (int i = 0; i < 3; i++) {
            int totalRegion = 0;
            System.out.print("Región " + i + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + " ");
                totalRegion += ventas[i][j];
            }
            System.out.println("Total: " + totalRegion);
        }
    }
}
