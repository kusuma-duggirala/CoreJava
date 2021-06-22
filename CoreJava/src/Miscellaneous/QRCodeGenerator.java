package Miscellaneous;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator 
{

	public static void main(String[] args) throws IOException 
	{
		String details="Name: Kusuma, EmpId: 1058643";
		ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
		File f=new File("QRCode.jpg");
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.flush();
		

	}

}
