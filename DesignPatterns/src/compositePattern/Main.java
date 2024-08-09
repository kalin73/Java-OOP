package compositePattern;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape line = new Line();
        Drawing drawing = new Drawing();

        drawing.add(rectangle);
        drawing.add(line);

        drawing.draw("Blue");
        drawing.clear();

        drawing.add(rectangle);
        drawing.add(line);

        drawing.draw("Green");
        drawing.draw("Red");
    }
}
