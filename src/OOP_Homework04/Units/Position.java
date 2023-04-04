package OOP_Homework04.Units;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getPosition() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double getDistance(MainUnit unit) {
        return Math.sqrt(Math.pow(x - unit.position.x, 2) + Math.pow(y - unit.position.y, 2));
    }
}
