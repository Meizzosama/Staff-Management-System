import java.util.Scanner;

public class Tree {
	
	private TreeNode root;
	
	private class TreeNode
	{                         
		private TreeNode left;
		private TreeNode left1;   
		private TreeNode middle;
		private TreeNode right1;  
		private TreeNode right;
		private String data;
		private String data1;
		int key;
		
		public TreeNode(String data, String data1) {
			this.data=data;
			this.data1=data1;
		}
		public TreeNode(String data) 
		{
			this.data=data;
		}
	}
	public void createBinaryTree() 
	{           
		TreeNode first= new TreeNode("Osama", "Chief Executive Officer");
		TreeNode second= new TreeNode("Ahmed", "IT General Manager 1");
		TreeNode third= new TreeNode("Asad", "Finance General Manager 2");
		TreeNode fourth= new TreeNode("Aabdi", "Sales General Manager 3");
		TreeNode fifth= new TreeNode("Ehsan", "IT Manager 1");
		TreeNode sixth= new TreeNode("Islam",  "IT Manager 2");
		TreeNode seventh= new TreeNode("Ubed", "IT Manager 3");
		TreeNode eighth= new TreeNode("Ammar", "IT Manager 4");
		TreeNode ninth= new TreeNode("Muneeb", "Finance Manager 5");
		TreeNode tenth= new TreeNode("Areeb", "Sales Manager 6");
		TreeNode eleventh= new TreeNode("Hammad", "IT Manager 7");
		TreeNode twelveth= new TreeNode("Raheela", "Finance Manager  8");
		TreeNode thirteenth= new TreeNode("Shoaib", "Sales Manager 9");
		TreeNode forteenth= new TreeNode("Habib",  "IT Employee 1");
		TreeNode fifteenth= new TreeNode("Hunain", "IT Employee 2");
		TreeNode sixteenth= new TreeNode("Areeb", "IT Employee 3");
		TreeNode seventeenth= new TreeNode("Mustafa", "IT Employee 4");
		TreeNode eighteenth= new TreeNode("Sualeha", "IT Employee 5");
		TreeNode ninteenth= new TreeNode("Daniyal", "Finance Employee 6");
		TreeNode twenteeth= new TreeNode("Babar", "Finance Employee 7");
		TreeNode twenty1= new TreeNode("Azam", "Finance Employee 8");
		TreeNode twenty2= new TreeNode("Rizwan", "Finance Employee 9");
		TreeNode twenty3= new TreeNode("Misbah", "Finance Employee 10");
		TreeNode twenty4= new TreeNode("Haidar", "Sales Employee 11");
		TreeNode twenty5= new TreeNode("Butler", "Sales Employee 12");
		TreeNode twenty6= new TreeNode("Warner", "Sales Employee 13");
		TreeNode twenty7= new TreeNode("Morgan", "Sales Employee 14");
		TreeNode twenty8= new TreeNode("Starc", "Sales Employee 15");
		TreeNode twenty9= new TreeNode("Hassan", "IT Employee 16");
		TreeNode thirteeth= new TreeNode("Malik", "IT Employee 17");
		TreeNode thirty1= new TreeNode("Najeeb", "IT Employee 18");
		TreeNode thirty2= new TreeNode("Rashid", "IT Employee 19");
		TreeNode thirty3= new TreeNode("Amir", "IT Employee 20");
		TreeNode thirty4= new TreeNode("Asif", "Finance Employee 21");
		TreeNode thirty5= new TreeNode("Shabad", "Finance Employee  22");
		TreeNode thirty6= new TreeNode("Fakhar", "Finance Employee 23");
		TreeNode thirty7= new TreeNode("Hafeez", "Finance Employee 24");
		TreeNode thirty8= new TreeNode("Imad", "Finance Employee 25");
		TreeNode thirty9= new TreeNode("Affan", "Sales Employee 26");
		TreeNode fourty= new TreeNode("Haris", "Sales Employee 27");
		TreeNode fourty1= new TreeNode("Sukriye", "Sales Employee 28");
		TreeNode fourty2= new TreeNode("Farukh", "Sales Employee 29");
		TreeNode fourty3= new TreeNode("Ali", "Sales Employee 30");
		TreeNode fourty4= new TreeNode("Rafay", "IT Employee 31");
		TreeNode fourty5= new TreeNode("Noman", "IT Employee 32");
		TreeNode fourty6= new TreeNode("Abid", "IT Employee 33");
		TreeNode fourty7= new TreeNode("Muzammil", "IT Employee 34");
		TreeNode fourty8= new TreeNode("Kashan", "IT Employee 35");
		TreeNode fourty9= new TreeNode("Fatima", "Finance Employee 36");
		TreeNode fifteeth= new TreeNode("Tipu", "Finance Employee 37");
		TreeNode fifty1= new TreeNode("Bano", "Finance Employee 38");
		TreeNode fifty2= new TreeNode("Tayyab", "Finance Employee 39");
		TreeNode fifty3= new TreeNode("Mubashir", "Finance Employee 40");
		TreeNode fifty4= new TreeNode("Tariq", "Sales Employee 41");
		TreeNode fifty5= new TreeNode("Hafiz Usama", "Sales Employee 42");
		TreeNode fifty6= new TreeNode("Ammar", "Sales Employee 43");
		TreeNode fifty7= new TreeNode("Ayub", "Sales Employee 44");
		TreeNode fifty8= new TreeNode("Moiz", "Sales Employee 45");
		
		root=first; 
		
		first.left=second; 
		first.left1=null;
		first.middle=third;
		first.right1=null;
		first.right=fourth; 
		second.left= fifth;
		second.left1= null;
		second.middle= sixth;
		second.right1= null;
		second.right= sixth;
		third.left=eighth;
		third.left1=null;
		third.middle=ninth;
		third.right1=null;
		third.right=tenth;
		fourth.left=eleventh;
		fourth.left1=null;
		fourth.middle=twelveth;
		fourth.right1=null;
		fourth.right=thirteenth;
		fifth.left=forteenth;
		fifth.left1=fifteenth;
		fifth.middle=sixteenth;
		fifth.right1=seventeenth;
		fifth.right=eighteenth;	
		sixth.left=ninteenth;
		sixth.left1=twenteeth;
		sixth.middle=twenty1;
		sixth.right1=twenty2;
		sixth.right=twenty3;	
		seventh.left=twenty4;
		seventh.left1=twenty5;
		seventh.middle=twenty6;
		seventh.right1=twenty7;
		seventh.right=twenty8;		
		eighth.left=twenty9;
		eighth.left1=thirteeth;
		eighth.middle=thirty1;
		eighth.right1=thirty2;
		eighth.right=thirty3;		
		ninth.left=thirty4;
		ninth.left1=thirty5;
		ninth.middle=thirty6;
		ninth.right1=thirty7;
		ninth.right=thirty8;		
		tenth.left=thirty9;
		tenth.left1=fourty;
		tenth.middle=fourty1;
		tenth.right1=fourty2;
		tenth.right=fourty3;
		eleventh.left=fourty4;
		eleventh.left1=fourty5;
		eleventh.middle=fourty6;
		eleventh.right1=fourty7;
		eleventh.right=fourty8;
		twelveth.left=fourty9;
		twelveth.left1=fifteeth;
		twelveth.middle=fifty1;
		twelveth.right1=fifty2;
		twelveth.right=fifty3;
		thirteenth.left=fifty4;
		thirteenth.left1=fifty5;
		thirteenth.middle=fifty6;
		thirteenth.right1=fifty7;
		thirteenth.right=fifty8;	
	}
	
