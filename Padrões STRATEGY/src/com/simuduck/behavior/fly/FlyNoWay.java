package com.simuduck.behavior.fly;

public final class FlyNoWay implements FlyBehavior {
    @Override public void fly() { System.out.println("Eu não consigo voar!"); }
}
