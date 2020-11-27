package com.cg.training.client;
//package com.cg.training.client;
//	
//	import java.io.*;
//	public class Exercise2
//	{
//	    
//	           public static void process(String str)
//	           {
//	                  System.out.println(str);
//	           }
//	           public void analyze(String s)
//	           {
//	                  File f=new File(s);
//	                  if(f.exists())
//	                  {
//	                	  process(f.getName()+" is a file");
//	                	  process(f.canRead()?" is readable":" is not readable");
//	                	  process(f.canWrite()?" is writable":" is not writable");
//	                	  process("Filesize:"+f.length()+" bytes");
//	                	  process("File last mdified:"+f.lastModified());
//	                  }
//	                  if(f.isDirectory())
//	                  {
//	                	  process(f.getName()+" is directory");
//	                	  process("List of files");
//	                   String dir[]=f.list();
//	                  for(int i=0;i<dir.length;i++)
//	                	  process(dir[i]);
//	                  }
//	           }
//	          
//	       public static void main(String rr[])throws IOException
//	           {
//	        	   Exercise2 fd=new Exercise2();
//	                  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	                  System.out.println("Enter the file name:");
//	                  String s=br.readLine();
//	                  fd.analyze(s);
//	           }
//	}
//	 
//

import java.io.File;
class FileDemo {
	static void p(String s) {
		System.out.println(s);
	}
	public static void main(String args[]) {
		File f1 = new File(args[0]);
		p("File Name: " + f1.getName());
		p("Path: " + f1.getPath());
		p("Abs Path: " + f1.getAbsolutePath());
		p("Parent: " + f1.getParent());
		p(f1.exists() ? "exists" : "does not exist");
		p(f1.canWrite() ? "is writeable" : "is not writeable");
		p(f1.canRead() ? "is readable" : "is not readable");
		p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
		p(f1.isFile() ? "is normal file" : "might be a named pipe");
		p(f1.isAbsolute() ? "is absolute" : "is not absolute");
		p("File last modified: " + f1.lastModified());
		p("File size: " + f1.length() + " Bytes");
	} }

