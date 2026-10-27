package com.simuduck.duck;

import com.simuduck.behavior.fly.FlyBehavior;
import com.simuduck.behavior.quack.QuackBehavior;

public final class ModelDuck extends Duck {
    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override public void display() { System.out.println("Sou um pato modelo!"); }
}
