//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CursoGrabado grabado = new CursoGrabado(
            "Java desde cero", 20, 50000,
            "Udemy", "31/12/2026"
    );

    MentoríaEnVivo mentoria = new MentoríaEnVivo(
            "Programacion avanzada", 10, 80000,
            "meet.google.com/ejemplo", 2
    );

    TallerPresencial taller = new TallerPresencial(
            "Reparacion de computadoras", 8, 60000,
            5, "Calle San Martin 123", 2
    );

    System.out.println("=== CURSO GRABADO ===");
    grabado.inscribirAlumno("Juan");
    grabado.mostrarDatos();

    System.out.println("\n=== MENTORIA EN VIVO ===");
    mentoria.inscribirAlumno("Maria");
    mentoria.inscribirAlumno("Pedro");
    mentoria.inscribirAlumno("Ana");
    mentoria.mostrarDatos();

    System.out.println("\n=== TALLER PRESENCIAL ===");
    taller.inscribirAlumno("Carlos");
    taller.inscribirAlumno("Lucia");
    taller.inscribirAlumno("Sofia");
    taller.mostrarDatos();
}
