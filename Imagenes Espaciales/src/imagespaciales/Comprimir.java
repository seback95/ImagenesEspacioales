package imagespaciales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Comprimir {
	 String Pixelescomprimidos="";		//PixelesComprimidos
	char PixelesNocomprimidos[];	//PixelesNocomprimidos
	public Comprimir(String nomArch)
	{
		File archivo = new File(nomArch);
		FileReader fr= null;
		BufferedReader  br=null;
		try {
			fr =new FileReader(archivo);
			br=new BufferedReader(fr);
			String linea;
			if((linea=br.readLine())!=null)
			{
				int size = linea.length();
				this.PixelesNocomprimidos =new char[size];
				this.PixelesNocomprimidos=linea.toCharArray();
			}
			
		}catch(Exception e) {e.printStackTrace();}	
		finally {
			try {
					if(fr!=null)
						fr.close();
			}catch(Exception e2)
			{e2.printStackTrace();}
					
			}
	}
	public void resolver()				//(O)=n 
	{
		Pixel pix = new Pixel(0,PixelesNocomprimidos[0]);
		int i=0;
		for(i = 0 ; i < PixelesNocomprimidos.length ; i++)
		{
			if(pix.getColor()!=PixelesNocomprimidos[i])
			{ //entra al if por cada cambio de pixel
				pix.setIndexEnd(i-1);
				pix.setCantRep(pix.getIndexEnd()-pix.getIndexStart()+1);
				comprimirPixel(pix,this);
				//Reseteo el objeto pixel
				pix.setCantRep(1);
				pix.setColor(PixelesNocomprimidos[i]);
				pix.setIndexStart(i);
			}
			
		}
				pix.setIndexEnd(i-1);
				pix.setCantRep(pix.getIndexEnd()-pix.getIndexStart()+1);
				comprimirPixel(pix,this);
		
	}
	
	public static void comprimirPixel(Pixel pix,Comprimir Obj)
	{	
		

		if(pix.getCantrep() > 4)
		{
			String aux="(" + ""+pix.getColor()+""+ pix.getCantrep()+") ";
			Obj.Pixelescomprimidos=Obj.Pixelescomprimidos.concat(aux);			
		}
		else
		{
			for( int i =0;i < pix.getCantrep() ; i++ )			//ESTE CILCO ES DESPRECIABLE YA QUE ES (O)=1
			{
				Obj.Pixelescomprimidos=Obj.Pixelescomprimidos.concat(""+pix.getColor()+"");
			}
		}
	}
	@Override
	public String toString() {
		return "Comprimir [Pixelescomprimidos=" + Pixelescomprimidos + "]";
	}

}
