public class App {
    public static void main(String[] args) throws Exception {

        //instanciando estudiantes
        Student student1 = new Student("Juan Vacca", "est001");
        Student student2 = new Student("Sebastian Peña", "est002");
        Student student3 = new Student("Samuel Vacca", "est003");
        Student student4 = new Student("Sergio Vacca", "est004");
        Student student5 = new Student("Oscar Vacca", "est005");
        Student student6 = new Student("Luciana Vacca", "est006");

        

        //instanciando departamentos
        Department department1 = new Department("Matemáticas", 15);
        Department department2 = new Department("Finanazas", 7);
        Department department3 = new Department("Ingeniería", 8);
        Department department4 = new Department("Ciencias humanas", 6);
        Department department5 = new Department("Derecho", 9);

        //instanciando profesores
        Professor profe1 = new Professor("Jaime G. ", "P001", department1);
        Professor profe2 = new Professor("Luis A.", "P002", department3);
        Professor profe3 = new Professor("Enrique A.", "P003", department2);
        Professor profe4 = new Professor("Antonio A.", "P004", department4);
        Professor profe5 = new Professor("Francisco E.", "P005", department5);

        //asignacion de profes a los departamentos(agregacion)
        department1.addProfessor(profe1);
        department3.addProfessor(profe2);
        department2.addProfessor(profe3);
        department4.addProfessor(profe4);
        department5.addProfessor(profe5);

        //mostrar profesores por departamento
        department1.displayProfessors();
        System.out.println();
        department2.displayProfessors();
        System.out.println();
        department3.displayProfessors();
        System.out.println();
        department4.displayProfessors();
        System.out.println();
        department5.displayProfessors();
        System.out.println();

        //creando cursos
        Course programacion = new Course("Programación básica", "C001", 40, profe2);
        Course calculo = new Course("Cálculo integral", "C003", 15, profe1);

        //matriculanod estudiantes a un curso
        programacion.enrolledStudent(student6);
        programacion.enrolledStudent(student5);
        programacion.enrolledStudent(student4);
        calculo.enrolledStudent(student1);
        calculo.enrolledStudent(student2);
        calculo.enrolledStudent(student3);
        calculo.enrolledStudent(student4);

        //mostrando estudiante matriculados
        System.out.println();
        programacion.displayEnrolledStudents();
        System.out.println();
        calculo.displayEnrolledStudents();
    }
}
