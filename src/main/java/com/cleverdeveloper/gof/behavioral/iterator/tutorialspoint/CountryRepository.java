package com.cleverdeveloper.gof.behavioral.iterator.tutorialspoint;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 12:55 AM
*/

public class CountryRepository implements Container{
    public String names[] = {"Germany", "France", "Algeria", "Spain", "Italy", "England", "United States", "Canada"};


    @Override
    public Iterator getIterator() {
        return new CountryIterator();
    }

    private class CountryIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) return names[index++];
            return null;
        }
    }
}
