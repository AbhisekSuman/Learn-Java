package Class35;

public class ChemistryTeacher extends Teacher{
    @Override
    void markaAttendance() {
        System.out.println("Chemistry teacher is marking attendance.");
    }

    @Override
    void teach() {
        System.out.println("Chemistry teacher is teaching chemistry.");
    }

    @Override
    void doExperiment() {
        System.out.println("Chemistry teacher is doing chemical experiment.");
    }
}
