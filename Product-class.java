class product1
{
    int pcode;
    String pname;
    double price;
    void data(int c, String n , double p)
      {
        pcode = c;
        pname = n;
        price = p;
      }
    void display()
      {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
      }
    static void findLowest(double price1 , double price2 , double price3)
     {
        if(price1<=price2 && price1<=price3)
        {
            System.out.println("\nProduct 1 is of the lowest price!");
        }
        else if(price2 <= price1 && price2 <= price3)
        {
            System.out.println("\nProduct2 is of the lowest price!");
        }
        else
        {
            System.out.println("\nProduct 3 is of the lowest price!");
        }
     }

public static void main(String[] args)
  {
    product1 obj1 = new product1();
    product1 obj2 = new product1();
    product1 obj3 = new product1();
    obj1.data(101, "product_1",100.0);
    obj2.data(102, "product_2",128.40);
    obj3.data(103, "product_3",790.00);
    System.out.println("Product Information:\n\n Product_code\tProduct_Name\tProduct_price");
    obj1.display();
    obj2.display();
    obj3.display();
    findLowest(obj1.price,obj2.price,obj3.price);
  }
}
