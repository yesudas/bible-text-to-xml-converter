import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 
 */

/**
 * @author Yesudas.S
 *
 */
public class TxtToXML {

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Turn off metal's use of bold fonts
                    //UIManager.put("swing.boldMetal", Boolean.FALSE);
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    GUIForm form = new GUIForm();
                    form.setSize(200, 200);
                    form.setVisible(true);
                    form.pack();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TxtToXML.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(TxtToXML.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(TxtToXML.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TxtToXML.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
	/**
	 * @param args
	 
	public static void main(String[] args) {

		if(args.length<1){
			System.out.println("Please give input file name with complete path.");
			System.out.println("Ex: TxtToXML \"E:/Desktop Files/Tamil.txt\"");
			return;
		}
		//String inputFileName = args[0];
		String inputFileName = "E:/Desktop Files/Tamil.txt";
		String outputFileName = inputFileName + ".xml";
		//File inputFile = new File(inputFileName);
		//File outputFile = new File(outputFileName);
		BufferedReader inputFileReader =  null;
		try {
			//inputFileReader =  new BufferedReader(new FileReader(inputFileName));
			inputFileReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFileName),"UTF8"));
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("The file: " + inputFileName + "is missing.");
		} catch (UnsupportedEncodingException e) {
			//e.printStackTrace();
			System.out.println("Exception Occured: " + e.getMessage());
		}

		BufferedWriter outputFileWriter = null;
		try {
			outputFileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName),"UTF8"));
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Exception Occured: " + e.getMessage());
		}
		
	    try {
	    	String line = null;
	    	StringTokenizer stringTokenizer = null; 
	    	while (( line = inputFileReader.readLine()) != null){ 
	    		stringTokenizer = new StringTokenizer(line, "\t"); 
				String bookNo = stringTokenizer.nextToken();
				String chapterNo = stringTokenizer.nextToken();
				String verseNo = stringTokenizer.nextToken();
				String verse = stringTokenizer.nextToken();
				try {
					outputFileWriter.write("<v b='" + bookNo + "' c='" + chapterNo + "' v='" + verseNo + "'>\n");
					outputFileWriter.write("<![CDATA[*" + verse + "*]]>\n");
					outputFileWriter.write("</v>\n");
					} catch (IOException e) {
						//e.printStackTrace();
						System.out.println("IOException occured: " + e.getMessage());
				}
			}
	      } catch (IOException e) {
				//e.printStackTrace();
				System.out.println("IOException occured: " + e.getMessage());
	      }finally {
	    	  try {
				inputFileReader.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("IOException occured: " + e.getMessage());
			}
	    	try {
				outputFileWriter.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("IOException occured: " + e.getMessage());
			}
	    }

	}*/
	
	/*
	 public static void main(String[] args) {
		
		if(args.length<1){
			System.out.println("Please give input file name with complete path.");
			System.out.println("Ex: TxtToXML \"E:/Desktop Files/Tamil.txt\"");
			return;
		}
		//String inputFileName = args[0];
		String inputFileName = "E:/Desktop Files/Tamil.txt";
		String outputFileName = inputFileName + ".xml";
		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);
		
		Writer outputFileWriter = null;
		try {
			outputFileWriter = new BufferedWriter(new FileWriter(outputFile));
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Exception Occured: " + e.getMessage());
		}
		Scanner lineScanner = null;
		try {
			lineScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("The file: " + inputFileName + "is missing.");
			return;
		}
	    try {
	      while ( lineScanner.hasNextLine() ){ 
	    	    Scanner columScanner = new Scanner(lineScanner.nextLine());
	    	    columScanner.useDelimiter("\t");
	    	    if( columScanner.hasNext() ){
	    	      String bookNo = columScanner.next();
	    	      String chapterNo = columScanner.next();
	    	      String verseNo = columScanner.next();
	    	      String verse = columScanner.next();
	    	      try {
					outputFileWriter.write("<v b='" + bookNo + "' c='" + chapterNo + "' v='" + verseNo + "'>");
					outputFileWriter.write("<![CDATA[*" + verse + "*]]>");
					outputFileWriter.write("</v>");
					} catch (IOException e) {
						//e.printStackTrace();
						System.out.println("IOException occured: " + e.getMessage());
					}
	    	    }
	    	    columScanner.close();
	      }
	    }
	    finally {
	    	lineScanner.close();
	    	try {
				outputFileWriter.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("IOException occured: " + e.getMessage());
			}
	    }

	}
	 */
}
