fun Media(x: Float, y: Float) {
    var resultado : Float = (x+y)/2
    println(resultado)
}

fun main(args: Array<String>) {
    val x : Float = 10F
    val y : Float = 15.5F
    println(Media(x,y))

    val palavra = "amor roma"
    val reverse = palavra.reversed()
    println(reverse)
    if (palavra == reverse) {
        println("é palindromo")
    } else {
        println("não palindromo")
    }
}
