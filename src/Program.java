import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor String: ");
        String st = sc.nextLine();
        System.out.println("Digite o valor Int: ");
        String it = sc.nextLine();
        System.out.println("Digite o valor date em formato dd/MM/yyyy: ");
        String dt = sc.nextLine();
        System.out.println("Digite um valor Double: ");
        String db = sc.nextLine();

        try {
            //String
            if (!st.contains("0") && !st.contains("1") && !st.contains("2") && !st.contains("3") && !st.contains("4") && !st.contains("5") && !st.contains("6") && !st.contains("7") && !st.contains("8") && !st.contains("9")) {
                System.out.println("Conversão para String: " + st);
            } else {
                throw new NumberFormatException();
            }

            //int
            try {
                int valueInt = Integer.parseInt(it);
                System.out.println("Conversão para Int: " + valueInt);
            }catch (Exception e) {
                throw new Exception();
            }

            //Date
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date dateFormat = format.parse(dt);
            System.out.println("Conversão para date: " + dateFormat);

            //Double
            double doubleValue = Double.parseDouble(db);
            System.out.println("Conversão para double: " + doubleValue);
        }catch (NumberFormatException e) {
            System.out.println("Erro de conversão, não é uma String sem números.");
        }catch (ParseException e) {
            System.out.println("Erro de conversão, formato da data inválido.");
        }catch (Exception e) {
            System.out.println("Erro de conversão, não é um número inteiro.");
        }
    }
}


