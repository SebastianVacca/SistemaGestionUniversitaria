public class Professor {
    private String name;
    private String professorId;
    private Department department;
    
    public Professor(String name, String professorId, Department department) {
        this.name = name;
        this.professorId = professorId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getProfessorId() {
        return professorId;
    }

    public Department getDepartment() {
        return department;
    }

    public void displayInfo(){
        System.out.printf("""
                ==========================
                Información del profesor%n
                Nombre: %s
                ID: %s%n
                """, getName(), getProfessorId());
        if (this.department != null) {
            System.out.println("Departamento: " + this.department.getName());
        } else {
            System.out.println("Departamento: sin asignar");
        }
    }

}
