import kotlinx.coroutines.delay


fun main() {
    MyClass()
}

class MyClass {
    suspend fun myFun(arg : Int) : String{
        delay(5000)
        return "sangeeth"
    }
}

