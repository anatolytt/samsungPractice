import java.awt.Color

class Cabriolet(color:Color,
                gosNomer:Int,
                model:String,
                private var roofState:Boolean
): Car(color, gosNomer, model){
    fun changeRoofState () {
        roofState = !roofState
        """
        if (roofState)
            println("Крыша открыта")
        else
            println("Крыша закрыта")
           """
    }

    override fun poBibikat() {
        println("Тихий звук")
    }
}