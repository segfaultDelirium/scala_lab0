def euclidModulo(x: Int, m: Int): Int = {
  val moduloRes = x % m
  return if moduloRes < 0 then moduloRes + m else moduloRes
}

def charToNumber(c: Char): Int = {
  return c - 'a'
}

def numberToChar(x: Int): Char = {
  ('a' + x).toChar
}

def shiftChar(c: Char, shiftBy: Int): Char = {
  numberToChar(euclidModulo(charToNumber(c) + shiftBy, 26))
}

def main(args: Array[String]): Unit = {
  println(s"raw args: ${args.map(arg => s"$arg, ").mkString}")
  if args.length != 1 then {
    println("program expects a single argument")
    return;
  }

  val initialMessage = args(0)
  val shiftBy = 13;
  val encodedMessage = initialMessage.map(c => shiftChar(c, 13))
  val reverseEncode = encodedMessage.map(c => shiftChar(c, 13))

  println(s"initial message: $initialMessage")
  println(s"encoded message: $encodedMessage")
  println(s"reverseEncode message: $reverseEncode")



}
