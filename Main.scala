import scala.util.matching.Regex

def printNumbers(numbers: Iterable[Int]): Unit = {
  numbers.foreach(x => print(s"$x "))
  println()
}

def main(args: Array[String]): Unit = {
  println(s"raw args: ${args.map(arg => s"$arg, ").mkString}")
  println(s"args length: ${args.length}")

  val numberPatters: Regex = "\\d+".r
  val argsAsNumbers = args
    .map(arg => numberPatters.findFirstIn(arg))
    .flatten
    .map(arg => arg.toInt)

  if argsAsNumbers.length == 0 then {
    println("please provide 1 to 3 arguments in form of numbers");
    return;
  }

  if argsAsNumbers.length == 1 then {
    printNumbers(Range(0, argsAsNumbers(0)))
    return;
  }

  if argsAsNumbers.length == 2 then {
    printNumbers(Range(argsAsNumbers(0), argsAsNumbers(1)))
    return;
  }

  if argsAsNumbers.length == 3 then {
    printNumbers(Range(argsAsNumbers(0), argsAsNumbers(1), argsAsNumbers(2)))
    return;
  }



}
