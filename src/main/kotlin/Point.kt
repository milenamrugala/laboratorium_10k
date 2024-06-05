class Point(
    private var x: Double,
    private var y: Double,
    private var color: String,
    private var filled: Boolean
) : Shape(color, filled) {

    override fun draw() {
        println("Draw: ($x, $y), color: $color, filled: $filled")
    }

    override fun erase() {
        println("Erase: ($x, $y)")
    }

    override fun transform() {
        println("Transform: ($x, $y)")
    }

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun setX(x: Double) {
        this.x = x
    }

    fun setY(y: Double) {
        this.y = y
    }

    override fun toString(): String {
        return "$x, $y"
    }


}