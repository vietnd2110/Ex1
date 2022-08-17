package Ex1;

import java.util.Random;

public abstract class BaseHorse implements Runnable, Run {

    @Override
    public void run() {
        int step = getStep();
        chay(step);
    }

    int getStep() {
        // TODO : thự hiên logic random step
        Horse horse = new Horse();
        while (horse.getLength() < 100){
            Random random = new Random();
            int length = random.nextInt(10) +1;
            horse.setLength(horse.getLength() + length);
            horse.setStep(horse.getStep()+1);
            if(horse.getLength() >100)
                horse.setLength(horse.getLength() - 100);
        }
        return horse.getStep();
    }
}
