val stream10 = Stream.from(1).takeWhile(_ <= 10)
val stream100 = Stream.from(1).takeWhile(_ <= 100)


def sumsquare (stream: Stream[Int]) : Int = {
  stream.map(num => num * num).reduce((a, b) => a + b)
}

def sum (stream: Stream[Int]) : Int = {
  stream.reduce((a, b) => a + b)
}

val sum10 = sum(stream10)
val diff10 = Math.abs(sumsquare(stream10)-sum10*sum10)

val sum100 = sum(stream100)
val diff100 = Math.abs(sumsquare(stream100)-sum100*sum100)