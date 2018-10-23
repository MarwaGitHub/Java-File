import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App4 {

	public static void main(String[] args) throws Exception {
		File f1=new File ("D:/Users/marwa.hami/git/LocalFichierJava/FichierJava/src/f.doc");
		FileInputStream fis=new  FileInputStream(f1);
		BufferedInputStream bis= new BufferedInputStream(fis);
		
		File f2=new File ("f.zip");
		FileOutputStream fos=new  FileOutputStream(f2);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		ZipOutputStream zos=new ZipOutputStream(bos);
		zos.setMethod(ZipOutputStream.DEFLATED);
		zos.putNextEntry(new ZipEntry(f1.getName()));
		int c;
		while((c=bis.read())!=-1)
		{
			zos.write(c);
		}
		zos.close();
	}

}
