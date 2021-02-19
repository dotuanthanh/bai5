public class Circle {
    public Circle() {

    }
    public void Circle(double r){
        this.radius=r;
    }

    private String color = "red";
    private double radius = 1.0;
    public double area;

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double setRadius() {
        return this.radius;
    }
    public double getArea(){
        return this.area= this.radius * this.radius *3.14;
    }
    public void display(){
        System.out.println("radius "+this.radius +"  "+ "color  "+this.color+"  "+"area"+this.area);
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("blue");
        circle.setRadius(5);
        circle.getArea();
        circle.display();
    }

}
