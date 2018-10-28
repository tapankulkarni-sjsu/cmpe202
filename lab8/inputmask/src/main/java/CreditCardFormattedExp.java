/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardFormattedExp extends CreditCardExp
{

	public String getFormattedNumber() {
		StringBuilder formattedStr = new StringBuilder("");
		int count = 0;
		for(Character digit:getDate().toCharArray()) {
			if(count%2==0 && count!=0) {
				formattedStr.append("/");
			}
			formattedStr.append(digit);
			count++;
		}
		return formattedStr.toString();
	}
	
}