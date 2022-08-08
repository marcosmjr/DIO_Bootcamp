package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Testes relacionados as Design Patter Singleton:
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
//        lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        SingletonLazy lazy1 = SingletonLazy.getInstancia();
//        System.out.println(lazy1);
//
//        System.out.println("**************************************************");
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        SingletonEager eager1 = SingletonEager.getInstancia();
//        System.out.println(eager1);
//
//        System.out.println("**************************************************");
//
//        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
//        System.out.println(holder);
//        holder = SingletonLazyHolder.getInstancia();
//        System.out.println(holder);
//        SingletonLazyHolder holder1 = SingletonLazyHolder.getInstancia();
//        System.out.println(holder1);

        System.out.println("**************************************************");
        //Strategy
//        Comportamento normal = new ComportamentoNormal();
//        Comportamento defensivo = new ComportamentoDefensivo();
//        Comportamento agressivo = new ComportamentoAgressivo();
//
//        Robo robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(defensivo);
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(agressivo);
//        robo.mover();
//        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");

    }
}
