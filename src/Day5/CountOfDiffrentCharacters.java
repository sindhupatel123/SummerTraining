package Day5;

public class CountOfDiffrentCharacters {
    public static void solution(String s){
        s = s.toLowerCase();
        String vowels = "aeiou";
        String decimals = "12345";
        String specialCharacters = "!@#$%()";

        int vowelsCount = 0;
        int decimalsCount = 0;
        int ConsonentsCount = 0;
        int specialCharactersCount = 0;

        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.contains(Character.toString(ch))){
                vowelsCount++;
            }else if(decimals.contains(Character.toString(ch))){
                decimalsCount++;
            }else if(specialCharacters.contains(Character.toString(ch))){
                specialCharactersCount++;
            }else{
                ConsonentsCount++;
            }
        }
        System.out.println(("Count of vowels: "+ vowelsCount));
        System.out.println(("Count of Consonents: "+ ConsonentsCount));
        System.out.println(("Count of specialCharacters: "+ specialCharactersCount));
        System.out.println(("Count of decimals:"+ decimalsCount));
    }
    public static void main(String[] args) {
        String s = "thotasindhuja249@gmail.com";
        solution(s);
    }
}
