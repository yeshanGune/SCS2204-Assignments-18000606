class rational(x:Int, y:Int){
    require(y>0 , "Denominator should be positive");
    private def gcd(a:Int, b:Int):Int ={
        if(a<0){
            gcd(-1*a , b); // Otherwise if a<0, minus goes to the denominator
        }
        else{
            if(b==0) a else gcd(b, a%b);
        }
    }

    private val g = gcd(x,y);
    def numer = x/g;
    def denom = y/g;

    def this(x:Int)={
        this(x,1);
    }

    def sub(r:rational):rational ={
        new rational(numer*r.denom - denom*r.numer , denom*r.denom);
    }

    def -(r:rational):rational ={
        new rational(numer*r.denom - denom*r.numer , denom*r.denom);
    }

    def printRational = println("" + numer + "/" + denom);
}

object Assignment5_Q2{
    def main(args:Array[String]):Unit={
        var x = new rational(3,4);
        var y = new rational(5,8);
        var z = new rational(2,7);
        
        var r1 = x-y-z;
        r1.printRational;
    }  
}