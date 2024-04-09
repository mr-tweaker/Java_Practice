 
      interface Compute
      {
          public void calculate(double d);
      }
 
     class Circle implements Compute
     {
          public void calculate(double r)
          {
              double area = Math.PI * Math.pow(r, 2);
              System.out.println("\n Area of circle = "+area);
          }
     }

     class Square implements Compute
     {
          public void calculate(double side)
          {
              double area = Math.pow(side, 2);
              System.out.println("\n Area of square = "+area);
          }
     }
    
    public class InterfaceDemo2
    {
        public static void main(String [] args)
        {
            Circle c = new Circle();
            Square s = new Square();

              Compute obj;     

              obj = c;
              obj.calculate(1);

              obj = s;
              obj.calculate(2); 
        }
    }
