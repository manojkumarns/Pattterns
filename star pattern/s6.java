public class s6{
 public static void main(String[]args){
 int str =1;
 int row=9;
 int spc=4;
 for(int i=1;i<=row;i++){
 for(int j=1;j<=spc;j++){
 System.out.print(" ");
 }
 for (int q=1;q<=str ;q++ ) {
 	System.out.print("*");

 }
 System.out.println();
 if(i<=row/2){
 	str+=2;
 	spc--;
 }else{
 	str-=2;
 	spc++;
 }

  
 

 }
}}