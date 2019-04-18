public class Person{
  private String name;
  private String lastName;
  private String idNumber;


// Getters
public String getNome(){
  return this.nome;
}

public String getLastName(){
  return this.lastName;
}

public String getIdNumber(){
  return this.idNumber;
}
// Getters-End

// Setters
/*
The setters below are private because they can only be called by other methods,
I don't want Name/LastName and id to be freely changed, they are encapsulated
*/
private void setName(name){
  this.name = name;
}

private void setLastName(lastName){
  this.lastName = lastname;
}

private void setIdNumber(idNumber){
  this.idNumber = idNumber;
}
// Setters-End

public Person(String name, String lastName, String idNumber){
  this.setName(name);
  this.setLastName(lastName);
  this.setIdNumber(idNumber);
}

}
