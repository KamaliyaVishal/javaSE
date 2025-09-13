package com.misc.generics;

/**
 * Generic Class Example with Multiple Type Parameters
 *
 * This class demonstrates a generic class that can accept multiple type parameters.
 * It has two type parameters T and U, and it prints the values of both types.
 */
class GenericClassMultipleTypeDemo<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    GenericClassMultipleTypeDemo(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class GenericClassMultipleType
{
    public static void main (String[] args)
    {
        GenericClassMultipleTypeDemo<String, Integer> obj =
            new GenericClassMultipleTypeDemo<String, Integer>("GfG", 15);

        obj.print();
    }
}