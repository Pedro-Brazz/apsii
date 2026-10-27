package com.simuduck;

import com.simuduck.behavior.fly.*;
import com.simuduck.behavior.quack.*;
import com.simuduck.duck.*;

/** Ponto de composição: cria estratégias concretas e injeta nos patos. */
public final class Main {
    public static void main(String[] args) {
        FlyBehavior flyWithWings = new FlyWithWings();
        FlyBehavior flyNoWay = new FlyNoWay();
        FlyBehavior flyRocket = new FlyRocketPowered();
        QuackBehavior normalQuack = new Quack();
        QuackBehavior squeak = new Squeak();
        QuackBehavior muteQuack = new MuteQuack();

        Duck mallard = new MallardDuck(flyWithWings, normalQuack);
        Duck redhead = new RedheadDuck(flyWithWings, normalQuack);
        Duck rubber = new RubberDuck(flyNoWay, squeak);
        Duck decoy = new DecoyDuck(flyNoWay, muteQuack);
        Duck model = new ModelDuck(flyNoWay, normalQuack);

        executar("PATO REAL", mallard);
        mallard.swim();
        executar("PATO CABEÇA VERMELHA", redhead);
        executar("PATO DE BORRACHA", rubber);
        executar("PATO CHAMARIZ", decoy);
        executar("PATO MODELO", model);

        System.out.println("\n=== ALTERANDO ESTRATÉGIAS ===");
        model.setFlyBehavior(flyRocket);
        model.performFly();
        model.setQuackBehavior(muteQuack);
        model.performQuack();
        model.setFlyBehavior(flyNoWay);
        model.performFly();
    }

    private static void executar(String titulo, Duck pato) {
        System.out.println("\n=== " + titulo + " ===");
        pato.display();
        pato.performFly();
        pato.performQuack();
    }
}
