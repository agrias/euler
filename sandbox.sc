val s = Stream.continually(1).zipWithIndex.map(p => p._1 + p._2)

val m = s.takeWhile(_ < 10).reduce(_+_)

println(m)


val n:Double = 10

Stream.from(2).takeWhile(_ < n).reduce((a, b) => a.max(b))