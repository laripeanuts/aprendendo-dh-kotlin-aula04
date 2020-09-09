fun main() {

//Exercicio Casa 03

    println("Qual sua altura:")
    var altura = readLine()!!.toDouble()
    var alturaHomem = (72.7 * altura) - 58
    var alturaMulher = (62.1 * altura) - 44.7

    println("Para homens: $alturaHomem")
    println("Para mulheres: $alturaMulher")

}