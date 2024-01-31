package ch09.resolve07;

public class Triangle {
	private int width;		//밑변
	private int heigh; 		//높이	
	private int area;
	
	public Triangle () {
		
	}
	public void SetTriangle (int _width, int _heigh) {
		this.width = _width;
		this.heigh = _heigh;
	}
	
	public void TriangleArea() {
		area = width * heigh / 2;
		
	}
	public void PrintTriangle() {
		System.out.println("밑변 : " + width + " , 높이 : " + heigh + " , 넓이 : " + area);
	} 
	
}
