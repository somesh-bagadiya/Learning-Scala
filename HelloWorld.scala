object HelloWorld {
    case class Student(var rollno: Int = 1, var name: String = "Somesh", var percentage: Float = 89){
        def show() = println("hii")

        def >(s : Student): Boolean = {
            println(percentage + " " + s.percentage)
            return percentage > s.percentage
        }

    }

    def main(args: Array[String]): Unit = {
        var s1 = Student()
        println(s1.name)
        println(s1.percentage)

        var s2 = Student(2, "Aditi", 98)
        println(s2.name)
        println(s2.rollno)   
        s2.show()
        println(s1 > s2)
        println(s2 > s1)


        var arr = List(1,2,4,5,6)

        for (n <- arr) print(n)
        println()
        arr = arr.reverse
        arr = arr.drop(2).take(2)

        arr.foreach {(i: Int) => print(i) }

        arr = List(1,2,4,5,6)

        println(arr drop 2 take 3)

    }

}
