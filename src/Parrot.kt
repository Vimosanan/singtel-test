class Parrot(private val neighbor: Animal?) : Animal(true, false, true, true) {
    override fun sing() {
        neighbor?.sing() ?: println("hee hee")
    }
}