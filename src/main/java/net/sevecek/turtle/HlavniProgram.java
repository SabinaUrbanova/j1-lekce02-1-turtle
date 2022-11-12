package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {



    private static void drawHouse(Turtle zofka) {

        for (int i=0; i<4; i++) {
            zofka.move(100);
            zofka.turnRight(90);

        }

        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);


    }

    private static void drawLegs(Turtle zofka) {
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
    }

    private static void drawPig(Turtle zofka) {
        zofka.turnLeft(90);
        drawHouse(zofka);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(45);
        zofka.penDown();
        drawLegs(zofka);
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(135);
        drawLegs(zofka);



    }
    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        for (int i=0; i<5; i++) {
            drawHouse(zofka);
            zofka.penUp();
            zofka.turnRight(30);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.penDown();


        //drawPig(zofka);


        }

    }
}
