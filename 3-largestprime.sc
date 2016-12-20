isPrime(1)
isPrime(2)
isPrime(3)
isPrime(4)
isPrime(100)

largestPrimeFactor(100)
largestPrimeFactor(13195)
//largestPrimeFactor(600851475143)
//isPrime(600851475143)

def largestPrimeFactor (number: Int) : Int = {
  val range = 2 to number-1
  range.toStream.filter(number%_==0)
    .filter(isPrime(_))
    .reduce((a: Int, b: Int) => a.max(b))
}

def isPrime (number: BigInt) : Boolean = {
  val range = Stream.from(2).takeWhile(_ < number-1)
  range.toStream.filter(number%_==0).map((a: Int) => {
    println(a)
    return false
  })
  return true
}