class CameCase{
	public static void main(String[] args) {
		String str="Azam Amir Reza";
		char ch[] = str.toCharArray();
		for (int i=0;i<ch.length ;i++ ) {
			if((i==0 || ch[i-1]==' ')&&(ch[i]>='a'&&ch[i]<='z')){
				ch[i]=(char)(ch[i]-32);
			}
		}
		String st =new String(ch);
		System.out.println(st);
	}
}