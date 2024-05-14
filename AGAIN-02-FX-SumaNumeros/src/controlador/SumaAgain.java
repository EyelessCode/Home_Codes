package controlador;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SumaAgain implements Initializable{

    @FXML
    private Button btnFoto;

    @FXML
    private Button btnResultado;

    @FXML
    private ImageView ivFoto;

    @FXML
    private TextArea txtConsejo;

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private TextField txtresultado;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }

    @FXML
    void accionConsejo1(MouseEvent event) {
        // if(this.txtConsejo.isPickOnBounds()){
        //     this.txtConsejo.setText("AAAA");
        // }if(this.txtConsejo.)
        // if(this.txtConsejo.getCursor() != null){
        //     this.txtConsejo.setText("AAAA");
        // }else{
        //     this.txtConsejo.setText("XD");
        // }
        
        while(!this.txtConsejo.isPickOnBounds()){
            this.txtConsejo.setText(null);
        }

        this.txtConsejo.setText("Aquí debes de ingresar el primer número que vas a calcular");
    }

    @FXML
    void accionConsejo2(MouseEvent event) {
        while(!this.txtConsejo.isPickOnBounds()){
            this.txtConsejo.setText(null);
        }

        this.txtConsejo.setText("Aquí debes de ingresar el segundo número que vas a calcular");
    }

    @FXML
    void accionConsejo3(MouseEvent event) {
        while(!this.txtConsejo.isPickOnBounds()){
            this.txtConsejo.setText(null);
        }

        this.txtConsejo.setText("???");
    }

    @FXML
    void accionConsejo4(MouseEvent event) {
        while(!this.txtConsejo.isPickOnBounds()){
            this.txtConsejo.setText(null);
        }

        this.txtConsejo.setText("Foto?");
    }

    @FXML
    void cambioFoto(ActionEvent event) {
        FileChooser cambioFoto=new FileChooser();
        cambioFoto.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Imágenes","*.png","*.jpg","*.jpeg"));

        Stage escenerio=(Stage) btnFoto.getScene().getWindow();
        File seleccion=cambioFoto.showOpenDialog(escenerio);

        if(seleccion!=null){
            Image select=new Image(seleccion.toURI().toString());
            ivFoto.setImage(select);
        }
    }

    @FXML
    void proceso(ActionEvent event) {

    }


}
