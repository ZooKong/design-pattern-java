package example.pattern.strategy.duck.solution;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("(QuackBehavior > Squeak).quack()");
    }

}