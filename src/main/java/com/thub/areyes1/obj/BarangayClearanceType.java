/**
 * Class File Name: BarangayClearanceType.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.obj;

// TODO: Auto-generated Javadoc
/**
 * The Enum BarangayClearanceType.
 */
public enum BarangayClearanceType {
	
	/** The new. */
	NEW ("New"),/** The renewal. */
RENEWAL ("Renewal");
	
	
	/** The name. */
	private final String name;       

    /**
     * Instantiates a new barangay clearance type.
     *
     * @param s the s
     */
    private BarangayClearanceType(String s) {
        name = s;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    public String toString(){
       return name;
    }

}
