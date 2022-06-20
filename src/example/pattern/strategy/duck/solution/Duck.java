package example.pattern.strategy.duck.solution;

/**
 * 오리 전체의 공통 기능을 감당하는 Duck class
 */
public abstract class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    // 수영하기
    public void swim() {
        System.out.println("Duck.swim()");
    }

    // 표시
    public abstract void display();

}