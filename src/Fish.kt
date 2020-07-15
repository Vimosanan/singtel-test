import enums.COLOUR
import enums.SIZE

open class Fish(val size: SIZE,
                val colour: COLOUR): Animal() {
    override fun sing() {
        //unsupported method
    }

    override fun walk() {
        //unsupported method
    }
}