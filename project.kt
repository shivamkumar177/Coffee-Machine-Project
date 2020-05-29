package machine

fun main() {
    println("Write how many cups of coffee you will need: > ")
    var cups_needed=readLine()!!.toInt()
    print("For ")
    print(cups_needed)
    println("cups of coffee you will need:")
    print(cups_needed*200)
    println(" ml of water")
    print(cups_needed*50)
    println(" ml of milk")
    print(cups_needed*15)
    println(" g of coffee beans")
}
