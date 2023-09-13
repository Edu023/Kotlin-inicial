package selection

fun main () {

//    val x = 0
//
//   val s = when {
//        x > 0 -> println("Positivo")
//        x < 0 -> println("Negativo")
//        else -> println("0")
//    }

   val s = 'c'
   val v =  when (s) {
        'A', 'a' -> println(1)
        'B', 'b' -> println(2)
        'C', 'c' -> println(3)
        else -> println(4)
    }
}