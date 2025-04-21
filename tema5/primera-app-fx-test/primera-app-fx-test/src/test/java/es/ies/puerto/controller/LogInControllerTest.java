package es.ies.puerto.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.model.UsuarioEntity;
import es.ies.puerto.model.UsuarioServiceModel;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

@ExtendWith(MockitoExtension.class)
class LogInControllerTest {
    LoginController loginController;

    UsuarioEntity usuarioEntity = null;

    @Mock
    private UsuarioServiceModel usuarioServiceModelMock;


    @BeforeEach
    void setUp() {
        //usuarioServiceModel = new UsuarioServiceModel();
        //when(metodo).thenReturn(valor);
        System.out.println("Valor de UsuarioServiceModel: "+usuarioServiceModelMock);
    }

    @Test
    void openUsuarioPorEmailTest(){
        when(usuarioServiceModelMock.obtenerUsuarioPorEmail(anyString()));
    }
    
}