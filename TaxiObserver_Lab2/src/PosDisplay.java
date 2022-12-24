public class PosDisplay implements Observer {
    float[] crds;
    boolean isMoving;

    public PosDisplay(PosData weatherData) {
        weatherData.recordObserver(this);
        crds = new float[]{0, 0};
        isMoving = false;
    }

    public void update(float[] coords, boolean isMoving) {
        if (!this.isMoving && (isMoving || coords[0] != this.crds[0] && this.crds[1] != coords[1])) {
            System.out.println("Taxi started moving. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (!isMoving || coords[0] == this.crds[0] && this.crds[1] == coords[1]) {
            System.out.println("Taxi isn't moving. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] > this.crds[1] && this.crds[0] == coords[0]) {
            System.out.println("Taxi is heading north. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] < this.crds[1] && this.crds[0] == coords[0]) {
            System.out.println("Taxi is heading south. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] == this.crds[1] && this.crds[0] > coords[0]) {
            System.out.println("Taxi is heading east. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] == this.crds[1] && this.crds[0] < coords[0]) {
            System.out.println("Taxi is heading west. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] > this.crds[1] && this.crds[0] > coords[0]) {
            System.out.println("Taxi is heading north-east. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] > this.crds[1] && this.crds[0] < coords[0]) {
            System.out.println("Taxi is heading north-west. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] < this.crds[1] && this.crds[0] > coords[0]) {
            System.out.println("Taxi is heading south-east. Coordinates: " + coords[0] + " " + coords[1]);
        }
        else if (coords[1] < this.crds[1] && this.crds[0] < coords[0]) {
            System.out.println("Taxi is heading south-west. Coordinates: " + coords[0] + " " + coords[1]);
        }

        this.crds = coords;
        this.isMoving = isMoving;
    }
}
