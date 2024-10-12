import java.util.Scanner;

public class Menu {

    private ConvertidorDivisas convertidorDivisas;

    public Menu() {
        this.convertidorDivisas = new ConvertidorDivisas();
    }

    // Metodo para mostrar el menú
    public void mostrarMenu() {
        System.out.println("\n\n*******************************************");
        System.out.println("Bienvenido al Conversor de Divisas");
        System.out.println("*******************************************\n\n");
        System.out.println("1. Dólares (USD) a Pesos Argentinos (ARS)");
        System.out.println("2. Pesos Argentinos (ARS) a Dólares (USD)");
        System.out.println("3. Dólares (USD) a Reales Brasileños (BRL)");
        System.out.println("4. Reales Brasileños (BRL) a Dólares (USD)");
        System.out.println("5. Dólares (USD) a Pesos Colombianos (COP)");
        System.out.println("6. Pesos Colombianos (COP) a Dólares (USD)");
        System.out.println("7. Dólares (USD) a Pesos Mexicanos (MXN)");
        System.out.println("8. Pesos Mexicanos (MXN) a Dólares (USD)");
        System.out.println("9. Salir\n\n");
        System.out.println("Por favor, seleccione una opción:");
    }

    // Metodo para procesar la opción seleccionada
    public void procesarSeleccion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        if (opcion >= 1 && opcion <= 8) {
            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();
            String monedaOrigen = "";
            String monedaDestino = "";

            switch (opcion) {
                case 1:
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    monedaOrigen = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    monedaOrigen = "COP";
                    monedaDestino = "USD";
                    break;
                case 7:
                    monedaOrigen = "USD";
                    monedaDestino = "MXN";
                    break;
                case 8:
                    monedaOrigen = "MXN";
                    monedaDestino = "USD";
                    break;
            }

            try {
                double tasaCambio = convertidorDivisas.obtenerTasaCambio(monedaOrigen, monedaDestino);
                double montoConvertido = monto * tasaCambio;
                System.out.println("El valor "+ monto + " " + monedaOrigen + " equivale al valor final de =>> " + montoConvertido + " " + monedaDestino);
            } catch (Exception e) {
                System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            }
        } else if (opcion != 9) {
            System.out.println("Opción no válida");
        }
    }

    // Metodo principal que ejecuta el ciclo del menú
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarSeleccion(opcion);
        } while (opcion != 9);

        System.out.println("\nGracias por usar el conversor de divisas. ¡Hasta luego!");
        scanner.close();
    }
}
