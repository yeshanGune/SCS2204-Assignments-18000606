object Assignment3_Q4{
    def oddEven(n:Int):String = (n)match{
        case 0 => "Even";
        case 1 => "Odd";
        case _ => oddEven(n-2);
    }
    
    def main(args:Array[String]):Unit =  {
        println(oddEven(49));
        println(oddEven(26));
    }
}