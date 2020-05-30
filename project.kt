package machine
fun main() {
    print("Write how many ml of water the coffee machine has: ")
    var water=readLine()!!.toInt()
    print("Write how many ml of milk the coffee machine has: ")
    var milk=readLine()!!.toInt()
    print("Write how many grams of coffee beans the coffee machine has: ")
    var coffee_beans=readLine()!!.toInt()
    print("Write how many cups of coffee you will need: ")
    var coffee_cups=readLine()!!.toInt()
    var ans=200*coffee_cups+50*coffee_cups+15*coffee_cups
    if(ans<=water+milk+coffee_beans)
    {
        water-=coffee_cups*200
        milk-=coffee_cups*50
        coffee_beans-=coffee_cups*15
        var extra=0
        while(water>=200&&milk>=50&&coffee_beans>=15)
        {
            extra+=1
            water-=200
            milk-=50
            coffee_beans-=15
        }
        if(extra>0)
        println("Yes, I can make that amount of coffee (and even $extra more than that)")
        else
        println("Yes, I can make that amount of coffee")
    }
    else
    {
        var extra=0
        while(water>=200&&milk>=50&&coffee_beans>=15)
        {
            extra+=1
            water-=200
            milk-=50
            coffee_beans-=15
        }
        println("No, I can make only $extra cups of coffee")
    }
}
