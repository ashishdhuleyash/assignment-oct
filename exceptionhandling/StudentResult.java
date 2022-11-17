package com.yash.assignment.exceptionhandling;

public class StudentResult {
	 int english;
	    int math;
	    int c;
	    int java;
	    double result;



	   
	    public StudentResult() {
	        super();
	        
	    }



	   public StudentResult(int english, int math, int c, int java) {
	        super();
	        this.english = english;
	        this.math = math;
	        this.c = c;
	        this.java = java;
	    }
	    
	    public int getEnglish() {
	        return english;
	    }



	   public void setEnglish(int english) throws CustomExpTion{
	        if(english<40)
	        {
	            throw new CustomExpTion(" you are fail in english = "+ english +" your score should be above 40 marks");
	        }
	        else
	        this.english = english;
	    }



	   public int getMath() {
	        return math;
	    }



	   public void setMath(int math) throws CustomExpTion {
	        if(math<40)
	            throw new CustomExpTion(" you are fail in math = "+ math +" result your score should be above 40 marks");
	        else
	        this.math = math;
	    }



	   public int getC() {
	        
	        return c;
	    }



	   public void setC(int c) throws CustomExpTion {
	        if(c<40)
	        {
	            throw new CustomExpTion(" you are fail in c = "+ c +" result your score should be above 40 marks");
	        }
	        else
	        this.c = c;
	    }



	   public int getJava() {
	        return java;
	    }



	   public void setJava(int java) throws CustomExpTion {
	        if(java<40)
	        {
	            throw new CustomExpTion(" you are fail in java = "+ java +" result your score should be above 40 marks");
	        }
	        else
	        this.java = java;
	    }



	   public double getResult() {
	        return result;
	    }



	   public void setResult(int result) throws CustomExpTion {
	    if(result<40)
	    {
	        throw new CustomExpTion(" you are fail "+ result +" result your score should be above 40%");
	    }
	    else
	        this.result = result;
	    }
	    



	   public  double calResult()
	    {
	        double total=0;
	        total=english+math+c+java;
	        result=((total/4));
	        return result;
	        
	    }

}
