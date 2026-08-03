import java.util.Arrays;
class CharacterFrequency{
	public static void main(String[] args){
	
		String str = "java is easy and arrays are more easy ";
		//String [] arr = str.split(" ");
		char[] ch = str.toCharArray();
		int n = ch.length;
		strFrequency(ch,n);
		distinct(ch,n);
		unique(ch,n);
		duplicate(ch,n);
		
		
	}
	public static void strFrequency(char [] ch , int n){
		boolean [] b = new boolean[n];
		for(int i = 0 ; i<n ; i++){
		if(b[i]) continue;
		int cnt = 1;
		for(int j = i+1; j<n ; j++){
			if(ch[i]==(ch[j]) && !b[j]){
				cnt++;
				b[j] = true;
				}
			}
			System.out.println(ch[i]+ " : " +cnt);
			}
			System.out.println("_______Distinct__________");
	
		}
	
		public static void distinct(char [] ch,int n){
			boolean [] b = new boolean[n];
			for(int i = 0; i<n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(ch[i]==(ch[j])){
					cnt++;
					b[j] = true;
					}
				}
				System.out.println(ch[i]);
			}
			System.out.println("__________unique_____");
		}	
		public static void unique(char[] ch, int n){
			boolean [] b =  new boolean[n];
			for(int i = 0 ; i < n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(ch[i]==(ch[j])){
					cnt++;
					b[j] = true;
					
				}
		}
		if(cnt == 1)
		System.out.println(ch[i]+ " : " +cnt);
		}
		System.out.println("___________duplicate____________");
	}		
		public static void duplicate(char[] ch, int n){
			boolean [] b = new boolean[n];
			for(int i = 0; i < n ; i++){
			if(b[i]) continue;
			int cnt = 1;
			for(int j = i + 1; j<n ; j++){
				if(ch[i]==(ch[j])){
					cnt++;
					b[j] = true;
				}
			}
			if(cnt > 1)
			System.out.println(ch[i] +" : " +cnt);
		}	
	}
}

