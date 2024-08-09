package behavioral.templetePattern;

public class ChildOne extends AbstractClass {
    @Override
    public void getInfo() {
        System.out.println("Info from: " + this.getClass().getSimpleName());
    }

    @Override
    public void writeHello() {
        System.out.println("Hello from: " + this.getClass().getSimpleName());
    }
}
