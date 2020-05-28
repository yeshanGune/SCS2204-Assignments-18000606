object Assignment_Q2{
    def attendees(ticketPrice: Int): Int = {
        return 120 + ((15-ticketPrice)/5)*20;
    }

    def cost(numOfPeople: Int): Int = {
        return 500 + 3*numOfPeople;
    }

    def revenue(numOfPeople: Int , ticketPrice: Int): Int = {
        return numOfPeople*ticketPrice;
    }

    def profit(ticketPrice: Int): Int = {
        var numOfPeople = attendees(ticketPrice);
        var rev = revenue(numOfPeople , ticketPrice);
        var totalCost = cost(numOfPeople);

        return rev - totalCost;
    }

    def main(args: Array[String]): Unit = {
        println("Ticket price: Rs.10 -> " + "Profit: Rs." + profit(10));
        println("Ticket price: Rs.15 -> " + "Profit: Rs." + profit(15));
        println("Ticket price: Rs.20 -> " + "Profit: Rs." + profit(20));
    }
}