package examples;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to represent a basic animal. It doesn't have all the attributes that a
 * real-live animal would have, but you get the point. Remember, this is just a "blueprint"
 *
 */
public class Animal {

    // An animal has a mouth (a member variable)
    private Mouth mouth;

    // An animal has one or more legs (a member variable)
    private List<Leg> legs;

    /**
     * A constructor method that when called, creates a new "Animal" object in memory on the computer's RAM and is accessible by your application.
     * This constructor has a single "parameter" that defines how many legs the animal has. By the end of this method, a new Animal object will be
     * created in memory on the computer's RAM.
     * @param numberOfLegs Parameter that represents the total number of legs the Animal will have
     */
    public Animal(Integer numberOfLegs) {
        // The "this." is only specifying that we are using the current in-memory object's "mouth". Here, we are saying that when we create a new
        // Animal object we assign a new "mouth" to its member variable call mouth
        this.mouth = new Mouth();

        // Because legs is a List<> of Leg objects, we need to create a new list and then put some legs into the list.
        this.legs = new ArrayList<>();
        // In this case, were going to add as many legs as were provided in the "numberOfLegs" parameter. This means if numberOfLegs = 8, we might
        // assume the animal is a spider or octopus. We add the legs using a "loop" which is just a mechanism for repeating processes over and over,
        // until a condition is met. The condition in this case, will be that we've reached the numberOfLegs.
        // This is called a "for loop" which has 3 parts.
        // 1) The first part shows that you're creating a local variable called "i" that is an "int" (integer)
        // that tracks the index of where you are in the loop. (int i = 0;)
        // 2) The second part is the condition that must be true in order to stop the loop. (i <= numberOfLegs;)
        // 3) The third part
        for (int i = 0; i <= numberOfLegs; i++) {
            legs.add(new Leg());
        }
    }

    /**
     * A method for using the animal's mouth to make a noise
     * @param noise Represents the noise that will be made by the mouth member variable
     */
    public void makeNoise(String noise) {
        mouth.makeNoise(noise);
    }

    /**
     * A method for making the animal walk using its legs
     */
    public void walk() {
        // This is called a "for-each loop" that essentially goes through each of the Leg objects in the list of "legs" and executes the "move()" method
        // This is similar to the other "for loop" that uses a
        for (Leg leg : legs) {
            leg.move();
        }
    }
}
