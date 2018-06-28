import java.io.*;

public class Archi02{
	public static void main(String[] args) {
		String fileName="E:\\20181-FP\\archivos\\registro.txt";
		FileWriter fichero = null;
        PrintWriter pw = null;
        try{
        	fichero = new FileWriter(fileName, true);
            pw = new PrintWriter(fichero);
			pw.println("Angel Sullon3 ");
        }catch (Exception e) {
        	System.out.println("Mierror:"+e);
        }finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

		reader(fileName);

	}

	public static void reader(String name){
		File archivo = null;
      	FileReader fr = null;
      	BufferedReader br = null;
      	try{
      		archivo = new File(name);
      		fr = new FileReader (archivo);
      		br = new BufferedReader(fr);
         	// Lectura del fichero
         	String linea;
         	while((linea=br.readLine())!=null){
           		System.out.println(linea);
         	}
      	}catch (Exception e) {
      		System.out.println("Mierror:"+e);
      	}finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
	}
}