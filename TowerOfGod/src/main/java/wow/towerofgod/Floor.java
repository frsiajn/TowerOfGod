/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wow.towerofgod;

/**
 *
 * @author Students Account
 */
public abstract class Floor {
    
    protected String floorName;
    public abstract void enter();

    // Story of the tower
    public void introStory() {
        System.out.println("Intro of the floorYou, a brave adventurer, "
                + "have been summoned to the legendary Tower of Fates—a structure said "
                + "to contain the secrets of the ancient world encoded into its very design. "
                + "Each floor of the tower embodies a unique way of organizing chaos into order. "
                + "Mysterious guardians stand watch on every level, each ready to challenge and enlighten you. "
                + "Your journey will demand both courage and wit as you navigate left and right choices, "
                + "each decision echoing the underlying structure of that floor");
    }
    
    public void outroStory() {
        System.out.println("Outro of the floor");
        
        /*
    ### **Epilogue: The Summit of Fate**  
    As you take the final step onto the pinnacle of the Tower of Fates, a strange silence settles over the ancient stone beneath your feet. The wind howls through the open sky, carrying whispers of those who have climbed before you. The guardians who guided you through each floor are nowhere to be seen—only the echo of their words lingers.
    A grand archway stands before you, unlike any of the doors you have passed. Its intricate carvings tell a tale you had never noticed before—scenes of travelers, warriors, scholars, and dreamers who once braved the tower's trials. Each figure is frozen in time, their faces contorted in expressions of triumph, fear, and revelation. And at the very center of the arch, a reflection forms—a vision of **you**, standing before the choice that will define your legacy.
    
    Beyond the archway, there are two paths:  
    One leads to a world untouched—a realm beyond the tower, where the mysteries of fate remain unsolved, and life continues as it always has.  
    The other leads **back downward**—a descent into the labyrinth of your journey, where knowledge gained may yet reshape the very foundation of the tower itself.  
    
    A voice—one that is neither the guardians’ nor your own—speaks softly in the wind:  
    > "The path forward is yours alone. Step with certainty, for your choice will be remembered."
    You glance at the archway once more. The carvings shimmer, shifting and twisting, until the figures no longer resemble strangers. They are the ones you have met, those who walked beside you, the ones who challenged you to think, fight, and endure. Their gazes rest upon you now, waiting.
    
    Do you choose to step forward into the unknown?  
    
    Or do you turn back to uncover the secrets still buried in the tower’s depths?  
    
    A final breath. A final step.
    And the story becomes **yours**.
    ---
        */      
    }
}
