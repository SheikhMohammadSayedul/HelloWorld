public class helloworld {
    private int roll;
    private String name;
    private boolean passed;
    public helloworld(){ /* Constructor */
        roll =7;
        name = "SAYEDUL";
        passed = false;
    }
    public helloworld(int roll, String name, boolean passed){ /* Constructor */
        this.roll = roll;
        this.name = name;
        this.passed = passed;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public int getRoll() {
        return roll;
    }

    public boolean isPassed() {
        return passed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        helloworld helloWorld = new helloworld();
        System.out.println(helloWorld.getName());
        System.out.println(helloWorld.getRoll());
        System.out.println(helloWorld.isPassed());
    }
}