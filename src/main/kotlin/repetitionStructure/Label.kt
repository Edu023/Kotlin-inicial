package repetitionStructure

fun main () {

    //loop@ é o nome que dei para meu bloco
    loop@ for (i in 'A'..'E') {
        for(j in 1..5){
            print("$i$j ")

            if (j == 3) {
                //break@loop vai parar o código
                break@loop
            }
        }
    }
    println("Fim!")
}