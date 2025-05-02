//Essa classe cria n parcelas de vencimento a partir de uma data inicial
package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GeraParcelas {

    public static void main(String[] args) throws ParseException {

        Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2025");  //Seta a data inicial
        Calendar calendar = Calendar.getInstance();     //Chama a classe que manipula datas
        calendar.setTime(dataInicial);                  //Seta a data inicial no calendar

        for (int parcela = 1; parcela<= 12; parcela++) {
            calendar.add(Calendar.MONTH, 1);

            System.out.println("Parcela de número " + parcela + " - Vencimento: " +
            new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

            //Usa o SimpleDateFormat para definir o formato e a atualização do calendar para retornar a nova data

        }
    }
}







