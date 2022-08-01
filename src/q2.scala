import scala.io.StdIn.readInt

object q2 extends App {
  print("Enter a number:")
  var x: Int = readInt();

  def matchInt(x: Int): String = x match {
    case x if (x <= 0) => "zero/Negative"
    case x if (x % 2 == 0) => "Even"
    case _ => "ODD"
  }
  var name:String="Malindu";
  println(name(2));

  println(matchInt(x));

}