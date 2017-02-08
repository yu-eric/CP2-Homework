package Chapter9;

import java.util.ArrayList;
import java.util.HashMap;

public class Grid {
    private HashMap<Location,Cell> cellHashMap = new HashMap<Location,Cell>();
    private int numRows;
    private int numColumns;

    class Location {
         int row;
         int column;
         Location(int row, int column){
             this.row = row;
             this.column = column;
         }

         public boolean equals(Object anotherLocation) {
             Location al = (Location) anotherLocation;
             return (this.row == al.row && this.column == al.column);
         }

         public int hashCode() {
             String columnInStr = String.format("%d", this.column);
             int columnLen = columnInStr.length();
             double hc = this.row * Math.pow(10,columnLen) + this.column;
             return (int)hc;
         }

         public String toString() {
             return this.row + ":" + this.column;
         }
    }

    class Cell {
        Location l;
        String description;
        Cell(int row, int column, String description) {
            l = new Location(row, column);
            this.description = description;
        }

        public Location getLocation() {
            return l;
        }

        public String getDescription() {
            return description;
        }
    }

    public Grid(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
    }

    public void add(int row, int column, String description) {
        if(row > numRows || column > numColumns) {
            System.out.println("You have exceeded the grid limit.");
            System.exit(-1);
        }
        Cell c = new Cell(row, column, description);
        Location l = c.getLocation();
        cellHashMap.put(l,c);
    }

    public String getDescription(int row, int column) {
        Location l = new Location(row, column);
        Cell c = cellHashMap.get(l);
        if(c == null) {
            return null;
        } else {
            return c.getDescription();
        }
    }

    public ArrayList<Location> getDescribedLocations() {
        ArrayList<Location> l = new ArrayList<Location>(cellHashMap.keySet());
        return l;
    }

    public static void main(String[] args) {
        Grid g = new Grid(5, 5);
        g.add(0, 0, "First Cell");
        g.add(0, 1, "Second Cell");
        g.add(1, 3, "Third Cell");
        System.out.println(g.getDescription(0,1));
        System.out.println(g.getDescription(1,3));
    }
}
