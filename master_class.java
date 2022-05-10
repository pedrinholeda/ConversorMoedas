public class master_branch{
  int roll;
  String name;
  string master;

  master_branch(String n, int r){
  this.name = n;
  this.roll = r;
  }

  public int getRoll(){
    return roll;
  }
  public void setRoll(int roll){
    this.roll = roll;
  }
  public int getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
   public int getMaster(){
    return master;
  }
  public void setMaster(String name){
    this.master = name;
  }

}