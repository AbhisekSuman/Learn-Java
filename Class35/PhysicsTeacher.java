package Class35;

public class PhysicsTeacher extends Teacher{
    @Override
    void markaAttendance() {
        System.out.println("Physics Teacher is marking attendance.");
    }

    @Override
    void teach() {
        System.out.println("Physics Teacher is teaching Physics");
    }

    @Override
    void doExperiment() {
        System.out.println("Physics Teacher is doing laws Experiment");
    }
}
