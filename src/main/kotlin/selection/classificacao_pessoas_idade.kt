package selection

fun main () {

    print("Coloque sua idade: ")
    val age = readln().toInt()

    if (age >= 0 && age <= 12) {
        print("você é uma criança com $age anos!")
    } else if (age >= 13 && age <= 17){
        print("você é um adolescente com $age anos!")
    } else if (age >= 18 && age <= 64) {
        print("você é adulto com $age anos!")
    } else {
        print("você já é senior, com $age anos!")
    }

}