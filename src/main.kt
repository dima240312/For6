fun main() {
    For6()
}

fun For6() {
    print("For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,\n" +
            "1.4, . . . , 2 кг конфет.")
    print("\nВведите цену за КГ: ")
    var kgPrice = readLine()!!.toDouble()

    for (i in 1..10) {
        println("Цена за ${i}00г = ${kgPrice*i/10} руб.")
    }
}