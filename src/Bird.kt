open class Bird(
    isWalk: Boolean,
    isSwim: Boolean,
    isSing: Boolean,
    isFly: Boolean): Animal(isWalk, isSwim, isSing, isFly) {

    open fun  fly() {
        println("I am flying")
    }

    override fun sing() {
        println("I am singing")
    }
}