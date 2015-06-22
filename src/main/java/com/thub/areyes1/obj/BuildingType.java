/**
 * Class File Name: BuildingType.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.obj;

// TODO: Auto-generated Javadoc
/**
 * The Enum BuildingType.
 */
public enum BuildingType {


	/** The owned. */
	OWNED("Owned"), /** The rented. */
 RENTED ("Rented");
	
	/** The name. */
	private final String name;       

    /**
     * Instantiates a new building type.
     *
     * @param s the s
     */
    private BuildingType(String s) {
        name = s;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    public String toString(){
       return name;
    }
	
	
}
