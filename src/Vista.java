import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Ver datos de un contenedor");
        System.out.println("2. Modificar un contenedor");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int obtenerNumeroContenedor() {
        System.out.print("Ingrese el número de contenedor (1-5): ");
        return scanner.nextInt();
    }

    public double obtenerNuevaDimension(String dimension) {
        System.out.print("Nueva " + dimension + ": ");
        return scanner.nextDouble();
    }

    public void mostrarContenedor(Contenedor contenedor) {
        System.out.println("Altura: " + contenedor.getAltura());
        System.out.println("Profundidad: " + contenedor.getProfundidad());
        System.out.println("Ancho: " + contenedor.getAncho());
        System.out.println("Estado: " + contenedor.determinarEstado());
    }
}
