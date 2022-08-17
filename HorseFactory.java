package Ex1;

import java.util.ArrayList;
import java.util.List;

public class HorseFactory {
    public static List<Horse> createHorse() {
        List<Horse> listHorses = new ArrayList<Horse>();
        for (int i = 1; i <= 10; i++) {
            listHorses.add(new Horse("H" + i));
        }
        return listHorses;
    }
}
