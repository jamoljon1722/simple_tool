import java.util.Random;
import java.util.Scanner;

public class simple_tool { 

    //   main
    public static void main(String[] args)  throws Exception {
     
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name_writer = name.nextLine();
        // delete
        System.out.print("\033c");

        // time
        Thread.sleep(1500);
          String banner = """
        
  ██████  ██▓ ███▄ ▄███▓ ██▓███   ██▓    ▓█████    ▄▄▄█████▓ ▒█████   ▒█████   ██▓    
▒██    ▒ ▓██▒▓██▒▀█▀ ██▒▓██░  ██▒▓██▒    ▓█   ▀    ▓  ██▒ ▓▒▒██▒  ██▒▒██▒  ██▒▓██▒    
░ ▓██▄   ▒██▒▓██    ▓██░▓██░ ██▓▒▒██░    ▒███      ▒ ▓██░ ▒░▒██░  ██▒▒██░  ██▒▒██░    
  ▒   ██▒░██░▒██    ▒██ ▒██▄█▓▒ ▒▒██░    ▒▓█  ▄    ░ ▓██▓ ░ ▒██   ██░▒██   ██░▒██░    
▒██████▒▒░██░▒██▒   ░██▒▒██▒ ░  ░░██████▒░▒████▒     ▒██▒ ░ ░ ████▓▒░░ ████▓▒░░██████▒
▒ ▒▓▒ ▒ ░░▓  ░ ▒░   ░  ░▒▓▒░ ░  ░░ ▒░▓  ░░░ ▒░ ░     ▒ ░░   ░ ▒░▒░▒░ ░ ▒░▒░▒░ ░ ▒░▓  ░
░ ░▒  ░ ░ ▒ ░░  ░      ░░▒ ░     ░ ░ ▒  ░ ░ ░  ░       ░      ░ ▒ ▒░   ░ ▒ ▒░ ░ ░ ▒  ░
░  ░  ░   ▒ ░░      ░   ░░         ░ ░      ░        ░      ░ ░ ░ ▒  ░ ░ ░ ▒    ░ ░   
      ░   ░         ░                ░  ░   ░  ░                ░ ░      ░ ░      ░  ░
                                                     By Ja3oli   
      """;

      // selects
      System.out.println(banner);
      System.out.println("1: Text to numbers");
      System.out.println("2: Format scanner");
      System.out.println("3: Web protocols scanner");
      System.out.println("4: Text to reverse");
      System.out.println("5: Random password generator");

      Scanner console_Writer = new Scanner(System.in);
      System.out.print("> ");
      String str_Writer = console_Writer.nextLine();

      printer(str_Writer.trim(), name_writer);
    }
    
    // printer
    public static void printer(String tool, String name) {

        if (tool.equals("1")) {
            Scanner str_num_Writer = new Scanner(System.in);

            // text
            System.out.print("Enter a text: ");
            String text_writer = str_num_Writer.nextLine();

            // number
            System.out.print("Enter a number: ");
            int number_writer = str_num_Writer.nextInt();
            
            System.out.println("==========================");

            for (int i = 1; i <= number_writer; i++) {
                System.out.println(text_writer + " " + i);
            }
            System.out.println("==========================");
            
            System.out.println("\u001B[32msuccessfully");

        } else if (tool.equals("2")) {
            Scanner format_scanner = new Scanner(System.in);
            System.out.print("Enter url: ");
            String format_str = format_scanner.nextLine();

            if (format_str.endsWith(".jpg") || format_str.endsWith(".jpeg")) {
                System.out.println("this image format: is jpeg && jpg");
            } else if (format_str.endsWith(".png")) {
                System.out.println("this image format: is png");
            } else if (format_str.endsWith(".svg") || format_str.endsWith(".webp")) {
                System.out.println("this image format: is svg && webp = for logo");
            } else if (format_str.endsWith(".doc") || format_str.endsWith(".docx")) {
                System.out.println("this is document format: is doc && docx");
            } else if (format_str.endsWith("htm") || format_str.endsWith(".html")) {
                System.out.println("this is web page format: htm && html");
            }

        } else if (tool.equals("3")) {
            Scanner url_scan = new Scanner(System.in);
            System.out.print("Enter web url: ");
            String url_str = url_scan.nextLine();

            if (url_str.startsWith("https")) {
                System.out.println("protocol = https: HyperText Transfer Protocol Secure");
            } else if (url_str.startsWith("http")) {
                System.out.println("protocol = http: HyperText Transfer Protocol");
            } else {
                System.out.println("protocol is unknown");
            }
            
            if (url_str.endsWith("com") || url_str.endsWith("net") || url_str.endsWith("ru") || url_str.endsWith("org") || 
                url_str.endsWith("cc") || url_str.endsWith("uz") || url_str.endsWith("kz")) {
                String[] domen = url_str.split("\\.");
                System.out.println("domain is = " + domen[domen.length - 1]);
            } else {
                System.out.println("domain is unknown");
            }

        } else if (tool.equals("4")) {
            Scanner builder_scan = new Scanner(System.in);
            System.out.print("Enter a text: ");
            String builder_str = builder_scan.nextLine();
            StringBuilder builder = new StringBuilder(builder_str);
            builder.reverse();
            String result = builder.toString();
            System.out.println("result = " + result);

        } else if (tool.equals("5")) {
            String lower = "qwertyuiopasdfghjklzxcvbnm";
            String upper = "QWERTYUIOPASDFGHJKLZXCVBNM";
            String numbers = "0123456789";
        
            Scanner num_scan = new Scanner(System.in);
            System.out.print("Enter a number in the password length: ");
            int len = num_scan.nextInt();
            String group = lower + upper + numbers;
        
            char[] password = new char[len];
        
            Random r = new Random();
        
            for (int i = 0; i < len; i++) {
               password[i] = group.charAt(r.nextInt(group.length()));
            }
        
            if (len <= 20) {
               System.out.println("\u001B[32msuccessfully");
               System.out.println("\u001B[35mYour password is: " + new String(password));
            } else {
               System.out.println("\u001B[31merror max length 20 " + "[ " + name + " ]");
            }
        } else {
            System.out.println("Please do not enter text or anything else just enter a number to select ! " + "[ " +  name + " ]");
        }
  }
}