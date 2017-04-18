/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class FilterOutputApplication {
public static void main(String[] args) throws Exception {
OutputStream OutputStreamObj = null; 
FilterOutputStream filterOutputStreamObj = null;
FileInputStream filterInputStreamObj = null;
byte[] bufObj = {81, 82, 83, 84, 85};
int i=0;
char c;
//encloses the creation of stream objects within try-catch block
try{
// creates output stream objects
OutputStreamObj = new FileOutputStream("C:\\Users\\Engr.Awais\\Desktop\\karachi.txt");
filterOutputStreamObj = new FilterOutputStream(OutputStreamObj);
// writes to the output stream from bufObj 
filterOutputStreamObj.write(bufObj);
// forces the byte contents to be written to the stream
filterOutputStreamObj.flush();
// creates an input stream object
filterInputStreamObj = new FileInputStream("C:\\Users\\Engr.Awais\\Desktop\\karachi.txt");
while((i=filterInputStreamObj.read())!=-1)
{ // converts integer to character
c = (char)i;
// prints the character read
System.out.println("Character read after conversion is: "+ c);
}
}catch(IOException e){
// checks for any I/O errors
System.out.print("Close() is invoked prior to write()");
}finally{
// releases system resources associated with the stream
if(OutputStreamObj!=null)
OutputStreamObj.close();
if(filterOutputStreamObj!=null)
    OutputStreamObj.close();
if(filterOutputStreamObj!=null){
    }
}
}}