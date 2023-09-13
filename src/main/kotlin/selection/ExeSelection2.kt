package selection

fun main () {
    print("Escveva um número para saber se é impar ou par: ")
    val number = readln().toInt()

    val leftover = (number % 2)

    if (leftover == 0 ){
        println("O numero é par!")
    } else {
        println("O número é ímpar!")
    }
}