public class Test {
    public static void main(String[] args) {
        Voice2 voice2 = new Voice2();
        voice2.templateMethod(); 

        System.out.println("\nTrying to hear without preparing...");

        
        Voice voice = new Voice();
        voice.hear(); 
    }
}
