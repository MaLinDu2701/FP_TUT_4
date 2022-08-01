object q1 extends App{

  def calcEarn(amt:Double): Double ={
    if(amt<20000){
      return amt*0.02;
    }
    else if(amt<200000) {
      return amt*0.04;
    }
    else if(amt<2000000){
      return amt*0.035;
    }
    else{
      return amt*0.065;
    }
  }

  println(calcEarn(2999));
}
