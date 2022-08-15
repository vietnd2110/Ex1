package Ex1;

import Ex1.Horse;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Horse> listHorses = new ArrayList<Horse>();
        for (int i = 1; i <= 10; i++) {
            listHorses.add(new Horse("H" + i));
        }
        for (Horse n : listHorses) {
            n.start();
        }
    }
}
