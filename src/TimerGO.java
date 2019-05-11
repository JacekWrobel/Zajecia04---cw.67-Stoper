public class TimerGO {
    public static void main(String[] args) {

        Timer timer = new Timer();
        Stoper stoper = new Stoper(0);
        System.out.println(timer.addSeconds(stoper, 1));
        System.out.println(timer.addMinutes(stoper, 1));
        System.out.println(timer.addHours(stoper, 1));
        System.out.println(timer.step(stoper));
        System.out.println(timer.getTime(stoper));
        System.out.println(timer.getSeconds(stoper));

        Stoper stoper2 = new Stoper(0);
        System.out.println(timer.addSeconds(stoper2, 10));
        System.out.println(timer.addMinutes(stoper2, 10));
        System.out.println(timer.addHours(stoper2, 10));
        System.out.println(timer.step(stoper2));
        System.out.println(timer.getTime(stoper2));
        System.out.println(timer.getSeconds(stoper2));
    }
}