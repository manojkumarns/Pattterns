class s5{
	public static void main(String[] args) {
		int row=5;
		int spa=0;
		int star=5;
		for (int i=1;i<=row ;i++ ) {
			for (int j=1;j<=spa ;j++ ) {
				System.out.print(" ");

				
			}for (int k=1;k<=star ;k++ ) {
				System.out.print("*");
				
			}
			System.out.println();
			spa++;
			star--;
			
		}
	}
}