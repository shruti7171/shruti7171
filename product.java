import java.util.Scanner;
class product{
   int gst,qty;
   float price,fprice,tax;
   String name,id;
   
   void displayinfo()
   {
	 Scannerobj=new Scanner(System.in);
     System.out.println("Enter product name:");
	 name=obj.next();
	 System.out.println("Enter productid:");
	 id=obj.next();
	 System.out.println("Enter price:");
	 price=obj.nextFloat();
	 System.out.println("Enter quantity:");
	 qty=obj.nextInt();
	 System.out.println("Enter GST:");
     gst=obj.nextInt();
	 
	 calculate();
	 
	   System.out.println("Product name:"+name);
	   System.out.println("Product Id:"+id);
	   System.out.println("Price:"+price);
	   System.out.println("Quantity:"+qty);
	   System.out.println("Final price:"+fprice);
	   System.out.println("Tax:"+tax);
	   if(fprice<500)
		 {
		 System.out.println("Product is Affordable");
		}
	   else
		{
		 System.out.println("Product is Expensive");
	    }
	}
	void calculate()
	{
	tax=(price*qty)/100;
	fprice=(fprice+tax)*qty;
	}
	public static void main(String args[])
	{
	 product p1=new product();
	 p1.displayinfo();
	 }
}
	 
			
	   
   
   
