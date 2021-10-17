class p9{
	public static void main(String[] args) {
		int num=7;
		int spa=0;
		int row=13;

		for (int i=1;i<=row ;i++ ) {
				if(i<=row/2){
			
			for (int j=0;j<=spa ;j++ ) {
				System.out.print(" ");
				
			}
			for (int q=1;q<=i;q++) {
 				System.out.print(num);

			}
	System.out.println();
			num--;
			spa++;
		}else{
			for (int j=6;j<=spa ;j++ ) {
				System.out.print(" ");
				
			}
			for (int q=num;q>=1;q-- ) {
 				System.out.print(num);

			}
System.out.println();

			num++;
			spa--;
		}
			
	

		

	}
		}
}