import java.net.InetAddress;
import java.net.UnknownHostException;

public class Passphrase1 {
	public static void main(String[] args) throws Exception {
        System.out.println("This first trigger is a test to see if you are worthy to save the world!");
        trigger1();
        System.out.println("You have proved your worthiness!!\n");
        System.out.println("Welcome reverser. Recently I discovered that a malicious mad scientist ");
        System.out.println("will release the T-virus into the world. Our only hope is to diffuse the triggering mechanism by entering a");
        System.out.println("5 passphrase sequence. The world is in danger unless you (yes you, the cs5375 student) discover the ");
        System.out.println("5 passphrases before all of earth is taken over by flesh eating zombies... :(");
        System.out.println();
        System.out.println("Please help! Now what about the 2nd?");
	}
	
	public static void trigger1() {
        String computerName = "";
        
        try {
            computerName = InetAddress.getLocalHost().getHostName();
        }catch(UnknownHostException u) {
            System.out.println("Can't find computer name.");
        }

        if(!computerName.equals("DESKTOP-NIB58S5")) {//Should be "REVERSE"
            worldEnds();
        }
    }
	
	 public static void worldEnds() {
	        System.out.println("Wrong. The earth has been destroyed!");
	        System.exit(0);
	    }
}
