import kotlin.math.PI

fun main(){

    //programa2()
    //programa3()
    //programa4()
    //programa5()
    //programa6()
    //programa7()
    //programa8()
    programa9()


}
fun programa2(){

    print("Ingrese El Radio De Circunferencia: ")
    var r = readLine()!!.toDouble()

   var area = (Math.PI*Math.pow(r,2.0))

    print("El Area:  %.2f ".format(area))

}

fun programa3(){

    print("Ingrese El Radio De Circunferencia: ")
    var r = readLine()!!.toDouble()

    var l= 2* PI*r

    print("La longitud:  %.2f ".format(l))

}

fun programa4(){

    print("Ingrese Valor 1: ")
    var n1 = readLine()!!.toInt()

    print("Ingrese Valor 2: ")
    var n2 = readLine()!!.toInt()

    print("Ingrese Valor 3: ")
    var n3 = readLine()!!.toInt()

    //Mayor
    if (n1==n2 && n2==n3)
        println("Son iguales")
    else if (n1>n2 && n1>n3)
        println("el valor es mayor: $n1 ")
    else if (n2>n3 && n2>n1)
        println("El Valor mayor es: $n2")
    else
        println("el valor  mayor es $n3 ")

    //Menor
    if (n1==n2 && n2==n3)
        println("Son iguales")
    else if (n1<n2 && n1<n3)
        println("el valor menor es: $n1 ")
    else if (n2<n3 && n2<n1)
        println("El menor es: $n2")
    else
        println("el valor menor es $n3 ")

}

fun programa5(){

    print("Ingrese un numero : ")
    var n1 = readLine()!!.toInt()

    if (n1==0)
    print("El numero es neutro")

    else if (n1>0)
        println("El numero es positivo")
    else
        println("El numero es negativo")
}

fun programa6(){

    print("Ingrese numero 1: ")
    var numero1 = readLine()!!.toInt()

    print("Ingrese numero 2: ")
    var numero2 = readLine()!!.toInt()

    if (numero1%numero2==0)
        println("Es multiplo")
    else
        println("No es multiplo")

}

fun programa7(){

    print("Introduce numero 1 : ")
    var n1 = readLine()!!.toInt()

    print("Introduce numero 2 : ")
    var n2 = readLine()!!.toInt()

    if (n1>n2)
        print("El numero $n1 mayor que $n2 ")
    else
        print("Es numero $n2 menor que $n1")







}

fun programa8(){

    print("Introduce numero 1 : ")
    var n1 = readLine()!!.toInt()

    print("Introduce numero 2 : ")
    var n2 = readLine()!!.toInt()

    if (n1>n2)
        print("El numero $n1 es mayor que $n2 ")
    else if (n2>n1)
        print("Es numero $n2 es mayor que $n1")
    else (n1==n2)
        print("El numero $n1 es igual que $n2")


}

fun programa9(){

    print("Ingrese un numero: ")
    var n1 = 

}