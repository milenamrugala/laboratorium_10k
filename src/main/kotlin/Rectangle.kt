class Rectangle(
    private var point: Point,
    private var width: Line,
    private var height: Line,
    private var color: String,
    private var filled: Boolean
) : Shape(color, filled){
    override fun draw() {
        println("Draw rectangle: $point, length: $width and height $height, color: $color, filled: $filled")

    }

    override fun erase() {
        println("Erase rectangle: $point, length: $width and height $height")

    }

    override fun transform() {
        println("Transform rectangle: $point, length: $width and height $height")

    }
}