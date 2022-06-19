package example.pattern.strategy.duck.inheritance;

/**
 * 오리 전체의 공통 기능을 감당하는 Duck class
 */
public abstract class Duck {

    // 꽥꽥!
    public void quack() {
        System.out.println("Duck.quack()");
    }

    // 수영하기
    public void swim() {
        System.out.println("Duck.swim()");
    }

    /**
     * 추가 요구사항 발생, 오리가 하늘을 날아야 한다.
     */
    // 날기
    public void fly() {
        System.out.println("Duck.fly()");
    }

    // 표시
    public abstract void display();

}