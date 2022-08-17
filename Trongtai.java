package Ex1;
import static java.lang.Thread.sleep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trongtai extends Thread{
    private List<Horse> list = new ArrayList<>();
    private int length = 0;
    private int step = 0;

    public Trongtai(List<Horse> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            tracking();
            if (isFinishAll()) break;
        }
    }

    public void tracking() {
        for (Horse horse : list) {
            if (horse.isFinish) {
                System.out.println("Con ngua " + horse.getName() + " ve dich voi " + horse.getStep()
                        + " buoc.");
                horse.isFinish = false;
            }
        }
    }

    public boolean isFinishAll() {
        for (Horse horse : list) {
            if (!horse.isFinish) return false;
        }

        return true;
    }
}
