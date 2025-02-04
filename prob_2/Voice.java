public class Voice {
    private boolean prepared = false;

    public void prepareVoice() {
        if (!prepared) {
            System.out.println("Preparing the voices...");
            // Initialize animals
            Animal[] animals = new Animal[5];
            animals[0] = new Cow();
            animals[1] = new Dog();
            animals[2] = new Pig();
            animals[3] = new Goat();
            animals[4] = new Lion();
            this.prepared = true;
        } else {
            System.out.println("Voices already prepared.");
        }
    }

    public void hear() {
        if (!prepared) {
            System.out.println("Error: Cannot hear. You must prepare the voices first.");
            return;
        }

        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        for (Animal animal : animals) {
            animal.makeVoice(); 
        }
    }
}
