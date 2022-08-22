package Ex1;

import java.util.Random;

public abstract class BaseHorse extends Thread implements Run {
    int getStepLength() {
        // TODO : thự hiên logic random step
        return (new Random()).nextInt(10) + 1;
    }
}
