package Grocery;

import java.util.ArrayList;

public class GroceryList {

	ArrayList<String> groceryList=new ArrayList<>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have "+ groceryList.size() + " items in your grocery list");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+  ". "+ groceryList.get(i));
		}
	}
		public void modifyGroceryItem(int position,String newItem) {
			groceryList.set(position, newItem);
			System.out.println("Grocery �tem "+ (position+1) +"has been modigied");
		}
		public void removeGroceryItem(int position) {
			groceryList.remove(position);
			
		}
		public String findItem(String searchItem) {
			int position=groceryList.indexOf(searchItem);
			if(position>=0) {
				return groceryList.get(position);
			}
			return null;
	}

		
	

}
