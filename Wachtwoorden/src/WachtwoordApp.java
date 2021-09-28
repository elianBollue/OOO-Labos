import java.util.*;
import java.util.Comparator;

public class WachtwoordApp {
    private String wachtwoord;

    public static void main(String[] args) {
        //array met 5 usernamen
        String wachtwoord;
        String[] userNames_a = {"u1234567", "u7654321", "u1122334", "u1212123", "u4443332"};
        List<String> userNames = new ArrayList<>(Arrays.asList(userNames_a));
        Map<String, ArrayList<String>> userAndPasswords = new HashMap<>();

        Iterator<String> username = userNames.iterator();
        while (username.hasNext()) {
            userAndPasswords.put(username.next(), new ArrayList<>());
        }

        //TO DO Maak een collectie om per user al zijn wachtwoorden bij te houden

        //deel1
        //ingeven van wachtwoorden van users
        Scanner scanner = new Scanner(System.in);
        String userName = "";
        System.out.println("Typ usernaam om wachtwoord toe te voegen (* = stoppen)");
        userName = scanner.nextLine();
        while (!userName.equals("*")) {
            // TO DO controleer of de user bestaat
            if (!userNames.contains(userName))
                System.out.println("user niet gevonden gevonden");
            else {
                System.out.println("Typ paswoord");
                String nieuwWachtwoord = scanner.nextLine();
                // TO DO indien het wachtwoord bij die user nog niet bestaat voeg het wachtwoord toe
                if (!userAndPasswords.get(userName).contains(nieuwWachtwoord)) {
                    userAndPasswords.get(userName).add(nieuwWachtwoord);
                    System.out.println("nieuw paswoord toevoegen gelukt");
                } else {
                    System.out.println("nieuw paswoord toevoegen niet gelukt - wachtwoord bestaat al");
                }
            }
            System.out.println("Typ usernaam om paswoord te setten/veranderen (* = stoppen)");
            userName = scanner.nextLine();
        }
        scanner.close();

        //lijst van alle paswoorden per user
        System.out.println("Lijst van wachtwoorden per user\n" + userAndPasswords.toString());


        //deel2
        //lijst van alle paswoorden van alle users samen geordend van langste naar kortste wachtswoord en bij gelijke lengte oplopend alfabetisch
        //TO DO    Maak de lijst met geordende wachtwoorden (wachtwoordenGeordend)


        Set wachtwoordenGeordend = new TreeSet<String>(new Comparator<String>(){
            @Override
            public int compare(java.lang.String o1, java.lang.String o2) {
                int result = o2.length()-o1.length();
                if (result == 0) result = o1.compareTo(o2);
                return result;

            }});


        for (Map.Entry<String, ArrayList<String>> lijst : userAndPasswords.entrySet()) {
            Iterator<String> it = lijst.getValue().iterator();
            while (it.hasNext()) {
                wachtwoordenGeordend.add(it.next());
            }
        }


        System.out.println("Lijst van alle ingegeven wachtwoorden geordend van lang naar kort\n" + wachtwoordenGeordend.toString());

    }
}





