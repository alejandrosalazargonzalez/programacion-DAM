package es.ies.puerto.controller;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.abstractas.AbstractController;
import es.ies.puerto.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController  extends AbstractController{
    
    private final String usuario = "pokemon";
    private final String password = "pokemon";

    private final String pathFile="src/main/resources/"; 
    private final String ficheroStr="idioma-";

    @FXML
    private TextField textFieldUsuario;
    
    @FXML
    private PasswordField textFieldPassword;

    @FXML
    private Text textFieldMensaje;

    @FXML
    private Button openRegistrarButton;
    
    @FXML
    private Button openRecuperarButton;

    @FXML
    private ComboBox<String> comboIdioma;

    @FXML
    protected void onLoginButtonClick() {

        if (textFieldUsuario== null || textFieldUsuario.getText().isEmpty() || 
            textFieldPassword == null || textFieldPassword.getText().isEmpty() ) {
                textFieldMensaje.setText("Credenciales null o vacias");
                return;
        }

        if (!textFieldUsuario.getText().equals(usuario) || !textFieldPassword.getText().equals(password)) {
            textFieldMensaje.setText("Credenciales invalidas");
            return;
        } 

        textFieldMensaje.setText("Usuario validado correctamente");
    }

    @FXML
    protected void openRegistrarClick() {

        try {
            Stage stage = (Stage) openRegistrarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla Registro");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @FXML
        protected void openRecuperarPasswordClick() {
    
            try {
                System.out.println("Abriendo pantalla de recuperacion de contraseña");
                Stage stage = (Stage) openRecuperarButton.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("/es/ies/puerto/recuperar-pasword.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 820, 640);
                stage.setTitle("Recuperar contraseña");
                stage.setScene(scene);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
    
    }

    @FXML
    public void initialize(){
        comboIdioma.getItems().addAll("es", "en", "fr");
        super.cambiarIdiomaLogin();
    }

    @FXML
    protected void seleccionarIdiomaClick(){
        String idioma = comboIdioma.getValue();
        if (idioma != null) {
            cargarIdioma(idioma);
            super.cambiarIdiomaLogin();
        }
    }

    private void cargarIdioma(String idioma){
        //Programacion defensiva
        String path = pathFile+ficheroStr+idioma+".properties";
        ConfigManager.ConfigProperties.setPath(path);
    }
    
}