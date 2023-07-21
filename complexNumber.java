package assignmentday4;
class Complex{
	private int real,img;
 Complex(){}
 Complex(int x, int y){
  real = x;  img = y;
 }
 public Complex add(Complex t)
 {
  // TODO Auto-generated method stub
	 Complex z = new Complex();
  z.real = (this.real+t.real);  z.img = this.img + t.img;
  return z;
  }
 public Complex sub(Complex t) { 
	 // TODO Auto-generated method stub
  Complex z = new Complex();  
  z.real = (this.real - t.real);
  z.img = this.img - t.img;  
  return z;
 } 
 public Complex mul(Complex t) 
 {
  // TODO Auto-generated method stub 
	 Complex z = new Complex();
  z.real = (this.real*t.real)-(this.img*t.img);  
  z.img = (this.real*t.img)+(this.img*t.real);
  return z;
  }
 public Complex div(Complex t) 
 {  // TODO Auto-generated method stub
  Complex z = new Complex();  
  z.real = (this.real*t.real+this.img*t.img)/(t.real*t.real+t.img*t.img);
  z.img = (this.img*t.real-this.real*t.img)/(t.real*t.real+t.img*t.img);  
  return z;
  
 }
 
 public String toString() {
  if(img<0) {   return real + "-" + "i" + (-1*img);
  }  return real + "+" + "i" + img;
 }
 }
public class complexNumber {
 public static void main(String[] args)
 {  // TODO Auto-generated method stub
           Complex x=new Complex(3,4);           
           Complex y=new Complex(4,5);
           Complex a=x.add(y);          
           Complex s=x.sub(y);
           Complex m=x.mul(y);           
           Complex d=x.div(y);
           System.out.println(x); //3+i4           
           System.out.println(y); //4+i5
           System.out.println(a);//7+i9          
           System.out.println(s);//-1-i
           System.out.println(m);//-8+i31           
           System.out.println(d);//.78+i0.02
   }
}