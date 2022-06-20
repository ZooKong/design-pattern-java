package example.pattern.strategy.duck.solution;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("(QuackBehavior > Quack).quack()");
    }

}