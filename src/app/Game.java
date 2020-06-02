package app;

import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.ArrayList;

import static app.Choose.*;
import static app.PuzzleStructure.*;

public class Game {
    private double ConstantX, ConstantY;
    private final ArrayList<String> NumberHolder = new ArrayList<>();
    static Label[] labelForLevel1 = new Label[9];
    static Label[] labelForLevel2 = new Label[16];
    static Label[] labelForLevel3 = new Label[25];
    private final Media Sound = new Media(getClass().getResource("ding.wav").toString());
    private final MediaPlayer ClickSound = new MediaPlayer(Sound);

    void newGame() {
        if (ThreeXThree.isSelected()) {
            ConstantX = 301.0;
            ConstantY = 201.0;
            Rearrange1();
            NineViews[0].setOnMouseClicked(mouseEvent -> click1(NineViews[0].getLayoutX(), NineViews[0].getLayoutY(), 0));
            NineViews[1].setOnMouseClicked(mouseEvent -> click1(NineViews[1].getLayoutX(), NineViews[1].getLayoutY(), 1));
            NineViews[2].setOnMouseClicked(mouseEvent -> click1(NineViews[2].getLayoutX(), NineViews[2].getLayoutY(), 2));
            NineViews[3].setOnMouseClicked(mouseEvent -> click1(NineViews[3].getLayoutX(), NineViews[3].getLayoutY(), 3));
            NineViews[4].setOnMouseClicked(mouseEvent -> click1(NineViews[4].getLayoutX(), NineViews[4].getLayoutY(), 4));
            NineViews[5].setOnMouseClicked(mouseEvent -> click1(NineViews[5].getLayoutX(), NineViews[5].getLayoutY(), 5));
            NineViews[6].setOnMouseClicked(mouseEvent -> click1(NineViews[6].getLayoutX(), NineViews[6].getLayoutY(), 6));
            NineViews[7].setOnMouseClicked(mouseEvent -> click1(NineViews[7].getLayoutX(), NineViews[7].getLayoutY(), 7));
            NineViews[8].setOnMouseClicked(mouseEvent -> click1(NineViews[8].getLayoutX(), NineViews[8].getLayoutY(), 8));
        }
        if (FourXFour.isSelected()) {
            ConstantX = 226.0;
            ConstantY = 151.0;
            Rearrange2();
            SixteenViews[0].setOnMouseClicked(mouseEvent -> click2(SixteenViews[0].getLayoutX(), SixteenViews[0].getLayoutY(), 0));
            SixteenViews[1].setOnMouseClicked(mouseEvent -> click2(SixteenViews[1].getLayoutX(), SixteenViews[1].getLayoutY(), 1));
            SixteenViews[2].setOnMouseClicked(mouseEvent -> click2(SixteenViews[2].getLayoutX(), SixteenViews[2].getLayoutY(), 2));
            SixteenViews[3].setOnMouseClicked(mouseEvent -> click2(SixteenViews[3].getLayoutX(), SixteenViews[3].getLayoutY(), 3));
            SixteenViews[4].setOnMouseClicked(mouseEvent -> click2(SixteenViews[4].getLayoutX(), SixteenViews[4].getLayoutY(), 4));
            SixteenViews[5].setOnMouseClicked(mouseEvent -> click2(SixteenViews[5].getLayoutX(), SixteenViews[5].getLayoutY(), 5));
            SixteenViews[6].setOnMouseClicked(mouseEvent -> click2(SixteenViews[6].getLayoutX(), SixteenViews[6].getLayoutY(), 6));
            SixteenViews[7].setOnMouseClicked(mouseEvent -> click2(SixteenViews[7].getLayoutX(), SixteenViews[7].getLayoutY(), 7));
            SixteenViews[8].setOnMouseClicked(mouseEvent -> click2(SixteenViews[8].getLayoutX(), SixteenViews[8].getLayoutY(), 8));
            SixteenViews[9].setOnMouseClicked(mouseEvent -> click2(SixteenViews[9].getLayoutX(), SixteenViews[9].getLayoutY(), 9));
            SixteenViews[10].setOnMouseClicked(mouseEvent -> click2(SixteenViews[10].getLayoutX(), SixteenViews[10].getLayoutY(), 10));
            SixteenViews[11].setOnMouseClicked(mouseEvent -> click2(SixteenViews[11].getLayoutX(), SixteenViews[11].getLayoutY(), 11));
            SixteenViews[12].setOnMouseClicked(mouseEvent -> click2(SixteenViews[12].getLayoutX(), SixteenViews[12].getLayoutY(), 12));
            SixteenViews[13].setOnMouseClicked(mouseEvent -> click2(SixteenViews[13].getLayoutX(), SixteenViews[13].getLayoutY(), 13));
            SixteenViews[14].setOnMouseClicked(mouseEvent -> click2(SixteenViews[14].getLayoutX(), SixteenViews[14].getLayoutY(), 14));
            SixteenViews[15].setOnMouseClicked(mouseEvent -> click2(SixteenViews[15].getLayoutX(), SixteenViews[15].getLayoutY(), 15));
        }
        if (FiveXFive.isSelected()) {
            ConstantX = 181.0;
            ConstantY = 121.0;
            Rearrange3();
            TwentyFiveViews[0].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[0].getLayoutX(), TwentyFiveViews[0].getLayoutY(), 0));
            TwentyFiveViews[1].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[1].getLayoutX(), TwentyFiveViews[1].getLayoutY(), 1));
            TwentyFiveViews[2].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[2].getLayoutX(), TwentyFiveViews[2].getLayoutY(), 2));
            TwentyFiveViews[3].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[3].getLayoutX(), TwentyFiveViews[3].getLayoutY(), 3));
            TwentyFiveViews[4].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[4].getLayoutX(), TwentyFiveViews[4].getLayoutY(), 4));
            TwentyFiveViews[5].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[5].getLayoutX(), TwentyFiveViews[5].getLayoutY(), 5));
            TwentyFiveViews[6].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[6].getLayoutX(), TwentyFiveViews[6].getLayoutY(), 6));
            TwentyFiveViews[7].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[7].getLayoutX(), TwentyFiveViews[7].getLayoutY(), 7));
            TwentyFiveViews[8].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[8].getLayoutX(), TwentyFiveViews[8].getLayoutY(), 8));
            TwentyFiveViews[9].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[9].getLayoutX(), TwentyFiveViews[9].getLayoutY(), 9));
            TwentyFiveViews[10].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[10].getLayoutX(), TwentyFiveViews[10].getLayoutY(), 10));
            TwentyFiveViews[11].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[11].getLayoutX(), TwentyFiveViews[11].getLayoutY(), 11));
            TwentyFiveViews[12].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[12].getLayoutX(), TwentyFiveViews[12].getLayoutY(), 12));
            TwentyFiveViews[13].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[13].getLayoutX(), TwentyFiveViews[13].getLayoutY(), 13));
            TwentyFiveViews[14].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[14].getLayoutX(), TwentyFiveViews[14].getLayoutY(), 14));
            TwentyFiveViews[15].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[15].getLayoutX(), TwentyFiveViews[15].getLayoutY(), 15));
            TwentyFiveViews[16].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[16].getLayoutX(), TwentyFiveViews[16].getLayoutY(), 16));
            TwentyFiveViews[17].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[17].getLayoutX(), TwentyFiveViews[17].getLayoutY(), 17));
            TwentyFiveViews[18].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[18].getLayoutX(), TwentyFiveViews[18].getLayoutY(), 18));
            TwentyFiveViews[19].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[19].getLayoutX(), TwentyFiveViews[19].getLayoutY(), 19));
            TwentyFiveViews[20].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[20].getLayoutX(), TwentyFiveViews[20].getLayoutY(), 20));
            TwentyFiveViews[21].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[21].getLayoutX(), TwentyFiveViews[21].getLayoutY(), 21));
            TwentyFiveViews[22].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[22].getLayoutX(), TwentyFiveViews[22].getLayoutY(), 22));
            TwentyFiveViews[23].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[23].getLayoutX(), TwentyFiveViews[23].getLayoutY(), 23));
            TwentyFiveViews[24].setOnMouseClicked(mouseEvent -> click3(TwentyFiveViews[24].getLayoutX(), TwentyFiveViews[24].getLayoutY(), 24));
        }
    }

    private void Rearrange1()
    {
        ArrayList<Integer> Data;
        Data = Permutation(9);
        System.out.println(Data);
        double[] PositionX = new double[9];
        double[] PositionY = new double[9];
        for (int j = 0; j < 9; j++) {
            PositionX[j] = NineViews[j].getLayoutX();
            PositionY[j] = NineViews[j].getLayoutY();
        }
        for (int i = 0; i < 9; i++) {
            NineViews[Data.get(i)].setLayoutX(PositionX[i]);
            NineViews[Data.get(i)].setLayoutY(PositionY[i]);
            labelForLevel1[Data.get(i)].setText("" + (Data.get(i) + 1));
            labelForLevel1[Data.get(i)].setLayoutX(NineViews[Data.get(i)].getLayoutX() + NineViews[Data.get(i)].getFitWidth() - 50);
            labelForLevel1[Data.get(i)].setLayoutY(NineViews[Data.get(i)].getLayoutY() + NineViews[Data.get(i)].getFitHeight() - 70);
        }
        NineViews[8].setVisible(false);
    }

    private void Rearrange2() {
        ArrayList<Integer> Data;
        Data = Permutation(16);
        System.out.println(Data);
        double[] PositionX = new double[16];
        double[] PositionY = new double[16];
        for (int j = 0; j < 16; j++) {
            PositionX[j] = SixteenViews[j].getLayoutX();
            PositionY[j] = SixteenViews[j].getLayoutY();
        }
        for (int i = 0; i < 16; i++) {
            SixteenViews[Data.get(i)].setLayoutX(PositionX[i]);
            SixteenViews[Data.get(i)].setLayoutY(PositionY[i]);
            labelForLevel2[Data.get(i)].setText("" + (Data.get(i) + 1));
            labelForLevel2[Data.get(i)].setLayoutX(SixteenViews[Data.get(i)].getLayoutX() + SixteenViews[Data.get(i)].getFitWidth() - 50);
            labelForLevel2[Data.get(i)].setLayoutY(SixteenViews[Data.get(i)].getLayoutY() + SixteenViews[Data.get(i)].getFitHeight() - 50);
        }
        SixteenViews[15].setVisible(false);
    }

    private void Rearrange3() {
        ArrayList<Integer> Data;
        Data = Permutation(25);
        System.out.println(Data);
        double[] PositionX = new double[25];
        double[] PositionY = new double[25];
        for (int j = 0; j < 25; j++) {
            PositionX[j] = TwentyFiveViews[j].getLayoutX();
            PositionY[j] = TwentyFiveViews[j].getLayoutY();
        }
        for (int i = 0; i < 25; i++) {
            TwentyFiveViews[Data.get(i)].setLayoutX(PositionX[i]);
            TwentyFiveViews[Data.get(i)].setLayoutY(PositionY[i]);
            labelForLevel3[Data.get(i)].setText("" + (Data.get(i) + 1));
            labelForLevel3[Data.get(i)].setLayoutX(TwentyFiveViews[Data.get(i)].getLayoutX() + TwentyFiveViews[Data.get(i)].getFitWidth() - 40);
            labelForLevel3[Data.get(i)].setLayoutY(TwentyFiveViews[Data.get(i)].getLayoutY() + TwentyFiveViews[Data.get(i)].getFitHeight() - 40);
        }
        TwentyFiveViews[24].setVisible(false);
    }

    private void click1(double xCoordinate, double yCoordinate, int n) {
        Win in = new Win();
        if (NineViews[8].getLayoutY() == (yCoordinate + ConstantY) && NineViews[8].getLayoutX() == xCoordinate)
            yCoordinate = yCoordinate + ConstantY;
        if (NineViews[8].getLayoutY() == (yCoordinate - ConstantY) && NineViews[8].getLayoutX() == xCoordinate)
            yCoordinate = yCoordinate - ConstantY;
        if (NineViews[8].getLayoutX() == (xCoordinate + ConstantX) && NineViews[8].getLayoutY() == yCoordinate)
            xCoordinate = xCoordinate + ConstantX;
        if (NineViews[8].getLayoutX() == (xCoordinate - ConstantX) && NineViews[8].getLayoutY() == yCoordinate)
            xCoordinate = xCoordinate - ConstantX;
        if (NineViews[n].getLayoutX() != xCoordinate || NineViews[n].getLayoutY() != yCoordinate) {
            ClickSound.stop();
            ClickSound.play();
            NineViews[8].setLayoutX(NineViews[n].getLayoutX());
            NineViews[8].setLayoutY(NineViews[n].getLayoutY());
            NineViews[n].setLayoutX(xCoordinate);
            NineViews[n].setLayoutY(yCoordinate);
            double a = labelForLevel1[8].getLayoutX(), b = labelForLevel1[8].getLayoutY();
            labelForLevel1[8].setLayoutX(labelForLevel1[n].getLayoutX());
            labelForLevel1[8].setLayoutY(labelForLevel1[n].getLayoutY());
            labelForLevel1[n].setLayoutX(a);
            labelForLevel1[n].setLayoutY(b);
            in.GameCompleted();
        }
    }

    private void click2(double xCoordinate, double yCoordinate, int n) {
        Win in = new Win();
        if (SixteenViews[15].getLayoutY() == (yCoordinate + ConstantY) && SixteenViews[15].getLayoutX() == xCoordinate)
            yCoordinate = yCoordinate + ConstantY;
        if (SixteenViews[15].getLayoutY() == (yCoordinate - ConstantY) && SixteenViews[15].getLayoutX() == xCoordinate)
            yCoordinate = yCoordinate - ConstantY;
        if (SixteenViews[15].getLayoutX() == (xCoordinate + ConstantX) && SixteenViews[15].getLayoutY() == yCoordinate)
            xCoordinate = xCoordinate + ConstantX;
        if (SixteenViews[15].getLayoutX() == (xCoordinate - ConstantX) && SixteenViews[15].getLayoutY() == yCoordinate)
            xCoordinate = xCoordinate - ConstantX;
        if (SixteenViews[n].getLayoutX() != xCoordinate || SixteenViews[n].getLayoutY() != yCoordinate) {
            ClickSound.stop();
            ClickSound.play();
            SixteenViews[15].setLayoutX(SixteenViews[n].getLayoutX());
            SixteenViews[15].setLayoutY(SixteenViews[n].getLayoutY());
            SixteenViews[n].setLayoutX(xCoordinate);
            SixteenViews[n].setLayoutY(yCoordinate);
            double a = labelForLevel2[15].getLayoutX(), b = labelForLevel2[15].getLayoutY();
            labelForLevel2[15].setLayoutX(labelForLevel2[n].getLayoutX());
            labelForLevel2[15].setLayoutY(labelForLevel2[n].getLayoutY());
            labelForLevel2[n].setLayoutX(a);
            labelForLevel2[n].setLayoutY(b);
            in.GameCompleted();
        }
    }

    private void click3(double xCoordinate, double yCoordinate, int n) {
        Win in = new Win();
        if (TwentyFiveViews[24].getLayoutY() == (yCoordinate + ConstantY) && TwentyFiveViews[24].getLayoutX() == xCoordinate)
            yCoordinate = yCoordinate + ConstantY;
        if (TwentyFiveViews[24].getLayoutY() == (yCoordinate - ConstantY) && TwentyFiveViews[24].getLayoutX() == xCoordinate)
            yCoordinate = yCoordinate - ConstantY;
        if (TwentyFiveViews[24].getLayoutX() == (xCoordinate + ConstantX) && TwentyFiveViews[24].getLayoutY() == yCoordinate)
            xCoordinate = xCoordinate + ConstantX;
        if (TwentyFiveViews[24].getLayoutX() == (xCoordinate - ConstantX) && TwentyFiveViews[24].getLayoutY() == yCoordinate)
            xCoordinate = xCoordinate - ConstantX;
        if (TwentyFiveViews[n].getLayoutX() != xCoordinate || TwentyFiveViews[n].getLayoutY() != yCoordinate) {
            ClickSound.stop();
            ClickSound.play();
            TwentyFiveViews[24].setLayoutX(TwentyFiveViews[n].getLayoutX());
            TwentyFiveViews[24].setLayoutY(TwentyFiveViews[n].getLayoutY());
            TwentyFiveViews[n].setLayoutX(xCoordinate);
            TwentyFiveViews[n].setLayoutY(yCoordinate);
            double a = labelForLevel3[24].getLayoutX(), b = labelForLevel3[24].getLayoutY();
            labelForLevel3[24].setLayoutX(labelForLevel3[n].getLayoutX());
            labelForLevel3[24].setLayoutY(labelForLevel3[n].getLayoutY());
            labelForLevel3[n].setLayoutX(a);
            labelForLevel3[n].setLayoutY(b);
            in.GameCompleted();
        }
    }

    private ArrayList<Integer> Permutation(int Size) {
        ArrayList<Integer> DigitHolder = new ArrayList<>();
        int Condition = 1;
        while (Condition <= Size) {
            int digit = (int) (Math.random() * Size);
            if (!DigitHolder.contains(digit)) {
                DigitHolder.add(digit);
                Condition++;
            }
        }
        if (!NumberHolder.contains(DigitHolder.toString())) {
            NumberHolder.add(DigitHolder.toString());
        }
        return (checkSolvable(DigitHolder).equals("Solvable")) ? DigitHolder : Permutation(Size);
    }

    String checkSolvable(ArrayList<Integer> hold) {
        int count = 0;
        int value = 0;
        for (int i = 0; i < hold.size(); i++) {
            for (int j = i + 1; j < hold.size() - 1; j++) {
                if (hold.get(i) > hold.get(j))
                    count++;
            }
        }
        if (hold.size() % 2 == 0) {
            if (hold.indexOf(hold.size() - 1) / hold.size() >= 0 && hold.indexOf(hold.size() - 1) / hold.size() < 1)
                value = 1;
            if (hold.indexOf(hold.size() - 1) / hold.size() >= 1 && hold.indexOf(hold.size() - 1) / hold.size() < 2)
                value = 2;
            if (hold.indexOf(hold.size() - 1) / hold.size() >= 2 && hold.indexOf(hold.size() - 1) / hold.size() < 3)
                value = 3;
            if (hold.indexOf(hold.size() - 1) / hold.size() >= 3 && hold.indexOf(hold.size() - 1) / hold.size() < 4)
                value = 4;
            if (hold.indexOf(hold.size() - 1) / hold.size() >= 4 && hold.indexOf(hold.size() - 1) / hold.size() < 51)
                value = 5;
            if (((hold.size() - value - 1) % 2 == 0 && count % 2 != 0) || ((hold.size() - value - 1) % 2 != 0 && count % 2 == 0)) {
                return "Solvable";
            }
        } else if (count % 2 == 0)
            return "Solvable";
        return "Non Solvable";
    }
}
