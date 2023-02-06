package trabalhopoo.q1;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;

public class q1_b {
public static void main(String[] args) throws ParseException {

			Scanner input = new Scanner(System.in);
			String data_1;
			SimpleDateFormat sfd = new SimpleDateFormat ("MM/dd/yyyy");

			
			System.out.printf(" Escreva  MES/DIA/ANO - utilize as barras para separar\n");
			
			data_1 = input.next();
			Date data_2 = sfd.parse(data_1);

			SimpleDateFormat conver = new SimpleDateFormat("\n MMMM/dd/yyyy");
			String Date = conver.format(data_2);

			System.out.println(Date);		

			}
}
