package selection

fun main () {

    print("Insira um valor: ")
    val x = readln().toInt()

    print("Insira um outro valor: ")
    val y = readln().toInt()

    print("Insira outro valor: ")
    val s = readln().toInt()

    when (x) {
        10 -> println("é 10")
        20 -> println("é 20")
        30 -> println("é 30")
        40 -> println("é 40")
        else -> println("Desconhecido")
    }
// in vem de intervalo - ou seja 0..10 - no intervalo de 0 a 10
    when (x) {
        in 0..10 -> println("0 a 10")
        in 11..20 -> println("11 a 20")
        else  -> println("Outro intervalo")
    }
    // se um número é par ou não
    when (y) {
        0,2,4,6,8,10 -> println("O número $y é par!")
        else -> println("O número $y é ímpar!")
    }

    //sem usar variável no bloco
    when {
        s > 0 -> println("Maior que zero!")
        s < 0 -> println("Menor que zero!")
        else -> println("Zero!")
    }
}