package com.GlobalSoftwareAcademy;

public class TryCatchException {
	
	//Create a class-level-variable:
	static String javaProgramFile = "TryCatchException.java";
	
	public static void main(String[] args) {
		//Create a method-level-variable:
		String messageToDisplay = "Hello World!";
		
        System.out.println("Say '" + messageToDisplay + "'");
        System.out.println("...inJavaProgram: " + javaProgramFile);
        
        try {
        	//doSomeUsefulCalculationsHere
        	int result = 3 / 0;
        } catch (Exception error) {
            System.out.println( "ERROR-FOUND: Numbers Cannot Be Divided By 0: " + error.toString() );
            error.printStackTrace();
        }
	}
}
