val limit = 1000

val stream1 = Stream.from(1).takeWhile(_ < limit)
val stream2 = Stream.from(1).takeWhile(_ < limit)

Methods.time {
  stream1.map(a => {
    stream2.map(b => a * b).filter(isPalindrome)
      .foldLeft(0)((first, second) => first.max(second)) //fixes empty set
    //.reduce((first, second) => first.max(second))
  }).reduce((firstmax, secondmax) => firstmax.max(secondmax))
}


//adding divisible by 11 reduces number of calculations needed
Methods.time {
  stream1.map(a => {
    stream2.filter(b => a%11==0||b%11==0).map(b => a * b).filter(isPalindrome)
      .foldLeft(0)((first, second) => first.max(second)) //fixes empty set
    //.reduce((first, second) => first.max(second))
  }).reduce((firstmax, secondmax) => firstmax.max(secondmax))
}

def isPalindrome (number: Int) : Boolean = {
  number.toString.equals(number.toString.reverse)
}