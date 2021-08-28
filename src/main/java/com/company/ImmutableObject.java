package com.company;

public class ImmutableObject {
    private final String objectName;
    private final int id;
    private final int[] arrayOfInts;
    private final CustomObject customObj;
    private final CustomObject[] arrayOfCustomObj;

    public ImmutableObject(String objectName, int id, int[] arrayOfInts, CustomObject customObj, CustomObject[] arrayOfCustomObj) {
        this.objectName = objectName;
        this.id = id;
        this.arrayOfInts = arrayOfInts;
        this.customObj = customObj;
        this.arrayOfCustomObj = arrayOfCustomObj;
    }


    public String getObjectName() {
        return objectName;
    }

    public int getId() {
        return id;
    }

    public int[] getArrayOfInts() {
        return arrayOfInts;
    }

    public CustomObject getCustomObj() {
        return customObj;
    }

    public CustomObject[] getArrayOfCustomObj() {
        return arrayOfCustomObj;
    }
    public ImmutableObject reverse()
    {
        int[] reversedArray = new int[arrayOfInts.length];
        for(int i = 0; i < reversedArray.length; i++)
        {
            reversedArray[i] = arrayOfInts[arrayOfInts.length-1 -i];
        }
        return (new ImmutableObject(objectName, id, reversedArray,customObj,arrayOfCustomObj));
    }

}
