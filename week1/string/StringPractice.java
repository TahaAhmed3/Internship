import java.util.HashSet;
import java.util.Map;


public class StringPractice {
    public static void main(String[] args) {
        String str = "a quick brown fox";
        String titleCaseStr = toTitleCase(str);
        String duplicatesRemovedStr = removeDuplicateCharacters(str);
        
        System.out.println("String: " + str);
        System.out.println("Title Case: " + titleCaseStr);
        System.out.println("Removed Duplicate Characters: " + duplicatesRemovedStr);

        String template = "The car is {model} with {horsePower} hp engine.";
        Map<String, String> values = Map.of(
            "model", "Mustang",
            "horsePower", "450"
        );
        String filledTemplate = fillTemplate(template, values);

        System.out.println("\nTemplate: " + template);
        System.out.println("Values: " + values);
        System.out.println("Filled Template: " + filledTemplate);
    }


    public static String toTitleCase(String s) {
        String[] parts = s.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < parts.length - 1; i++) {
            sb.append(Character.toUpperCase(parts[i].charAt(0)));
            sb.append(parts[i].substring(1));
            sb.append(' ');
        }
        sb.append(Character.toUpperCase(parts[i].charAt(0)));
        sb.append(parts[i].substring(1));

        return sb.toString();
    }


    public static String removeDuplicateCharacters(String str) {
        HashSet<Character> seenChars = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (!seenChars.contains(ch)) {
                sb.append(ch);
                seenChars.add(ch);
            }
        }
        return sb.toString();
    }


    // Replace placeholders like {name}, {age}
    public static String fillTemplate(String template, Map<String, String> values) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry : values.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
        String placeholder;
        int leftBraceIndex, rightBraceIndex, nextLeftBraceIndex;
        int i = 0;

        while (i < template.length()) {
            leftBraceIndex = template.indexOf('{', i);

            // No more placeholders
            if (leftBraceIndex == -1) {
                sb.append(template.substring(i));
                break;
            }
            else {
                sb.append(template.substring(i, leftBraceIndex));
                nextLeftBraceIndex = template.indexOf('{', leftBraceIndex + 1);
                rightBraceIndex = template.indexOf('}', leftBraceIndex + 1);

                // Handle 2 consecutive left braces
                if (nextLeftBraceIndex != -1 && nextLeftBraceIndex < rightBraceIndex) {
                    // Next left brace is not appended because there may be a corresponding right brace
                    sb.append(template.substring(leftBraceIndex, nextLeftBraceIndex));
                    i = nextLeftBraceIndex;
                    continue;
                }

                // No more placeholders
                if (rightBraceIndex == -1) {
                    sb.append(template.substring(leftBraceIndex));
                    break;
                }
                else {
                    placeholder = template.substring(leftBraceIndex + 1, rightBraceIndex);

                    // Replace placeholder if its value exists
                    if (values.containsKey(placeholder)) {
                        sb.append(values.get(placeholder));
                    }
                    else {
                        sb.append(template.substring(leftBraceIndex, rightBraceIndex + 1));
                    }
                    i = rightBraceIndex + 1;
                }
            }
        }

        return sb.toString();
    }

}