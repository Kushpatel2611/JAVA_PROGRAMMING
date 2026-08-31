public class CinemaShow {
     private int seatsAvailable;
     private final int capacity;
     private static int totalBooked=0;

    public CinemaShow(String title,int capacity) {
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    public CinemaShow(String title) {
        this(title,100);
    }

    public boolean book(int n){
        if(n<=seatsAvailable){
            seatsAvailable-=n;
            totalBooked+=n;
            return true;
        }
        return false;
    }

    public boolean cancel(int n){
        if(n>0 && seatsAvailable+n<=capacity){
            seatsAvailable+=n;
            return true;
        }
        return false;
    }

    public int getSeatsAvailable(){
        return seatsAvailable;
    }

    public static int getTotalBooked(){
        return totalBooked;
    }

    public static void main(String[] args) {
        CinemaShow show = new CinemaShow("Movie", 100);

        System.out.println(show.book(30));
        System.out.println(show.getSeatsAvailable());

        System.out.println(show.book(80));
        System.out.println(show.getSeatsAvailable());

        System.out.println(show.cancel(20));
        System.out.println(show.getSeatsAvailable());

        System.out.println(show.cancel(100));
        System.out.println(show.getSeatsAvailable());

        System.out.println(getTotalBooked());
    }
}