class Chicken(private val isMale: Boolean): Bird(true, true, true, false) {
    override fun sing() {
        if(isMale) {
            println("Cock-a-doodle-doo")
        } else {
            println("Cluck, cluck")
        }
    }

    override fun fly() {
        // unsupported method
    }
}