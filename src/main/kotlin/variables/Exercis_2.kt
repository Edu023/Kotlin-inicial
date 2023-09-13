package variables

/**Crie um programa onde arredonde um valor decimal informado pelo usuário
truncando as casas decimais e mostrando na tela. **/

fun main () {
    print("Informa um número decimal que será convertido para inteiro: ")
    val decimal = readln().toDouble()

    val integer = decimal.toInt()

    println("O número decimal $decimal foi convertido para $integer")
}