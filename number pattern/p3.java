class p3{
	public static void main(String[]args){
 
  int num=7;
 int row=14;
 

 for (int i=1;i<=row ;i++ ) {
 	for(int j=1;j<=num;j++){
 		System.out.print(j);
 	}
 	
 	System.out.println();
 if(i<=row/2){
 	num--;
 }else{
 	num++;
 }

 }}
}