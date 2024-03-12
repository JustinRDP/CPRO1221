package org.example;

public class Dice {

    public Die die1;
    public Die die2;

    // Instantiate two dice
    public Dice() {
        die1 = new Die();
        die2 = new Die();
    }

    public int getDie1Value() {return die1.getValue();} // die1 getter
    public int getDie2Value() {return die2.getValue();} // die2 getter
    public int getSum() {return getDie1Value() + getDie2Value();} // Adds the values of both dice
    public void roll() {die1.roll(); die2.roll();} // Calls the roll function of both dice
    public void printRoll() {

        System.out.println("Die 1: " + getDie1Value());
        System.out.println("Die 2: " + getDie2Value());
        System.out.println("Sum: " + getSum());

        // Switch statement for special cases
        switch (getSum()) {

            case 2:
                System.out.println("Snake eyes!");
                break;
            case 7:
                System.out.println("Craps!");
                break;
            case 12:
                System.out.println("Box cars!");
                break;
        }

    }


}
