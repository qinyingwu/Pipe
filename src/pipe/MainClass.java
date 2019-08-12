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
             in.connect(out);//将两个管道连接起来，in输入，out输出，实现缓冲数组的循环输出
             s.start();
             r.start();
        }catch(Exception e){
             e.printStackTrace();
        }
    }
}

