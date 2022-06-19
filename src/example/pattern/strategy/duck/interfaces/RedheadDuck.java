package example.pattern.strategy.duck.interfaces;

/**
 * 큰흰죽지
 */
public class RedheadDuck extends Duck implements Quackable, Flyable {

    @Override
    public void quack() {
        System.out.println("(Quackable > RedheadDuck).quack()");
    }

    @Override
    public void fly() {
        System.out.println("(Flyable > RedheadDuck).fly()");
    }

    @Override
    public void display() {
        System.out.println("(Duck > RedheadDuck).display()");
    }

}