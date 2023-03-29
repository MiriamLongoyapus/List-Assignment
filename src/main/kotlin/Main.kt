fun main() {
    val names = listOf("mary","mercy","aaron","jack","miriam","kelly","jack","brenda","brundi","kadogo")
    println(names)

    numbers()
    var people1=Persons("mary",20,30.3,50)
    var people2=Persons("mercy",30,44.4,70)
    var people3=Persons("jack",26,66.7,70)
    var people4=Persons("brenda",60,75.5,85)
    var people= listOf<Persons>(people1,people2,people3,people4)
    var pple=people.sortedByDescending {people->people.age }
    println(pple)
    var a = Vehicles("KCF217L",50)
    var b = Vehicles("KBG120R",100)
    var c = Vehicles("KBR355U",30)
    var d = Vehicles("KDG007L",80)
    var allVehicles= listOf(a,b,c,d)
    println(vehicleList(allVehicles))


}
fun main(array: List<String>):String{

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun  Name(Name:List<String>):List<String> {
    Name.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
    return Name
}
// Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun numbers(){
    var num= mutableListOf(3.0,1.7,2.5,8.7,7.6)
    println(num.average())
    println(num.sum())

}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
class Persons(var nam:String,var age:Int,var height:Double,var weight:Int)


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addpple(topple:List<Persons>):List<Any>{
    return listOf()
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int{
    var avg=0
    vehicle.forEach { new->new.mileage
        avg+=new.mileage
    }
    var totalAvg=vehicle.count()
    return totalAvg
}






