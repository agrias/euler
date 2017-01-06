isPrime(1)
isPrime(2)
isPrime(3)
isPrime(4)
isPrime(100)

Methods.time{largestPrimeFactor(100)}
Methods.time{largestPrimeFactor(13195)}
Methods.time{largestPrimeFactor(600851475143L)}
largestPrimeFactor(3628800)
//isPrime(600851475143)

def largestPrimeFactor (number: Double) : Double = {
  val squareroot = Math.sqrt(number)
  Stream.from(2).takeWhile(_ <= squareroot)
    .filter(number%_==0)
    .filter(isPrime(_))
    .reduce((a, b) => a.max(b))
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