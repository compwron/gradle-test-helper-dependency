public class BarStuff {
    private AbeStuff abeStuff;

    public BarStuff(){
        abeStuff = new AbeStuff();
        System.out.println("Bar depends on Abe");
    }
}
