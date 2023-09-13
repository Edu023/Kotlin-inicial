package selection

fun main () {
    print("Digite o primeeiro valor: ")
    val firstValue = readln().toDouble()

    print("Digite o operador: ")
    //usado para pegar caractere na entrada de dados //
    // pega a primeira letra do que for digitado
    val operator = readln()[0]

    print("Digite o segundo valor: ")
    val secondValue = readln().toDouble()

    val result = when (operator) {
        '+' -> (firstValue + secondValue)
        '-' -> (firstValue - secondValue)
        '*' -> (firstValue * secondValue)
        '/' -> (firstValue / secondValue)
        else -> println("Digito inválido!")
    }

    println("O resultado é $result")
}