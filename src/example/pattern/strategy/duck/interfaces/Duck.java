package example.pattern.strategy.duck.interfaces;

/**
 * 오리 전체의 공통 기능을 감당하는 Duck class
 */
public abstract class Duck {

    // 수영하기
    public void swim() {
        System.out.println("Duck.swim()");
    }

    // 표시
    public abstract void display();

}