package SocketProgramming;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException // haricen try catch olusturmadan hataları burda kontrol etmek için
    {
        ServerSocket s = new ServerSocket(8045); // bu portu server olarak acıldı.

        Socket s1 = s.accept();// bağlantıyı bekleme

        OutputStream s1out  = s1.getOutputStream();

        DataOutputStream dos = new DataOutputStream(s1out); // dosya geliş ve okuma işlemleri yapıldı.

        dos.writeUTF("Soket Programlama Başlatıldı"); //utf code çözümü yapıp string bir deger donduruyor.

        dos.close();
        s1out.close();


    }
}
