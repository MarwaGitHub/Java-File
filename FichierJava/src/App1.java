import java.io.File;

public class App1 {
 public static void main(String[] argv)
 {
	 File f=new File ("D:/Users/marwa.hami/Desktop/projet MY");
	 String[] contenu=f.list();
	 for(String s:contenu)
	 {
		 File f2=new File ("D:/Users/marwa.hami/Desktop/projet MY");
		 if(f2.isDirectory())
		 System.out.println("Rep : "+s);
		 else
	     System.out.println("File : "+s); 
	 }
 }
}
