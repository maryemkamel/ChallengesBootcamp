package Day7.Challenge3;

import java.util.ArrayList;
import java.util.List;

class DrawingBoard {
    private List<Drawable> shapes;

    public DrawingBoard() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Drawable shape) {
        shapes.add(shape);
    }

    public void displayDrawing() {
        for (Drawable shape : shapes) {
            if (shape instanceof Shape) {
                ((Shape) shape).displayShapeType();
            }
            shape.drawShape();
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        drawingBoard.addShape(new Triangle());
        drawingBoard.addShape(new Square());
        drawingBoard.displayDrawing();
    }
}

