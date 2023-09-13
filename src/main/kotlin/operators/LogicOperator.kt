package operators

fun main () {
    //tabela verdade

    //AND - as duas codições devem ser verdadeiras
    println("T and T ${true && true}")
    println("T and F ${true && false}")
    println("F and T ${false && true}")
    println("F and F ${false && false}")

    println()

    //OR - se um dos lados for verdadeiro, ele retorna verdadeiro
    println("T or T ${true || true}")
    println("T or F ${true || false}")
    println("F or T ${false || true}")
    println("F or F ${false || false}")

    println()

    //NOT - negação
    println("Not F ${!false}")
    println("Not T ${!true}")

}
