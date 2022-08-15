package Ex1;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Horse extends Thread{
    private String nameH;
    private int length = 0;
    private int step = 0;

    public Horse(String nameH) {
        this.nameH = nameH;
    }

    public void run() {
        try {
	//tạm ngưng một thread cho một khoảng thời gian nhất định
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (length != 100) {
            Random randomNumber = new Random();
            //trả về 1 số bất kì với kiểu int
            length += randomNumber.nextInt(10) + 1;
            step += 1;
            System.out.println(nameH + ": " + length);
            if (length > 100) {
                length -= 100;
            }
        }
        System.out.println("Con ngựa " + nameH + " về đích với " + step
                + " bước ");
    }

    public int getLength() {
        return this.length;
    }

    public int getStep() {
        return step;
    }

    public String getNameH() {
        return nameH;
    }
}
