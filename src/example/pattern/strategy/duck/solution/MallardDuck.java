package example.pattern.strategy.duck.solution;

/**
 * 청둥 오리
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWinds();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("(Duck > MallardDuck).display()");
    }

}