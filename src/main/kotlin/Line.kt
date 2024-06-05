class Line(
    private var start: Point,
    private var end: Point,
    private var color: String,
    private var filled: Boolean
) : Shape(color, filled) {
    override fun draw() {
        println("Draw line: (${start.getX()}, ${start.getY()}) to (${end.getX()}, ${end.getY()}, color: $color, filled: $filled")
    }

    override fun erase() {
        println("Erase line: (${start.getX()}, ${start.getY()}) to (${end.getX()}, ${end.getY()})")
    }

    override fun transform() {
        println("Transform line: (${start.getX()}, ${start.getY()}) to (${end.getX()}, ${end.getY()})")
    }

    override fun toString(): String {
        return "$start, $end"
    }

}