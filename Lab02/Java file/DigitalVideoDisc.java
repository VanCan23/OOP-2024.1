public class DigitalVideoDisc {
    private String category;
    private String director;
    private int length;
    private float cost;
    private String title;
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public DigitalVideoDisc(String title){
        this.title = title;
 }
    public DigitalVideoDisc(String title, String category, float cost){
        this(title);
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String category, String director, float cost, String title) {
        this(title, category, cost);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this(category, director, cost, title);
        this.length = length;
    }
}