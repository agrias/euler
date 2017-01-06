val num = 20
val primes = Stream.from(1).takeWhile(_ <= num).filter(isPrime(_)).map(same => {
  println(same)
  same
}).reduce((a, b) => {a*b})

//has to be a multiple of the product of the primes, idk if this is true for everything
Stream.from(1).find((a) => divisibleByAll(a*primes, num)).get*primes

Stream.from(1).takeWhile(_ <= 10).filter(!isPrime(_)
).map(a => smallestPrimeFactor(a)).print()

Stream.from(1).takeWhile(_ <= 10).reduce((a,b) => a.min(b))

Stream.from(1).takeWhile(_ <= 10).map((a) => {
  if (isPrime(a))
    a
  else
    a+10
})

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

def smallestPrimeFactor (number: Double) : Double = {
  val squareroot = Math.sqrt(number)
  Stream.from(2).takeWhile(_ <= squareroot)
    .filter(number%_==0)
    .filter(isPrime(_))
    .reduce((a, b) => a.min(b))
}

def divisibleByAll (number: Double, limit: Double) : Boolean = {
  Stream.from(1).takeWhile(_ <= limit).forall(a => number%a == 0)
}

//Stream.from(10).find(num => divisibleByAll(num, 10)).get
//Stream.from(20).find(num => divisibleByAll(num, 20)).get

val stream20 = Stream.from(1).takeWhile(_ <= 20)


