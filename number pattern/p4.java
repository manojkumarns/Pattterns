class p4{

 public static void main(String[]args){
 int num=1;
 int row=13;
 

 for (int i=1;i<=row ;i++ ) {
 	if(i<=row/2){
 	for(int j=1;j<=num;j++){
 		System.out.print(j);
 	}
 	System.out.println();
 	num++;
 	}
 	else{
 		for(int j=1;j<=num;j++){
 		System.out.print(j);
 	}
 	System.out.println();
   num--;
 	}
 	
 }
 }
}