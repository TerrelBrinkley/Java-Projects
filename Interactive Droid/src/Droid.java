public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey");

        System.out.println(Codey);

        Codey.performTask("dancing");
        Codey.performTask("coding");
    }
}
