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
                out.write(str.getBytes());//ͬ���������������Ĭ�ϲ��õ�ǰ�ļ����뷽ʽ�����ַ���д��������
                out.close();
          } catch(Exception e) {
                e.printStackTrace();
          }
    }
}
