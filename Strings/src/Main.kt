fun main() {
    println("Hello World!")
    val city = "Lagos"
    println("The capital city of nigeria is $city")
    val person = "Janet"
    val profession = "architect"
    println(person + " is an " + profession)
    println("$person is an $profession")
    printBirthYear("Joy", 19)

    //index of strings
    val os = "Ubuntu"
    println(os[0])
    println(os[1])
    println(os[2])
    println(os[3])
    println(os[4])
    println(os[5])

    val name = "Ubuntu"
    val age = 20;
    println("$name is $age years old")
    println(os.equals(name))
    println(os.slice(0..3))
    println(os.uppercase())
    println(os.lowercase())
    val a = ""
    val b = " "
    println(a.isEmpty())//expect true
    println(a.isBlank())
    println(b.isEmpty())
    println(b.isBlank())

    val namE = "patricia"
    println(namE)
    println(namE.trim())
    println(namE.trimStart())
    println(namE.trimEnd())
//for checking ending and starting strings
    val fullName = "Pamela kilonzo"
    println(fullName.startsWith("Pam"))
    println(fullName.endsWith("nzo"))

    var stmt = "Phoebe is our class represntative"
    stmt = stmt.replace("Phoebe", "Victoria")
    println(stmt)

    val words=stmt.split("q")
    println(words)

}
//Write a function that takes in a name and an age
//then prints out for example "Joy was born in 2006"
//When given "Joy" and 19


fun printBirthYear(name: String, age: Int) {
    val currentYear = 2006
    val birthYear = 2006 - 19
    println("$name was born in $birthYear")
}

