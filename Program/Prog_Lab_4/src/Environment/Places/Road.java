package Environment.Places;

public class Road extends Place{

    public Road() {
        this.placeName = "Road";
        System.out.println("There's a " + this.placeName + '.');
    }

    public void getNarrow() {
        System.out.println(this.placeName + " gets narrow.");
    }

    public class BarbedWall {
        public BarbedWall() {
            System.out.println("Barbed wall shows up.");
        }
    }
}
