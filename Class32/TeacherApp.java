package Class32;

public class TeacherApp {
    public static void main(String[] args) {
        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        BiologyTeacher biologyTeacher = new BiologyTeacher();

        physicsTeacher.teach();
        physicsTeacher.doingExperiment();

        chemistryTeacher.teach();
        chemistryTeacher.doingExperiment();

        biologyTeacher.teach();
        biologyTeacher.doingExperiment();

    }
}
