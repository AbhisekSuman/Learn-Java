package Class32;

public class ChemistryTeacher extends Teacher{
    @Override
    void teach() {
        System.out.println("Chemistry teacher is marking attendance");
    }
    void doingExperiment() {
        System.out.println("Teacher is doing Chemistry Experiment");
    }
}
