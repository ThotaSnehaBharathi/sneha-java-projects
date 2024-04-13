import java.io.FileOutputstream;
poblic class FileOutputStreamExample {
public static void main(String args[]) {
try {
FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
fout.write(65);
fout.flush();
fout.close();
System.out.println("success...");
}catch(Exception e){system.out.println(e);}
}
}