package example.pattern.strategy.duck.interfaces;

/**
 * 고무 오리
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("(Duck > RubberDuck).display()");
    }

}