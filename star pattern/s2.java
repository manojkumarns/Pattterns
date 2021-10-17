class s2{
	public static void main(String[] args) {
		int star=1;
        int spa=4;
        int row=5;
	    for (int i=1;i<=row;i++ ) {
	    	for (int j=1;j<=spa ;j++ ) {
	    	
	    	System.out.print(" ");	
	    	}
	    	for (int a=1;a<=star ;a++ ) {
	    		System.out.print("*");
	    		
	    	}

	    System.out.println();
	    star+=2;
	    spa--;
	    }
	}
}