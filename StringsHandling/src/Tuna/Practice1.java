package Tuna;



public class Practice1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int rows=5;
		int spacecounter=4;
		int starcounter=1;
		
		for(int i=1;i<rows;i++) {
			System.out.println();
			
			for(int j=1;j<spacecounter;j++ ) {
				System.out.print(" ");
			}
				for(int k=1;k<=starcounter;k++) {
					System.out.print("*");
				}
			
			spacecounter--;
			starcounter=starcounter+2;
		}

	}

}
