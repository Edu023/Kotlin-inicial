package operators

/*Encontre o resultado da operação
(5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)  */


fun main () {

    val op = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)

    //Resolvendo
    //8 * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
    //16 < 30 / 2 || !(4 <= 2)
    //16 < 15 || !(4 <= 2)
    //F || !F
    //F || T
    //T

    println(op)
}