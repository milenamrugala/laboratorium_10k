fun main() {
    val canvas = Canvas()

    val point1 = Point(1.0,1.0,"green",false)
    val point2 = Point(5.0,5.0,"green",false)
    val line = Line(point1, point2, "green",false)
    val circle = Circle(point1,line,"yellow",true)

    // rectangle
    val point3 = Point(0.0,0.0,"green",false)
    val width = Line(Point(0.0, 0.0,"green", false), Point(4.0, 0.0, "green",false),"green",false)
    val height = Line(Point(0.0, 0.0,"green",false), Point(0.0, 2.0,"green",false),"green",false)
    val rectangle = Rectangle(point3, width, height,"orange",true)

    // triangle
    val side1 = Line(Point(0.0, 0.0,"green",false), Point(3.0, 0.0,"green",false),"green",false)
    val side2 = Line(Point(3.0, 0.0,"green",false), Point(1.5, 2.0,"green",false),"green",false)
    val side3 = Line(Point(1.5, 2.0,"green",false), Point(0.0, 0.0,"green",false),"green",false)
    val triangle = Triangle(side1, side2, side3,"pink",true)

    canvas.add(circle)
    canvas.add(triangle)
    canvas.add(rectangle)

    canvas.paint()

}