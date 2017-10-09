package minesweeper;

public class Square {
    private boolean mine, flag, openFlag;

    public boolean isMine() {
        return mine;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = false;
    }

    Square(boolean mine) {
        this.mine = mine;
    }

    public boolean isOpenFlag() {
        return openFlag;
    }

    public void setOpenFlag(boolean openFlag) {
        this.openFlag = openFlag;
    }
}
