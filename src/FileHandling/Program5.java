//File class Operations

package FileHandling;

import java.io.File;
import java.io.IOException;

public class Program5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("D:\\IOPrograms\\Sample.txt");
		boolean b1=f.createNewFile();
		// Creates a new File
		if(b1==true) {
			System.out.println("File Created!!");
		}else {
			System.out.println("File Already Exists!!");
		}
		System.out.println("---------");
		b1 = f.canExecute();
		System.out.println(b1);
		// Checks weather the file is executable or not
		System.out.println("---------");
		
		b1 = f.canRead();
		System.out.println(b1);
		// Checks whether the file is readable or not by the application
		System.out.println("---------");
		
		b1 = f.canWrite();
		System.out.println(b1);
		// Checks whether we can write in the file or not.
		System.out.println("---------");
		
//		boolean b2= f.delete();
//		System.out.println(b2);
		// Deletes the file which is created
		System.out.println("---------");
		
		f.deleteOnExit();
		// Deletes the file after the execution and when the Virtual machine is terminated
		System.out.println("---------");
//		for(int i=1;i<5;i++) {
//			System.out.println("Hello");
//			Thread.sleep(1000);
//		}
		
		b1 = f.exists();
		System.out.println(b1);
		// checks whether the file exists in the path that is specified
		
		System.out.println(f.getAbsolutePath());
		// returns the path of the file
		
		System.out.println(f.getAbsolutePath());
		// this also returns the path of the file 
		
		 System.out.println(f.getFreeSpace());
		 // this will give the available free space in the file
		 
		 System.out.println(f.getTotalSpace());
		 // this will give the overall space allocated to the file
		 
		 System.out.println(f.getName());
		 // this method will give the name of the file
		 
		 System.out.println(f.getParent());
		 // this method will give the parent of the file 
		 
		 System.out.println(f.getPath());
		 // this method will give the path of the file
		 
		 System.out.println(f.getUsableSpace());
		 // this method will give the space which is usable
		 
		 System.out.println(f.getClass());
		 // returns the class of this object
		 
		 System.out.println(f.getAbsoluteFile());
		 // same returns path
		 
		 System.out.println(f.getCanonicalFile());
		 // same returns path
		 
		 System.out.println(f.hashCode());
		 // hashcode for the object of this file
		 
		 System.out.println(f.isAbsolute());
		 System.out.println(f.isDirectory());
		 System.out.println(f.isFile());
		 
		 System.out.println(f.isHidden());
		 // Checks whether the file is hidden or not
		 
		 File f2 = new File("D:\\IOPrograms\\Output1.txt");
		 System.out.println(f2.isHidden());
		 
		 System.out.println(f.lastModified());
		 // returns the time when is the file last modified

		 
		 System.out.println(f.length());
		 
		
	}

}
