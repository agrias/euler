val fib: Stream[Int] = fib.scanLeft(1){
  _+_
}.#::(0) //what the heck is a conswrapper

fib.takeWhile(_ <= 4000000).filter(_%2==0).reduce(_+_)

//perf testing
Methods.time{fib.takeWhile(_ <= 4000000).filter(_%2==0).reduce(_+_)}
Methods.time{fib.view.takeWhile(_ <= 4000000).filter(_%2==0).reduce(_+_)}

//learning