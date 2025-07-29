package Distance;
public class Distance {
    public static void main(String[] args) {
        String password="bbbb";

        int distance=0;
        int start=0;
        int end=password.length()-1;

        String chars="abcdefghijklmnopqrstuvwxyz";

        String nums="1234567890";

        while(start<end)
        {
            if(chars.contains(String.valueOf(password.charAt(start)))  && chars.contains(String.valueOf(password.charAt(end))) ){
                end--;
            }else{
                distance=end-start;
                break;
            }
        }

        System.out.println("The distance is :"+distance);
    }
}
