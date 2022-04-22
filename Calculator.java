package application;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.ColorPicker;
import java.lang.String;
import java.util.Stack;

public class Calculator extends Application {
// these will store my values
	String tempstr = "";
	double tempx = 0;
	double tempy = 0;
	double tempt = 0;
	double tempz = 0;

	public void start(Stage primaryStage) {


		// Need a display box
		TextField display = new TextField();

		// All the buttons go here
		Button one = new Button();
		Button two = new Button();
		Button three = new Button();
		Button four = new Button();
		Button five = new Button();
		Button six = new Button();
		Button seven = new Button();
		Button eight = new Button();
		Button nine = new Button();
		Button zero = new Button();
		Button enter = new Button();
		Button decimal = new Button();
		Button chs = new Button();
		Button plus = new Button();
		Button minus = new Button();
		Button multiply = new Button();
		Button divide = new Button();
		Button sqrt = new Button();
		Button sin = new Button();
		Button cos = new Button();
		Button tan = new Button();
		Button clr = new Button();
		Button exp = new Button();
		one.setText("1");
		two.setText("2");
		three.setText("3");
		four.setText("4");
		five.setText("5");
		six.setText("6");
		seven.setText("7");
		eight.setText("8");
		nine.setText("9");
		zero.setText("0");
		decimal.setText(".");
		chs.setText("CHS");
		enter.setText("Enter");
		plus.setText("+");
		minus.setText("-");
		multiply.setText("*");
		divide.setText("/");
		sqrt.setText("sqrt");
		sin.setText("sin");
		cos.setText("cos");
		tan.setText("tan");
		clr.setText("CLR");
		exp.setText("**");

	
		// to display text
		int tempd = 0;
		String dpstr = String.valueOf(tempd);
		display.setText(dpstr);
		
		//a constant to clear or enter
		String tempstrt = "0";
		
		// each buttons action
		one.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
			
				tempstr += "1";
				display.setText(tempstr);
			}
		});

		two.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "2";
				display.setText(tempstr);
			}
		});

		three.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "3";
				display.setText(tempstr);
			}
		});

		four.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "4";
				display.setText(tempstr);
			}
		});
		five.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "5";
				display.setText(tempstr);
			}
		});
		six.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "6";
				display.setText(tempstr);
			}
		});
		seven.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "7";
				display.setText(tempstr);
			}
		});
		eight.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "8";
				display.setText(tempstr);
			}
		});
		nine.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "9";
				display.setText(tempstr);
			}
		});
		zero.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempstr += "0";
				display.setText(tempstr);
			}
		});
		plus.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempx = Double.parseDouble(tempstr);
				double temp = tempx + tempy;
				tempstr = Double.toString(temp);
				display.setText(tempstr);
			}
		});
		minus.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempx = Double.parseDouble(tempstr);
				double temp = tempx - tempy;
				tempstr = Double.toString(temp);
				display.setText(tempstr);
			}
		});
		multiply.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempx = Double.parseDouble(tempstr);
				double temp = tempx * tempy;
				tempstr = Double.toString(temp);
				display.setText(tempstr);
			}
		});
		divide.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempx = Double.parseDouble(tempstr);
				double temp = tempx / tempy;
				tempstr = Double.toString(temp);
				display.setText(tempstr);
			}
		});
		chs.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
		
					tempx = Double.parseDouble(tempstr);
					double temp;
					if (tempx < 0) {
					 temp = Math.abs(tempx);
					 tempstr = Double.toString(temp);
					 display.setText(tempstr);
					}
					else {
						 temp = -(tempx);
						 }
					tempstr = Double.toString(temp);
					display.setText(tempstr);
			}
			
		});
		enter.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempx = Double.parseDouble(tempstr);
				tempy = tempx;
				tempz = tempy;
				tempt = tempz;
				
				tempstr = "";
				display.setText(tempstrt);
				
			}
		});
		clr.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
				tempstr = "";
				display.setText(tempstrt);
			}
		});
		sqrt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

			}
		});
		sin.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					tempx = Double.parseDouble(tempstr);
					double temp = Math.sin(tempx);
					tempstr = Double.toString(temp);
					display.setText(tempstr);
			}
		});
		cos.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempx = Double.parseDouble(tempstr);
				double temp = Math.cos(tempx);
				tempstr = Double.toString(temp);
				display.setText(tempstr);
			}
		});
		tan.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tempx = Double.parseDouble(tempstr);
				double temp = Math.tan(tempx);
				tempstr = Double.toString(temp);
				display.setText(tempstr);
			}
		});
		exp.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					tempx = Double.parseDouble(tempstr);
					double temp =  Math.pow(tempy,tempx);
					tempstr = Double.toString(temp);
					display.setText(tempstr);
			}
		});
		decimal.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (tempstr.contains(".")) {	
				}
				else {
					tempstr += ".";
					display.setText(tempstr);
				}
			
			}	});


		GridPane root = new GridPane();
		root.setGridLinesVisible(false);
		root.setVgap(15);// want space
		root.setHgap(15);

		HBox row0 = new HBox(12);
		row0.getChildren().add(sin);
		row0.getChildren().add(cos);
		row0.getChildren().add(tan);
		row0.getChildren().add(clr);
		root.add(row0, 0, 1);

		HBox row1 = new HBox(12);
		row1.getChildren().add(one);
		row1.getChildren().add(two);
		row1.getChildren().add(three);
		row1.getChildren().add(decimal);
		row1.getChildren().add(plus);
		row1.getChildren().add(enter);

		root.add(row1, 0, 2);

		HBox row3 = new HBox(15);
		row3.getChildren().add(seven);
		row3.getChildren().add(eight);
		row3.getChildren().add(nine);
		
		row3.getChildren().add(divide);
		row3.getChildren().add(exp);
		root.add(row3, 0, 4);

		HBox row2 = new HBox(12);
		row2.getChildren().add(four);
		row2.getChildren().add(five);
		row2.getChildren().add(six);
		row2.getChildren().add(minus);
		row2.getChildren().add(sqrt);
		root.add(row2, 0, 3);

		HBox row4 = new HBox(12);
		row4.getChildren().add(decimal);
		row4.getChildren().add(zero);
		row4.getChildren().add(chs);

		row4.getChildren().add(multiply);
		root.add(row4, 0, 5);

		root.add(display, 0, 0);

		Scene scene = new Scene(root, 200, 250);

		primaryStage.setTitle("RPN Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	public void numBtn(String display, double num) {

	}
}