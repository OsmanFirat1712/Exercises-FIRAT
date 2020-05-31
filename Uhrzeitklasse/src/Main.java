public class Main {

    @Override
    public String toString() {
        return "main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time(3, 20, 45);
        Time t3 = new Time(1, 20, 45);
        Time subtract = t2.subtract(t2,t3);
        System.out.println(subtract.toString());

    }

}