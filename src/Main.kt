//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val bus = Bus()
    bus.calculateFare(3.5)
    bus.bookTicket("person")
    bus.loadGoods()

    val samsung= SamsungTv()
    val hisense = HisenseTV()
    samsung.switchOn()
    hisense.switchOn()
    hisense.adjustVolume(6)
    samsung.adjustVolume(8)



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


interface Television{
    fun adjustVolume(volume: Int)

    fun switchChannel(channel: String)

    fun switchOn()

    fun swithOff()
}

class SamsungTv(): Television{
    var myVolume = 0
    var myChannel = "KBC"
    override fun adjustVolume(volume: Int) {
       var myVolume = 0

    }

    override fun switchChannel(channel: String) {
        var myChannel = channel
    }

    override fun switchOn() {
        println("Switching on")
    }

    override fun swithOff() {
        println("Switching off")
    }

}

class HisenseTV(): Television{
    var hsVol = -5
    var hsChannel = ""
    var on:Boolean = false

    override fun adjustVolume(volume: Int) {
      hsVol = 0
        hsVol = (volume*2)/2
    }

    override fun switchChannel(channel: String) {
    hsChannel = channel

    }

    override fun switchOn() {
        println("Switching on")
    }

    override fun swithOff() {
        println("Switching off")
    }

}