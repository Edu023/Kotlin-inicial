package repetitionStructure

fun main () {

    print("Digite o valor para imprimir a tabuada: ")
    val tab = readln().toInt()

    var i = 1
    while (i <= 10) {
        println("$tab x $i = ${tab * i}")
        i++
    }


}