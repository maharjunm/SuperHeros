package doors;

public class Door {

    private boolean opened;
    private int number;

    Door(int number, boolean opened) {
        this.number = number;
        this.opened = opened;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public int getNumber() {
        return number;
    }
}
