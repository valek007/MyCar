package com.mycar;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;

public class MyCar{

	public static void main(String[] args){

		MyFrame frame = new MyFrame();

	}

	static class MyFrame extends JFrame{

		public MyFrame(){

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Image icon = myScreen.getImage("com/mycar/graphics/icon.png");
		setIconImage(icon);

		Dimension screenSize = myScreen.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		setBounds(screenWidth/3,screenHeight/4,screenWidth/3,screenHeight/2);
		setResizable(false);
		setVisible(true);
		

		MyPanel sheet = new MyPanel();
		add(sheet);
		}

	}

	static class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g){

			super.paintComponent(g);
			try {

			Image lambo = ImageIO.read(new File("com/mycar/graphics/lambo.png"));
			g.drawImage(lambo,100,100,null);
			
			} catch(IOException e){ System.out.println("Can't find input file.");}

		}

	}

}