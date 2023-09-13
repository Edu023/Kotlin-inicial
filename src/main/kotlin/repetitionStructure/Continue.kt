package repetitionStructure

fun main () {

   //vai contar de 0 a 100 pulando todos os números que contenha 0
    for (i in 0..100) {
        if (i % 10 == 0) {
            continue
        }
        print(i)
    }

}