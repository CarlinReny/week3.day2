package week3.day2;



public class FindIntersection {


	static int[]Array1 = {3,2,11,4,6,7};

	static int length1 = Array.length;


	static int[] Array2 = {1,2,8,4,9,7};
	static int length2 =Array2.length;


	public static void main(String[] args) {



		for (int i = 0; i < Array1.length; i++) {

			for (int j = 0; j < Array2.length; j++) {

				if(Array1[i] == Array2[j]) {

					System.out.println(Array1[i]);
				}
			}



		}
	}

}
