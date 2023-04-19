package ch7;

class PointTest {

	public static void main(String[] args) {
 
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Points {
	int x, y;
	
	Points(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocatoin() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Points {
	int z;
	
	Point3D(int x, int y, int z){
		super(x, y); //조상클래스의 생성자 Point(int x, int y)를 호출
		this.z = z;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: "+ z;
	}
}
