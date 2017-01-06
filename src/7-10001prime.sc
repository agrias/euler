val primestream = Stream.from(2).filter(num => Methods.isPrime(num))

primestream.take(6).reduce((a, b) => a.max(b))
Methods.time{primestream.take(10001).reduce((a, b) => a.max(b))}