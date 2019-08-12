package pipe;

import java.io.PipedOutputStream;

public class sender extends Thread {
    PipedOutputStream out = new PipedOutputStream();
    public PipedOutputStream getOut(){
         return out;
    }
    public void run() {
          String str = "Hello,receiver ! I`m sender\n";
          try {
                out.write(str.getBytes());//同步方法，获得锁，默认采用当前文件编码方式，将字符串写进缓冲区
                out.close();
          } catch(Exception e) {
                e.printStackTrace();
          }
    }
}
