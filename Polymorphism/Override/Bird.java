public class Bird extends Animal{
  private String featherColor;
  @Override
  public void move(){
    System.out.println("Flying");
  }
  @Override
  public void feed(){
    System.out.println("Eating fuits");
  }
  @Override
  public void emitSound(){
    System.out.println("Bird sound");
  }
  public void buildNest(){
    System.out.println("Nest built");
  }

  public String getFeatherColor(){
    return featherColor;
  }

  public void setFeatherColor(String featherColor){
    this.featherColor = featherColor;
  }
}
