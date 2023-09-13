package selection

fun main () {

    print("Escvreva um valor para saber se é Positivo ou Negativo: ")
    val negative: Int = readln().toInt()

    if (negative > 0 ) {
        print("O valor $negative é Positivo ")
    } else if (negative < 0) {
        print("O valor $negative é negativo")
    } else {
        print("O valor é Zero!")
    }

}
