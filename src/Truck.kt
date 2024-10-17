import java.awt.Color

class Truck (
    color: Color,
    gosNomer:Int,
    model:String,
    var destination: destination
):Car(color, gosNomer, model) {

    override fun poBibikat() {
        println("ОЧЕНЬ громкий звук")
    }

}