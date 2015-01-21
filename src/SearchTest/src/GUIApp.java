import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;

import javax.swing.*;

public class GUIApp {

	public static void main(String[] args) {

		new GUIApp();
	}

	public GUIApp() {//this is mainly used to test the algorithm
		JFrame frame = new JFrame("Search Test");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JTextField inputField = new JTextField(30);

		inputField.setSize(100, 25);
		inputField.setLocation(0, 0);
		JButton searchButton = new JButton("Search");

		final TextArea outputArea = new TextArea();

		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)

			{
				inputTextField = inputField.getText();
				// Execute when button is pressed
				outputArea.setText("");
				try {
					readLargerTextFileAlternate("dictionary.txt");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ArrayList<SearchTuple> output = new ArrayList<SearchTuple>();
				output = Searching.getResults(inputTextField, input, 10);//get the results and add them to a text box
				for (int o = 0; o < output.size(); o++) {
					outputArea.append(o + 1 + " . " + output.get(o).data +  " Cost: " + output.get(o).cost+ "\n");
				}

				System.out.println("You clicked the button");
			}

		});

		JPanel panel = new JPanel();
		panel.add(inputField);

		panel.add(searchButton);
		panel.add(outputArea);
		frame.getContentPane().add(panel);

		frame.setSize(500, 300);
		frame.setVisible(true);
	}

	String inputTextField;
	ArrayList<String> input;
//read in the file not needed in android app as it's pulled from SQL database
	public void readLargerTextFileAlternate(String aFileName)
			throws IOException {
		input = new ArrayList<String>();
		Path path = Paths.get(aFileName);
		try (BufferedReader reader = Files.newBufferedReader(path,
				Charset.defaultCharset())) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				// process each line in some way
				if ((line.charAt(0) == inputTextField.charAt(0))
						&& inputTextField != null) {
					input.add(line);
				}
			}
		}
	}

}
