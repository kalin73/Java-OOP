package behavioral.templetePattern;

public abstract class AbstractClass {

    public void doSomething() {
        System.out.println("doSomething");
    }

    public abstract void getInfo();

    public abstract void writeHello();

    public void templateMethod() {
        this.doSomething();
        this.getInfo();
        this.writeHello();

    }
}
