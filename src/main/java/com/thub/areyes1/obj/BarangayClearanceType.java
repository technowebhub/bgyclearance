/**
 * Class File Name: BarangayClearanceType.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.obj;

public enum BarangayClearanceType {
	
	NEW ("New"),RENEWAL ("Renewal");
	
	
	private final String name;       

    private BarangayClearanceType(String s) {
        name = s;
    }

    public String toString(){
       return name;
    }

}
