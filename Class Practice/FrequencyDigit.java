class FrequencyDigit 
{
	public static void main(String[] args) 
	{
		int num = 234565438;
		//freqDgt(num , 0);
		//distinctDigit(num , 0);
		//uniqueDigit(num, 0);
		//highestRepeatingDigit(num,0);
		leastRepeatedDigit(num , 0);
		
	}
	public static void freqDgt(int num , int i){
		if(i > 9) return;
		int cnt = findFreq(i , num , 0);
		if(cnt != 0) System.out.print(i+" : " +cnt);
		System.out.println();
		freqDgt(num,++i);
}
	public static int findFreq(int i , int num , int cnt){
	if(num == 0) return cnt;
	if(i == (num%10)) cnt++;
	return findFreq(i, num/10,cnt);
}

//distinct
	public static void distinctDigit(int num , int i){
		if(i > 9) return;
		int cnt = findFreq(i , num , 0);
		if(cnt == 1) System.out.println(i+" ");
		distinctDigit(num,++i);
	}
	public static int distinctDigit(int i , int num , int cnt){
		if(num == 0) return cnt;
		if(i != (num%10)) cnt++;
		return distinctDigit(i, num/10, cnt);
	}
	
	//uniwueDigit
	
	public static void uniqueDigit(int num, int i){
		if(i > 9) return;
		int cnt = uniqueDigit(i , num ,  0);
		if(cnt == 1) System.out.println(i+" : " +cnt);
		uniqueDigit(num, ++i);
	}
	
	public static int uniqueDigit(int i , int num , int cnt){
		if(num == 0) return cnt;
		if(i == (num%10)) cnt++;
		return uniqueDigit(i , num/10, cnt);
	}
	
	//duplicateDigit
	public static void duplicateDigit(int num , int i){
		if(i > 9) return;
		int cnt = duplicateDigit(i , num , 0 );
		if(cnt > 1) System.out.println(i+ " : " +cnt);
		duplicateDigit(num,++i);
	}
	
	public static int duplicateDigit(int i , int num , int cnt){
		if(num == 0) return cnt;
		if(i == (num%10)) cnt++;
		return duplicateDigit(i , num/10, cnt);
	}
	
	//highest repeating digit
	//static int highestDigit = -1;
   // static int freq = 0;


public static void highestRepeatingDigit(int num, int i){
    if(i > 9){
        System.out.println(highestDigit + " : " + freq);
        return;
    }

    int cnt = highestRepeatingDigit(i, num, 0);

    if(cnt > freq){
        freq = cnt;
        highestDigit = i;
    }

    highestRepeatingDigit(num, ++i);
}

public static int highestRepeatingDigit(int i, int num, int cnt){
    if(num == 0) return cnt;

    if(i == (num % 10))
        cnt++;

    return highestRepeatingDigit(i, num / 10, cnt);
}

//least Repeated Digit
	static int highestDigit = -1;
	static int freq = 0;
	
	public static void leastRepeatedDigit(int num, int i){
		if( i > 9){
			System.out.println(highestDigit+ " : " +freq);
			return;
		}
		int cnt = leastRepeatedDigit(i , num , 0);;
		
		if(cnt > freq){
			freq = cnt;
			highestDigit = i;
		}
		highestRepeatingDigit(num , ++i);
	}
	public static int leastRepeatedDigti(int i, int num, int cnt){
		if(num == 0) return cnt;
		
		if( i == (num % 10));
			cnt++;
			
		return highestRepeatingDigit(i , num / 10 , cnt);
		System.out.prinltn("..");
		
	}
		

}
