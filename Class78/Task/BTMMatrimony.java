package Class78.Task;

public class BTMMatrimony {

    void initiateRegistration() {
        MatrimonyUser matrimonyUser = new MatrimonyUser();
        try {
            matrimonyUser.acceptData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
