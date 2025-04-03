fun main() {
    println("Hello World!")
    //subaru object from Car class
    val subaru=Car("subaru", "Impreza", "KDQ 134T",0)
    println(subaru.registration)
    println(subaru.model)
    println(subaru.speed)
    subaru.start()
    subaru.accelerate(32)
    println(subaru.speed)

    println(subaru.speed)
   val audi=Car("Audi","A4","KDS 567B",0)
    var ushi=Person()
    val car=Car("BMI","#20i","KcX 123",0)
}
class Car(var make:String, var model:String, var registration:String , var speed:Int){
    var driver=Person()
    fun start(){
        println("Vrooommmmmmm")
    }
    fun accelerate(acceleration:Int){
        speed+=acceleration
    }
    fun hoot(){

        println("beep beep")
    }
    fun decelerate(deceleration:Int){
         speed-=deceleration
    }
    fun stop(){
       speed=0
    }
}
class Person(){
    var name="Rigbe"
    fun walk(){
        println("KO KO ")
    }
}