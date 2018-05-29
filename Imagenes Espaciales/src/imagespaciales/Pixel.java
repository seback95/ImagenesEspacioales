package imagespaciales;

public class Pixel {
	private int indexStart;
	private int indexEnd;
	private int cantRepe=1;
	private char color;
	public Pixel (int indexStart,char color)
	{
		this.indexStart=indexStart;
		this.color=color;
	}
	public char getColor()
	{
		return this.color;
	}
	public int getIndexStart()
	{
		return this.indexStart;
	}
	public int getIndexEnd()
	{
		return this.indexEnd;
	}
	public void setColor(char color)
	{
		this.color=color;
	}
	public void setIndexEnd(int end)
		{
			this.indexEnd=end;
		}
	public void setIndexStart(int end)
	{	
		this.indexStart=end;
	}
	public void setCantRep(int rep)
	{
		this.cantRepe=rep;
	}
	public int getCantrep()
	{
		return this.cantRepe;
	}
				
		
}
