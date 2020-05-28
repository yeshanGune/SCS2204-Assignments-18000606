object Assignment_Q1{
    def normalWorkingHour(hours: Int):Int = {
        return hours*150;
    }

    def otHour(hours: Int):Int = {
        return hours*75;
    }
    def totalIncome(x:Int , y:Int): Int = {
        return normalWorkingHour(x) + otHour(y);
    }

    def tax(income: Int):Double = {
        return income*0.1;
    }

    def takeHomeSalary(x: Int , y: Int): Double = {
        return totalIncome(x,y) - tax(totalIncome(x,y));
    }

    def main(args: Array[String]): Unit = {
        println("Rs." + takeHomeSalary(40,20));
    }
}