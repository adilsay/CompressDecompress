package CodeFile;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class compress {
	
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		File path = new File("D:\\EclipseWorkspace\\CompressDecompress\\src\\CodeFile\\demo.txt");
//		compressfunction(path);
//	}

	public static void compressfunction(File path) throws IOException {
		// TODO Auto-generated method stub
		String filedir = path.getParent();
		System.out.print(filedir);
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream(filedir+"\\Compressfile.gz");
		GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
		byte[] buffer = new byte[1024];
		int len;
		while((len = fis.read(buffer)) != -1) {
			gzipOS.write(buffer, 0, len);
		}
		gzipOS.close();
		fos.close();
		fis.close();
	}

}
