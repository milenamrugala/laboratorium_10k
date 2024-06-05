class Triangle(
    private var first: Line,
    private var second: Line,
    private var third: Line,
    private var color: String,
    private var filled: Boolean
) : Shape(color, filled){
    override fun draw() {
        println("Draw triangle - first line: $first, first line: $second and second line $third, color: $color, filled: $filled")
    }

    override fun erase() {
        println("Erase triangle - first line: $first, first line: $second and second line $third")
    }

    override fun transform() {
        println("Transform triangle - first line: $first, first line: $second and second line $third")
    }
}