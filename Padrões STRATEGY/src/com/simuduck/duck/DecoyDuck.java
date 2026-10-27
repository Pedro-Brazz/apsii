package com.simuduck.duck;

import com.simuduck.behavior.fly.FlyBehavior;
import com.simuduck.behavior.quack.QuackBehavior;

public final class DecoyDuck extends Duck {
    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override public void display() { System.out.println("Sou um pato chamariz!"); }
}
