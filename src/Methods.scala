/**
  * Created by Andrew Gao on 1/4/17.
  */

object Methods {
  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block    // call-by-name
    val t1 = System.currentTimeMillis()
    println("Elapsed time: " + (t1 - t0) + "msd")
    result
  }

  def foo() {
    println("Hello World!")
  }
}
