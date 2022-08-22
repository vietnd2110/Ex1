package Ex1;

import static java.lang.Thread.sleep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trongtai extends Thread {
    private List<Horse> list;

    public Trongtai(List<Horse> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            tracking();
            if (isFinishAll()) {
                for (Horse horse : list) {
                    System.out.println("Con ngua " + horse.getNameHorse() + " ve dich voi " + horse.getStep()
                            + " buoc");
                }
                break;
            }
        }
    }

    public void tracking() {
        for (Horse horse : list) {
            if (horse.isFinish && horse.getLength() == 100) {
                horse.setLength(0);
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
