public class Timer {
    int addSeconds(Stoper stoper, int sec) {
        return stoper.time = stoper.time + sec;
    } //– która dodaje do aktualnie odmierzonego czasu wskazaną liczbę sekund,

    int addMinutes(Stoper stoper, int minutes) {
        return stoper.time = stoper.time + (minutes * 60);
    }//– która dodaje do aktualnie odmierzonego czasu wskazaną liczbę minut,

    int addHours(Stoper stoper, int hours) {
        return stoper.time = stoper.time + (hours * 60 * 60);
    }// – która dodaje do aktualnie odmierzonego czasu wskazaną liczbę godzin,

    int step(Stoper stoper) {
        return stoper.time = stoper.time + 1;
    }// – która dodaje do aktualnie odmierzonego czasu jedną sekundę.

   String getTime(Stoper stoper){
        return (int) stoper.time/3600 +":" + (int) ((stoper.time % 3600 - stoper.time%60)/60) +":" + (int) stoper.time % 60;

    }// która zwraca czas w formacie HH:mm:ss, gdzie HH to godziny, mm to minuty, a ss to sekundy,

    long getSeconds(Stoper stoper) {
        return stoper.time;
    }// – która zwracałączną liczb sekund, którą zmierzyłdany stoper
}
