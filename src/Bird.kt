open class Bird: Animal() {

    open fun  fly() {
        println("I am flying")
    }

    override fun sing() {
        println("I am singing")
    }
}