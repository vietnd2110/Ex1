package Ex1;

public class Horse extends BaseHorse {
    // thuộc tính của nguwa
    private String name;
    private int step;
    private int length;

    public Horse(String name, int step, int length) {
        this.name = name;
        this.step = step;
        this.length = length;
    }

    public Horse() {
    }

    public Horse(String s) {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
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
