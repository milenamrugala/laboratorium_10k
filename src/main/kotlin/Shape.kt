abstract class Shape(
    private var color: String,
    private var filled: Boolean
) {
    abstract fun draw()
    abstract fun erase()
    abstract fun transform()

    fun getColor(): String {
        return color
    }

    fun isFilled(): Boolean {
        return filled
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun setFilled(filled: Boolean) {
        this.filled = filled
    }
}