// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String mode = args[1];	
		int number;
		int times;
		if(mode.equals("v")){
			for(int i = 1; i <= n; i++){
				number = i;
				times = 1;
				System.out.print(number + " ");
				if(i == 1){
					times = times + 1;
					if(number % 2 == 0){
						number = number /2;
						System.out.print(number + " ");
					}
					else{
						number = (number * 3) + 1;
						System.out.print(number + " ");
					}
				}
				
				while(number != 1){
					if(number % 2 == 0){
						number = number /2;
						System.out.print(number + " ");
					}
					else{
						number = (number * 3) + 1;
						System.out.print(number + " ");
					}
					times = times + 1;	
				}

				if(number == 1){
						System.out.println("(" + times + ")");
				}
				
			}
		}
		if(mode.equals("c")){
				for(int i = 1; i <= n; i++){
				number = i;
				times = 1;
				if(i == 1){
					times = times + 1;
					if(number % 2 == 0){
						number = number /2;
					}
					else{
						number = (number * 3) + 1;
					}
				}
				
				while(number != 1){
					if(number % 2 == 0){
						number = number /2;
					}
					else{
						number = (number * 3) + 1;
					}
					times = times + 1;	
				}				
			}
		}	
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1");
	}
}
