class s4{
	public static void main(String[] args) {
		int row=6;
		int spa=5;
		int star=1;
		for (int i=1;i<=row ;i++ ) {
			for (int j=1;j<=spa ;j++ ) {
				System.out.print(" ");

				
			}for (int k=1;k<=star ;k++ ) {
				System.out.print("*");
				
			}
			System.out.println();
			spa--;
			star++;
			
		}
	}
}