package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerDesktop {

    @FXML private TextField txtNom;
    @FXML private TextField txtEdat;
    @FXML private Label lblError;

    @FXML
    public void enviarDades() {
        String nomIntroduit = txtNom.getText().trim();
        String edatIntroduida = txtEdat.getText().trim();

        if (nomIntroduit.isEmpty() || edatIntroduida.isEmpty()) {
            lblError.setText("Si us plau, omple tots els camps.");
        } else {
            lblError.setText("");
            
            Main.nom = nomIntroduit;
            Main.edat = edatIntroduida;
            
            ControllerMobile ctrlMobile = (ControllerMobile) UtilsViews.getController("layout_mobile");
            
            if (ctrlMobile != null) {
                ctrlMobile.actualitzarText();
            }
            
            UtilsViews.setView("layout_mobile");
        }
    }
}
