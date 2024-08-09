package composite;

public class Line implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing a line with color: " + fillColor);
    }
}
