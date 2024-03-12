public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String inpuString = "Hello, World!";
        int[] counts = CountVowelsAndConsonants(inputString);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
    
    public static int[] CountVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase(); // Convert the strings to lowercase to handle both uppercase and lowercase characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else{
                    consonants++;
                }
            }
        }
        
        return new int[]{vowels, consonants}
    }
}
