package Java_Notes;

public class ExceptionsPlayground {
    public static void main(String[] args) {
        String[] names = {"Ted", "Sally", "George", "Fred"};
        
        for(int x=0; x<names.length; x++){
            if(names[x].equals("Billy")){
                throw new NoBilly("No Billys Allowed!");
                //Runtime exception allow it happen but Exception need you to handle it(catch)
            } else {
                System.out.println("No Billy found here, continuing on");
            }
        }

        try {
            for(int x=0; x<names.length; x++){
                if(names[x].equals("Billy")){
                    throw new NoBilly("No Billys Allowed!");
                    //Exception does not allow it happen without handle it, Exception need you to handle it in try catch block
                } else {
                    System.out.println("No Billy found here, continuing on");
                }
            }
        } catch (NoBilly e) {
            // TODO: handle exception
            //Just print out the message but can handle the problem here if want to;
            System.out.println(e.getMessage());
        }

        try {
            checkForFred(); // if we do not wrap this method in a try/catch block we will get a compilation error
        } catch (NoFred e) {
            System.out.println(e.getMessage());
        }
         
    }
    // because we added the throws NoFred keywords to our method we can throw our checked exception in this method
    // but not worry about handling it with a try catch block: that is done for us in the main method where this
    // checkForFred method is called!
    public static void checkForFred()throws NoFred{
        String[] names = {"Ted", "Sally","George", "Billy","Fred"};
        for(int x = 0; x < names.length; x++){
            if(names[x].equals("Billy")){
                throw new NoFred("No Billys allowed!");
            } else {
                System.out.println("No Billy found here, continuing on");
            }
        }     
    }
}