import java.io.*;

public class Archi02{
	public static void main(String[] args) {
		File archivo = null;
      	FileReader fr = null;
      	BufferedReader br = null;
      	try{
      		archivo = new File("E:\\20181-FP\\archivos\\registro.txt");
      		fr = new FileReader (archivo);
      		br = new BufferedReader(fr);
         	// Lectura del fichero
         	String linea;
         	while((linea=br.readLine())!=null){
           		System.out.println(linea);
         	}
      	}catch (Exception e) {
      		System.out.println("Mierror:"+e);
      	}

	}
}