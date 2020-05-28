object Assignment3_Q5{
    def oddEven(n:Int):String = (n)match{
        case 0 => "Even";
        case 1 => "Odd";
        case _ => oddEven(n-2);
    }

    def sum(n:Int):Int = (n)match{
        case 0 => 0;
        case n if(oddEven(n)=="Even") => n+sum(n-1);
        case n if(oddEven(n)=="Odd") => 0+sum(n-1);
    }
    
    def main(args:Array[String]):Unit =  {
        println(sum(11));
    }
}