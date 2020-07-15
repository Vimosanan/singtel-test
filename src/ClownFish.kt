import enums.COLOUR
import enums.SIZE

class ClownFish(size:SIZE, colour: COLOUR): Fish(size, colour) {
    fun joke(){
        println("I'm joking")
    }
}