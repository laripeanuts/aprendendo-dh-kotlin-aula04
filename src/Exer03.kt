fun main() {

//Exercicio 03
    println("Digite uma distancia em metros:")
    var distanciaMetro = readLine()!!.toDouble()
    val multiplicadorCm = 100
    var resultado = distanciaMetro * multiplicadorCm
    println("Distância em centimetros  "+ resultado)
}