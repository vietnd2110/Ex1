package Ex1;

import java.util.List;

public class Racing {

    private List<Horse> horses;

    public void start() {
        horses = HorseFactory.createHorse();
        for (Horse horse : horses) {
            (new Thread(horse)).start();
        }

        Trongtai trongtai = new Trongtai(horses);
        trongtai.start();
        // tracking xem con ngựa nao vef dich truoc
    }
}

// design pattern factory
// abstract, interface, kế thừa, đa hình
// multi thread
// nguyên lý SOLID ( single responsibility)
