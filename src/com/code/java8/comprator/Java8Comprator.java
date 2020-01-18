/**
 * 
 */
package com.code.java8.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author dineshveer
 *
 */
public class Java8Comprator {

	public static void main(String[] args) {

		List<Developer> listOfDevelopers =getData();
		
		System.out.println("Before Sorting...");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}
		//By name Ascending
		//Comparator<Developer> byName =(Developer d1,Developer d2)->d1.getName().compareTo(d2.getName());
		
		//By Dept Descding
		//Comparator<Developer> byDept =(Developer d1,Developer d2)-> -d1.getDepaartment().compareTo(d2.getDepaartment());
		
		//By Salary Descending
		Comparator<Developer> bySalary =(Developer d1,Developer d2)->-(d1.getSalary()-d2.getSalary());
		
		
		
		
		Collections.sort(listOfDevelopers,bySalary);
		
		System.out.println("After Sorting...");
		for (Developer developer : listOfDevelopers) {
			System.out.println(developer);
		}
		
	}
	
	private static List<Developer> getData(){
		
		ArrayList<Developer> list= new ArrayList<>();
		
		list.add(new Developer("Dinesh","Comp",45000));
		list.add(new Developer("Sam","Ele",6000));
		list.add(new Developer("John","Chem",40000));
		list.add(new Developer("Ryan","Comp",39000));
		list.add(new Developer("Roth","Extc",20000));
		list.add(new Developer("Test","Mech",8000));
		return list;
	}
	

}
