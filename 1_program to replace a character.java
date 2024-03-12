public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int indexToReplace = 7; // Index of the character to replace
        char ReplacementChar = 'z'; // Character to replace with

        String modifiedString = replacementCharAtIndex(originalString, indexToReplace, ReplacementChar);
        System.out.println("ModifiedString: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {
            throw new IllegalArgumentException("Index is out of bounds");
            
        }
        char[] chars = str.toCharArray();
        chars[index] = replacementChar;
        return new String(chars);
    }
}