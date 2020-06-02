package app;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

import static app.ROOT.anchorPane;

public class Choose{
    static String location="C:\\Users\\ABC.ABC-PC\\IdeaProjects\\SlidingPuzzle\\src\\app\\img1.jpg";
    private final Stage stage=new Stage();
    static RadioButton ThreeXThree=new RadioButton("Easy (3 X 3)");
    static RadioButton FourXFour=new RadioButton("Medium (4 X 4)");
    static RadioButton FiveXFive=new RadioButton("Hard (5 X 5)");
    void setting()
    {
        final FileChooser fileChooser = new FileChooser();
        configuringFileChooser(fileChooser);
        Button OK=new Button("   Apply    ");
        Button Browse=new Button("Choose the Image");
        Button Picture=new Button("See the Puzzle Pic");
        OK.setLayoutX(115);OK.setLayoutY(365);
        Browse.setLayoutX(5);Browse.setLayoutY(200);
        Picture.setLayoutY(230);Picture.setLayoutX(5);
        AnchorPane anchorPane1=new AnchorPane();
        ROOT.scene.setRoot(anchorPane1);
        Text text=new Text("Choose the Level:");
        Text text1=new Text("Choose the Image:");
        text.setLayoutX(5);text.setLayoutY(50);
        text1.setLayoutY(180);text1.setLayoutX(5);
        text.setStyle("-fx-font: normal bold 25px 'Jokerman'");
        text1.setStyle("-fx-font: normal bold 25px 'Jokerman'");
        ThreeXThree.setLayoutX(5);ThreeXThree.setLayoutY(80);
        FourXFour.setLayoutX(5);FourXFour.setLayoutY(100);
        FiveXFive.setLayoutX(5);FiveXFive.setLayoutY(120);
        ThreeXThree.setOnMouseClicked(mouseEvent -> {
            ThreeXThree.setSelected(true);
            FiveXFive.setSelected(false);
            FourXFour.setSelected(false);
            PuzzleStructure.puzzleType();
        });
        FourXFour.setOnMouseClicked(mouseEvent -> {
            ThreeXThree.setSelected(false);
            FiveXFive.setSelected(false);
            FourXFour.setSelected(true);
            PuzzleStructure.puzzleType();
        });
        FiveXFive.setOnMouseClicked(mouseEvent -> {
            ThreeXThree.setSelected(false);
            FiveXFive.setSelected(true);
            FourXFour.setSelected(false);
            PuzzleStructure.puzzleType();
        });
        Browse.setOnAction(actionEvent -> {
            String files = fileChooser.showOpenMultipleDialog(stage).toString();
            files=files.replace('[',' ');
            files=files.replace(']',' ');
            files=files.trim();
            location=files;
        });
        OK.setOnAction(actionEvent -> ROOT.scene.setRoot(anchorPane));
        anchorPane1.getChildren().add(OK);
        anchorPane1.getChildren().add(Browse);
        anchorPane1.getChildren().add(Picture);
        anchorPane1.getChildren().add(text);
        anchorPane1.getChildren().add(text1);
        anchorPane1.getChildren().add(ThreeXThree);
        anchorPane1.getChildren().add(FourXFour);
        anchorPane1.getChildren().add(FiveXFive);
    }
    private void configuringFileChooser(FileChooser fileChooser) {
        // Set title for FileChooser
        fileChooser.setTitle("Select Pictures");

        // Set Initial Directory
        fileChooser.setInitialDirectory(new File("D:\\"));

        // Add Extension Filters
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png"));
    }
}
