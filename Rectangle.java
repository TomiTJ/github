public class Rectangle {
  private int width;
  private int height;

  public Rectangle(){
    width = Input.askInt("Enter width: "); 
    height = Input.askInt("Enter height: "); 
  }
  public Rectangle(int width, int height){
    this.width = width; 
    this.height = height; 
  }
  public String showArea(){
    return "Dimensions are " + width +"x" + height; 
  }
  public int getArea(){
    return width*height;
  }

}

