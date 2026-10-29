public class MentoríaEnVivo extends Curso{
    private String enlaceVideollamada;
    private int cupoMaximo;
    private int alumnosInscritos;

    public MentoríaEnVivo(String nombreCurso, int horasTotales, double precioBase,
                          String enlaceVideollamada, int cupoMaximo) {
        super(nombreCurso, horasTotales, precioBase);
        this.enlaceVideollamada = enlaceVideollamada;
        this.cupoMaximo = cupoMaximo;
        this.alumnosInscritos = 0;
    }

    @Override
    public void inscribirAlumno(String nombreAlumno) {
        if (alumnosInscritos < cupoMaximo) {
            alumnosInscritos++;
            System.out.println(nombreAlumno + " se inscribio en la mentoria en vivo.");
        } else {
            System.out.println("No hay cupos disponibles para " + nombreAlumno);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Enlace: " + enlaceVideollamada);
        System.out.println("Cupos disponibles: " + (cupoMaximo - alumnosInscritos));
    }
}
