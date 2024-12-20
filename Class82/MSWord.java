package Class82;

import java.util.Scanner;

public class MSWord implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            if (name.equals("typing")) {
                typing();
            } else if (name.equals("spell")) {
                spellCheck();
            } else {
                autoSave();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void typing() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            System.out.println(input);
        }
    }

    void spellCheck() throws InterruptedException {
        for (;;) {
            System.out.println("Spell checking...");
            Thread.sleep(4000);
        }
    }

    void autoSave() throws InterruptedException {
        for (;;) {
            System.out.println("Saved...");
            Thread.sleep(3000);
        }
    }
}
