package io.montanus.geometria;

public final class Figura {
    private enum Forma {RECTANGULO, CIRCULO}

    private final Forma forma;
    private double radio;
    private double longitud;
    private double anchura;

    public Figura(double radio) {
        forma = Forma.CIRCULO;
        this.radio = radio;
    }

    public Figura(double longitud, double anchura) {
        forma = Forma.RECTANGULO;
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double calculaArea() {
        switch (forma) {
            case RECTANGULO:
                return longitud * anchura;
            case CIRCULO:
                return Math.PI * (radio * radio);
            default:
                throw new AssertionError();
        }
    }

    public double calculaPerimetro() {
        switch (forma) {
            case RECTANGULO:
                return 2 * (longitud + anchura);
            case CIRCULO:
                return 2 * Math.PI * radio;
            default:
                throw new AssertionError();
        }
    }
}
