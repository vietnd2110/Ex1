package Ex1;

public class Horse extends BaseHorse {
    // thuộc tính của nguwa
    private String name;
    private int step;
    private int length;

    public boolean isFinish;

    public Horse(String name, int step, int length) {
        this.name = name;
        this.step = step;
        this.length = length;
    }

    @Override
    public void run() {
        while (true) {
            length += getStepLength();
            step++;
            System.out.println(name + " length " + length + " step " + step);
            if (length > 100) length -= 100;
            if (length == 100) {
                isFinish = true;
                break;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Horse() {
    }

    public Horse(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
