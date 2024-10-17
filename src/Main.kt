import java.awt.Color
import java.util.*

fun main() {
    var car = Car(Color.BLUE, 52, "Lada")  // конструктор
    var cabriolet = Cabriolet(Color.PINK, 9092, "BMW", false)
    var car2 = Car(gosNomer = 12, color = Color.DARK_GRAY, model = "BMW")
    var car3 = Car(gosNomer = 12, color = Color.DARK_GRAY, model = "BMW")
    var truck = Truck(gosNomer = 123, color = Color.DARK_GRAY, model = "GAZ", destination = destination.East)

    car.poBibikat()
    Car.increase()
    println(Car.count)
    cabriolet.changeRoofState()
    cabriolet.poBibikat()
    car2.openBaggage()
    car2.poBibikat()
    println(Car.count)
    car3.poBibikat()
    println(Car.count)

    truck.poBibikat()

    println(car2)

    var circle = Circle(r=15.0)
    var triangle = Triangle(h=5.5, a=12.1)
    var rectangle = Rectangle(width=0.5, height=99.34)


    var dest = destination.East
    when(dest) {
        destination.East -> {

        }
        destination.North -> {

        }

        destination.South -> {

        }
        destination.West -> {

        }
    }

    val arrayCar = arrayOf(Car(Color.BLUE, 2, "Lada"), Car(Color.BLUE, 522, "Lada"), Car(Color.BLUE, 52, "Lada"), Car(Color.BLUE, 23902, "Lada"))
    println(arrayCar.contentToString())
    Arrays.sort(arrayCar)
    println(arrayCar.contentToString())

    val customComparator = CustomComparator()
    Arrays.sort(arrayCar, customComparator)
    println(arrayCar.contentToString())
}
