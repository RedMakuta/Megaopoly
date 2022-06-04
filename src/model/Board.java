package model;

import java.util.ArrayList;

public class Board implements IBoard {
    private ArrayList<IPlayer> players;
    private ArrayList<ISpace> spaces; // Should always be 44 of these, starting at Go and ending at Connecticut Ave. (for base game)
}
