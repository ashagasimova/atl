public class Test {
//        public static int f(int x){
//            if(x==0 || x==1){
//                return 1;
//            }
//            else {
//                return x*f(x-1);
//            }
//        }

    public static int cem(int x){
        if(x==0){
            return 0;
        } else {
            return x+(cem(x-1));
        }
    }
    public static void main(String[] args) {

        System.out.println(cem(3));
    }
    }




