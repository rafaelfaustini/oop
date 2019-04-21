public class Fish extends Animal{
  private String scalesColor;
  @Override
  public void move(){
    System.out.println("Swimming");
  }
  @Override
  public void feed(){
    System.out.println("Eating substances");
  }
  @Override
  public void emitSound(){
    System.out.println("Fishes don't produce sounds");
  }
  public void makeBubble(){
    System.out.println("Making bubble");
  }

  public String getScalesColor(){
    return scalesColor;
  }

  public void setScalesColor(String scalesColor){
    this.scalesColor = scalesColor;
  }
}
