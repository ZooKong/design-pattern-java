package example.pattern.strategy.duck.solution;

/**
 * 고무 오리
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("(Duck > RubberDuck).display()");
    }

}