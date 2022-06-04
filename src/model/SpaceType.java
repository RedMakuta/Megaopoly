package model;

public enum SpaceType {
    RAILROAD("railroad", 4), UTILITY("utility", 2);

    private final String str;
    private final int numOf;

    SpaceType(String str, int numOf) {
        this.str = str;
        this.numOf = numOf;
    }

    @Override
    public String toString() {
        return str;
    }

}
