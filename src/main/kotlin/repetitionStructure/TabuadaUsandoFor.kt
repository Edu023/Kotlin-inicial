package repetitionStructure

fun main() {

    print("Escreva um número para mostrar a tabuada dele: ")
    val number = readln().toInt()

    val max = 10

    for (x in 1..max) {
        println("$number x $x = ${x * number}")
    }

}