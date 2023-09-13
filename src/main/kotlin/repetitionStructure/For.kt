package repetitionStructure

fun main () {

    //vai imprimir o i do 0 até o 10
    for (i in 0..10) {
        print("$i ")
    }

    println()

    //o comando toDown vai contar para trás por exe 10 até 0
    // vai imprimir de 10 até 0 pulando de 2 em 2
    for (i in 10 downTo 0) {
        print("$i ")
    }

    println()
    //o comando until incrementa valor por exe contar de 10 até 100 pulando de 3 em 3
    for (i in 10 until 100 step 3) {
        print("$i ")
    }

}