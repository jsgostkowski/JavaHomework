package Exercises;

public class Homework_01 {
    public static void main(String[] args) {
        addString("kuba");
        System.out.println(addParams(1, 2));
        checkLength("1");
        System.out.println(compareStringLength("asd", "b1234"));
        System.out.println(checkBiggerParam(0.2,1.2));
        System.out.println(sumAndMultiplyParam(2,2,2));
        System.out.println(checkEven(8));
        System.out.println(sumParamsAndCheck(10,2));
        System.out.println(modifyString("zy"));
        System.out.println(checkString("xxbadxx"));
        System.out.println(countChars("kkkkkubaa",'k'));
        System.out.println(count(5));
        System.out.println(countSqrt(3,3));
    }

    // Napisz metode, ktora dodaje do Stringa podanego jako parametr napis "dzien dobry"
    public static void addString(String param) {
        System.out.println(param + " dzien dobry");
    }

    // Stworz metode ktora liczy sume dwoch liczb ktore sa podane jako parametr
    public static int addParams(int a, int b) {
        return a + b;
    }

    // Stwórz metode ktora zwraca dlugosc Stringa podanego jako parametr
    public static void checkLength(String param) {
        System.out.println(param.length());
    }

    // Stworz metode ktora zwraca dluszzy z dwoch podanych jako parametr Stringow
    public static String compareStringLength(String a, String b) {
        int firstParam = a.length();
        int secoundParam = b.length();
        if (firstParam > secoundParam) {
            return a;
        } else {
            return b;
        }
    }

    // Stworz metode ktora zwraca wieksza z dwoch podanych liczb typu double jako
    // parametr gdy liczby są równe zwracamy 0
    public static double checkBiggerParam(double a, double b) {
        if (a > b) {
            return a;
        } else if (a == b) {
            return 0;
        } else {
            return b;
        }
    }
    // Napisz metode ktora jako argument (parametr) przyjmuje
    // 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia
    public static int sumAndMultiplyParam (int a, int b, int c){
        return (a+b) * c;
    }
    // Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to liczba parzysta
    public static boolean checkEven (double a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    // Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z podanych liczb jest z przedzialu [13,19]
    // to zwrocona wartosc to zawsze 19
    public static int sumParamsAndCheck (int a, int b){
        int sum = a+ b;
        if(sum >= 13 && sum<=19){
            return 19;
        }else{
            return sum;
        }
    }
    //Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie na z zwroc napis zzz, jesli konczy sie na y zwroc napis yyy
    // jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku zwroc stringa niezmienionego
    // metoda startsWith() i endsWith() <- sprawdzenie czy string konczy/zaczyna sie na dany literał łancuchowy
    public static String modifyString(String input) {
        if (input.startsWith("z") && input.endsWith("y")) {
            return "zzyy";
        } else if (input.startsWith("z")) {
            return "zzz";
        } else if (input.endsWith("y")) {
            return "yyy";
        } else {
            return input;
        }
    }
    //Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
    //xbadxxx - true
    //badxxx - true
    //xxbadxx - false
    public static boolean checkString(String input) {
        if (input.indexOf("bad") == 0 || input.indexOf("bad") == 1) {
            return true;
        } else {
            return false;
        }
    }
    //Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu
    public static int countChars (String input, char character){
        int counter = 0;
        for (int i =0; i<input.length();i++){
            if(input.charAt(i) == character){
                counter++;
            }
        }
        return counter;
    }
   // Napisz metodę obliczająca silnię z podanej liczby
    public static int count(int a){
        int iloczyn = 1;
        for (int i = 1; i<=a; i++){
            iloczyn *=i;
        }
        return iloczyn;
    }
    // napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre
    // jednosci od cyfry dziesiatek
//    public boolean checkFirstNumber(int param){
//        if(param <= 9){
//            return false;
//        }else if(param.){
//
//        }
//    }
    // Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi,
    // dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81
    // uwzglednic ze a^0 = 1
    // uwzglednic ze a^-b = 1/(a^b)
    public static double countSqrt(int a, int b){
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return 1 / countSqrt(a, -b);
        }
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }


}
