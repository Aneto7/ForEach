public class forEach {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};
        //I create a variable, I define that while the value of the variable is smaller
        // than the size of the list I execute the function,
        // then increment one more for the variable
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("------------------------------------------------------");

        //Define a variable that will receive, in sequence,
        // the contents of the list, informing content by content for the informed variable. (for each)
        for(String obj:vect){
            System.out.println(obj);
        }
    }
}
