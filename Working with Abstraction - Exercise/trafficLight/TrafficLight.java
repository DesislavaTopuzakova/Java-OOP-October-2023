package trafficLight;

public class TrafficLight {
    private Color color;

    public TrafficLight (Color color) {
        //нов светофар
        this.color = color;
    }

    //променя цвета си
    public void changeColor() {
        switch (this.color) {
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
        }
    }

    public String getColor() {
        return this.color.name();
    }
}
