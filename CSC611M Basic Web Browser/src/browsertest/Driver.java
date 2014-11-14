package browsertest;

import java.awt.EventQueue;

public class Driver {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				int runs = 50;
				try {
					for (int i = 0; i < runs; i++){
						BasicBrowser frame = new BasicBrowser("http://localhost:8080/");
						//frame.setVisible(true);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

}
