class Parrot(private val neighbor: Animal?) : Animal() {
    override fun sing() {
        neighbor?.sing() ?: println("hee hee")
    }
}