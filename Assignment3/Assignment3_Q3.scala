object Assignment3_Q3{
    def sum(n:Int):Int = (n)match{
        case 1 => 1;
        case _ => n + sum(n-1);
    }
    
    def main(args:Array[String]):Unit =  {
        println(sum(5));
    }
}