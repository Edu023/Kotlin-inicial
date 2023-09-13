package repetitionStructure
import kotlin.random.Random

fun main () {

    //sorteia um número alearóriamente
    val secret = Random.nextInt(0,101)

    //é true enquanto o usuário joga
    while (true) {
        print("Digite um valor: ")
        val enter = readln().toInt()

        when {
            (enter > secret) -> println("O número é menor!")
            (enter < secret) -> println("O número é maior!")
            else -> {
                println("Parabéns você acertou, o número é $secret!")
                //break faz o loop ser falso e encerrar o jogo
                break
            }
        }
    }
}
