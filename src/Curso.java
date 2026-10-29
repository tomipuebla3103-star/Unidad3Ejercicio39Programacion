public class Curso {
    protected String nombreCurso;
    protected int horasTotales;
    protected double precioBase;

    public Curso(String nombreCurso, int horasTotales, double precioBase) {
        this.nombreCurso = nombreCurso;
        this.horasTotales = horasTotales;
        this.precioBase = precioBase;
    }

    public double calcularCostoFinal() {
        return precioBase * 0.9;
    }

    public void inscribirAlumno(String nombreAlumno) {
        System.out.println(nombreAlumno + " se inscribio en " + nombreCurso);
    }

    public void mostrarDatos() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Horas totales: " + horasTotales);
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Precio final: $" + calcularCostoFinal());
    }
}
