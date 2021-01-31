package SocketProgramming;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) throws IOException
    {
        Socket s1 = new Socket("localhost",8045); // client baglantısı yapıldı

        InputStream s1in = s1.getInputStream();

        DataInputStream dis = new DataInputStream(s1in);

        String st = new String(dis.readUTF()); // server tarafındaki writeutf yi okuma işlemi yapıldı

        JOptionPane.showMessageDialog(null,"Socket Programming",st,JOptionPane.INFORMATION_MESSAGE);

        dis.close();
        s1in.close();
        s1.close();
    }
}
