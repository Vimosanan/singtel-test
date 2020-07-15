import enums.COLOUR
import enums.SIZE

class Shark(size: SIZE, colour: COLOUR) : Fish(size, colour){
    fun eat(fish: Fish){
        println("eating $fish")
    }
}