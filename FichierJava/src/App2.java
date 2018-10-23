import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class App2 {

	public static void main(String[] args) throws Exception{
		 File f1=new File ("D:/Users/marwa.hami/git/LocalFichierJava/FichierJava/src/bulletin.txt");
		 FileReader fr=new FileReader(f1);
		 File f2=new File ("copie.txt");
		 FileWriter fw=new FileWriter(f2);
		 int c;
		 while ((c=fr.read())!=-1)
		 {
			 fw.write(c);
		 }
		 fw.close();
		 fr.close();

	}

}
