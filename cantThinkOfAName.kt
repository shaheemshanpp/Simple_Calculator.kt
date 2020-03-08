package cantThinkOfAName

fun main(args: Array<String>) {
    var repeat = 1
    while (repeat == 1) {
        println("Enter 2 Numbers : ")
        var n1 = readLine()!!.toInt()
        var n2 = readLine()!!.toInt()
        println(
            "Enter an Operator" +
                    "\n\t\t enter '+' to Add" +
                    "\n\t\t enter '-' to Substract" +
                    "\n\t\t enter '*' to Multiply" +
                    "\n\t\t enter '/' to Divide"
        )
        var op = readLine()!!.toString()
        when (op) {
            "+" -> println(n1 + n2)
            "-" -> println(n1 - n2)
            "*" -> println(n1 * n2)
            "/" -> println(n1 / n2)
        }
        println(
            "Do you have anything else to calculate?" +
                    "Enter 1 for yes" +
                    "wnter 0 for no"
        )
        repeat = readLine()!!.toInt()
        if(repeat!==1){
            println("Wrong Input, and Terminating the program")
            repeat=0
        }
    }
}
