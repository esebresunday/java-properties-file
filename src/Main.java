import java.util.*;
import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("cde.Properties");
        prop.load(fis);
        System.out.println(prop);
        String s = prop.getProperty("venki");
        System.out.println(s);
        prop.setProperty("nag", "12345");
        System.out.println(prop);
        FileOutputStream fos = new FileOutputStream("cde.Properties");
        prop.store(fos, "I have updated the file with nag");
    }
}