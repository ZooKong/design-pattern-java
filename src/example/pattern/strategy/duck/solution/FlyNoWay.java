package example.pattern.strategy.duck.solution;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("(FlyBehavior > FlyNoWay).fly()");
    }

}