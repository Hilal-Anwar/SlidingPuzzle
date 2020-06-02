package app;

import javafx.concurrent.Task;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.stream.IntStream;

import static app.Choose.*;
import static app.Game.*;
import static app.ROOT.GameIcon;

public class PuzzleStructure {
    static private final AnchorPane Level1 = new AnchorPane();
    static private final AnchorPane Level2 = new AnchorPane();
    static private final AnchorPane Level3 = new AnchorPane();
    static private final BorderPane borderPane1 = new BorderPane(Level1);
    static private final BorderPane borderPane2 = new BorderPane(Level2);
    static private final BorderPane borderPane3 = new BorderPane(Level3);
    static private final Scene gameView = new Scene(borderPane1, 902, 627);
    static private final MenuBar menuBar = new MenuBar();
    static ArrayList<Double> DataX = new ArrayList<>();
    static ArrayList<Double> DataY = new ArrayList<>();
    static ImageView[] NineViews = new ImageView[9];
    static ImageView[] SixteenViews = new ImageView[16];
    static ImageView[] TwentyFiveViews = new ImageView[25];
    private final Stage GameStage = new Stage();
    RadioMenuItem GameHelp = new RadioMenuItem("Show numbers on image");
    private Image image;
    private int Second = 0, Minute = 0, Hour = 0;
    PuzzleStructure() {
        GameHelp.setDisable(true);
        Game go = new Game();
        Menu fileMenu = new Menu("New");
        Menu OptionMenu = new Menu("Options");
        Menu Help = new Menu("Help");
        MenuItem NewGame = new MenuItem("New game");
        MenuItem Quit = new MenuItem("Quit");
        MenuItem SolvedPuzzle = new MenuItem("Solved puzzle");
        MenuItem MainMenu = new MenuItem("Root Menu");
        MenuItem PuzzlePic = new MenuItem("Puzzle picture");
        MenuItem About = new MenuItem("About");
        fileMenu.getItems().add(NewGame);
        fileMenu.getItems().add(Quit);
        OptionMenu.getItems().add(SolvedPuzzle);
        OptionMenu.getItems().add(MainMenu);
        OptionMenu.getItems().add(PuzzlePic);
        Help.getItems().add(GameHelp);
        Help.getItems().add(About);
        menuBar.getMenus().add(fileMenu);
        menuBar.getMenus().add(OptionMenu);
        menuBar.getMenus().add(Help);
        MainMenu.setOnAction(actionEvent -> {
            GameStage.close();
            ROOT.stage.show();
            ROOT.GameSound.play();
            IntStream.range(0, 9).forEachOrdered(a -> labelForLevel1[a].setVisible(false));
            IntStream.range(0, 16).forEachOrdered(a -> labelForLevel2[a].setVisible(false));
            IntStream.range(0, 25).forEachOrdered(a -> labelForLevel3[a].setVisible(false));
            GameHelp.setText("Show numbers on image");
            GameHelp.setSelected(false);
            GameHelp.setDisable(true);
        });

        GameHelp.setOnAction(actionEvent -> {
            if (GameHelp.getText().equals("Show numbers on image")) {
                IntStream.range(0, 9).forEachOrdered(a -> labelForLevel1[a].setVisible(true));
                IntStream.range(0, 16).forEachOrdered(a -> labelForLevel2[a].setVisible(true));
                IntStream.range(0, 25).forEachOrdered(a -> labelForLevel3[a].setVisible(true));
                GameHelp.setText("Hide the number on image");
            } else {
                IntStream.range(0, 9).forEachOrdered(a -> labelForLevel1[a].setVisible(false));
                IntStream.range(0, 16).forEachOrdered(a -> labelForLevel2[a].setVisible(false));
                IntStream.range(0, 25).forEachOrdered(a -> labelForLevel3[a].setVisible(false));
                GameHelp.setText("Show numbers on image");
                GameHelp.setSelected(false);
            }
        });
        NewGame.setOnAction(actionEvent ->
        {
            go.newGame();
            GameHelp.setDisable(false);
            Hour = 0;
            Minute = 0;
            Second = 0;
            if (!ROOT.GameStatus.equals("Playing")) {
                watch();
                ROOT.GameStatus="Playing";
            }

        });
        Quit.setOnAction(actionEvent -> System.exit(0));
        borderPane1.setTop(menuBar);
        puzzleType();
    }

