package selection

fun main () {

    println("Escreva um número que sera multiplicado por ele mesmo.")
    println("Se o número for maior que 10, ele será redefinido por 10!")
    print("Digte o número: ")

    var enter = readln().toInt()
    var multi = (enter * enter)

    if (enter > 10) {
        enter = 10
        var exe = (enter * 10)
        println("O valor é $exe!")
    } else {
        println("O valor é $multi!")
    }

}