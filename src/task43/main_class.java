package task43;

public class main_class {
	abstract class Node implements Comparable<Node> {
	    
	  	public  int frequency; // the frequency of this tree
	    public  char data;
	    public  Node left, right; 
	    public Node(int freq) { 
	    	frequency = freq;
	   	}
	 
	    // compares on the frequency
	    public int compareTo(Node tree) {
	        return frequency - tree.frequency;
	    }
	  
	}
	void decode(String S, Node root){

		/*A - 1
		B - 00
		C - 01*/
		StringBuilder output = new StringBuilder();
		Node base = root;
	  while (!S.isEmpty()){
	    if (S.charAt(0) == '1'){
	    	base = base.right;
	    	S = S.substring(1);
	    }
	    else {
	    	base = base.left;
	    	S = S.substring(1);
	    }
	    if (base.left == null && base.right == null){
	  		output.append(base.data);
	  		base = root;
	  	}

	  }
	  System.out.println(output.toString());
	}

}
