package Day7.Challenge3;

abstract class Shape implements Drawable {
    private String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public void displayShapeType() {
        System.out.println("Shape Type: " + shapeType);
    }
}
