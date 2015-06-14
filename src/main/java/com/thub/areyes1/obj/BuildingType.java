/**
 * Class File Name: BuildingType.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.obj;

public enum BuildingType {


	OWNED("Owned"), RENTED ("Rented");
	
	private final String name;       

    private BuildingType(String s) {
        name = s;
    }

    public String toString(){
       return name;
    }
	
	
}
