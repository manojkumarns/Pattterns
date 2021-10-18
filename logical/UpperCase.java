class UpperCase{
	public static void main(String[] args) {
	  String str ="AZAM";
	  char ch[]= str.toCharArray();
	  for (int i=0;i<ch.length ;i++ ) {
	  	if(ch[i]>='A'&&ch[i]<='Z'){
	  		ch[i]=(char)(ch[i]+32);

	  	}
	 

	  }
	   	String st =new String(ch);
	  System.out.println(st);
	
	}

}