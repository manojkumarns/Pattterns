class p11{
public static void main(String[] args) {
	int row =7;
	int num=1;
	int star=6;
	for (int i=1;i<=row ;i++ ) {
		for (int j=1;j<=num;j++ ) {
			System.out.print(j);
		}
		for (int q=1;q<=star;q++ ) {
			System.out.print("*");
			
		}
		System.out.println();
         num++;
         star--;   

	}
}
}