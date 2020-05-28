object Assignment{
	def cel_to_far(cel: Int): Unit = { // Celsius to fahrenheit
		var far = cel*1.8 + 32;
		println("Fahrenheit: " + far + " F");
	}
	
	def vol_sphere(r: Double): Unit = {  // Voulume of a sphere
		var vol = (4.0/3.0)*(math.Pi)*r*r*r;
		println("Volume of sphere: " + vol + " m^3");
	}

	//****** Wholesale cost ******
	def bookPrice(x:Int): Double = {
			return 24.95 * x;
	}

	def discount(totalBookPrice: Double): Double = {
		return totalBookPrice * 0.4;
	}

	def shippingCost(x:Int): Double = {
			return (3) + ((x-50)*0.75);
	}

	// ***************************

	def main(args: Array[String]): Unit = {
		cel_to_far(35);
		vol_sphere(5);
		var totalCost = bookPrice(60) - discount(bookPrice(60)) + shippingCost(60);
		println("Total cost: Rs." + totalCost);
	}
}