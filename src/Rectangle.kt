class Rectangle (
    private var width:Double,
    private var height:Double
) : Shape() {
      override fun area (): Double {
        return width*height
    }
}