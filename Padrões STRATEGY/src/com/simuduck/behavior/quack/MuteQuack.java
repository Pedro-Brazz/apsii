package com.simuduck.behavior.quack;

public final class MuteQuack implements QuackBehavior {
    @Override public void quack() { System.out.println("<< Silêncio >>"); }
}
