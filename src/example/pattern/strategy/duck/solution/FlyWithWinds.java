package example.pattern.strategy.duck.solution;

public class FlyWithWinds implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("(FlyBehavior > FlyWithWinds).fly()");
    }

}