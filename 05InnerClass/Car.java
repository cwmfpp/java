class Car
{
	Car()
	{
		System.out.println("Car construct");	
	}
	class Wheel
	{
		Wheel()
		{
			System.out.println("Wheel construct");	
		}
	}
}

class PlaneWheel extends Car.Wheel
{
	PlaneWheel(Car car)
	{
		car.super();
		System.out.println("PlaneWheel construct");	
	}
	public static void main(String[] args)
	{
		Car car = new Car();
		PlaneWheel pw = new PlaneWheel(car);
	}
}

