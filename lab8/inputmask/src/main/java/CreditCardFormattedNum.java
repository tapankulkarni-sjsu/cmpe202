/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardFormattedNum extends CreditCardNum
{

	public String getFormattedNumber() {
		StringBuilder formattedStr = new StringBuilder("");
		int count = 0;
		for(Character digit:getNumber().toCharArray()) {
			if(count%4==0 && count!=0) {
				formattedStr.append(" ");
			}
			formattedStr.append(digit);
			count++;
		}
		return formattedStr.toString();
	}


}