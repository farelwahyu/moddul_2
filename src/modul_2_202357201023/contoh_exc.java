
package modul_2_202357201023;


public class contoh_exc {

   
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c" };
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        } catch (ArithmeticException ai) {
            System.out.println("Eror Aritmatik");
            System.out.println(ai.getMessage());
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Eror karena melebihi kapasitas array");
            System.out.println(n.getMessage());
        } catch (Exception e) {
            System.out.println("Ada error");
            
            System.out.println(e.getMessage());
        }
        
    }

    private static class ArithmeyticException {

        public ArithmeyticException() {
        }
    }
    
}
