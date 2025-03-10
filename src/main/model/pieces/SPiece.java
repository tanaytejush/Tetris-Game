package model.pieces;

import model.Game;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

// Represents an "S" piece
public class SPiece extends Piece {

    // EFFECTS: creates an "S" piece in given game. The piece is placed at the topmost row
    //          in its default orientation.
    //          Note: the constructor does not put the piece on the game board.
    public SPiece(Game game) {
        super(game, new Point(Math.floorDiv(Game.WIDTH - 1, 2), -1));
    }

    // EFFECTS: returns a set of the tile locations of this "S" piece relative to rotationReferencePoint
    //          for orientation 0
    @Override
    protected Set<Point> getOrientation0RelativeLocations() {
        Set<Point> orientation0RelativeLocations = new HashSet<Point>();
        orientation0RelativeLocations.add(new Point(0, 2));
        orientation0RelativeLocations.add(new Point(1, 2));
        orientation0RelativeLocations.add(new Point(1, 1));
        orientation0RelativeLocations.add(new Point(2, 1));
        return orientation0RelativeLocations;
    }

    // EFFECTS: returns a set of the tile locations of this "S" piece relative to rotationReferencePoint
    //          for orientation 1
    @Override
    protected Set<Point> getOrientation1RelativeLocations() {
        Set<Point> orientation1RelativeLocations = new HashSet<Point>();
        orientation1RelativeLocations.add(new Point(0, 0));
        orientation1RelativeLocations.add(new Point(0, 1));
        orientation1RelativeLocations.add(new Point(1, 1));
        orientation1RelativeLocations.add(new Point(1, 2));
        return orientation1RelativeLocations;
    }

    // EFFECTS: returns a set of the tile locations of this "S" piece relative to rotationReferencePoint
    //          for orientation 2
    @Override
    protected Set<Point> getOrientation2RelativeLocations() {
        return getOrientation0RelativeLocations();
    }

    // EFFECTS: returns a set of the tile locations of this "S" piece relative to rotationReferencePoint
    //          for orientation 3
    @Override
    protected Set<Point> getOrientation3RelativeLocations() {
        return getOrientation1RelativeLocations();
    }
}
