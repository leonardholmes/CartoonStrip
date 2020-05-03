// This program is copyright VUW.
// You are granted permission by VUW to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Code for 13DTC Assignment Cartoon Strip
 * Name:leonard
 * Username:leonard
 * Email:leonard.holmes@student.onslow.school.nz
 */

import ecs100.*;

/** Program to create simple animated cartoon strips using the
 *  CartoonCharacter class.  
 */

public class CartoonStrip{
    /** tellStory creates two cartoon characters on the window.
     *  Then animates them according to a fixed script by calling a series
     *  of methods on the characters.
     */
    public void tellStory(){
        CartoonCharacter casey = new CartoonCharacter(100, 200, "casey");
        CartoonCharacter alice = new CartoonCharacter(300, 200, "alice");
        alice.lookLeft();
        alice.speak("Casey! watch this."); //box cuts off at around 28 characters
        alice.speak("it's going to be really cool!");
        casey.speak("ok, let's see it then.");
        alice.lookRight();
        for (int count=1; count<= 4; count++){
            UI.sleep(2);
            alice.walk(20);
        }
        alice.lookLeft();
        alice.speak("see that awesome right?");
        casey.speak("err.. not really");
        casey.speak("all you did was walk");
        alice.frown();
        alice.speak("well how about this?");
        alice.lookRight();
        alice.speak("*puts on mask*");
        CartoonCharacter bob = new CartoonCharacter(380, 200, "bob");
        bob.lookLeft();
        bob.speak("tada i am now Bob");
        casey.speak("Wow how did you do that?");
        bob.speak("magic obviously");
        bob.think("the magic of a mask");
        for (int count=1; count<= 5; count++){
            UI.sleep(2);
            casey.walk(20);
        }
        casey.think("wait a minute");
        casey.frown();
        casey.speak("this is a mask!");
        alice.lookLeft();
        alice.speak("aw you caught me");
        alice.smile();
    }


}

