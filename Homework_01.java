package Exercises;

import javax.swing.*;
import java.util.*;

public class Homework_01 {
    public static void main(String[] args) {

//        String a = "abc";
//        String b = "abc";
//     //   String c = JOptionPane.showInputDialog("");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//
//        addString("kuba");
//        System.out.println(addParams(1, 2));
//        checkLength("1");
//        System.out.println(compareStringLength("asd", "b1234"));
//        System.out.println(checkBiggerParam(0.2, 1.2));
//        System.out.println(sumAndMultiplyParam(2, 2, 2));
//        System.out.println(checkEven(8));
//        System.out.println(sumParamsAndCheck(10, 2));
//        System.out.println(modifyString("zy"));
//        System.out.println(checkString("xxbadxx"));
//        System.out.println(countChars("kkkkkubaa", 'k'));
//        System.out.println(count(5));
//        System.out.println(countSqrt(3, 3));
//
//        //LISTS
//        System.out.println(generaterateList());
//        List<Integer> list = new ArrayList<>();
//
//        list.add(2);
//        list.add(4);
//        list.add(8);
//        list.add(19);
//        list.add(22);
//        System.out.println(checkList(list));
//        List<String> names = new ArrayList<>();
//        names.add("Jakubb");
//        names.add("Jakub");
//        names.add("Jakub");
//        names.add("Fejk");
//        names.add("Jakub");
//        names.add("Jan");
//
//        System.out.println(countNames(names, "Jakub"));
//
//        System.out.println(checkPAram(names, "e"));
//        List<String> list1 = Arrays.asList("a", "b", "c", "d");
//        List<String> list2 = Arrays.asList("b", "c", "e", "f");
//        System.out.println(checkCommonElements(list1, list2));
//
//        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4);
//        System.out.println(checkDifference(listInt));
//
//        System.out.println(checkLength(names, "Jakub"));
//
//        System.out.println(reverseList(listInt));
//        reversePartTwo(listInt);
//
//        checkNames(names);
//        countVowels(names);
//        System.out.println(checkNamesLength(names));
//        List<Integer> len = new ArrayList<>();
//        len.add(6);
//        len.add(4);
//        len.add(4);
//        len.add(4);
//        len.add(4);
//        len.add(4);
//
//        System.out.println(getNamesByLength(names, len));

        	/*
		 * ArrayList
		 * 1) Przechowuje elementy w dynamicznej tablicy - nie podajemy jej rozmiaru
		 * 2) Dane zapisywane w pamieci znajduja sie obok siebie
		   3) Operacja wyjecia jest szybsza niz na LinkedList, ale usuniecie jest wolniejsze
		 */

        /*LinkedList
         * 1) Przechowuje wewnetrznie elementy opakowane w obiekty wskazujace na element poprzedni i nastepny
         * 2) Dane w pamieci jej sa zapisywane rozstrzelone
         * 3) Patrz punkt 3 przy ArrayList

         */

        List<String> imiona = new ArrayList<>();

        // metoda add() - metoda ktora dodaje cos do kolekcji
        imiona.add("Tomek");
        imiona.add("Karolina");
        imiona.add("Piotr");

        System.out.println(imiona);

        // metoda addAll() - metoda ktora dodaje kolekcje do kolekcji
        // Arrays.asList() tworzy z elementow oddzielonych przecinkami kolekcję
        imiona.addAll(Arrays.asList("Grzegorz", "Ania", "Tomek"));
        System.out.println(imiona);

        // metoda size() - rozmiar kolekcji
        System.out.println("Rozmiar kolekcji: " + imiona.size());

        // metoda get(i) - zwraca element o indeksie i
        System.out.println("Element pierwszy: " + imiona.get(0));

        //	list.remove(Integer.valueOf(2));

        // wypisanie kolekcji za pomoca zwyklej petli
        for (int i = 0; i < imiona.size(); i++) {
            System.out.print(imiona.get(i) + " ");
        }

        System.out.println();

        // wypisanie kolekcji za pomoca for eacha
        for (String imie : imiona) {
            System.out.print(imie + " ");
        }


        // metoda remove(x) - usuniecie z kolekcji elementu x badz indeksu x
        imiona.remove(0);
        System.out.println(imiona);

        imiona.remove("Piotr");
        System.out.println(imiona);

        // metode removeAll() - usuniecie z kolekcji innej kolekcji
        imiona.removeAll(Arrays.asList("Ania", "Tomek"));
        System.out.println(imiona);

        imiona.addAll(Arrays.asList("Piotr", "Ania", "Karolina", "Tomek"));

        System.out.println(imiona);

        // metoda contains(x) - zwraca true jesli element x znajduje sie w kolekcji
        System.out.println("Czy Klaudia jest w kolekcji? " + imiona.contains("Klaudia"));
        System.out.println("Czy Tomek jest w kolekcji? " + imiona.contains("Tomek"));

        System.out.println(imiona);

        // metoda isEmpty() - zwraca true jesli kolekcja jest pusta
        System.out.println("Czy kolekcja jest pusta? " + imiona.isEmpty());

        // metoda indexOf(x) - zwraca indeks pierwszego wystapienia elementu x
        // jesli elementu x nie ma w kolekcji to zwraca -1
        System.out.println("Indeks pierwszego wystapienia Tomka: " + imiona.indexOf("Tomek"));

        // metoda lastIndexOf(x) - zwraca indeks ostatniego wystapienia elementu x
        // jesli elementu nie ma w kolekcji to zwraca -1
        System.out.println("Indeks ostatniego wystapienia Tomka: " + imiona.lastIndexOf("Tomek"));

        // metoda set(indeks, element) - zastepuje element po podanym indeksie innym
        // elementem
        imiona.set(5, "Monikaaaaaaaa");
        System.out.println(imiona);

        // metoda sublist(x,y) zwraca podliste od indeksu podanego jako pierwszy
        // parametr uwzgledniajac go
        // do indeksu drugiego podanego jako parametr nieuwzgledniajac go
        System.out.println(imiona.subList(1, 4));


        // clear() - metoda czyszczaca kolekcje
        // listaImion.clear();
        System.out.println(imiona);

        // metoda equals() zwraca true jesli dwie kolekcje sa takie same
        System.out.println(imiona.equals(imiona));


        // Sety - przyjmuja tylko unikalne elementy

        // HashSet
        // Zbior nieuporzadkowany, akceptuje wartosci null

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(3, 5, 4, -3, 5, 5, 8, 1, 0));
        System.out.println(hashSet);

