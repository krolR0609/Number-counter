import java.util.Scanner;
public class NumbCon{
	public static void getLast(int numb){
		switch (numb){
			case 1: System.out.println("Один");
			break;
			case 2: System.out.println("Два");
			break;
			case 3: System.out.println("Три");
			break;
			case 4: System.out.println("Четыре");
			break;
			case 5: System.out.println("Пять");
			break;
			case 6: System.out.println("Шесть");
			break;
			case 7: System.out.println("Семь");
			break;
			case 8: System.out.println("Восемь");
			break;
			case 9: System.out.println("Девять");
			break;
		}
		

	}
	public static void getSecond(int numb){
		switch (numb){
			case 1: System.out.println("00");
			break;
			case 2: System.out.println("Двадцать");
			break;
			case 3: System.out.println("Тридцать");
			break;
			case 4: System.out.println("Сорок");
			break;
			case 5: System.out.println("Пятьдесят");
			break;
			case 6: System.out.println("Шестьдесят");
			break;
			case 7: System.out.println("Семьдесят");
			break;
			case 8: System.out.println("Восемьдесят");
			break;
			case 9: System.out.println("Девяносто");
			break;
		}
	}
	public static void main(String[] args) {
		int numb = 0;
		if(args.length > 0){
			numb = Integer.parseInt(args[0]);  
		}
		if(numb<100){
			switch(numb/10){
				case 0: getLast(numb);
				break;
				default: getSecond(numb/10);
				getLast(numb%10);
				break;

			}
		}
    	//System.out.println(String.valueOf(Math.abs(numb)).length());
	}
}