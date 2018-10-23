import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App3 {

	public static void main(String[] args) throws Exception {
		File f1=new File ("D:/Users/marwa.hami/git/LocalFichierJava/FichierJava/src/bulletin.txt");
		 FileReader fr=new FileReader(f1);
		 BufferedReader br=new BufferedReader(fr);
		 String s;
		 float somme=0; int nb=0;
		 while((s=br.readLine())!=null)
			 
		 {  
			 ++nb;
			 String[] t=s.split(";");
			 
			 float note=Float.parseFloat(t[2]);
			 somme += note;
			
		 }
		 System.out.println("Moy= "+somme/nb);
	}

}
