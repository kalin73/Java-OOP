package behavioral.templetePattern;

public class Main {

    public static void main(String[] args) {
        AbstractClass a = new ChildOne();
        a.templateMethod();

        AbstractClass b = new ChildSecond();
        b.templateMethod();

    }
}
