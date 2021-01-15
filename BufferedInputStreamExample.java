import java.io.*;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		byte[] by = new byte[1024];
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"E:/Addall.txt"));

		int i = 0;
		while ((i = bis.read(by)) != -1) {
			String st = new String(by, 0, i);
			System.out.print(st);
		}
		bis.close();
	}
}