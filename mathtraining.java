import hsa.*;
import java.awt.*;
public class mathtraining{
  public static void main (String[]args){
    Console con = new Console();
   
    //variables
    int intSelect;
    String strSelectInstruct;//the sleection for the instructions because it is kinda broken
    int intAnswer;//this will wait for user input 
    int intRandom1;//variable for the second number
    int intRandom2;//variable for the second number
    int intLevel;// counts level so that the diits will increase
    int intScore;//the amount of questions answered correctly
    int intCounter;// the counter for the for loop and the counter for the question #
    int intDifficulty;//the range for the random number
    int intPercentage;//the percentage for the end score
    String strContinue;//ask the user to continue agter every 16 questions
    
    //menu screen
    con.setColor(Color.RED);
    con.setFont(new Font("Arial",Font.PLAIN, 40));
    con.drawString ("Welcome to Math Training", 100, 240);
    pause (1500);
    intSelect = 0;//inital value so that the while loop will run from the menu
    while (intSelect ==0){ //input for menu is 4
      con.clear();//clear the welcome to math training
      con.setFont(new Font("Arial",Font.PLAIN, 40));
      con.println("");//spacing so the input is under the menu
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.setColor(Color.RED);
      con.drawString ("Math Training", 0, 40);
      con.setColor(Color.BLACK);
      con.drawString ("Type 1 to start", 0, 80);
      con.drawString ("Type 2 for instructions",0, 120);
      con.drawString ("Type 3 to exit",0, 160);
      intSelect = con.readInt();
      
      if (intSelect == 1){//game
        con.setFont(new Font("Arial",Font.PLAIN, 40));
        intScore = 0;// resets the score back to 0
        intLevel = 1;
        intDifficulty = 10;
        for (intCounter = 0; intCounter >= 0;intCounter++){
          if (intCounter%16==0 && intCounter !=0){
            con.clear();
            intLevel = intLevel+1;// increase level after 16 questions
            intDifficulty = intDifficulty*10; // multiply digits by 10
            con.drawString("Type in exit to stop the game", 0,120);
            con.drawString("or type in anything else to continue", 0,160);
            con.drawString (+intScore+"/"+intCounter,400,40);//score board
            con.drawString ("Level: " +intLevel,400,80);//score board
            strContinue = con.readLine();
            if (strContinue.equalsIgnoreCase("exit") || strContinue.equalsIgnoreCase("stop")){//exit the game if input is exit or stop
              con.clear();
              con.drawString ("Your final score was:", 160,220);
              con.drawString(+intScore+"/"+intCounter+" "+((intScore*100)/intCounter)+"%",220,260);// it the score along with the percent
              pause(2000);
              con.clear();
              con.drawString ("Thanks for playing!", 180, 240);
              pause (1000);
              System.exit (1);
            }
            if (strContinue.equalsIgnoreCase("anything else")){
              con.clear();
              con.drawString("Plz stop taking things literally", 100,240);
              pause(2000);
            }
          }
          con.clear();//clear whatever is on the screen
          con.println("");//spacing so it looks nice
          con.println("");
          con.println("");
          con.println("");
          con.drawString (+intScore+"/"+intCounter,400,40);//score board
          con.drawString ("Level: " +intLevel,400,80);//score board
          intRandom1 = (int)(Math.random()*intDifficulty+0);//generate random 1
          intRandom2 = (int)(Math.random()*intDifficulty+0);//generate random 2
          if (intCounter%2==0){//if the question number is even, ask for addition
            con.drawString("What is: ", 0,40);
            con.drawString(+intRandom1 +"+" +intRandom2, 0, 80);//random number + random number
            intAnswer = con.readInt();
            
            if (intAnswer ==intRandom1+intRandom2){//input correct answer
              con.drawString ("Correct!", 0, 180);
              intScore = intScore +1;
              pause (500);
            }
            
            else if (intAnswer != intRandom1+intRandom2){//input wrong answer
              con.drawString ("Wrong!", 0, 180); 
              con.drawString ("The answer is: " +(intRandom1+intRandom2),0,220);
              pause (1200);
            }
          }
          else{//if the question number is odd, ask for subtraction
            
            con.drawString("What is: ", 0,40);
            con.drawString(+intRandom1 +"-" +intRandom2, 0, 80); //random number - random number
            intAnswer = con.readInt();
            
            if (intAnswer ==intRandom1-intRandom2){//input correct answer
              con.drawString ("Correct!", 0, 180);
              intScore = intScore +1;
              pause (500);
            }
            
            else if (intAnswer != intRandom1+intRandom2){//input wrong answer
              con.drawString ("Wrong!", 0, 180); 
              con.drawString ("The answer is: " +(intRandom1-intRandom2),0,220);
              pause (1200);
            }
          }
        }
      }
      
      while (intSelect ==2){//instructions
        con.setFont(new Font("Arial",Font.PLAIN, 20));
        con.clear();// clear the menu
        con.drawString("Instructions", 260,100);
        con.drawString ("An equation made of 2 numbers will be displayed on the screen.",40,140);
        con.drawString ("The user will enter the answer.  The questions will gradually", 40,180);
        con.drawString ("become harder every 16 questions. After every 16 questions, ", 40, 220);
        con.drawString ("you will have an option to exit by typing in \"exit\"(without quotes).", 40, 260);
        con.drawString ("Type in any key to go back to the menu", 140, 300);
        strSelectInstruct = con.readLine();
        if (strSelectInstruct.equalsIgnoreCase("any key")){
          intSelect = 1337; 
          pause(1000);
        }
        else{
          intSelect = 0;
        }
      }
      if (intSelect != 0 && intSelect !=1 && intSelect !=2 && intSelect!=3 && intSelect !=1337){ // if a numberother than 1,2,3 or 4 is input
        con.drawString ("Enter a valid number",0, 260); 
        pause (1000);
        intSelect = 0;//bring back to the menu
      }
      if (intSelect ==3 ){
        con.clear();
        con.drawString ("Thanks for playing!", 180, 240);
        pause (1000);
        System.exit (1);
      }
      if (intSelect == 1337){//bonus game
        con.clear();
        con.setFont(new Font("Arial",Font.PLAIN, 40));
        con.drawString("Loading Math Training GOTY Edition",0,220);
        for (intCounter = 0; intCounter<600;intCounter++){//loading bar
          con.setColor(Color.RED);
          con.fillRect (intCounter, 240, 50, 50);
          pause (7);//speed of the bar
        }
        con.setColor(Color.BLACK);
        intScore = 0;// resets the score back to 0
        intLevel = 1;
        intDifficulty = 10;
        for (intCounter = 0; intCounter >= 0;intCounter++){
          if (intCounter%16==0 && intCounter !=0){
            con.clear();
            intLevel = intLevel+1;// increase level after 16 questions
            intDifficulty = intDifficulty*10; // multiply digits by 10
            con.drawString("Type exit to stop or", 0,120);
            con.drawString("type anything else to continue", 0,160);
            con.drawString (+intScore+"/"+intCounter,400,40);//score board
            con.drawString ("Level: " +intLevel,400,80);//score board
            strContinue = con.readLine();
            if (strContinue.equalsIgnoreCase("exit")){
              con.clear();
              con.drawString ("Your final score was:", 160,220);
              con.drawString(+intScore+"/"+intCounter+" "+((intScore*100)/intCounter)+"%",220,260);
              pause(2000);
              con.clear();
              con.drawString ("Thanks for playing!", 180, 240);
              pause (1000);
              System.exit (1);
            }
            if (strContinue.equalsIgnoreCase("anything else")){
              con.clear();
              con.drawString("Powered by NoVideo Gimpforce",40,240);
              pause(3000);
            }
            
          }
          con.clear();//clear whatever is on the screen
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          intRandom1 = (int)(Math.random()*intDifficulty+0);
          intRandom2 = (int)(Math.random()*intDifficulty+0);
          con.drawString (+intScore+"/"+intCounter,400,40);//score board
          con.drawString ("Level: " +intLevel,400,80);//score board
          con.drawString("What is: ", 0,40);
          con.drawString(+intRandom1 +"×" +intRandom2, 0, 80);
          intAnswer = con.readInt();
          
          if (intAnswer ==intRandom1*intRandom2){//input correct answer
            con.drawString ("Correct!", 0, 180);
            intScore = intScore +1;
            pause (500);
          }
          
          else if (intAnswer != intRandom1*intRandom2){//input wrong answer
            con.drawString ("Wrong!", 0, 180); 
            con.drawString ("The answer is: " +intRandom1*intRandom2,0,220);
            pause (1200);
          }
          
        }
      }
    }
  }
  public static void pause (int intMS){
    try{
      Thread.sleep(intMS);
    }catch (InterruptedException e){
    }
  }
}
