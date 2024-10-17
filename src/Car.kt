import java.awt.Color

open class Car (
    private var color:Color,
    var gosNomer:Int,
    private var model:String
) : IFly, Iswim, Comparable<Car> {
    companion object {
        var count:Int = 0
        fun increase () {
            count ++
        }
    }



    fun openBaggage() {
        color = Color.RED
        println("Багажник откыт")
    }
    open fun poBibikat() {
        println("ГРОМКИЙ ЗВУК")
        increase()
    }

    override fun fly() {

    }

    override fun swim() {

    }

    override fun compareTo(other: Car): Int {
        if (gosNomer==other.gosNomer) {
            return 0
        } else if (gosNomer>other.gosNomer) {
            return 1
        } else {
            return -1
        }

    }

    override fun toString(): String {
        return "Car(color=$color, gosNomer=$gosNomer, model='$model')"
    }


}

