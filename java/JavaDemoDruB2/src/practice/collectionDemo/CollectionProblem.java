package practice.collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> wordCountMap = new HashMap();
		String languages = "eng chinese eng telugu"
				+ " chinese hindi chinese  ";
		String[] splittedArray = languages.split(" ");
		int count= 1;
		for(String word:splittedArray) {
			if(wordCountMap.containsKey(word)) {//chek already present
				wordCountMap.put(word,wordCountMap.get(word)+1);
			}else {
				wordCountMap.put(word, 1);
			}
			//eng -5 
			//chinese - 1
		}
		System.out.println(wordCountMap);
		Set<Entry<String, Integer>> se2 = wordCountMap.entrySet();
	for(Map.Entry<String, Integer> entry:se2) {
		if(entry.getValue()>1) {
			System.out.println("dup word is" +entry.getKey());
		}
	}
	}

}
//eng - 2
//chinese - 1
//telugu - 1
//check each and every data
//whether already having or not
//already having -> count - 2
//else count 1