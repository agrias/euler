2<<1
2<<2
2<<3
2<<4
2<<14
2<<32
2<<31
2<<30

val first: BigInt = 2

(2<<14).toString.filter(_.isDigit).map(_.asDigit).reduce((a,b) => a+b)
first.<<(999).toString.filter(_.isDigit).map(_.asDigit).reduce((a,b) => a+b)
