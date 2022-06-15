fun main() {
    //переменная количества лайков
    val likes = 121
    var correctName = if (likes % 10 === 1 && likes % 100 != 11) "человеку" else "людям"
    println("Публикация понравилась $likes $correctName ")
}