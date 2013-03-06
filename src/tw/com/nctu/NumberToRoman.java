package tw.com.nctu;

import static org.junit.Assert.assertEquals;

public class NumberToRoman {

	public String print(int i) {
		if (isLevel1(i))
		//TODO DO Something
			System.out.println(printLevel1(i));
		else if (isLevel2(i))
		//TODO DO Something
			System.out.println("level2");
		else if (isLevel3(i))
		//TODO DO Something
			System.out.println("level3");
		else if (isLevel4(i))
			System.out.println("level4");
	
		switch (i){
		case 1:
		return "I";
		case 2:
		return "II";
		case 3:
		return "III";
		case 4:
		return "IV";	
		case 5:
		return "V";
		case 10:
		return "X";
		case 50:
		return "L";
		case 100:
		return "C";
		case 500:
		return "D";
		case 1000:
		return "M";
		default:
		return "";
		}
	}

	public boolean isLevel1(int i){
		if (i >= 1 && i <= 9){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isLevel2(int i){
		if (i >= 10 && i <= 99){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isLevel3(int i){
		if (i >= 100 && i <= 999){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isLevel4(int i){
		if (i >= 1000 && i <= 9999){
			return true;
		}else {
			return false;
		}
	}
	
	//TODO Not tested...yes, is a shame
	public String printLevel1(int i){
		String finalString = "";
		for(;i<=3;i--){
			finalString+="I";
			if(i==0)
				return finalString;
		}
		if(i==4){
			finalString="IV";
			return finalString;
		}
		finalString+="V";
		if(i==9){
			finalString="IX";
			return finalString;
		}
		for(;i>5;i--){
			finalString+="I";
			if(i==5)
				return finalString;
		}
		return finalString;
	}
}
