

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public int a = 2;
	public int b = 12;
	public static void main(final String[] args) {
		String digits = e.substring(a,b);
		double dNum = Double.parseDouble(digits);
		for(int i=0;i<e.length();i++){
			if(isPrime(dNum) == true){
				System.out.print(dNum);
			}
			else{
				a++;
				b++;
			}
		}
	}
	

	//Finish this function
	public static boolean isPrime(double dNum){
		if(dNum < 2){
    return false;
  }
  else if(dNum >= 2){
    for(int i = 2; i <= Math.sqrt(dNum); i++){
      if(dNum%i == 0){
        return false;
      }
    }
  }
  return true;
	}

}

