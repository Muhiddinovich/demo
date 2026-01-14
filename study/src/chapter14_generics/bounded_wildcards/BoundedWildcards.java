package chapter14_generics.bounded_wildcards;


public class BoundedWildcards {
	static void showXY(Coordinates<?> c) {
		System.out.println("X Y Coordinates: ");
		for (int i = 0; i < c.coordinates.length; i++) {
			System.out.println(c.coordinates[i].x + " " + c.coordinates[i].y);
		}
		System.out.println();
	}

	static void showXYZ(Coordinates<? extends ThreeD> c) {
		System.out.println("X Y Z coordinates: ");
		for (int i = 0; i < c.coordinates.length; i++) {
			System.out.println(c.coordinates[i].x + " " + c.coordinates[i].y + " " + c.coordinates[i].z);
		}
		System.out.println();
	}
	
	static void showAll(Coordinates<? extends FourD> c) {
		System.out.println("X Y Z T coordinates: ");
		for(int i=0;i<c.coordinates.length;i++) {
			System.out.println(c.coordinates[i].x+" "+c.coordinates[i].y+" "+c.coordinates[i].z+" "+c.coordinates[i].t);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TwoD [] twoD = {
				new TwoD(0, 0),
				new TwoD(7, 9),
				new TwoD(18, 4),
				new TwoD(-1, -23)
		};
		
		Coordinates<TwoD> tdCoordinates=new Coordinates<TwoD>(twoD);
		System.out.println("Contents of all coordinates: ");
		showXY(tdCoordinates);
//		showAll(tdCoordinates);
		
		FourD [] fourDs= {
				new FourD(1, 2, 3, 4),
				new FourD(6, 8, 14, 8),
				new FourD(22, 9, 4, 9),
				new FourD(3, -2, -23, 17)
		};
		
		Coordinates<FourD> fd = new Coordinates<FourD>(fourDs);
		showXY(fd);
		showXYZ(fd);
		showAll(fd);
	}
}
