class rational(x:Int, y:Int){
    def numer = x;
    def denom = y;

    def this(x:Int)={
        this(x,1);
    }
    def neg = new rational(-1*numer , denom);

    def printRational = println("" + numer + "/" + denom);
}

object Assignment5_Q1{
    def main(args:Array[String]):Unit={
        var r1 = new rational(3,4);
        r1.printRational;

        var r2 = r1.neg;
        r2.printRational;
    }  
}