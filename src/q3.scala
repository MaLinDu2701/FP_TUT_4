object q5 extends App{

  def toUpper(name:String):String={
    name.toUpperCase();
  }

  def toLower(name: String): String = {
    name.toLowerCase();
  }

  def formatNames(name:String)(index: Int*)(func:String=>String):String={
    if(index.isEmpty){
      return func(name)
    }
    var str=""
    var i=0
    while (i<name.length()){
      if(index.contains(i)) str=str+func(name.charAt(i).toString)
      else str=str+name.charAt(i).toString
      i=i+1
    }
    str
  }

  println(formatNames("Bobby")()(toUpper))
  println(formatNames("Niroshan")(0,1)(toUpper))
  println(formatNames("Saman")()(toLower))
  println(formatNames("Kumara")(5)(toUpper))

}