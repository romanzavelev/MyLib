/**
 * 
 */
package ru.print;


/**
 * @author ������������
 *
 */
public class MyPrint {
	
	public static void p(String text, String cp) {
	
		
		try {
			System.out.write(text.getBytes(cp));
		} catch (Exception e) {
			e.printStackTrace();
		}		
	} 

}

