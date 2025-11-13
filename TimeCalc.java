public class TimeCalc {
public static void main(String [] args) { 
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int minToAdd = Integer.parseInt("" + args[1]);
		String time = "";
		if (minutes + minToAdd >=60)
		{
			hours = hours + ((minutes + minToAdd)/60);
			minutes = (minutes + minToAdd)%60;
		}
		else{
			minutes = minutes + minToAdd;
		}

		if(hours >= 24){
			hours = hours % 24;
		}
		if(hours < 10){
			time = "0" + Integer.toString(hours) + ":";
		}
		if(hours >= 10){
			time = Integer.toString(hours) + ":";
		}
		if(minutes < 10){
			time = time + "0" + Integer.toString(minutes);
		}
		else{
			time = time + Integer.toString(minutes);

		}
		System.out.println(time);    }
}
