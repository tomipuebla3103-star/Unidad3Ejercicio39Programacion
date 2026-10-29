public class CursoGrabado extends Curso{
    private String plataforma;
    private String fechaLimiteAcceso;

    public CursoGrabado(String nombreCurso, int horasTotales, double precioBase,
                        String plataforma, String fechaLimiteAcceso) {
        super(nombreCurso, horasTotales, precioBase);
        this.plataforma = plataforma;
        this.fechaLimiteAcceso = fechaLimiteAcceso;
    }

    @Override
    public void inscribirAlumno(String nombreAlumno) {
        System.out.println(nombreAlumno + " se inscribio en el curso grabado: " + nombreCurso);
        System.out.println("Puede acceder desde " + plataforma);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Fecha limite de acceso: " + fechaLimiteAcceso);
    }
}
