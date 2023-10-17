class Sum {
	public static void main (String args[]){
	int sum=0; 
	 if(args.length>0){ 
	    for(int i=0;i<args.length;i++)
	    {
	 	int argument=Integer.parseInt(args[i]);
		sum=sum+argument;
      	    }
	System.out.println("sum is "+sum);
	}
	 else
	{
	 System.out.println("nothing");
	}
     }
}