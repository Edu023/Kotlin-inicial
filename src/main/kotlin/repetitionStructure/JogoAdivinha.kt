package repetitionStructure
import kotlin.random.Random

fun main () {

    //sorteia um número alearóriamente
    val secret = Random.nextInt(0,101)
    //enqaunto o usuário não acertar fica true
    var playing = true

    while (playing) {
        print("Digite um valor: ")
        val enter = readln().toInt()

        when {
            (enter > secret) -> println("O número é menor")
            (enter < secret) -> println("O número é maior")
            else -> playing = false
            //se o usuário acertar retorna false e encerra o jogo

        }
    }
    println("Parabéns você acertou, o número é $secret!")
}
