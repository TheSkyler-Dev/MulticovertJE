import java.util.Scanner;
import java.util.Locale;
//MulticonvertJE v0.2.0-alpha (c) Innokenti "Skyler" Nikiforov
class MulticonvertJ {
    public static void main(String[] args){
        while (true) { 
            //menu
            System.out.println("=============================");
            System.out.println("|   Select a menu option    |");
            System.out.println("=============================");
            System.out.println("|       1: Convert Time     |");
            System.out.println("|       2: Convert Data     |");
            System.out.println("|       3: Quit             |");
            System.out.println("=============================");

            //get menu choice
            Scanner userchoice = new Scanner(System.in);
            System.out.println("Enter your menu choice: ");
            int choice = userchoice.nextInt();

            //menu logic
            switch(choice){
                case 1:
                //getting values for 'days'
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a value in days: ");
                int days = scanner.nextInt();

                //conversion logic: convert days to seconds/minutes/hours
                int seconds = days * 24 * 60 * 60;
                int minutes = days * 24 * 60;
                int hours = days * 24;
                int mins = hours * 60;
                int secs = minutes * 60;
                int min = seconds / 60;
                int hrs = minutes / 60;
                int d = hours / 24;

                //output conversion results
                System.out.println(seconds + "s");
                System.out.println(minutes + "min");
                System.out.println(hours + "h");
                System.out.println(mins + "min");
                System.out.println(secs + "s");
                System.out.println(min + "min");
                System.out.println(hrs + "h");
                System.out.println(d + "d");
                continue;

                case 2:
                //get values for data in units
                Scanner data = new Scanner(System.in);
                data.useLocale(Locale.US);
                System.out.println("Enter values in B, KiB, MiB, GiB, TiB, PiB: ");
                double bytes = data.nextDouble();
                double kbytes = data.nextDouble();
                double mbytes = data.nextDouble();
                double gbytes = data.nextDouble();
                double tbytes = data.nextDouble();
                double pbytes = data.nextDouble();

                //conversion logic: input to target unit
                double KiB = bytes / 1024;
                double MiB = kbytes / 1024;
                double GiB = mbytes / 1024;
                double TiB = gbytes / 1024;
                double PiB = tbytes / 1024;
                double TiB2 = pbytes * 1024;
                double GiB2 = tbytes * 1024;
                double MiB2 = gbytes * 1024;
                double KiB2 = mbytes * 1024;
                double B = kbytes * 1024;

                //output conversion results
                System.out.println(bytes + " B are " + KiB + " KiB");
                System.out.println(kbytes + " KiB are " + MiB + " MiB");
                System.out.println(mbytes + " MiB are " + GiB + " GiB");
                System.out.println(gbytes + " GiB are " + TiB + " TiB");
                System.out.println(tbytes + " TiB are " + PiB + " PiB");
                System.out.println(pbytes + " PiB are " + TiB2 + " TiB");
                System.out.println(tbytes + " TiB are " + GiB2 + " GiB");
                System.out.println(gbytes + " GiB are " + MiB2 + " MiB");
                System.out.println(mbytes + " MiB are " + KiB2 + " KiB");
                System.out.println(kbytes + " KiB are " + B + " B");
                continue;

                case 3:
                break;

                default:
                System.out.println("Invalid input! Choice is not a valid menu option");
                continue;
            }
            break;
        }
    }
} //97 lines of Java