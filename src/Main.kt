import Generator.Generator
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

fun calculateRelativeFrequency(events: ArrayList<Double>): ArrayList<Double> {
    var relativeFrequencies = arrayListOf<Double>()
    val uniqueValues = HashSet(events)

    uniqueValues.mapTo(relativeFrequencies) { Collections.frequency(events, it).toDouble() / events.size.toDouble() }

    return relativeFrequencies
}

fun main(args: Array<String>) {
    var events = arrayListOf<Double>()
    val n = 1000
    val p = 0.25

    for (i in 0 until n)
        events.add(Generator.Bernoulli.generate(p))

    val relativeFrequencies = calculateRelativeFrequency(events)
    val entropy = Generator.entropy(relativeFrequencies)
    println(entropy)

}