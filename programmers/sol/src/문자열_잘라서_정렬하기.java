import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 문자열_잘라서_정렬하기 {
    public String[] solution(String myString) {
        // Split the string by 'x' and filter out empty strings
        List<String> filtered = Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Convert the list to an array and sort it
        String[] answer = filtered.toArray(new String[0]);
        Arrays.sort(answer);

        return answer;
    }
}
