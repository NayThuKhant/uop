package turing;

/**
 * A Tape object represents a Turing machine tape, which is made up of little squares called cells that
 * can hold one character. The tape is represented by a doubly-linked list of Cell objects, where each
 * Cell has a pointer to the previous cell (to its left) and to the next cell (to its right).
 */
public class Tape {

    private Cell currentCell;  // The current cell pointer for this tape.

    /**
     * Constructs a new tape that initially consists of a single cell containing a blank space.
     * The current cell pointer is initialized to point to the single cell.
     */
    public Tape() {
        currentCell = new Cell(' ');
    }

    /**
     * Returns the pointer that points to the current cell on this tape.
     */
    public Cell getCurrentCell() {
        return currentCell;
    }

    /**
     * Returns the character in the current cell of this tape.
     */
    public char getContent() {
        return currentCell.content;
    }

    /**
     * Changes the character in the current cell of this tape to the specified value.
     */
    public void setContent(char ch) {
        currentCell.content = ch;
    }

    /**
     * Moves the current cell one position to the left along this tape. If the current cell is the leftmost
     * cell that exists, then a new cell is created and added to the tape at the left of the current cell,
     * and then the current cell pointer is moved to point to the new cell. The content of the new cell is a
     * blank space.
     */
    public void moveLeft() {
        if (currentCell.prev == null) {
            Cell newCell = new Cell(' ');
            newCell.next = currentCell;
            currentCell.prev = newCell;
        }
        currentCell = currentCell.prev;
    }

    /**
     * Moves the current cell one position to the right along this tape. If the current cell is the rightmost
     * cell that exists, then a new cell is created and added to the tape at the right of the current cell,
     * and then the current cell pointer is moved to point to the new cell. The content of the new cell is a
     * blank space.
     */
    public void moveRight() {
        if (currentCell.next == null) {
            Cell newCell = new Cell(' ');
            newCell.prev = currentCell;
            currentCell.next = newCell;
        }
        currentCell = currentCell.next;
    }

    /**
     * Returns a String consisting of the characters from all the cells on this tape, read from left to right,
     * except that leading or trailing blank characters are discarded. The current cell pointer is not moved
     * by this method; it points to the same cell after the method is called as it did before. A different
     * pointer is used to move along the tape and get the full contents.
     */
    public String getTapeContents() {
        Cell start = currentCell;
        while (start.prev != null) {
            start = start.prev;
        }
        StringBuilder contents = new StringBuilder();
        while (start != null && start.content == ' ') {
            start = start.next;
        }
        while (start != null) {
            contents.append(start.content);
            start = start.next;
        }
        while (contents.length() > 0 && contents.charAt(contents.length()-1) == ' ') {
            contents.setLength(contents.length()-1);
        }
        return contents.toString();
    }

}
