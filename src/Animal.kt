open class Animal(
    val isWalk: Boolean = false,
    val isSwim: Boolean = false,
    val isSing: Boolean = false,
    val isFly: Boolean = false
) {
    open fun walk() {
        if (isWalk)
            println("I am walking");
    }

    open fun swim() {
        if (isSwim)
            println("I am swimming")
    }

    open fun sing() {
        if (isSing)
            println("I am singing")
    }
}