    void create() {
        ROOT.GameStatus="";
        image = new Image(new File(Choose.location).toURI().toString());
        GameStage.getIcons().add(GameIcon);
        DataX.clear();
        DataY.clear();
        imageFormer();
        GameStage.setTitle("Sliding Puzzle");
        GameStage.setScene(gameView);
        GameStage.show();
    }

    static void puzzleType() {
        if (ThreeXThree.isSelected()) {
            borderPane1.setTop(menuBar);
            gameView.setRoot(borderPane1);
        }
        if (FourXFour.isSelected()) {
            borderPane2.setTop(menuBar);
            gameView.setRoot(borderPane2);
        }
        if (FiveXFive.isSelected()) {
            borderPane3.setTop(menuBar);
            gameView.setRoot(borderPane3);
        }
    }

    void Easy() {
        int Id = 65;
        for (int i = 0; i < 9; i++) {
            NineViews[i] = new ImageView();
            NineViews[i].setId("" + (char) Id);
            NineViews[i].setFitWidth(300);
            NineViews[i].setFitHeight(200);
            labelForLevel1[i] = new Label("");
            labelForLevel1[i].setFont(Font.font(30));
            labelForLevel1[i].setTextFill(Color.WHITE);
            labelForLevel1[i].setVisible(false);
            Id++;
        }
        Level1.setStyle("-fx-background-color:#1E90FF");
        for (int a = 0; a < 9; a++) {
            Level1.getChildren().add(NineViews[a]);
            Level1.getChildren().add(labelForLevel1[a]);
        }
    }

    void Medium() {
        int Id = 65;
        double LocationX = 0.0, LocationY = 0.0;
        for (int i = 0; i < 16; i++) {
            SixteenViews[i] = new ImageView();
            SixteenViews[i].setId("" + (char) Id);
            SixteenViews[i].setFitWidth(225);
            SixteenViews[i].setFitHeight(150);
            SixteenViews[i].setLayoutX(LocationX);
            SixteenViews[i].setLayoutY(LocationY);
            labelForLevel2[i] = new Label("");
            labelForLevel2[i].setFont(Font.font(20));
            labelForLevel2[i].setTextFill(Color.WHITE);
            labelForLevel2[i].setVisible(false);
            if ((i + 1) % 4 == 0 && (i + 1) != 16) {
                LocationY = LocationY + SixteenViews[i].getFitHeight() + 1;
                LocationX = 0;

            } else {
                LocationX = LocationX + SixteenViews[i].getFitWidth() + 1;
            }
            Id++;
        }
        Level2.setStyle("-fx-background-color:#1E90FF");
        for (int a = 0; a < 16; a++) {
            Level2.getChildren().add(SixteenViews[a]);
            Level2.getChildren().add(labelForLevel2[a]);
        }
    }

    void Hard() {
        int Id = 65;
        double LocationX = 0.0, LocationY = 0.0;
        for (int i = 0; i < 25; i++) {
            TwentyFiveViews[i] = new ImageView();
            TwentyFiveViews[i].setId("" + (char) Id);
            TwentyFiveViews[i].setFitWidth(180);
            TwentyFiveViews[i].setFitHeight(120);
            TwentyFiveViews[i].setLayoutX(LocationX);
            TwentyFiveViews[i].setLayoutY(LocationY);
            labelForLevel3[i] = new Label("");
            labelForLevel3[i].setFont(Font.font(20));
            labelForLevel3[i].setTextFill(Color.WHITE);
            labelForLevel3[i].setVisible(false);
            if ((i + 1) % 5 == 0 && (i + 1) != 25) {
                LocationY = LocationY + TwentyFiveViews[i].getFitHeight() + 1;
                LocationX = 0;

            } else {
                LocationX = LocationX + TwentyFiveViews[i].getFitWidth() + 1;
            }
            Id++;
        }
        Level3.setStyle("-fx-background-color:#1E90FF");
        for (int a = 0; a < 25; a++) {
            Level3.getChildren().add(TwentyFiveViews[a]);
            Level3.getChildren().add(labelForLevel3[a]);
        }
    }

