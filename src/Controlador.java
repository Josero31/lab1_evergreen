public class Controlador {
        private Vista vista;
        private Contenedor[] contenedores;

        public Controlador(Vista vista) {
                this.vista = vista;
                contenedores = new Contenedor[5];

                for (int i = 0; i < contenedores.length; i++) {
                        contenedores[i] = new Contenedor(10, 10, 10, true); // Valores iniciales arbitrarios
                }
        }

        public void procesarContenedores() {
                int opcion;
                do {
                        opcion = vista.mostrarMenu();

                        switch (opcion) {
                                case 1:
                                        verDatosContenedor();
                                        break;
                                case 2:
                                        modificarContenedor();
                                        break;
                                case 3:
                                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                                        break;
                                default:
                                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                } while (opcion != 3);
        }

        private void verDatosContenedor() {
                int numeroContenedor = vista.obtenerNumeroContenedor();
                if (numeroContenedor >= 1 && numeroContenedor <= 5) {
                        Contenedor contenedorSeleccionado = contenedores[numeroContenedor - 1];
                        vista.mostrarContenedor(contenedorSeleccionado);
                } else {
                        System.out.println("Número de contenedor inválido.");
                }
        }

        private void modificarContenedor() {
                int numeroContenedor = vista.obtenerNumeroContenedor();
                if (numeroContenedor >= 1 && numeroContenedor <= 5) {
                        Contenedor contenedorSeleccionado = contenedores[numeroContenedor - 1];
                        modificarDimensionesContenedor(contenedorSeleccionado);
                        String nuevoEstado = contenedorSeleccionado.determinarEstado();
                        System.out.println("Contenedor modificado:");
                        vista.mostrarContenedor(contenedorSeleccionado);
                        System.out.println("Nuevo estado: " + nuevoEstado);
                } else {
                        System.out.println("Número de contenedor inválido.");
                }
        }

        private void modificarDimensionesContenedor(Contenedor contenedor) {
                double nuevaAltura = vista.obtenerNuevaDimension("altura");
                double nuevaProfundidad = vista.obtenerNuevaDimension("profundidad");
                double nuevoAncho = vista.obtenerNuevaDimension("ancho");
                contenedor.modificarDimensiones(nuevaAltura, nuevaProfundidad, nuevoAncho);
        }

        public static void main(String[] args) {
                Vista vista = new Vista();
                Controlador controlador = new Controlador(vista);

                controlador.procesarContenedores();
        }
}
