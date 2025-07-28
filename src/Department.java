public class Department {
    private String name;
    private Professor[] professors;
    private int professorCount = 0;

    public Department(String name, int maxProfessors) {
        this.name = name;
        this.professors = new Professor[maxProfessors];
        System.out.println("Departamento " + this.name + " creado con capacidad para " + maxProfessors + " profesor.");
    }

    public String getName(){
        return name;
    }

    public void addProfessor(Professor professor){
        if (this.professorCount < this.professors.length) {
            this.professors[this.professorCount] = professor;
            this.professorCount++;

            System.out.println("Profesor " + professor.getName() + " agregado al departamento " + this.name);
        } else {
            System.out.println("Error: El departamento " + this.name + " está lleno. No se puede agregar a " + professor.getName());
        }
    }

    public void displayProfessors(){
        System.out.println(".: Listado de profesores en el departamento " + this.getName() + " :.");
        if (this.professorCount == 0) {
            System.out.println("No hay profesores asignados");
        } else {
            for (int i = 0; i < this.professorCount; i++) {
                if (this.professors[i] != null) {
                    System.out.println(" -" + this.professors[i].getName() + " (ID: " + this.professors[i].getProfessorId() + ")");
                }
            }
        }
    }
}
