package example.pattern.strategy.duck.inheritance;

/**
 * 고무 오리
 */
public class RubberDuck extends Duck {

    @Override
    public void fly() {
        // 아무것도 하지 않는다..
    }

    @Override
    public void display() {
        System.out.println("(Duck > RubberDuck).display()");
    }

}