	public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(key > root.key){ 
            root.right = deleteNode(root.right, key);
        }else if(key < root.key){ //move left
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left == null && root.right == null){ 
                root = null;
            }else if(root.right != null){ 
                root.key = successor(root); 
                root.right = deleteNode(root.right, root.key);
            }else{ 
                root.key = predecessor(root);
                root.left = deleteNode(root.left, root.key);
            }
        }
        return root;
        }
        
        private int predecessor(TreeNode root){
            root = root.left;
            while(root.right != null){
                root = root.right;
            }
            return root.key;
        }
        
        private int successor(TreeNode root){
            root = root.right;
            while(root.left != null){
                root = root.left;
            }
            return root.key;
        }
	
	public void preOrder(TreeNode root) 
	{
		if(root == null) 
		{
			return;
		}
		System.out.println("Name: "+ root.data+" \t Id : "+ root.data1+" ");
		preOrder(root.left);
		preOrder(root.left1);  
		preOrder(root.middle);
		preOrder(root.right1);  
		preOrder(root.right);
		System.out.println();
	}
	public static void main(String[] args) {
		Tree bt = new Tree();
		int d;

		System.out.print("\t\t\t\t\t---------------------------------------------------------------------------------------");
		System.out.println("\n\t\t\t\t\t\tWELCOME TO STAFF-MANAGEMENT SYSTEM");
		Scanner s = new Scanner(System.in);
		System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t Enter (1):  See the Company staff details");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t Enter (2) See new Employee resume");
		d= s.nextInt();
		String adminid="osama",adminpass="48372";
    	String id,pass;
		System.out.println();
		switch(d) {
		case 1:System.out.print("\n\t\t\t\t\t\t--------------------------------------------");
    	System.out.print("\n\t\t\t\t\t\t\t View Staff Members");
    	System.out.print("\n\t\t\t\t\t\t----------------------------------------------");
    	System.out.println();
    	System.out.println("\n\t\t\t\t\t\t\t\t Enter unique id:");
    	id=s.next();
    	System.out.println("\n\t\t\t\t\t\t\t\t Enter password:");
    	pass=s.next();
		System.out.println();
    	if(id.equals(adminid) && pass.equals(adminpass)) 
    	{
		bt.createBinaryTree();
		bt.preOrder(bt.root);
    	}
    	else 
    	{
    		System.out.println("Invalid Details!");
    	}
		break;
		case 2: //name, qualification, city, designation.
			System.out.println("\n\t\t\t\t\t\t\t---------------------------------------------");
	    	System.out.println("\n\t\t\t\t\t\t\t View Details of new employees: ");
	    	System.out.println("\n\t\t\t\t\t\t\t--------------------------------------------");
	    	
	    	System.out.println("\n\t\t\t\t\t\t\tEnter unique id:");
	    	id=s.next();
	    	System.out.println("\n\t\t\t\t\t\t\tEnter password:");
	    	pass=s.next();
	    	
	    	if(id.equals(adminid) && pass.equals(adminpass)) 
	    	{
			Applyforjobs a = new Applyforjobs("Farooq","BBA","Karachi","Finance");
			Applyforjobs b = new Applyforjobs("Ahsaan","B.com","Karachi","Sales");
			Applyforjobs c = new Applyforjobs("Fatima","Bs(SE)","Karachi","IT");
			Applyforjobs arr[]= {a,b,c};
			
			 for (int i = 0; i < arr.length; i++) 
	         {
	         	System.out.println(arr[i]);
	         }
			break;
			}
	    	else 
        	{
        		System.out.println("Invalid Details!");
        	}
		default:
			System.out.println("Invalid number entered");
			break;
		
		}}}