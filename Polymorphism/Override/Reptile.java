public class Reptile extends Animal{
  private String scalesColor;
  @Override
  public void move(){
    System.out.println("Crawling");
  }
  @Override
  public void feed(){
    System.out.println("Eating Veggies")
  }
  @Override
  public void emitSound(){
    System.out.println("Reptile sound")
  }

  public String getScalesColor(){
    return scalesColor;
  }

  public void setFurColor(String scalesColor){
    this.scalesColor = scalesColor;
  }
}
