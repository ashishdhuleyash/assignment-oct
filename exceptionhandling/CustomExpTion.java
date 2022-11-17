package com.yash.assignment.exceptionhandling;

public class CustomExpTion extends RuntimeException{
	  String message;



	   public CustomExpTion(String message) {
	        super();
	        this.message = message;
	    }



	   public String getMessage() {
	        return message;
	    }



	   public void setMessage(String message) {
	        this.message = message;
	    }

}
