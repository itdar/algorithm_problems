//package algorithm_sites.goorm;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//
//public class CompressString {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//
//        String filteredNumber = input.replaceAll("[^0-9]",",");
//        String[] numbers = filteredNumber.split(",");
//        List<Integer> numberList = new ArrayList<>();
//        for (int i = 0; i < numbers.length; ++i) {
//            if (!numbers[i].isBlank() && !numbers[i].isEmpty()) {
//                numberList.add(Integer.parseInt(numbers[i]));
//            }
//        }
//
//        String filteredChar = input.replaceAll("[^a-z]",",");
//        String[] chars = filteredChar.split(",");
//        List<String> charList = new ArrayList<>();
//        for (int i = 0; i < chars.length; ++i) {
//            if (!chars[i].isBlank() && !chars[i].isEmpty()) {
//                charList.add(chars[i]);
//            }
//        }
//
//        for (int i = 0; i < charList.size(); ++i) {
//            if (!map.containsKey(charList.get(i))) {
//                map.put(charList.get(i), numberList.get(i));
//            } else {
//                map.put(charList.get(i), map.get(charList.get(i)) + numberList.get(i));
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        map.entrySet().forEach( entry -> {
//            sb.append(entry.getKey() + entry.getValue());
//        });
//
//        System.out.println(sb);
//    }
//
//}
