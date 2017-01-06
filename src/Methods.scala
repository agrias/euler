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

  def isPrime (number: Double) : Boolean = {
    val squareroot = Math.sqrt(number)
    Stream.from(2).takeWhile(_ <= squareroot)
      .filter(number%_==0)
      .map((a: Int) => {
        //println(a)
        return false
      })
    return true
  }

  def foo() {
    println("Hello World!")
  }
}
