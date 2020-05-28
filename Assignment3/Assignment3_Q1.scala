object Assignment3_Q1{
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

    def main(args:Array[String]):Unit =  {
        println(prime(5));
        println(prime(8));
    }
}