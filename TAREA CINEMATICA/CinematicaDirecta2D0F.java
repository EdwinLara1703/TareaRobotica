import java.util.Scanner;

public class CinematicaDirecta2D0F{


    static final double L1 = 20.0; // Longitud del primer eslabón en cm
    static final double L2 = 20.0; // Longitud del segundo eslabón en cm
    static final double c = 5.0;   // Distancia de la brida de montaje al TCP en cm

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ángulo theta1 (en grados): ");
        double theta1 = scanner.nextDouble();
        System.out.println("Ingrese el ángulo theta2 (en grados): ");
        double theta2 = scanner.nextDouble();

        // Convertir los ángulos de grados a radianes
        theta1 = Math.toRadians(theta1);
        theta2 = Math.toRadians(theta2);

        // Calcular las coordenadas del efector final (xd, yd) 
        double xd = L1 * Math.cos(theta1) + (L2 + c) * Math.cos(theta1 + theta2);
        double yd = L2 * Math.sin(theta1) + (L2 + c) * Math.sin(theta1 + theta2);

        System.out.printf("Coordenadas del efector final: (xd, yd) = (%.2f, %.2f) cm\n", xd, yd);
    }
}
