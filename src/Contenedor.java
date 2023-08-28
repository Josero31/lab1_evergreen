public class Contenedor {
    private double altura;
    private double profundidad;
    private double ancho;

    public Contenedor(double altura, double profundidad, double ancho, boolean vacio) {
        this.altura = altura;
        this.profundidad = profundidad;
        this.ancho = ancho;

    }

    public void modificarDimensiones(double nuevaAltura, double nuevaProfundidad, double nuevoAncho) {
        this.altura = nuevaAltura;
        this.profundidad = nuevaProfundidad;
        this.ancho = nuevoAncho;
    }

    public String determinarEstado() {
        double peso = (altura + ancho + profundidad) / 5000;

        if (peso < 325000) {
            return "Contenedor con peso estable";
        } else if (peso == 325000) {
            return "Contenedor lleno";
        } else {
            return "Contenedor sobrepesado";
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public double getAncho() {
        return ancho;
    }

}
