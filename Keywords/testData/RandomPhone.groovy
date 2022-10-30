package testData
import com.kms.katalon.core.annotation.Keyword
public class RandomPhone {
	//generate a random phone number starts with (347) 791
	@Keyword
	public String getPhone(){

		int randomNo = (int)(Math.random() * 8000) + 1000;
		return '347791' + randomNo;
	}
}
