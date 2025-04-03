fun main() {
   println("Hello World!")
    printSubString("akirachix")
  val numbers=intArrayOf(12,13,56,12,158,23,76)
  arrayOperations(intArrayOf(12,13,56,12,158,23,76))
}
fun printSubString(str:String){
   if(str.length>=4){
  val result="${str[0]} ${str[2]} ${str[3]}"
  println(result)
   }else{
       println("String is too short!")
   }
    }

fun introducingMySelf(x:String,y:Int):String{
    return "Hi, my name is $x and I am $y years old."
}

fun arrayOperations(numbers:IntArray){


    if(numbers.size<5){
        println("hello")
        return
    }
    val sum=numbers[1]+numbers[4]
    println("$sum")
    val indexNum=numbers.indexOf(158)
    println("$indexNum")
    val sortedNumbers=numbers.sortedArray()
    println(sortedNumbers.contentToString())

}
