package repetitionStructure

fun main () {
    var x = 0

    while (x <= 10) {
        print("$x ")
        x++
    }

    println()
    //O teste do bloco é feito no final e não no começo como no While
    // pelo menos uma vez é executado o bloco
    x = 0
    do {
        print("$x ")
        x++
    } while (x <= 10)
}