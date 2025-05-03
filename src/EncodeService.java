import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EncodeService implements Encoder {

	@Override
	public String encode(String plainText) {

		
		Table rtl = new Table();
		List<Character> referenceTableList = rtl.getReferenceTableList();
		HashMap<Integer, Character> referenceTable = rtl.getReferenceTable();
		int index = 0;

		StringBuilder encodeText = new StringBuilder();
		List<Integer> encodeKeys = new ArrayList<Integer>();
		Character offSetChar;
		Integer offSetInt;
		
		Scanner sc = new Scanner(System.in);

		for (Character values : referenceTableList) {
			referenceTable.put(index, values);
			index++;
		}

		System.out.println("Enter offset :");
		String offset = sc.next().toUpperCase();

		//Logic removed to public - Shan Wen

		return encodeText.toString();
	}

}
