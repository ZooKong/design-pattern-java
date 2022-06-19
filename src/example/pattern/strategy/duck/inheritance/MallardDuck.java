package example.pattern.strategy.duck.inheritance;

/**
 * 청둥 오리
 */
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("(Duck > MallardDuck).display()");
    }

}