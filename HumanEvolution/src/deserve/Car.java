package deserve;


public class Car {
     private String name;
     private int speed;
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed<=150) {
			this.speed = speed;
		}
		else {
			this.speed=speed;
		     System.out.println("速度不允许超过150，请小心驾驶！");
		}
	}

	public static void main(String[] args) {
		Car car=new Car();
		car.setName("宝马");
		System.out.println("Car name is:"+car.getName());
		car.setSpeed(100);
        System.out.println("Car speed is:"+car.getSpeed());
	}

}
