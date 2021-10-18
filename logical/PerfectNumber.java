class l2{
	public static void main(String[] args) {
		int p=6;
		int sum=0;

		for(int i=1;i<=p/2;i++){
			if (p%i==0) {
				 sum=sum+i;
			}
		}
		if(sum==p){
			System.out.println(p+"is a perfect number");
		}else{
			System.out.println(p+"is not a perfect number");
		}
	}
}