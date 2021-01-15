import java.io.*;
class MyInput
{
  public static void main(String[] args) throws IOException
  {
    String text;
    InputStreamReader re = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(re);
   text = br.readLine(); 

    System.out.println(text);
  }
}