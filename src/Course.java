public class Course {

    private String name;
    private String courseCode;
    private int maxCapacity;
    private Professor professor;
    private Student[] enrolledStudents;
    private int studentCount = 0;


    public Course(String name, String courseCode, int maxCapacity, Professor professor) {
        this.name = name;
        this.courseCode = courseCode;
        this.maxCapacity = maxCapacity;
        this.professor = professor;

        this.enrolledStudents = new Student[maxCapacity];
        System.out.println("Curso " + this.name + " con capacidad para " + maxCapacity + " estudiantes");
    }


    public String getName() {
        return name;
    }


    public String getCourseCode() {
        return courseCode;
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }


    public Professor getProfessor() {
        return professor;
    }


    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }


    public int getStudentCount() {
        return studentCount;
    }

    //matricula de estudiante
    public void enrolledStudent(Student student){
        if (this.studentCount < this.maxCapacity) {
            this.enrolledStudents[this.studentCount] = student;
            this.studentCount++;
            System.out.println("Estudiante " + student.getName() + " matriculado en " + this.name);
        } else {
            System.out.println("Error: el curso " + this.name + " está lleno. No se puede matricular a " + student.getName());
        }
    }

    //mostrando los esstuiantes
    public void displayEnrolledStudents(){
        System.out.println("Estudiantes matriculados en " + this.name + ":");
        if (this.studentCount == 0) {
            System.out.println("No hay estudiantes matriculados");
        } else {
            for (int i = 0; i < studentCount; i++) {
                if (this.enrolledStudents[i] != null) {
                    System.out.println(" -" + this.enrolledStudents[i].getName() + "(ID: " + this.enrolledStudents[i].getStudentId() + ")");
                }
            }
        }
    }

    
}
