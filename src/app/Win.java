package app;

import javafx.scene.control.Alert;

import static app.Choose.*;
import static app.Game.*;
import static app.PuzzleStructure.*;

public class Win{
    void GameCompleted() {
        int counter = 0;
        if (ThreeXThree.isSelected())
        {
            for (int i = 0; i < 9; i++) {
                if (NineViews[i].getLayoutX() == DataX.get(i) &&
                        NineViews[i].getLayoutY() == DataY.get(i))
                    counter++;
            }
            if (counter == 9 /*&& NineViews[8].getLayoutX() == DataX.get(4) &&
                    NineViews[8].getLayoutY() == DataY.get(4) &&
                    NineViews[4].getLayoutX() == DataX.get(8) &&
                    NineViews[4].getLayoutY() == DataY.get(8)*/)
            {
                NineViews[8].setLayoutX(DataX.get(8));
                NineViews[8].setLayoutY(DataY.get(8));
                NineViews[4].setLayoutX(DataX.get(4));
                NineViews[4].setLayoutY(DataY.get(4));
                NineViews[8].setVisible(true);
                for (int j = 0; j < 9; j++) {
                    labelForLevel1[j].setVisible(false);
                }
                ROOT.GameStatus ="Won";
                showAlert();
            }

        }
        if (FourXFour.isSelected()) {
            for (int i = 0; i < 16; i++) {
                if (SixteenViews[i].getLayoutX() == DataX.get(i) &&
                        SixteenViews[i].getLayoutY() == DataY.get(i))
                    counter++;
            }
            if (counter == 14 && SixteenViews[15].getLayoutX() == DataX.get(10) &&
                    SixteenViews[15].getLayoutY() == DataY.get(10) &&
                    SixteenViews[10].getLayoutX() == DataX.get(15) &&
                    SixteenViews[10].getLayoutY() == DataY.get(15)) {
                SixteenViews[15].setLayoutX(DataX.get(15));
                SixteenViews[15].setLayoutY(DataY.get(15));
                SixteenViews[10].setLayoutX(DataX.get(10));
                SixteenViews[10].setLayoutY(DataY.get(10));
                SixteenViews[15].setVisible(true);
                for (int j = 0; j < 15; j++) {
                    labelForLevel2[j].setVisible(false);
                }
                ROOT.GameStatus ="Won";
                showAlert();
            }
        }
        if (FiveXFive.isSelected())
        {
            for (int i = 0; i < 25; i++) {
                if (TwentyFiveViews[i].getLayoutX() == DataX.get(i) &&
                        TwentyFiveViews[i].getLayoutY() == DataY.get(i))
                    counter++;
            }
            if (counter == 23 && TwentyFiveViews[24].getLayoutX() == DataX.get(18) &&
                    TwentyFiveViews[24].getLayoutY() == DataY.get(18) &&
                    TwentyFiveViews[18].getLayoutX() == DataX.get(24) &&
                    TwentyFiveViews[18].getLayoutY() == DataY.get(24)) {
                TwentyFiveViews[24].setLayoutX(DataX.get(24));
                TwentyFiveViews[24].setLayoutY(DataY.get(24));
                TwentyFiveViews[18].setLayoutX(DataX.get(18));
                TwentyFiveViews[18].setLayoutY(DataY.get(18));
                TwentyFiveViews[24].setVisible(true);
                for (int j = 0; j < 25; j++) {
                    labelForLevel3[j].setVisible(false);
                }
                ROOT.GameStatus ="Won";
                showAlert();
            }
        }
    }
    void showAlert(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sliding Puzzle");
        alert.setContentText("Congratulation you have solved the puzzle");
        alert.showAndWait();
    }
}