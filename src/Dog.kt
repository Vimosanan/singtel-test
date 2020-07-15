import Animal

class Dog: Animal(true, true, true, false) {
    override fun sing() {
        println("Woof, woof")
    }
}