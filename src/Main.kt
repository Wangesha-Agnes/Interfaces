//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val bus = Bus()
    bus.calculateFare(3.5)
    bus.bookTicket("person")
    bus.loadGoods()



}

abstract class Transport() {
    abstract fun calculateFare(distance: Double):Double

    abstract fun bookTicket(passengerName: String)

    fun loadGoods(){
        val goods = listOf("Bag", "Chair", "Cartoon", "Sack")
        goods.forEach{ println("loading $it...") }
    }
}
class Bus(): Transport(){
    override fun calculateFare(distance: Double): Double {
        return distance * 30
    }

    override fun bookTicket(passengerName: String) {
        println("booking $passengerName")
    }
}

