package LOL;

import java.util.*;

public class Set2 {
public static void main(String[] args) {
	// list
	// set
	// map
	
	HashSet<Integer> hash = new HashSet<>(); 
	hash.add(null);
	hash.add(1);
	hash.add(1);
	
	
	Iterator<Integer> It = hash.iterator();
	while(It.hasNext())
		System.out.println(It.next());
	
	
	TreeSet<String> Tree = new TreeSet<>();
	Tree.add("a");
	Tree.add("a");
	Tree.add("a");
	Tree.add("a");
	Tree.add("a");
	Tree.add("a");
	
	Tree.add("a");
	Tree.add("a");
	
	Iterator<String> It_Tree = Tree.iterator();
	while(It_Tree.hasNext())
		System.out.println(It_Tree.next());
	
	
	
	
}
}