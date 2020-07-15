import enums.STAGE

class Butterfly(private val stage: STAGE) : Bird(false, false, false, stage == STAGE.BUTTERFLY) {
    override fun sing() {
        // no sound
    }

    override fun fly() {
        if (stage == STAGE.CATERPILLAR) {
            // can't fly
        } else {
            super.fly()
        }
    }
}