fun main(args: Array<String>) {
// Faça um programa que leia um valor e imprima sua tabuada (aceite apenas números entre 1 e 10).
// Imprima, logo em seguida, a tabuada ao contrário

    print("Digite um número entre 1 e 10 para calcular a sua tabuada: ")
    var num = readLine()!!.toInt()

    if (num >= 1 && num <= 10){

    for (i in 10 downTo 1)
            println("$num X $i = ${num * i}")

    }else{
        println("Número inválido")


    }


    }
