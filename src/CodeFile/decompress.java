package CodeFile;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class decompress {
	
	public static void decompressFunction(File file) throws IOException {
		// TODO Auto-generated method stub
		String fileDirectory = file.getParent();
        System.out.println(fileDirectory);
        
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/DecompressedFile.txt");
        
        byte[] buffer = new byte[1024];
        int len;
        
        while((len= gzipIS.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        
        gzipIS.close();
        fis.close();
        fos.close();
	}

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//	
//	File path = new File("D:\\EclipseWorkspace\\CompressDecompress\\src\\CodeFile\\Compressfile.gz");
//	
//	decompressFunction(path);
//	}
}
