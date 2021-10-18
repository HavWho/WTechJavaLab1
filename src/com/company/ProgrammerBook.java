package com.company;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    @Override
    public int hashCode() {
        return level * 12345;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ProgrammerBook book = (ProgrammerBook) obj;
        return level == book.level;
    }

    @Override
    public String toString() {
        return language + ", " + level;
    }
}
