public class abstract Animal {

  protected float weight;
  protected int age;
  protected int limbs;

  public abstract void move();
  public abstract void feed();
  public abstract void emitSound();

  public float getWeight(){
    return weight;
  }

  public void setWeight(float weight){
    this.weight = weight;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getLimbs(){
    return limbs;
  }
}
