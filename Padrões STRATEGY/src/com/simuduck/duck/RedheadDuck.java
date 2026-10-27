package com.simuduck.duck;

import com.simuduck.behavior.fly.FlyBehavior;
import com.simuduck.behavior.quack.QuackBehavior;

public final class RedheadDuck extends Duck {
    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override public void display() { System.out.println("Sou um pato de cabeça vermelha!"); }
}
