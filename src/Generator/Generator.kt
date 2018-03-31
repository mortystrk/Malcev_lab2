package Generator

class Generator {

    companion object {
        fun gerRandomValue(): Double {
            return Math.random()
        }

        fun entropy(events: ArrayList<Double>): Double {
            return events.sumByDouble { -(it * (Math.log(it) / Math.log(2.0))) }
        }
    }

    class Bernoulli {

        companion object {
            private fun generate(p: Double, random: Double): Double {

                return if (random < 1.0 - p)
                    0.0
                else
                    1.0
            }

            fun generate(p: Double): Double {
                return Generator.Bernoulli.Companion.generate(p, Generator.gerRandomValue())
            }
        }
    }
}