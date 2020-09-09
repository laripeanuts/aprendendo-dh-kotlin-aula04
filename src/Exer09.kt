fun main() {

//Exercicio Casa 02
    println("Quanto vale sua hora?")
    var valorHora = readLine()!!.toInt()
    println("Quantas hora você trabalhou?")
    var horasTrabalhadas = readLine()!!.toInt()

    var salario = valorHora * horasTrabalhadas

    println("Seu salário é: $salario)

}