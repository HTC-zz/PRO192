
package DTO;

public class FPTUniversity extends University implements Role {
   private String Adress;
   
   public FPTUniversity () {
       super();
       Adress = "";
   }

    public FPTUniversity( int size, String Adress, String name) {
        super(size, name);
        this.Adress = Adress;
    }

       @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

    @Override
    public void createWorker() {
        System.out.println("providing human resources");
    }
}


