val s = Stream.continually(1).zipWithIndex.map(p => p._1 + p._2)

val m = s.takeWhile(_ < 10).reduce(_+_)

println(m)


val n:Double = 10

Stream.from(2).takeWhile(_ < n).reduce((a, b) => a.max(b))

val divisors = List(20, 19, 18, 17, 16, 15, 14, 13, 12, 11)
def check (value :Int) :Int = {
  if (divisors.exists((a) => (value % a != 0)))
    return check(20+value)
  else return value
}

check(20)