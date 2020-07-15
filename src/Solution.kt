import enums.COLOUR
import enums.SIZE
import enums.STAGE

class Solution {
    fun main() {
        val bird = Bird(true, true, true, true)
        bird.walk()
        bird.fly()
        bird.sing()

        val dolphins = Dolhpin()
        dolphins.swim()

        val animals = listOf<Animal>(
            Bird(true, true, true, true),
            Duck(),
            Chicken(false),
            Chicken(true),
            Parrot(null),
            Fish(null, null),
            Shark(SIZE.LARGE, COLOUR.GREY),
            ClownFish(SIZE.SMALL, COLOUR.ORANGE),
            Dolhpin(),
            Dog (),
            Butterfly(STAGE.CATERPILLAR),
            Cat()
        )

        println(animals.filter { it.isSwim }.count())
    }
}

fun main() {
    Solution().main()
}