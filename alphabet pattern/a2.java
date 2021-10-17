class a2{
	public static void main(String[] args) {
		char ch='a';
		int spa=0;
		int row=14;
		int j;
		for (int i=0;i<=row ;i++ ) {
			for ( j=1;j<=spa;j++ ) {
				System.out.print(" ");
				
			}for (int q=1;q<=j ;q++ ) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			if(i<=row/2){
				
				spa--;
			}else{
				ch--;
				spa++;
			}
			
		}

	}
}