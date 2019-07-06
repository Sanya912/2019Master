package com.exmple.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
	
	public MyWindow(String title) {
		super(title);
		setSize(500, 140);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSeriLarge = new Font("SansSerif",  Font.BOLD,  18);
		Font sansSeriSmall = new Font("SansSerif",  Font.BOLD,  12);
		g.setFont(sansSeriLarge);
		g.drawString("The Complete Java Developer Course", 60, 60);
		g.setFont(sansSeriSmall);
		g.drawString("by Alex Melikhov", 60, 100);
		
	}

}
