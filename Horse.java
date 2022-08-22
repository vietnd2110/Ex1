package Ex1;

public class Horse extends BaseHorse {
    // thuộc tính của nguwa
    private String name;
    private int step = 0;
    private int length = 0;

    public boolean isFinish = false;

    public Horse(String name, int step, int length) {
        this.name = name;
        this.step = step;
        this.length = length;
//        this.isFinish = false;
    }

    @Override
    public void run() {
        while (!isFinish) {
            System.out.println(name + " length " + length + " step " + step);
            // viet hàm check về đích hay chưa if (isFinish()) { break;)
            check();
            // tách thành sleep method
            sleep();
        }
    }

    private void check(){
        if (length > 100) length -= 100;
        if (length == 100) {
            isFinish = true;
            return;
        }
        length += getStepLength();
        step++;
    }

    private void sleep() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Horse() {
    }

    public Horse(String s) {
        this.name = s;
        this.isFinish = false;
    }

    public String getNameHorse() {
        return name;
    }

    public void setNameHorse(String name) {
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
