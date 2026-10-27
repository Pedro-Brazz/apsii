package com.simuduck.duck;

import java.util.Objects;
import com.simuduck.behavior.fly.FlyBehavior;
import com.simuduck.behavior.quack.QuackBehavior;

/** Contexto do Strategy: delega os algoritmos a comportamentos substituíveis. */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    protected Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    public final void performFly() { flyBehavior.fly(); }
    public final void performQuack() { quackBehavior.quack(); }

    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = Objects.requireNonNull(flyBehavior, "FlyBehavior não pode ser nulo");
    }

    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = Objects.requireNonNull(quackBehavior, "QuackBehavior não pode ser nulo");
    }

    public void swim() { System.out.println("Todos os patos flutuam!"); }
    public abstract void display();
}
