module GymL {
	requires javafx.graphics;
	requires java.sql;
	requires javafx.controls;
	requires javafx.fxml;
	requires com.jfoenix;
	requires java.xml.crypto;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
