/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvcm;

/**
 *
 * @author Anshul
 */
public class ArraySearch {
    public int arraysearch(long array[],long id)
            
    {
        int index;
        for(index=0;index<array.length;index++)
            if(array[index]==id)
                break;
        return index;
            }
}
