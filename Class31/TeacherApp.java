package Class31;

public class TeacherApp {
    public static void main(String[] args) {
        JavaTrainer javaTrainer = new JavaTrainer();
        SQLTrainer sqlTrainer = new SQLTrainer();
        SoftSkillTrainer softSkillTrainer = new SoftSkillTrainer();

        javaTrainer.markAttendance();
        javaTrainer.teach();

        sqlTrainer.markAttendance();
        sqlTrainer.teach();

        softSkillTrainer.markAttendance();
        softSkillTrainer.teach();
    }
}
