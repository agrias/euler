val fib: Stream[Int] = fib.scanLeft(1){
  _+_
}.#::(0) //what the heck is a conswrapper

fib.takeWhile(_ <= 4000000).filter(_%2==0).reduce(_+_)

//perf testing
time{fib.takeWhile(_ <= 4000000).filter(_%2==0).reduce(_+_)}
time{fib.view.takeWhile(_ <= 4000000).filter(_%2==0).reduce(_+_)}

def time[R](block: => R): R = {
  val t0 = System.currentTimeMillis()
  val result = block    // call-by-name
  val t1 = System.currentTimeMillis()
  println("Elapsed time: " + (t1 - t0) + "msd")
  result
}

//learning