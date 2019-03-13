import java.io.*;
import java.util.*;
import java.net.*;

public class MyServer {
public static void main(String[] args){
try{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection 

DataInputStream dis=new DataInputStream(s.getInputStream());


String	str=(String)dis.readUTF();
System.out.println("message= "+str);


//TimerTask tasknew = new TimerTask();
   Thread t=new Thread();
      
   // scheduling the task at interval
   t.sleep(5000);  

DataOutputStream dout=new DataOutputStream(s.getOutputStream());

while(true)
{
i++;
dout.writeUTF("Frame " + i%2+ "received\n ACK"+(i+1)%2+" sent");
dout.flush();
}
dout.close();

ss.close();

}catch(Exception e){System.out.println(e);}
}
}
