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
			case 1: getElse(numb%10);
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
	public static void getFirst(int numb){
		switch (numb){
			case 1: System.out.println("Сто");
			break;
			case 2: System.out.println("Двести");
			break;
			case 3: System.out.println("Триста");
			break;
			case 4: System.out.println("Четыреста");
			break;
			case 5: System.out.println("Пятьсот");
			break;
			case 6: System.out.println("Шестьсот");
			break;
			case 7: System.out.println("Семьсот");
			break;
			case 8: System.out.println("Восемьсот");
			break;
			case 9: System.out.println("Девятьсот");
			break;
		}
	}
		public static void getElse(int numb){
		switch (numb){
			case 0: System.out.println("Десять");
			break;
			case 1: System.out.println("Одиннадцать");
			break;
			case 2: System.out.println("Двеннадцать");
			break;
			case 3: System.out.println("Тринадцать");
			break;
			case 4: System.out.println("Четырнадцать");
			break;
			case 5: System.out.println("Пятьнадцать");
			break;
			case 6: System.out.println("Шестьнадцать");
			break;
			case 7: System.out.println("Семьнадцать");
			break;
			case 8: System.out.println("Восемьнадцать");
			break;
			case 9: System.out.println("Девятьнадцать");
			break;
		}
	}
	public static void main(String[] args) {
		int numb = 0;
		if(args.length > 0){
			numb = Integer.parseInt(args[0]);  
		}
		if(numb>=100){
			getFirst(numb/100);
			getSecond((numb/10)%10);
			getLast(numb%10);
		}else{
			if(numb>=10 ){
				getSecond(numb/10);
				getLast(numb%10);
			}else{
				getLast(numb%10);
			}
		}
		
    	//System.out.println(String.valueOf(Math.abs(numb)).length());
	}
}