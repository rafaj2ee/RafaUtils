package br.com.rafaj2ee.util;

import javax.security.sasl.AuthenticationException;

public class OmniKeyTest {

	public static void main(String[] args) throws //CardException, 
							InterruptedException, AuthenticationException {

	    /*
		TerminalFactory tf = TerminalFactory.getDefault();
	    CardTerminals cardTerminals = tf.terminals();
	    CardTerminal terminal = cardTerminals.getTerminal(OMNIKEY_5021_CL_CARD_READER_NAME);
	
	    {
	        System.out.println("Waiting for card present!");
	        terminal.waitForCardPresent(5000);
	        if (terminal.isCardPresent()) {
	            System.out.println("Card present!");
	        }
	        
	        Card card = terminal.connect("*");
	        CardChannel channel = card.getBasicChannel();
	        // In the next method I just load a key and authenticate to the second sector
	        authenticateThis(default_kljuc, 0, channel);

	        System.out.println("card: " + card);
	        card.disconnect(true);
	        System.out.println("card: " + card);

	        // Here I miserably try to remove all references to the objects I used :)
	        card = null;
	        terminal = null;
	        cardTerminals = null;
	        tf = null;
	        System.gc();
	    }
	    //Here I remove the card
	    int miliSeconds = 1000;
	    System.out.format("Now remove the card, waiting for %d miliseconds...%n", miliSeconds);
	    Thread.sleep(miliSeconds);

	    tf = TerminalFactory.getDefault();
	    cardTerminals = tf.terminals();
	    terminal = cardTerminals.getTerminal(OMNIKEY_5021_CL_CARD_READER_NAME);

	    {
	        System.out.println("Waiting for card present!");
	        terminal.waitForCardPresent(5000);
	        if (terminal.isCardPresent()) {
	            System.out.println("Card present!");
	        }
	        Card card = terminal.connect("*");
	        System.out.println("Got an instance of the card!");
	        CardChannel channel = card.getBasicChannel();
	        authenticateThis(default_kljuc, 0, channel);

	        System.out.println("card: " + card);
	        card.disconnect(true);
	        System.out.println("card: " + card);

	    }
	    */
	}

}
