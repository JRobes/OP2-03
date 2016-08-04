package asdf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

import com.google.common.io.LittleEndianDataInputStream;

public class op2Parser {
	//static String fileName = "fem-op2.op2";
	static String fileName = "elbdf_lll_2.op2";
	
	//private static int isAnotherTable = 0;
	private static boolean isAnotherTable = true;
	private static int valorLeido;

	private static String tableName;
		
	public static void main(String[] args) {
		FileInputStream inputStream;
		try {
	
			inputStream = new FileInputStream(fileName);
			LittleEndianDataInputStream stream = new LittleEndianDataInputStream(inputStream);
			readOP2Header(stream);
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			
			System.out.print(stream.readInt());System.out.print("\t");stream.skipBytes(8);System.out.print("8 bytes");System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			
			
			
			System.out.println(stream.readInt());//System.out.print("\t");
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			
			
			System.out.println(stream.readInt());//System.out.print("\n");

			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");stream.skipBytes(8);System.out.print("8 bytes");System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			
			
			System.out.println(stream.readInt());//CHAR4
			System.out.println(stream.readInt());//CHAR4
			System.out.println(stream.readInt());//CHAR4
			System.out.println(stream.readInt());//CHAR4
			//grid 1
			System.out.println(stream.readInt());//ID
			System.out.println(stream.readInt());//CP
			byte[] bytes = new byte[8];
			
			stream.read(bytes);
			System.out.println(ByteBuffer.wrap(bytes).getDouble());//x
			stream.read(bytes);
			System.out.println(ByteBuffer.wrap(bytes).getDouble());//y
			stream.read(bytes);
			System.out.println(ByteBuffer.wrap(bytes).getDouble());//z
			
			System.out.println(stream.readInt());//uno
			System.out.println(stream.readInt());//dos
			System.out.println(stream.readInt());//tres
			
			
			System.out.println(stream.readInt());//ID
			System.out.println(stream.readInt());//CP
			System.out.println(stream.readDouble());
			System.out.println(stream.readDouble());
			System.out.println(stream.readDouble());
			System.out.println();
			System.out.println(stream.readInt());
			System.out.println(stream.readInt());
			System.out.println(stream.readDouble());
			System.out.println(stream.readDouble());
			System.out.println(stream.readDouble());
			
			stream.skipBytes(452);System.out.print("452 bytes");System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			
			
			System.out.println(stream.readInt());
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
			System.out.println(byteToBinaryString(stream.readByte())+"  "+byteToBinaryString(stream.readByte()) +"  "+byteToBinaryString(stream.readByte())+"  "+ byteToBinaryString(stream.readByte()));
					
			System.out.println(stream.readInt());//System.out.print("\n");
			
			
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");
			
			//El cero final de tabla
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");

			//comienzo de la siguiente
			System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\t");System.out.print(stream.readInt());System.out.print("\n");

				
			//System.out.println(stream.readInt());
			//stream.skipBytes(28);
			////System.out.println("28 bytes");
			//System.out.println(stream.readInt());
			
						
			
			
			/*
			while (isAnotherTable){
				if (readTableName(stream)){

						readHeaderAndTrailer(stream);
						readTheTables(stream);
						readTables(stream);

				}
				else{
					isAnotherTable = false;
				}
			}
			*/
		
			inputStream.close();
			stream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Filename: "+fileName);
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	

	private static void readTheTables(LittleEndianDataInputStream myStream) {
		int markValue;
		markValue = readMarker(myStream);
		if(markValue!=7){
			System.out.println("Valor != 7");
			try {
				myStream.skipBytes((markValue+2)*4);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Valor == 7");
			try {
				//myStream.skipBytes((markValue+2)*4);
				
				myStream.skipBytes(4);
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
				//myStream.skipBytes(20);//3 WORDs header words
				myStream.skipBytes(4);
			
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}


	private static void readHeaderAndTrailer_EPT(LittleEndianDataInputStream myStream) {
  		int k;
  		System.out.println(readTri(myStream));//4 -1 4
  		k=readTri(myStream);//4 7 4
  		System.out.println(k);//7
  		try {
  			myStream.readInt();// 28
  			readCHAR4(myStream);//WORD
			readCHAR4(myStream);//WORD
			readCHAR4(myStream);//WORD
			
			myStream.skipBytes(16);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//8
  		
  	
	}


	private static void readTables(LittleEndianDataInputStream myStream) {
		boolean hasNextMarker = true;
		int markValue;
		while(hasNextMarker){
			markValue = readMarker(myStream);
			if (markValue != 0){
				try {
					
					myStream.skipBytes((markValue+2)*4);
					System.out.println("Skipped "+markValue*4+" integers of data");
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else{
				hasNextMarker = false;
			}
		}
	}
	
	private static int readMarker(LittleEndianDataInputStream myStream) {
		
		readTri(myStream);//First Int of Marker 
		readTri(myStream);//Second
		readTri(myStream);//Third
		
		
		return readTri(myStream);
	}
	private static void readHeaderAndTrailer(LittleEndianDataInputStream myStream) {
  		int k;
  		
		readTri(myStream);//4 -1 4
  		k=readTri(myStream);//4 7 4
  		
  		try {
			myStream.skipBytes(9*4);//8
			System.out.println("Skipped "+36+" bytes of data, 28 + 2*4");
						
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		
  		//readChars_header_trailer(myStream, k);//28 28bytes 28 		----- Header & Trailer 
		
	}
	private static String readChars_header_trailer(LittleEndianDataInputStream myStream, int k) {
		
		StringBuilder cadena = new StringBuilder();
		try {
			myStream.readInt();// 28
			//myStream.skipBytes(6);//3 WORDs header words
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			System.out.println(byteToBinaryString(myStream.readByte())+"  "+byteToBinaryString(myStream.readByte()));
			//myStream.skipBytes(20);//3 WORDs header words

			myStream.readInt();//28
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cadena.toString().trim();
		
	}


	private static boolean readTableName(LittleEndianDataInputStream myStream) {
  		
		int k;
		k=readTri(myStream);//4 2 4 
		if(k!=0){
			System.out.println();
			System.out.println("Reading table name...");
			tableName = readChars(myStream, k);//8 8bytes 8			----- GEOM1
			//System.out.println(tableName);
			return true;
		}
		else{
			System.out.println("End of OP2 file.");
			return false;
		}
		
			
	}
	private static void readOP2Header(LittleEndianDataInputStream stream) {
        
		byte[] 	myByteDate 	= new byte[12];
		int k;
		try {
			System.out.println("Reading op2 header...");
			stream.readInt();//4
			stream.readInt();//3
		   	System.out.println("FECHA");
			stream.skipBytes(8);//4 y 12
			stream.read(myByteDate, 0, 12);
				
			System.out.println(myByteDate[0]+"/"+myByteDate[4]+"/"+myByteDate[8]);//Fecha5/7/15 (12 bytes)
			System.out.println(stream.readInt());//12
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
       
		k=readTri(stream);//4 7 4
		readChars(stream, k);//28 28bytes 28 	----- NASTRAN FORT TAPE ID CODE - 
		k=readTri(stream);//4 2 4
		readChars(stream, k);// 8 8bytes 8		----- XXXXXXXXX
		k=readTri(stream);//4 -1 4
  		k=readTri(stream);//4 0 4 
  		System.out.println("End of op2 header.");
  		System.out.println("********************************************************************************");
		
	}
	
	
	static int readTri(LittleEndianDataInputStream myStream){
		int j = 987654321;
		try {
			myStream.readInt();
			j= myStream.readInt();
			myStream.readInt();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return j;
		
	}
	
	static String readChars(LittleEndianDataInputStream myStream, int numberInts){
		byte[] micadena = new byte[numberInts*4];
		StringBuilder cadena = new StringBuilder();
		try {
			myStream.readInt();
			myStream.read(micadena, 0, numberInts*4);
			for (int i = 0; i < numberInts*4; i++ ){
				cadena.append((char)micadena[i]);
				//System.out.println((char)micadena[i]);
			}
			System.out.println(cadena);
			myStream.readInt();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cadena.toString().trim();
		
	}
	static String readCHAR4(LittleEndianDataInputStream myStream){
		byte[] micadena = new byte[4];
		StringBuilder cadena = new StringBuilder();
		try {
			
			myStream.read(micadena, 0, 4);
			for (int i = 0; i < 4; i++ ){
				cadena.append((char)micadena[i]);
				//System.out.println((char)micadena[i]);
			}
			System.out.println("CHAR4 = "+cadena);
			//myStream.readInt();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cadena.toString();
	}
	
	static String byteToBinaryString(byte b){
	    StringBuilder binaryStringBuilder = new StringBuilder();
	    for(int i = 0; i < 8; i++)
	        binaryStringBuilder.append(((0x80 >>> i) & b) == 0? '0':'1');
	    return binaryStringBuilder.toString();
	}
	
	
	static String lee3(LittleEndianDataInputStream myStream) throws IOException{
			valorLeido = myStream.readInt();
			String valor = Integer.toString(valorLeido);
			String valor_mitad;
			if(valorLeido != 4){
				myStream.skipBytes(valorLeido*4);
				myStream.readInt();
				
				return valor+"\t"+ Integer.toString(valorLeido*4)+" bytes\t"+valor;
			}
			else{
				valor_mitad =Integer.toString(myStream.readInt());
				myStream.readInt();
				
				return valor+"\t"+valor_mitad+"\t"+valor;
			}
		
		
		
	}
	
	
	
	
	
	
}
