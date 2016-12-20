val range10 = 1 to 9
val range1000 = 1 to 999

sumMultiplesOfThreeAndFive(range10)
sumMultiplesOfThreeAndFive(range1000)

def sumMultiplesOfThreeAndFive (range: Range) : Int = {
  range.toStream.filter(num => num%3==0||num%5==0).reduce(_+_)
}

//using infinite stream
val stream = Stream.from(1)
val mod3: Int => Boolean = _ % 3 == 0
val mod5: Int => Boolean = _ % 5 == 0
val mod3and5: (Int, Int) => Boolean = mod3(_)||mod5(_)

//playing with predicates
stream.takeWhile(_ < 10).filter(num => num%3==0||num%5==0).reduce(_+_)
stream.takeWhile(_ < 10).filter(num => mod3(num)||mod5(num)).reduce(_+_)
stream.takeWhile(_ < 10).filter(num => mod3and5(num, num)).reduce(_+_)