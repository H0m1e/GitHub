package deserve;

class Car implements Vehicle{
    private int speed;
	public void start() {
		System.out.println("���������ˣ�");
		
	}

	public void stop() {
		System.out.println("����ֹͣ�ˣ�");
		
	}

	public void speedup(int speed) {
		this.speed=speed;
		
		
	}

	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ����Ϊ��"+speed);
		return speed;
		
	}
    

}
