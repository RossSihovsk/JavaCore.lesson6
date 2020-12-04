 interface Salary {

    public void salary();

}


class WorkerPerHour implements Salary {

     @Override
     public void salary() {
         int salaryPerHour = 15;
         int workingHours = 8;
         int workingDays = 21;
         int result;

         result = workingDays * workingHours * salaryPerHour;

         System.out.println("\nWorkers salary is " + result + " at the end of the month " + "\n");
     }
 }


 class WorkerPerMonth implements Salary {

     @Override
     public void salary() {
         int salaryPerMonth = 500;
         int result;
         result = 12 * salaryPerMonth;

         System.out.println("Worker salary is " + salaryPerMonth + " dollars per one Month" + "\n");
         System.out.println("Workers salary " + result + " dollars for all Year");
     }
 }



public class Main {
    public static void main(String[] args) {

        WorkerPerHour workerPerHour = new WorkerPerHour();
        workerPerHour.salary();
        WorkerPerMonth workerPerMonth = new WorkerPerMonth();
        workerPerMonth.salary();

    }
}
