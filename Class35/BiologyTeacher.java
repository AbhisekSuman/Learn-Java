package Class35;

public class BiologyTeacher extends Teacher{

    @Override
    void markaAttendance() {
        System.out.println("Biology teacher is marking attendance.");
    }

    @Override
    void teach() {
        System.out.println("Biology Teacher is teaching Biology.");
    }

    @Override
    void doExperiment() {
        System.out.println("Biology teacher is doing Disec Experiment.");
    }
}
