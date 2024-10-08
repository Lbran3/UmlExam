package octexam;

public enum Size {

    S, M, L;

    public String getSize() {
        switch (this) {
            case S:
                return "small";

            case M:
                return "medium";

            case L:
                return "large";

            default:
                return null;
        }

    }
}





