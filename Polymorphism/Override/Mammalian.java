public class Mammalian extends Animal {
  private String furColor;

  @Override
  public void move(){
    System.out.println("Running");
  }
  @Override
  public void feed(){
    System.out.println("Suckling")
  }
  @Override
  public void emitSound(){
    System.out.println("Mammalian sound")
  }

  public String getFurColor(){
    return furColor;
  }

  public void setFurColor(String furColor){
    this.furColor = furColor;
  }

}
