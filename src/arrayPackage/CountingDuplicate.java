package arrayPackage;
import java.util.Set;
import java.util.TreeSet;

public class CountingDuplicate {
    public static void main(String[] args) {
        Duplicate result = new Duplicate();
        System.out.println(result.duplicate("indivisibilities"));

    }
}

class Duplicate{
    public int duplicate(String word){
        Set<Character> value = new TreeSet<>();
        char[] wordArr = word.toLowerCase().toCharArray();
        int count = 0;
//        System.out.println(wordArr);
        for(int i=0; i<wordArr.length; i++){
            value.add(wordArr[i]);
        }
        Character[] valueArr = value.toArray(new Character[value.size()]);
        int length = valueArr.length;
//        System.out.println(length);
        for(int i=0; i<length; i++){
            int singleCount = 0;
            for(int j=0; j<word.length(); j++){

                if(valueArr[i] == wordArr[j]) {
                    singleCount += 1;

                }
            }
            if(singleCount>1){
                count+=1;
            }

        }
        return count;
    }
}