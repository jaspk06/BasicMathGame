import hsa.*;
public class jasonmethods{
  public static void main (String[]args){
    Console con = new Console();
    //Variables
    double dblPrincipal;
    double dblRate;
    int intCycles;
    double dblInterest;
    String strBossName;
    String strName;
    
    //logo part
    cadawastools.logo(con);
    cadawastools.pause(2000);
    //interest part
    con.println("Enter the principal amount");
    dblPrincipal = con.readDouble();//get principal amount
    con.println("Enter the interest rate");
    dblRate = con.readDouble();//get rate
    con.println("Enter the number of cycles");
    intCycles = con.readInt();//get number of cycles
    dblInterest = cadawastools.interest(dblPrincipal,dblRate,intCycles);//principal, then rate, then the amount of cycles
    con.println("The interest gained is: $"+dblInterest);
    
    //boss name
      con.println("Enter your name");
    strName = con.readLine();
    strBossName = cadawastools.makemynameboss(strName, con);
    con.println("No, your name is "+strBossName);

  }
}