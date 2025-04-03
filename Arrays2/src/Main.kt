fun main() {
    println("Hello World!")
    var friends=arrayOf("Ushi","Mercy","margaret","Queen","Kevine")
    println(friends.contentToString())
    println(friends[2])
    println(friends[5])
    friends.set(2,"Rigbe")
    friends[3]="David"
    println(friends.contentToString())
    println(friends::class.simpleName)
    val friend=friends.get(1)
   println(friend)
    val x=34.5F
    println(x::class.simpleName)


    val years=arrayOf(1995,1997,2001,2007,2013,2022)
    val southAfrica=arrayOf("Cyril Ramaphosa",63210000,false,"Rand",6022.54)
    println(southAfrica.contentToString())

    friends=friends.plus("Francisca")
    friends=friends.plus(arrayOf("Ada","Beth"))
    println(friends.contentToString())
    println(friends.indexOf("Abby"))
    //For knowing the size of an array
  println(friends.size)
    println(friends.count())


//    nums.sort()
//    println(nums.contentToString())
//    println(nums.size)
//    println(nums.count())
//    println(nums.sum())
//    println(nums.average())
//    println(nums.max())
//println(nums.min())
 val friends=arrayOf("Ushi","Queen","Mercy","Margret","Kevine")

for(x in friends){
      println(x)
}
val nums=arrayOf(13,27,31,65,34,21)
//for (num in nums) {
//    val square = num * num
//    println("The square of $num is:$square")
//}
//friends.forEach{friend-> println(friend)}
//    nums.forEach{num->
//        val square=num*num
//        println("The square of $num is:$square")
//
//    }
//coping of the array and
    val sortedNums=nums.sortedArrayDescending()
    println(sortedNums.contentToString())
    val x=nums.sorted()
        print(x)
    val sortedFriends=friends.sortedArray()
    println(sortedFriends.contentToString())
}