package example.pattern.strategy.duck.interfaces;

/**
 * 청둥 오리
 */
public class MallardDuck extends Duck implements Quackable, Flyable {

    @Override
    public void quack() {
        System.out.println("(Quackable > MallardDuck).quack()");
    }

    @Override
    public void fly() {
        System.out.println("(Flyable > MallardDuck).fly()");
    }

    @Override
    public void display() {
        System.out.println("(Duck > MallardDuck).display()");
    }

}