package pipe;

import java.io.*;
import java.util.*;
public class MainClass{
public static void main(String [] args){
sender s = new sender();
receiver r = new receiver();
        PipedOutputStream out = s.getOut();
        PipedInputStream in = r.getIn();
        try{
             in.connect(out);//�������ܵ�����������in���룬out�����ʵ�ֻ��������ѭ�����
             s.start();
             r.start();
        }catch(Exception e){
             e.printStackTrace();
        }
    }
}

