import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        World world = new World(800, 600);
        Turtle turtle = new Turtle(world);

        // Drawing 'H'
        turtle.setPenWidth(2);
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(25);
        turtle.turnRight(90);
        turtle.forward(20);
        turtle.turnRight(90);
        turtle.forward(25);
        turtle.backward(50);

        // Space between letters
        turtle.penUp();
        turtle.turnLeft(90);
        turtle.forward(30);
        turtle.turnLeft(90);

        // Drawing 'E'
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(50);
        turtle.turnRight(90);
        turtle.forward(20);
        turtle.turnLeft(90);
        turtle.forward(30);
        turtle.backward(30);
        turtle.turnRight(90);
        turtle.forward(20);
        turtle.turnLeft(90);
        turtle.forward(50);

        // Space between letters
        turtle.penUp();
        turtle.turnRight(180);
        turtle.forward(70);
        turtle.turnLeft(90);

        // Drawing 'L'
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(50);
        turtle.turnRight(90);
        turtle.forward(20);

        // Space between letters
        turtle.penUp();
        turtle.turnLeft(90);
        turtle.forward(50);
        turtle.turnLeft(90);
        turtle.forward(20);
        turtle.turnRight(180);

        // Drawing another 'L'
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(50);
        turtle.turnRight(90);
        turtle.forward(20);

        // Space between letters
        turtle.penUp();
        turtle.turnLeft(90);
        turtle.forward(50);
        turtle.turnLeft(90);
        turtle.forward(20);
        turtle.turnRight(180);

        // Drawing 'O'
        turtle.penDown();
        for(int i = 0; i < 36; i++) {
            turtle.forward(2);
            turtle.turnRight(10);
        }

        // Space between words
        turtle.penUp();
        turtle.forward(50);
        turtle.turnLeft(90);
        turtle.forward(100);
        turtle.turnLeft(90);

        // Drawing 'W'
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight(150);
        turtle.forward(50);
        turtle.turnLeft(150);
        turtle.forward(50);
        turtle.turnRight(150);
        turtle.forward(50);

        // Space between letters
        turtle.penUp();
        turtle.turnLeft(60);
        turtle.forward(30);
        turtle.turnLeft(90);

        // Drawing 'O'
        turtle.penDown();
        for(int i = 0; i < 36; i++) {
            turtle.forward(2);
            turtle.turnRight(10);
        }

        // Space between letters
        turtle.penUp();
        turtle.forward(40);
        turtle.turnLeft(90);
        turtle.forward(10);
        turtle.turnLeft(90);

        // Drawing 'R'
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(20);
        turtle.turnRight(90);
        turtle.forward(25);
        turtle.turnRight(90);
        turtle.forward(20);
        turtle.turnLeft(135);
        turtle.forward(35);
        turtle.turnLeft(45);
        turtle.forward(15);

        // Space between letters
        turtle.penUp();
        turtle.turnRight(90);
        turtle.forward(40);
        turtle.turnRight(90);
        turtle.forward(60);
        turtle.turnRight(180);

        // Drawing 'L'
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(50);
        turtle.turnRight(90);
        turtle.forward(20);

        // Space between letters
        turtle.penUp();
        turtle.turnLeft(90);
        turtle.forward(50);
        turtle.turnLeft(90);
        turtle.forward(20);
        turtle.turnRight(180);

        // Drawing 'D'
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(20);
        for(int i = 0; i < 18; i++) {
            turtle.forward(2);
            turtle.turnRight(10);
        }
    }
}
