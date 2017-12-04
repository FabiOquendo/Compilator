package Logica;

import java.util.ArrayList;

//TODO CLASE NUEVA
public class StringTools {

	char[] T, P; // T = text, P = pattern
	int n, m; // n = length of T, m = length of P
	int[] b; // b = back table
	
	ArrayList<String> names;
	ArrayList<String> matches;
	ArrayList<Integer> matchesIndex;

	public StringTools() {
		names = new ArrayList<String>();
		matches = new ArrayList<String>();
		matchesIndex = new ArrayList<Integer>();
	}

	private void naiveMatching() {
		for (int i = 0; i < n; i++) { // try all potential starting indices
			Boolean found = true;
			for (int j = 0; j < m && found; j++) // use boolean flag `found'
				if (i + j >= n || P[j] != T[i + j]) // if mismatch found
					found = false; // abort this, shift starting index i by +1
			if (found) // if P[0 .. m - 1] == T[i .. i + m - 1]
				System.out.printf("P is found at index %d in T\n", i);
		}
	}

	private void kmpPreprocess() { // call this before calling kmpSearch()
		int i = 0, j = -1;
		b[0] = -1; // starting values
		while (i < m) { // pre-process the pattern string P
			while (j >= 0 && P[i] != P[j])
				j = b[j]; // if different, reset j using b
			i++;
			j++; // if same, advance both pointers
			b[i] = j; // observe i = 8, 9, 10, 11, 12 with j = 0, 1, 2, 3, 4
		}
	} // in the example of P = "SEVENTY SEVEN" above

	private void kmpSearch() { // this is similar as kmpPreprocess(), but on string T
		int i = 0, j = 0; // starting values
		while (i < n) { // search through string T
			while (j >= 0 && T[i] != P[j])
				j = b[j]; // if different, reset j using b
			i++;
			j++; // if same, advance both pointers
			if (j == m) { // a match found when j == m
				matchesIndex.add( i - j);
				j = b[j]; // prepare j for the next possible match
			}
		}
	}
	
	private void searchIdsTexts() {
		matches.clear();
		for (int i = 0; i < matchesIndex.size(); i++) {
			int match = matchesIndex.get(i);
			String id = "";
			for (int j = match; j < n; j++) {
				if(T[j] == ',' || T[j] == ']')
					break;
				id += T[j];
			}
			matches.add(id);
		}
	}
	
	private void getNamesTexts() {
		names.clear();
		for(int i = 0; i < matches.size(); i++) {
			names.add("lbl_" + matches.get(i).substring(4, matches.get(i).length()));
		}
	}
	
	public String addLabelsToTexts(String expresion) {
		matchesIndex.clear();
		String patternT = "txt_";
		T = new String(expresion).toCharArray();
		P = new String(patternT).toCharArray();
		n = T.length;
		m = P.length;
		naiveMatching();
		b = new int[100010];
		kmpPreprocess();
		kmpSearch();
		searchIdsTexts();
		getNamesTexts();
		for (int i = 0; i < matchesIndex.size(); i++) {
			expresion = expresion.substring(0, matchesIndex.get(i)) + names.get(i) + 
					"," + expresion.substring(matchesIndex.get(i), expresion.length());
			for(int j = i+1;  j < matchesIndex.size(); j++) {
				matchesIndex.set(j, matchesIndex.get(j)+matches.get(i).length()+1);
			}
		}
		return expresion;
	}
	
	private void searchIdsCombos() {
		matches.clear();
		for (int i = 0; i < matchesIndex.size(); i++) {
			int match = matchesIndex.get(i);
			String id = "";
			for (int j = match; j < n; j++) {
				if(T[j] == ',' || T[j] == ']')
					break;
				id += T[j];
			}
			matches.add(id);
		}
	}
	
	private void getNamesCombos() {
		names.clear();
		for(int i = 0; i < matches.size(); i++) {
			names.add("lbl_" + matches.get(i).substring(1, matches.get(i).length()));
		}
	}
	
	public String addLabelsToCombos(String expresion) {
		matchesIndex.clear();
		String patternC = "*";
		T = new String(expresion).toCharArray();
		P = new String(patternC).toCharArray();
		n = T.length;
		m = P.length;
		naiveMatching();
		b = new int[100010];
		kmpPreprocess();
		kmpSearch();
		searchIdsCombos();
		getNamesCombos();
		for (int i = 0; i < matchesIndex.size(); i++) {
			expresion = expresion.substring(0, matchesIndex.get(i)) + names.get(i) + 
					"," + expresion.substring(matchesIndex.get(i), expresion.length());
			for(int j = i+1;  j < matchesIndex.size(); j++) {
				matchesIndex.set(j, matchesIndex.get(j)+matches.get(i).length()+4);
			}
		}
		return expresion;
	}
}