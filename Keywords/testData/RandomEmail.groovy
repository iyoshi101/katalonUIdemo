package testData
import com.kms.katalon.core.annotation.Keyword


class RandomEmail {

	//random mail generator
	@Keyword
	public String getEmail(String suffix,String prefix){
		int randomNo = (int)(Math.random() * 100000);
		return suffix + randomNo + "@" + prefix;
	}
}
