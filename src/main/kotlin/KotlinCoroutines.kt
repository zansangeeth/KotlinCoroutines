import kotlinx.coroutines.*

fun main() = runBlocking{ // new thread created and blocked the main thread

        println("my program starts ${Thread.currentThread().name}") // run on main thread

        GlobalScope.launch {
            println("fake program starts ${Thread.currentThread().name}")// child thread created and running paralleled with background thread := T1
            mySuspendFun(1000)
            println("fake program starts ${Thread.currentThread().name}")// this can be T2 or t1
        }

        mySuspendFun(2000) //main thread :  wait for the background tasks to finish

        println("my program ends ${Thread.currentThread().name}") // main thread: final print statement end with  the program


}

suspend fun mySuspendFun(time : Long){
    delay(time)
}



