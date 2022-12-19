package com.lm.sbeans;

import java.util.Date;

public class WishMessageGenerate 
{
  private Date date;

public void setDate(Date date) {
	this.date = date;
}
  @SuppressWarnings("deprecation")
public String generateWishMessage(String user)
  {
	  int hour = 0;
	  hour = date.getHours();
	  if(hour<12)
		  return "GoodMorning "+user;
	  else if(hour<16) 
	  return "GoodAfternoon "+user;
	  
	  else if(hour<20)
	   return "GoodEvening "+user;
	  else
		  return "GoodNight "+user;
	  
	  
  }

  
}
