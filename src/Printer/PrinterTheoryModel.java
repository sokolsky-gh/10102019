package Printer;


import java.util.concurrent.TimeUnit;

public class PrinterTheoryModel {
    static boolean paperCharged = false; //наличие заправленной бумаги
    static boolean readyToPrint = true; //возможность начать процесс печати
    public static void main(String[] args) {
    }

    public static void paperCharge(String[] args) {
        if (paperCharged == true){
            System.out.println("Если бумага заправлена, то повторно заправляться не может");
        }
        else {
            paperCharged=true;
            //бумага заправляется
            System.out.println("Бумага успешно заправлена");
        }
    }
    public static void print(String[] args) throws InterruptedException {
        if (readyToPrint==false){
            System.out.println("Дождитесь завершения текущей операции печати");
        }
        else{
            if (paperCharged==false) {
                System.out.println("Печать без заправленной бумаги производиться не может");
            }
                else{
                    readyToPrint=false;
                    paperCharged=false;
                    //происходит печать
                    TimeUnit.SECONDS.sleep(60);
                    readyToPrint=true;
                    System.out.println("Печать успешно завершена");
            }
        }
    }
}
//Принтер имеет две кнопки: «печать» и «заправка бумаги».
//
//Печать происходит в течение 1 минуты. Печать без заправленной бумаги производиться не может. Во время печати можно заправить ещё один лист.
//
//Во время печати нажатием на кнопку «печать» ничего не производится.
//
//Если бумага заправлена, то повторно заправляться не может.
//
//Начальная конфигурация: принтер без бумаги.