    private void imageFormer()
    {
        double LocationX = 0.0, LocationY = 0.0;
        double Value1 = 0, Value2 = 0, K1 = 1.0, K2 = 1.0;
        DataX.clear();
        DataY.clear();
        if (ThreeXThree.isSelected())
        {
            for (int i = 0; i < 9; i++)
            {
                NineViews[i].setImage(image);
                Rectangle2D rectangle2D = new Rectangle2D(Value1, Value2, image.getWidth() / 3, image.getHeight() / 3);
                NineViews[i].setViewport(rectangle2D);
                NineViews[i].setLayoutX(LocationX);
                NineViews[i].setLayoutY(LocationY);
                if ((i + 1) % 3 != 0 && (i + 1) != 9)
                {
                    LocationX = LocationX + NineViews[i].getFitWidth() + 1;
                    Value1 = image.getWidth() / 3 * K1;
                    K1++;
                } else {
                    LocationY = LocationY + NineViews[i].getFitHeight() + 1;
                    LocationX = 0;
                    K1 = 1;
                    Value2 = image.getHeight() / 3 * K2;
                    K2++;
                    Value1 = 0;
                }
                DataX.add(NineViews[i].getLayoutX());
                DataY.add(NineViews[i].getLayoutY());
            }
            NineViews[8].setVisible(true);
        }
        if (FourXFour.isSelected())
        {
            for (int i = 0; i < 16; i++)
            {
                SixteenViews[i].setImage(image);
                SixteenViews[i].setLayoutX(LocationX);
                SixteenViews[i].setLayoutY(LocationY);
                Rectangle2D rectangle2D = new Rectangle2D(Value1, Value2, image.getWidth() / 4, image.getHeight() / 4);
                SixteenViews[i].setViewport(rectangle2D);
                if ((i + 1) % 4 != 0 && (i + 1) != 16) {
                    LocationX = LocationX + SixteenViews[i].getFitWidth() + 1;
                    Value1 = image.getWidth() / 4 * K1;
                    K1++;
                } else {
                    LocationY = LocationY + SixteenViews[i].getFitHeight() + 1;
                    LocationX = 0;
                    K1 = 1;
                    Value2 = image.getHeight() / 4 * K2;
                    K2++;
                    Value1 = 0;
                }
                DataX.add(SixteenViews[i].getLayoutX());
                DataY.add(SixteenViews[i].getLayoutY());
            }
            SixteenViews[15].setVisible(true);
        }
        if (FiveXFive.isSelected()) {
            for (int i = 0; i < 25; i++) {
                TwentyFiveViews[i].setImage(image);
                TwentyFiveViews[i].setLayoutX(LocationX);
                TwentyFiveViews[i].setLayoutY(LocationY);
                Rectangle2D rectangle2D = new Rectangle2D(Value1, Value2, image.getWidth() / 5, image.getHeight() / 5);
                TwentyFiveViews[i].setViewport(rectangle2D);
                if ((i + 1) % 5 != 0 && (i + 1) != 25) {
                    LocationX = LocationX + TwentyFiveViews[i].getFitWidth() + 1;
                    Value1 = image.getWidth() / 5 * K1;
                    K1++;
                } else {
                    LocationY = LocationY + TwentyFiveViews[i].getFitHeight() + 1;
                    LocationX = 0;
                    K1 = 1;
                    Value2 = image.getHeight() / 5 * K2;
                    K2++;
                    Value1 = 0;
                }
                DataX.add(TwentyFiveViews[i].getLayoutX());
                DataY.add(TwentyFiveViews[i].getLayoutY());
            }
        }
        TwentyFiveViews[24].setVisible(true);
    }

    private void watch() {
        Task<Void> sleeper = new Task<>() {
            @Override
            protected Void call() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(event2 ->
        {
            Second++;
            if (Second == 60) {
                Minute++;
                Second = 0;
            }
            if (Minute == 60) {
                Hour++;
                Minute = 0;
                Second = 0;
            }
            GameStage.setTitle("Sliding Puzzle" + "     " + Hour + " : " + Minute + " : " + Second);
            if (GameStage.isShowing() && ROOT.GameStatus.equals("Playing"))
                watch();
            else
            {
                Hour = 0;
                Minute = 0;
                Second = 0;
            }
        });
        new Thread(sleeper).start();
    }
}
