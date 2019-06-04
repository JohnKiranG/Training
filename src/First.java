//First.java  
import java.applet.Applet;  
import java.awt.Graphics;  
public class First extends Applet{  

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String eno, ename;
double sal, tax;

public void init() {
	eno = "10";
	ename = "Aditya";
	sal = 300000;
	if(sal<= 250000) {
		tax = 0;
	} else if (sal> 250000 && sal<=500000) {
		tax = (sal * 5)/100;
	} else {
		tax = (sal * 10)/100;
	}
}

public void paint(Graphics g) {
	g.drawString("Emp no = "+eno+"\n"+"Name = "+ename+"\n"+"Salary ="+sal,20,100);
	g.drawString("taxvalue = "+String.valueOf(tax),50,100);
}

//public void paint(Graphics g){  
//g.drawString("welcome",150,150);  
//}  
 
}  