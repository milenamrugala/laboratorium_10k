class Circle(
    private var center: Point,
    private var radius: Line,
    private var color: String,
    private var filled: Boolean
) : Shape(color, filled) {
    override fun draw() {
        println("Draw circle: ${center.getX()}, ${center.getY()} with radius: $radius, color: $color, filled: $filled")
    }

    override fun erase() {
        println("Erase circle: ${center.getX()}, ${center.getY()} with radius: $radius")
    }

    override fun transform() {
        println("Transform circle: ${center.getX()}, ${center.getY()} with radius: $radius")
    }

}
