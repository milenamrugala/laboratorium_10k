class Canvas {
    private var shapes = mutableListOf<Shape>()

    fun add(shape: Shape) {
        shapes.add(shape)
    }

    fun remove(shape: Shape) {
        shapes.remove(shape)
    }

    fun paint() {
        for (shape in shapes) {
            shape.draw()
        }
    }
}