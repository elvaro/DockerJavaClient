package elvaro;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController {
    
    @FXML
    private Label label;

    @FXML
    private Button button;
    
    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        button.setText("test");
    }


    @FXML
    private void buttonClick() {
        System.out.println("test");
    }
}
