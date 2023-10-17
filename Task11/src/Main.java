import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ИНН: ");
        String taxn = sc.nextLine();
        try
        {
            CheckPTN(taxn);
            System.out.println("ИНН верен");
        }
        catch (PTNException pt)
        {
            System.out.println(pt.getMessage());
        }
    }


    public static void CheckPTN(String tax_number) throws PTNException {
        boolean physical = tax_number.length() == 12;
        ArrayList<Integer> number = new ArrayList<>(), signature = new ArrayList<>();
        if (tax_number.length()==10 || tax_number.length()==12)
        {
            try
            {
                for(int i=0;i<tax_number.length();i++)
                {
                    int digit = Integer.parseInt(tax_number.substring(i,i+1));
                    if(i<4) number.add(digit);
                    else
                    {
                        if (physical)
                        {
                           if(i<10)
                           {
                               number.add(digit);
                           }
                           else signature.add(digit);
                        }
                        else
                        {
                            if(i<9)
                            {
                                number.add(digit);
                            }
                            else signature.add(digit);
                        }
                    }
                }
            }
            catch (Exception ex) {throw new PTNException("ИНН содержит буквы");}
            boolean right= false;
            if(physical)
            {
                int control1, control2;
                control1=((7*number.get(0)+2*number.get(1)+4*number.get(2)+10*number.get(3)+3*number.get(4)+5*number.get(5)+9*number.get(6)+4*number.get(7)+6*number.get(8)+8*number.get(9))%11)%10;
                control2=((3*number.get(0)+7*number.get(1)+2*number.get(2)+4*number.get(3)+10*number.get(4)+3*number.get(5)+5*number.get(6)+9*number.get(7)+4*number.get(8)+6*number.get(9)+8*control1) %11)%10;
                right = control1==signature.get(0) && control2== signature.get(1);
            }
            else
            {
                int control1;
                control1=((2*number.get(0)+4*number.get(1)+10*number.get(2)+3*number.get(3)+5*number.get(4)+9*number.get(5)+4*number.get(6)+6*number.get(7)+8*number.get(8))%11)%10;
                right = control1==signature.get(0);
            }
            if(!right) throw new PTNException("Контрольная сумма не сходится");
        }
        else throw new PTNException("Неверная длина ИНН");
    }


}
class PTNException extends Exception
{
    public PTNException(String error_message)
    {
        super(error_message);
    }
}