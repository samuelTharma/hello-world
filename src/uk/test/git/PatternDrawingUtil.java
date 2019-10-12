package uk.test.git;

public class PatternDrawingUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PatternDrawingUtil().drawSquire2(5);
	}

	public void drawSquire(int sideLenghth) {
		System.out.println("drawomg square ....");
		for (int i = 0; i < sideLenghth; i++) {
			for (int j = 0; j < sideLenghth; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public void drawSquire2(int sideLenghth) {
		System.out.println("drawomg square ....");
		int temp = sideLenghth * sideLenghth;

		for (int i = 1; i <= temp; i++) {
			System.out.print("#");
			if (i % sideLenghth == 0) {
				System.out.println();
			}
		}
	}

	public void drawRect(int sideWidth, int sideLength) {
		System.out.println("drawomg square ....");
		for (int i = 0; i < sideLength; i++) {
			for (int j = 0; j < sideWidth; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
