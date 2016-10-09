public class NumbCon{
	static String result = "";
	public static void getLast(int numb){
		switch ((numb%100)%10){
			case 1: result += "Один";
			break;
			case 2: result += "Два"; 
			break;
			case 3: result += "Три";
			break;
			case 4: result += "Четыре";
			break;
			case 5: result += "Пять";
			break;
			case 6: result += "Шесть";
			break;
			case 7: result += "Семь";
			break;
			case 8: result += "Восемь";
			break;
			case 9: result += "Девять";
			break;
		}
		
	}
	public static void getSecond(int numb){
		switch ((numb%100)/10){
			case 0: getLast(numb);
			break;
			case 1: getElse(numb%10);
			break;
			case 2: result += "Двадцать ";
			break;
			case 3: result += "Тридцать ";
			break;
			case 4: result += "Сорок ";
			break;
			case 5: result += "Пятьдесят ";
			break;
			case 6: result += "Шестьдесят ";
			break;
			case 7: result += "Семьдесять ";
			break;
			case 8: result += "Восемьдесять ";
			break;
			case 9: result += "Девяносто ";
			break;
		}
	}
	public static void getFirst(int numb){
		switch (numb/100){
			case 1: result += "Сто ";
			break;
			case 2: result += "Двести ";
			break;
			case 3: result += "Триста ";
			break;
			case 4: result += "Четыреста ";
			break;
			case 5: result += "Пятьсот ";
			break;
			case 6: result += "Шестьсот ";
			break;
			case 7: result += "Семьсот ";
			break;
			case 8: result += "Восемьсот ";
			break;
			case 9: result += "Девятьсот ";
			break;
		}
	}
	public static void getElse(int numb){
		switch (numb%10){
			case 0: result += "Десять ";
			break;
			case 1: result += "Одиннадцать ";
			break;
			case 2: result += "Двенадцать ";
			break;
			case 3: result += "Тринадцать ";
			break;
			case 4: result += "Четырнадцать ";
			break;
			case 5: result += "Пятнадцать ";
			break;
			case 6: result += "Шестнадцать ";
			break;
			case 7: result += "Семнадцать ";
			break;
			case 8: result += "Восемнадцать ";
			break;
			case 9: result += "Девятнадцать ";
			break;
		}
	}
	public static void main(String[] args) {
		int numb = 0;
		if(args.length > 0){
			numb = Integer.parseInt(args[0]); 
			if(numb > 999 || numb < 1){
				System.out.println("Out of range");
			}else {
				getFirst(numb);
				getSecond(numb);
				if((numb%100) > 19){
					getLast(numb);
				}
			}
			System.out.println("Вы ввели - " + numb);
			System.out.println(result);
		}else {
			System.out.println("Enter the data\nlike: java NumbCon 12");
			System.out.println("===========================================\n Compile with -encoding utf8\n===========================================");
		}
	}
}
