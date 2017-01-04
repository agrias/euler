val limit = 1000

val stream1 = Stream.from(1).takeWhile(_ < limit)
val stream2 = Stream.from(1).takeWhile(_ < limit)

stream1.map(a => {
  stream2.map(b => a*b).filter(isPalindrome)
    .foldLeft(0)((first, second) => first.max(second)) //fixes empty set
  //.reduce((first, second) => first.max(second))
}).reduce((firstmax, secondmax) => firstmax.max(secondmax))

def isPalindrome (number: Int) : Boolean = {
  number.toString.equals(number.toString.reverse)
}