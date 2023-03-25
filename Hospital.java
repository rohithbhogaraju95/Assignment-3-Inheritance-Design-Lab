//
//  Hospital.java       
//
//

public class Hospital
{
   //-----------------------------------------------------------------
   //  Creates several objects from classes derived from
   //  HospitalEmployee.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      HospitalEmployee vito = new HospitalEmployee ("Vito", 123);
      Doctor michael = new Doctor ("Michael", 234, "Heart");
      Surgeon vincent = new Surgeon ("Vincent", 645, "Brain", true);
      Nurse sonny = new Nurse ("Sonny", 789, 6);
      

      // print the employees
      System.out.println (vito);
      System.out.println (michael);
      System.out.println (vincent);
      System.out.println (sonny);
      

      // invoke the specific methods of the objects
      vito.work();
      michael.work();
      vincent.work();
      sonny.work();
     
   }
}

class HospitalEmployee {
    protected String name;
    protected int number;

    public HospitalEmployee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return name + " " + number;
    }

    public void work() {
        System.out.println(name + " works for the hospital.");
    }
}

class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String toString() {
        return super.toString() + " " + specialty;
    }

    public void work() {
        super.work();
        System.out.println(name + " is a(n) " + specialty + " doctor.");
    }
}

class Nurse extends HospitalEmployee {
    private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    public String toString() {
        return super.toString() + " has " + numOfPatients + " patients.";
    }

    public void work() {
        super.work();
        System.out.println(name + " is a nurse with " + numOfPatients + " patients.");
    }
}

class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public String toString() {
        return super.toString() + " Operating: " + operating;
    }

    public void work() {
        super.work();
        if (operating) {
            System.out.println(name + " is operating now.");
        }
    }
}
