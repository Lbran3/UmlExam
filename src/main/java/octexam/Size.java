package octexam;

public enum Size {
    Small,
    Medium,
    Large,
    ;

    private final int clothingSizes;

    Size(int clothingSizes) {
        this.clothingSizes = clothingSizes;
    }
    public int getClothingSizes(){
        return clothingSizes;
    }
}
