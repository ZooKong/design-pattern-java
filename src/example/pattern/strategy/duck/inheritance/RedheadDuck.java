package example.pattern.strategy.duck.inheritance;

/**
 * 큰흰죽지
 */
public class RedheadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("(Duck > RedheadDuck).display()");
    }

}