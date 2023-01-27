package xycoordinates;
import java.util.logging.Logger;
public class Basicpoint implements Cloneable{
	Logger logger= Logger.getLogger("com.api.jar");
	String x;
    String y;
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    Basicpoint(String x,String y)
    {
  	  this.x=x;
  	  this.y=y;
    }
    boolean checking(String tempx,String tempy)
    {
  	  if(this.x.equals(tempx)&&this.y.equals(tempy))
  	  {
  		  logger.info("X and Y Coordinates are Equal");
  		  return true;
  	  }
  	  else {
  		  logger.info("X and Y Coordinates are NotEqual");
  		  return false;
  	  }
    }
       public static void main(String[] arg) throws CloneNotSupportedException
        {
    	          Logger logger= Logger.getLogger("com.api.jar");
            	  Basicpoint a1=new Basicpoint("13.7","13.7");
            	  Basicpoint a2=new Basicpoint("13.7","13.7");
            	  logger.info("Coordinates status:"+a1.checking(a2.x,a2.y));
            	  Basicpoint a3=(Basicpoint)a1.clone();
            	  logger.info("Cloned Coordinates:X-"+a3.x+" Y-"+a3.y);
            	  
          }
}
