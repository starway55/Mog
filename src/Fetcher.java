import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;


public class Fetcher extends Robot{

    private int wait = 600;


    public Fetcher() throws AWTException{

    }

    public void fetch(){

        wait =  wait + (int)Math.random() * 800;

        delay(3000);

        this.mouseMove(836, 560);
        delay(250);
        this.mousePress(InputEvent.BUTTON3_MASK);
        delay(200);
        this.mouseRelease( InputEvent.BUTTON3_MASK );
        delay(500);
//        this.mousePress(InputEvent.BUTTON3_MASK);
//        delay(200);
//        this.mouseRelease( InputEvent.BUTTON3_MASK );
//        delay(200);




        this.mouseMove(836, 590);
        delay(1500);
        this.mousePress(InputEvent.BUTTON1_MASK);
        delay(100);
        this.mouseRelease( InputEvent.BUTTON1_MASK );
        delay(100);

        this.mouseMove(836, 530);
        delay(250);
        this.mousePress(InputEvent.BUTTON3_MASK);
        delay(200);
        this.mouseRelease( InputEvent.BUTTON3_MASK );
        delay(500);

        this.mouseMove(836, 590);
        delay(1500);
        this.mousePress(InputEvent.BUTTON1_MASK);
        delay(100);
        this.mouseRelease( InputEvent.BUTTON1_MASK );
        delay(100);




        this.mouseMove(1300, 800);
        delay(wait);

        this.mousePress(InputEvent.BUTTON1_MASK);
        delay(800);
        this.mouseRelease(InputEvent.BUTTON1_MASK);
        delay(2000);


//        int x = 100;
//        int y = 100;
//        int width = 1200;
//        int height = 800;

//        Rectangle screenRect = new Rectangle(x, y, width, height);
//        BufferedImage image = this.createScreenCapture(screenRect);
//
//        int i = 0;
//        int j = 0;
//        for(i = 0; i < image.getWidth(); i++){
//            for(j = 0; j < image.getHeight();j++){
//                System.out.println("i: " + i + " j: " + j + " rgb: " + image.getRGB(i, j));
//            }
//        }




    }

    public void infiniteFetch(){
        while(true){
            fetch();
        }
    }

    public void delay(int delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
