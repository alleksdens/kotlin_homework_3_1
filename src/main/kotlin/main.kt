fun main() {
    val time = 11111
    when {
        time in 0..60 -> println("только что")
        time in 61..3600 -> println("${minutes(time)} назад")
        time in 3601..86400 -> println("${hours(time)} назад ")
        time in 86401..172800 -> println("сегодня")
        time in 172801..259200 -> println("вчера")
        time > 259200 -> println("давно")
    }
}

fun minutes(time: Int): String {
    val min = time / 60
    when {
        min % 100 == 11 -> return "$min минут"
        min % 10 == 1 -> return "$min минуту"
        min % 10 in 2..4 -> return "$min минуты"
    }
    return "$min минут"
}

fun hours(time: Int): String {
    val hour = time / 3600
    when {
        hour % 100 == 11 || hour in 12..20 -> return "$hour часов"
        hour % 10 == 1 -> return "$hour час"
        hour % 10 in 2..4 -> return "$hour часа"
    }
    return "$hour часов"
}