        // LinkedHashSet
        //  zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
        // wartosci null

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(3, 5, 7, 3, 5, 4, null, 3, 2));
        System.out.println(linkedHashSet);

        // TreeSet
        // Sortuje elementy w secie, ale nie akceptuje wartosci null
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(2, 13, 5, 3, 6, 3, 7));
        System.out.println(treeSet);

        // Mapy przechowuja elemetny pod postaciami par klucz-wartosc
        // klucze musza byc unikalne

        // HashMap
        //nie gwarantuje zachowania zadnej kolejscnoi,  akceptuje wartosci null
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("jeden", 1);
        hashMap.put("cztery", 4);
        hashMap.put("dwa", 2);
        hashMap.put("trzy", 3);
        System.out.println(hashMap);

        // LinkedHashMap
        //  zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
        // wartosci null

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("jeden", 1);
        linkedHashMap.put("cztery", 4);
        linkedHashMap.put("dwa", 2);
        linkedHashMap.put("trzy", 3);
        System.out.println(linkedHashMap);

        // TreeMap
        // Sortuje elementy po kluczach, ale nie akceptuje wartosci null
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("jeden", 1);
        treeMap.put("cztery", 4);
        treeMap.put("dwa", 2);
        treeMap.put("trzy", 3);
        System.out.println(treeMap);

        // zwraca wartoc dla danego klucza
        System.out.println(treeMap.get("jeden"));

        // keySet() values() zwracaja odpowiednio set kluczy i set wartosci
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

        // containsKey() containsValue()
        System.out.println(treeMap.containsKey("jeden"));
        System.out.println(treeMap.containsValue(5));

        // replace(i,j)
        treeMap.replace("jeden", 11);
        System.out.println(treeMap);

        // jesli klucz istnieje to zwracamy jego wartosc
        // jesli klucz nie istnieje to zwracmay wartosc defaultowa
        System.out.println(treeMap.getOrDefault("jeden1", 10));

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        String s = "Izabela";

        System.out.println(s.substring(0,3));

        // Stwórz set Stringów, dodaj jakies elementy, zrob tak zeby wyswietlic je w
        // kolejnosci rosnacej

        // Stworz mape gdzie kluczem jest String i wartoscia tez String, wyswietl cala mape za pomoca Entry

        // Dodaj do mapy 4 slowa jako klucze, niech wartoscia bedzie dlugosc kazdego ze slow

        // w tych dwoch metodach jedno wywolanie metody dodaje jedo slowo do mapy
        // Napisz metoda która dodaje słowa do mapy. Kluczem maja byc kolejen liczby
        // naturalne zaczynajac od 0

        // Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
        // wyswietlic ile razy jaki element byl dodany

        // Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb 1-45

        // napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
        // klucze sa parzystych wartosci
        // na słowo "parzyste"

        // Napisz program, ktory symuluje dzialanie slownika
        // polsko-angielskiego. Przykładowy program: Podaj slowko po Polsku: mama Slowko
        // po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
        // (cancel)

        // W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
        // (same nazwiska jako Stringi) które uczeszczaja do klasy.
        // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
        // 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas


        // zapis/odczyt klasy File, FileReader, FileWriter, BufferedReader

        // Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
        // kurde, kurcze i kurka.
        // Program ma za zadanie kazdy wyraz brzydki zastapic **** i zapisac
        // całosc do nowego pliku ktory sie nazywa
        // slownikPoprawiony

        // wypisanie calego pliku tekstowego
        int[] arr = {1,2,0,0};
        System.out.println(arrayCount9(arr));
        System.out.println(arrayFront9(arr));
    }
    public static  int arrayCount9(int[] nums) {
        int count=0;
        for (int i : nums) {
            if(i == 9){
                count++;
            }

        }
        return count;
    }
    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < 4; i++) {
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }
    public int[] middleWay(int[] a, int[] b) {
        int[] res = new int[2];
        for(int i = 0; i<a.length/2;i++){
            res[0] = a[i];
        }
        for(int i = 0; i<b.length/2;i++){
            res[1] = b[i];
        }
        return res;
    }
    public static int[] makeEnds(int[] nums) {
        int[] res = new int[2];
        int firstValue = nums[0];
        int lastValue = nums[nums.length-1];
        if(nums.length > 2){
            res[0] = firstValue;
            res[1]=lastValue;
        }
        return res;
    }




    public static String frontTimes(String str, int n) {
        int len = 3;
        if(len>str.length()){
            len=str.length();
        }
        String firstLetter = str.substring(0,len);
        String res = "";
        for(int i = 0; i<n;i++){
            res = res + firstLetter;
        }
        return res;
    }
