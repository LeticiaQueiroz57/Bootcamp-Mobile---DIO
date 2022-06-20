//Jogo de JoKenPo (Pedra-Papel-Tesoura)
fun main(){
    val pc = (1..3).random()
    val eu = 1
    var resultado:String
    //1 = Pedra
    //2 = Papel
    //3 = Tesoura
    print("Adversário: ")
    resultado = PPT(pc)
    println(resultado)
    print("Você: ")
    resultado = PPT(eu)
    println("${resultado} \n")
    vencedor(pc,eu)

}

fun PPT(a:Int):String{
    val b:String
    when{
        a==1 -> b = "Pedra"
        a==2 -> b = "Papel"
        else -> b = "Tesoura"
    }
    return b
}

fun vencedor(pc:Int,eu:Int){
    if(pc==1 && eu==3){
        println("Você perdeu!")
    }else if(pc==1 && eu==2){
        println("Você ganhou!")
    }else if(pc==2 && eu==3){
        println("Você ganhou!")
    }else if(pc==2 && eu==1){
        println("Você perdeu!")
    }else if(pc==3 && eu==2){
        println("Você perdeu!")
    }else if(pc==3 && eu==1){
        println("Você ganhou!")
    }else{
        println("Empate!")
    }
}
