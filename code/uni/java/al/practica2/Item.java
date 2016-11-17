public class Item {
	  private int clave;
	  private String info;

	  public Item(int clave, String info){
		  this.clave = clave;
		  this.info = info;
	  }
	  
	  public int getClave(){
		  return clave;
	  }
	  
	  public String getInfo(){
		  return info;
	  }
	  
	  @Override
	  public String toString(){
		  return "{"+clave+", '"+info+"'}";
	  }
}
