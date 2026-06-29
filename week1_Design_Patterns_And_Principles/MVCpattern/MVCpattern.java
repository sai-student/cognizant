package MVCpattern;

class Student {

    private String name;
    private int id;
    private String grade;

    public Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class StudentView {

    public void displayStudentDetails(Student student) {

        System.out.println("Student Details");
        System.out.println("Name  : " + student.getName());
        System.out.println("ID    : " + student.getId());
        System.out.println("Grade : " + student.getGrade());
    }
}

class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudentName(String name) {
        model.setName(name);
    }

    public void updateStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public void updateView() {
        view.displayStudentDetails(model);
    }
}

public class MVCpattern {

    public static void main(String[] args) {

        Student student = new Student("Sai", 101, "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        controller.updateStudentName("Tarun");
        controller.updateStudentGrade("A+");

        System.out.println();

        controller.updateView();
    }
}
