object Assignment3_Q2{
    def prime(n:Int , i:Int = 2):Boolean = {
        if(n <= 2){
            if(n<2)
                return false;    
            else   
                return true; 
        }
        else if(n%i == 0)
            return false;

        else if(i*i > n)
            return true;
        
        else
            return prime(n,i+1);
    }

    def primeSeq(n:Int):Unit ={
        if(n>0)
            primeSeq(n-1);
        if(prime(n))
            print(n.toString + " "); // Used toString because compiler gives a warning saying not to add a string and a number
    }


    def main(args:Array[String]):Unit =  {
        primeSeq(10);
    }
}