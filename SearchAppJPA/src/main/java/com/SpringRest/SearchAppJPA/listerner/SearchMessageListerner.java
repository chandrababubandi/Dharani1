package com.SpringRest.SearchAppJPA.listerner;

import org.springframework.stereotype.Component;

@Component
public class SearchMessageListerner {
	
	public String reveiverSearchMessdage(Message jsonMessage) {
		System.out.println("The received Message is : " +jsonMessage);
		return "Successfully received";
	}

}
