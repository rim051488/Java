import java.io.*;
import java.util.*;

class TextLines{
	List<String> linelist;
	public TextLines(String pathName) throws IOException{
		linelist = new ArrayList<String>();
		BufferedReader br = 
		new BufferedReader(new FileReader(pathName));
		String line;
		while ((line = br.readLine()) != null){
			linelist.add(line);
		}
		br.close();
	}
	public List<String> getFindList(String searchWord){
		List<String> findList = new ArrayList<String>();
		int linenum = 1;
		for (String line:linelist){
			int findPos;
			int startPos = 0;
			while((findPos = line.indexOf(searchWord,startPos))!=-1){
				findList.add(linenum + "(" + (findPos + 1) + ")" + line);
				startPos = findPos + searchWord.length();
			}
			linenum++;
		}
		return findList;
	}
}

public class Q6{
    public static void main(String[] args){
    	if (args.length != 2){
		System.out.println("Argument error.");
    		System.exit(0);
    	}
    	String serchWord = args[0];
    	String pathName = args[1];
    	try{
    		TextLines textdata = new TextLines(pathName);
    		List<String> findlist = textdata.getFindList(serchWord);
    		for (String find : findlist){
    			System.out.println(find);
    		}
    	}catch(FileNotFoundException e){
    		System.out.println("File cannot open["+pathName+ "]");
    	} catch (IOException e){
    		System.out.println("I/O error");
    	}
    }
}
