package Class35;

public class TeacherApp {
    public static void main(String[] args) {
//        Teacher teacher;
//
//        teacher = new PhysicsTeacher();
//        teacher.markaAttendance();
//        teacher.teach();
//        teacher.doExperiment();
//        System.out.println();
//
//        teacher = new ChemistryTeacher();
//        teacher.markaAttendance();
//        teacher.teach();
//        teacher.doExperiment();
//        System.out.println();
//
//        teacher = new BiologyTeacher();
//        teacher.markaAttendance();
//        teacher.teach();
//        teacher.doExperiment();

        College college = new College();
        college.acceptTeacher(new PhysicsTeacher());
        System.out.println();
        college.acceptTeacher(new ChemistryTeacher());
        System.out.println();
        college.acceptTeacher(new BiologyTeacher());
    }
}
