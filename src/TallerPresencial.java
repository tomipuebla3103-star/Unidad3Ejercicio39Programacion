public class TallerPresencial extends Curso{
    private int numeroAula;
    private String direccion;
    private int cupoMaximo;
    private int alumnosInscritos;

    public TallerPresencial(String nombreCurso, int horasTotales, double precioBase,
                            int numeroAula, String direccion, int cupoMaximo) {
        super(nombreCurso, horasTotales, precioBase);
        this.numeroAula = numeroAula;
        this.direccion = direccion;
        this.cupoMaximo = cupoMaximo;
        this.alumnosInscritos = 0;
    }

    @Override
    public void inscribirAlumno(String nombreAlumno) {
        if (alumnosInscritos < cupoMaximo) {
            alumnosInscritos++;
            System.out.println(nombreAlumno + " se inscribio en el taller presencial.");
        } else {
            System.out.println("No hay cupos disponibles para " + nombreAlumno);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de aula: " + numeroAula);
        System.out.println("Direccion: " + direccion);
        System.out.println("Cupos disponibles: " + (cupoMaximo - alumnosInscritos));
    }
}
