package deserve;

class Car implements Vehicle{
    private int speed;
	public void start() {
		System.out.println("汽车启动了！");
		
	}

	public void stop() {
		System.out.println("汽车停止了！");
		
	}

	public void speedup(int speed) {
		this.speed=speed;
		
		
	}

	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("当前车速为："+speed);
		return speed;
		
	}
    

}
