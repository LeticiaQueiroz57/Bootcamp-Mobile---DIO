//Calculadora:
//1 = Soma
//2 = Subtração
//3 = Multiplicação
//4 = Divisão
//5 = Resto
fun main(){
    var n1 = 10.0
    var n2 = 15.5
    var option = 1
    println(option.calculate(n1,n2))
}

fun Int.calculate(n1:Double,n2:Double): Double{
    return when(this){
        1 -> soma(n1,n2)
        2 -> subtracao(n1,n2)
        3 -> multiplicacao(n1,n2)
        4 -> divisao(n1,n2)
        else -> resto(n1,n2)
    }
}


fun soma (a:Double,b:Double):Double{
    return(a+b)
}

fun subtracao(a:Double,b:Double):Double{
    return(a-b)
}

fun multiplicacao(a:Double,b:Double):Double{
    return(a*b)
}

fun divisao(a:Double,b:Double):Double{
    return (a/b)
}

fun resto(a:Double,b:Double):Double{
    return(a%b)
}