//    int countXX(String str) {
//        int count =0;
//        for(int i =0; i<str.length();i++){
//            if(str.equals("xx")){
//                count++;
//            }
//        }
//        return count;
//    }


    // Napisz metode, ktora dodaje do Stringa podanego jako parametr napis "dzien dobry"
    public static String addString(String param) {
        return param + " dzien dobry";
    }

    // Stworz metode ktora liczy sume dwoch liczb ktore sa podane jako parametr
    public static int addParams(int a, int b) {
        return a + b;
    }

    // Stwórz metode ktora zwraca dlugosc Stringa podanego jako parametr
    public static int checkLength(String param) {
        return param.length();
    }

    // Stworz metode ktora zwraca dluszzy z dwoch podanych jako parametr Stringow
    public static String compareStringLength(String a, String b) {
        return a.length() > b.length() ? a : b;
//        if (a.length() > b.length()) {
//            return a;
//        }
//        return b;

    }

    // Stworz metode ktora zwraca wieksza z dwoch podanych liczb typu double jako
    // parametr gdy liczby są równe zwracamy 0
    public static double checkBiggerParam(double a, double b) {
        if (a > b) {
            return a;
        } else if (a == b) {
            return 0;
        }
        return b;

    }

    // Napisz metode ktora jako argument (parametr) przyjmuje
    // 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia
    public static int sumAndMultiplyParam(int a, int b, int c) {
        return (a + b) * c;
    }

    // Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to liczba parzysta
    public static boolean checkEven(double a) {
        return a % 2 == 0;
//        if (a % 2 == 0) {
//            return true;
//        }
//        return false;
    }

    // Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z podanych liczb jest z przedzialu [13,19]
    // to zwrocona wartosc to zawsze 19
    public static int sumParamsAndCheck(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        }
        return a + b;
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
        }
        return input;

    }

    //Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
    //xbadxxx - true
    //badxxx - true
    //xxbadxx - false
    public static boolean checkString(String input) {
        return input.startsWith("bad") || input.startsWith("bad", 1);
//        if (input.indexOf("bad") == 0 || input.indexOf("bad") == 1) {
//            return true;
//        } else {
//            return false;
//        }
    }

    //Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu
    public static int countChars(String input, char character) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }

    // Napisz metodę obliczająca silnię z podanej liczby
    public static int count(int a) {
        int iloczyn = 1;
        for (int i = 1; i <= a; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }

    // napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre
    // jednosci od cyfry dziesiatek
    // 83
    public boolean checkFirstNumber(int param) {
        return param % 10 > param / 10;
    }

    // Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi,
    // dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81
    // uwzglednic ze a^0 = 1
    // uwzglednic ze a^-b = 1/(a^b)
    public static double countSqrt(int a, int b) {
        if (b == 0) {
            return 1;
        }

        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result *= a;
        }

        if (b < 0) {
            return 1 / result;
        }
        return result;
    }

    // Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z przedziaku 1-10,
    // wrzucmy te liczby do nowej listy posortujmy ja odwrotnie i zwracamy ta liste
    public static List<Integer> generaterateList() {
        List<Integer> randomArray = new ArrayList<>();

        Random r = new Random();
        int sizeArray = r.nextInt(2, 9); //r.nextInt(7) generuje nam liczby od 0-6 dodając 2 mamy od 2 do 8
        for (int i = 0; i < sizeArray; i++) {
            randomArray.add(r.nextInt(1, 11)); //tak samo jak na gorze 0-9 dodajac jeden mamy 1-10
        }
        Collections.sort(randomArray, Collections.reverseOrder());
        return randomArray;
    }

    // Napisz metode ktora jako parametr przyjmuje liste intow i zwraca wszystkie liczby parzyste z tej listy
    public static List<Integer> checkList(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }

    // Wyswietl wszystkie imiona męskie które znajduja sie w liscie
    public static List<String> mensName(List<String> names) {
        List<String> name = new ArrayList<>();

        for (String s : names) {
            if (!s.endsWith("a")) {
                name.add(s);
            }
        }
        return name;
    }

    public static int countNames(List<String> names, String param) {
        int counter = 0;
        for (String s : names) {
            if (s.equals(param)) {
                counter++;
            }
        }
        return counter;
    }

    // Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
    // liste zawierajaca wszystkie
    // Stringi ktore zawieraja podana znak
    // Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
    // zawierac Ania Kasia Magda
    public static List<String> stringsWithChar(List<String> names, char c) {
        List<String> result = new ArrayList<>();
        for (String s : names) {
            if (s.contains(String.valueOf(c))) {
                result.add(s);
            }
        }
        return result;
    }

    // Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
    // elementów wspolnych, ktore sa na obu listach
    public static List<String> checkCommonElements(List<String> listA, List<String> listB) {
        List<String> result = new ArrayList<>();
        for (String s : listA) {
            if (listB.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    // Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
    // najmniejszym elementem
    public static int checkDifference(List<Integer> numbers) {

//        int max = numbers.get(0);
//        int min = numbers.get(0);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        return max - min;
    }

    // Napisz metode ktora przyjmuje liste Stringow i zwraca listę (intow) indeksow
    // wszystkich elementow na liscie, ktore sa takie same jak parametr metody
    // np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
    // output: to 0,2,5\
    public static List<Integer> checkLength(List<String> names, String param) {
        List<Integer> countIndex = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(param)) {
                countIndex.add(i);
            }
        }

        return countIndex;
    }

    // Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
    // nie mozna uzywac nic z Collections
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    // Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
    // metoda ma odwrocic liste, nie ma nic zwracac, nie mozna wykorzystywac innych list/tablic
    // nie mozna uzywac nic z Collections
    // 5 4 3 2 1
    public void reverse(List<Integer> lista) {
        for (int i = 0; i < lista.size() / 2; i++) {
            int temp = lista.get(i); // 2
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size() - 1 - i, temp);
        }
    }


    // majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre
    // podana jako porametr
    // %
    public static List<Integer> checkLastOfParam(List<Integer> list, int param) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i % 10 == param) {
                result.add(i);
            }
        }
        return result;
    }

    // Wyświetl ile razy ktorekolwiek imie zostało powtórzone Np dla imion ania piotr ania tomek krzys tomek ania program
    // powinien wypisac 3, bo byly 3 potworki
    public static int repeatNames(List<String> names) {
        List<String> result = new ArrayList<>();
        int counter = 0;
        for (String s : names) {
            if (result.contains(s)) {
                counter++;
            } else {
                result.add(s);
            }
        }
        return counter;
    }

    // Wyswietl ile razy we wszystkich imionach była użyta samogłoska
    public static void countVowels(List<String> names) {

        List<Character> listVowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));

        int count = 0;
        for (String name : names) {
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (listVowels.contains(c)) {
                    count++;
                }
            }

        }
        System.out.println("Liczba samogłosek wynosi: " + count);

    }

    //Napisz metodę która wyswietli unikalne imiona
    public static Set<String> checkNames(List<String> list) {
        return new HashSet<>(list);
    }

    //Zwroc liste imion które sa dluzsze niz 5 znakow o parzystej dlugosci
    public static List<String> checkNamesLength(List<String> names, int n) {
        List<String> checkLen = new ArrayList<>();
        for (String s : names) {
            if (s.length() > n && s.length() % 2 == 0) {
                checkLen.add(s);
            }
        }
        return checkLen;
    }

    //Zwroc liczbe słow ktore sa zlozone z samych whitespaców np spacji
    public static int whitespaceListOfWords(List<String> list) {
        int counter = 0;
        for (String s : list) {
            if (s.isBlank()) {
                counter++;
            }
        }
        return counter;
    }

    //Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie listy)
    //Metoda ma zwrocic liste Stringow z pirwszej listy ktorych dlugosc odpowiada liczbom na 2 liscie
    // Ania Krzys Tomek Kasia Jan
    // 4 2 5 8 3
    //Ania Tomek Jan
    public static List<String> getNamesByLength(List<String> names, List<Integer> lengths) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() == lengths.get(i)) {
                result.add(names.get(i));
            }
        }
        return result;
    }

    // napisz metode ktora przyjmuje liste intow i zwraca z niej wszystkie liczby pierwsze
    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> firstNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if(isPrimeNumber(i)){
                result.add(i);
            }
        }
        return result;
    }

    // Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza
    // sume dlugosci wszystkich Stringów
    public static int countSumStringLength(List<String[]> list) {
        int count = 0;
        for (String[] array : list) {
            for (String s : array) {
                count += s.length();
            }
        }
        return count;
    }
}
