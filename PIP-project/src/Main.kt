import kotlin.math.*

import java.util.Locale

fun main() {
   val notes=arrayOf(100,200,300,200,400,500)
    notes.sort()
    println(notes.contentToString())
    println("Enter the name")
    val input=readLine()?:""
    val isPalindrome=isPalindrome(input)
    println("is the input string is palindrome?$isPalindrome")
    estimate()
   println(areAnagram("Listen","hello"))
//   println(areAnagram())
//   println(areAnagram("password123","3password12"))
//   println(areAnagram("123password","password123"))
    students()
}
fun isPalindrome(input:String):Boolean{

    //\\w remonves all non-alphanumeric charcters
    val cleanInput=input.replace("\\W".toRegex(),"").lowercase()
    return cleanInput==cleanInput.reversed()
}
fun estimate(){
    val pi=3.14159
    val diameterA=36.0
    val radiusA=diameterA/2
    val diameterB=42.0
    val radiusB=diameterB/2

    val volumeA=(4.0/3.0)*pi* radiusA.pow(3)
    val volumeB=(4.0/3.0)*pi*radiusB.pow(3)
    var totalVolumeA=volumeA*2200
    var totalVolumeB=volumeB*1800
    val totalVolume=totalVolumeA+totalVolumeB
    var quotation=16.75
    var totalQuotation=totalVolume*quotation

    println(totalQuotation)
}
fun areAnagram(word:String,word1:String):Boolean{
    println("Enter two words separarted with comma:")
    var word=readLine()?:""
    var word1=readLine()?:""
    return word.toCharArray().sorted()==word1.toCharArray().sorted()
}
fun students() {
    println("Enter student names separated by commas :")
    val input = readLine() ?: ""
    val lists = input.split(",").map { it.trim() }.toTypedArray()
    var tripOne = mutableListOf<String>()
    var tripTwo = mutableListOf<String>()

    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    for (name in lists) {
        if (vowels.contains(name.lowercase().first())) {
            tripOne.add(name)
        } else {
            tripTwo.add(name)
        }
    }

    println("Trip One (starts with vowels): $tripOne")
    println("Trip Two (starts with consonants): $tripTwo")
}