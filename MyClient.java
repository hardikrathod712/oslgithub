import java.util.*;
import java.io.*;
import java.net.*;

public class MyClient {
public static void main(String[] args) {
try{	
Socket s=new Socket("localhost",6666); // 6666 is port number
/*DataInputStream dis=new DataInputStream(s.getInputStream());


String	str=(String)dis.readUTF();
System.out.println("message= "+str);*/
	
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

dout.writeUTF("Frame "+ i%2 +"sent\n ACK "+(i+1%2+"received");
 Thread t=new Thread();
 t.sleep(5000);
dout.flush();



