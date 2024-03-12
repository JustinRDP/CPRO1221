package org.example;

public class Die {

    public int value; // value of die

    public Die() { value = 0;} // Die constructor
    public void roll() {value = (int) (Math.random() * 6) + 1;} // Roll method
    public int getValue() {return value;} // Getter


}
