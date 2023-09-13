package variables

fun main (){

    /*o rato roeu
    * a $roupa do
    * rei de "Roma"*/
    // para quebrar a linha usa "\n".
    // para enter as "" no compilador usa \"
    //para entender o dolár no compilador usa \$
    //outra forma de fazer a quebra é usando aspas triplas ("""O \ não é suportato""")

    val frase ="O rato roeu \na \$roupa do \nrei de \"Roma\"."

    val fraseTripla = """
       | o rato roeu
       | a roupa do 
       | rei de "Roma."
    """.trimMargin()

    println(frase)
    println()
    println(fraseTripla)
}