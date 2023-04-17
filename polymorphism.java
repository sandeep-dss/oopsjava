class child{  
    void run(){System.out.println("running");}  
  }  
  class parent extends child{  
    void run(){System.out.println("running behind child");}  
    
    public static void main(String args[]){  
      child c = new parent();//upcasting  
      c.run();  
    }  
  } 