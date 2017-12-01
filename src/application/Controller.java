package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Controller {

	@FXML
    private AnchorPane principal;

    @FXML
    private Pane segundario;

    @FXML
    private JFXButton botonSing;

    @FXML
    private JFXButton botonSingup;
    @FXML
    private ImageView imagen;

    @FXML
    private Pane paneSiguiente;

    public void initialize(URL arg0, ResourceBundle arg1) {
    translateAnimation(0.5,paneSiguiente,600);
    rotateAnimation();
    }

    private void rotateAnimation()
    {
    RotateTransition rotar = new RotateTransition(Duration.seconds(100),imagen);
    rotar.setByAngle(360*50);
    rotar.play();
    }



    @FXML
    public void nextAction()
    {

    translateAnimation(0.1, paneSiguiente, -600);

    }


    @FXML
    public void backAction()
    {

    translateAnimation(0.1, paneSiguiente, 600);

    }


    private void translateAnimation(double duracion, Node node, int distancia) {
    TranslateTransition translateTransition =new TranslateTransition(Duration.seconds(0.2),node);
    translateTransition.setByY(distancia);
            translateTransition.play();
    }

    }
